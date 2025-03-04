package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DigitalSignaturePage {

	public static By SignatureBoard = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/signatureView");
	
	public static By DisclaimerMessage = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtViewTitle");
	
	public static By CheckBox = AppiumBy.xpath("//android.widget.CheckBox[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/checkBox\"]");
	
	public static By BackButton = AppiumBy.accessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎");
	
	public static By ConfirmButton = AppiumBy.xpath("//*[@text='Confirm']");
	
	public static By ClearButton = AppiumBy.xpath("//*[@text='Clear']");
	
	
}
