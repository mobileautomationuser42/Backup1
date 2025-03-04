package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class SignInPage {
	
	public static By SigninwithUAEPASS = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/llUAEPASSButton");
	
	public static By Continue_U = AppiumBy.xpath("//*[@text='Continue']");
			
	public static By IHaveAnExistingAccount_U = AppiumBy.xpath("//android.widget.TextView[@text=\"I have an existing account\"]");
	
    public static By CheckButton_U = AppiumBy.xpath("(//android.view.View[contains(@clickable, 'true')])[1]");
    
    public static By Accept_U = AppiumBy.xpath("(//*[@class='android.widget.Button'])[1]");
	
    public static By AccountRecovery_U = AppiumBy.xpath("//android.widget.TextView[@text=\"Account Recovery\"]");
	
	public static By TextBoxFieldForMobile_U = AppiumBy.xpath("//android.widget.ScrollView/android.view.View");
	
	public static By Guest = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/btn_guest_sign_in");	
	
	public static By Residency = AppiumBy.xpath("//*[@text=\"Residency\"]");
	
	public static By ConfirmButton =  AppiumBy.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Confirm' or . = 'Confirm')]");
    
	public static By okButton=AppiumBy.xpath("//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'android:id/button1']");
public static By allowButton=AppiumBy.xpath("//*[@class = 'android.widget.Button' and (@text = 'Allow' or . = 'Allow') and @resource-id = 'com.android.permissioncontroller:id/permission_allow_button']");
}
