package dwManagement;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import Utilities.AndroidUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;

public class DWManager {

	protected AndroidDriver driver;
	private Properties properties;
	protected AndroidUtilities utilities;
	protected IOSDriver iosDriver;
	AndroidUtilities androidUtilities;

	public void pushPhoto() {
		try {
			
			String adbPath = "/Users/jagdishvervalipvt/Library/Android/sdk/platform-tools/adb";
			String photo = "Photo/attachment.jpg";
			String command = adbPath + " push " + photo + " /sdcard/Download/";
			// Execute the command
			Process process = Runtime.getRuntime().exec(command);

			// Wait for the command to complete
			process.waitFor();

			// Check if the command was successful
			if (process.exitValue() == 0) {
				System.out.println("Image uploaded successfully.");
				// Trigger a media scan so that the photo appears in the Photos app
//	                String mediaScanCommand = "adb shell am broadcast -a android.intent.action.MEDIA_SCANNER_SCAN_FILE -d file:///sdcard/Download/attachment.png";
				String mediaScanCommand = adbPath
						+ " shell am broadcast -a android.intent.action.MEDIA_SCANNER_SCAN_FILE -d file:///sdcard/Download/attachment.jpg";
				Process mediaScanProcess = Runtime.getRuntime().exec(mediaScanCommand);
				// Wait for the media scan command to complete
				mediaScanProcess.waitFor();
				// Check if the media scan was successful
				if (mediaScanProcess.exitValue() == 0) {
					System.out.println("Media scan completed successfully. Photo should now appear in the Photos app.");
				} else {
					System.out.println("Failed to trigger media scan.");
				}
			} else {
				System.out.println("Failed to upload the image.");
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void setUp() throws IOException { 
	    System.out.println("Setting up...");
	    pushPhoto();
	    System.out.println("Image uploaded successfully.");
	    try {
	        loadProperties();
	        System.out.println("Properties loaded.");

	      UiAutomator2Options options=new UiAutomator2Options();
	      // Android:14
	        options.setCapability("deviceName", properties.getProperty("DEVICE.NAME"));
	        options.setPlatformName("Android");
	        options.setPlatformVersion("14");
	       // Android:13
//	      options.setCapability("deviceName", properties.getProperty("Device.name API 33"));
//	        options.setPlatformName("Android");
//	        options.setPlatformVersion("13"); 
	//         options.setNoReset(true);
	        options.setCapability("autoGrantPermissions", "true");
	        options.setCapability("appPackage", properties.getProperty("APP.PACKAGE"));
	        options.setCapability("appActivity", properties.getProperty("APP.ACTIVITY"));
	       // options.setCapability("newCommandTimeout", 4000); // 300 seconds
	        URL appiumServerUrl = new URL(properties.getProperty("APPIUM.SERVER.URL"));
	        setDriver(new AndroidDriver(appiumServerUrl, options));
	        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        System.out.println("AndroidDriver initialized successfully.");

	        // Verify app state
	        if (getDriver().isAppInstalled(properties.getProperty("APP.PACKAGE"))) {
	            System.out.println("App is installed.");
	        } else {
	            System.out.println("App is not installed.");
	        }

	    } catch (IOException e) {
	        System.err.println("IOException occurred: " + e.getMessage());
	        e.printStackTrace();
	    } catch (Exception e) {
	        System.err.println("Exception occurred: " + e.getMessage());
	        e.printStackTrace();
	    } 



		/*
		 * try { loadProperties(); DesiredCapabilities options = new
		 * DesiredCapabilities(); options.setCapability("deviceName", "iPhone 11");
		 * options.setCapability("platformName", "iOS");
		 * options.setCapability("platformVersion", "16.6.1");
		 * options.setCapability("udid", "00008030-001D590E3610402E");
		 * options.setCapability("bundleId", "com.deg.mdubai.enterprise");
		 * options.setCapability("automationName", "XCUITest"); URL appiumServerUrl =
		 * new URL(properties.getProperty("APPIUM.SERVER.URL")); setIOSDriver(new
		 * IOSDriver(appiumServerUrl, options));
		 * getIOSDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * System.out.println("AndroidDriver initialized successfully."); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
	}

	public IOSDriver getIOSDriver() {
		return iosDriver;
	}

	public void setIOSDriver(IOSDriver driver) {
		this.iosDriver = driver;
	}

	public void tearDown() {
		if (getDriver() != null) {
			getDriver().quit();
			
		
		}
		System.out.println("Setting down...");
	}

//	private void loadProperties() throws IOException {
//		properties = new Properties();
//		FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
//		properties.load(fis);
//		fis.close();
//		String appPath = properties.getProperty("APP.PATH.DW");
//		if (appPath.startsWith(properties.getProperty("APP.PATH.DW"))) {
//			String frameworkDir = System.getProperty("user.dir");
//			properties.setProperty("APP.PATH.DW", frameworkDir + "/" + appPath);
//		}
//	}
	private void loadProperties() throws IOException {
	    properties = new Properties();
	    FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
	    properties.load(fis);
	    fis.close();
	}


	public AndroidDriver getDriver() {
		return driver;
	}

	public void setDriver(AndroidDriver driver) {
		this.driver = driver;
	}
}
