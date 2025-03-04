package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class CommonElements {

	public static By SwipeUp = AppiumBy.xpath("//android.widget.ScrollView/android.widget.LinearLayout");
	
	public static By SwipeDown = AppiumBy.xpath("//android.widget.ListView");
	
	public static By UploadDocSwipeUp = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/swipeRefreshLayout\"]");
	
	public static By PageTitle = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtToolbarTitle");
	
	//public static By SelectOption = AppiumBy.xpath("//*[@text=\"Select\"]");
	public static By SelectOption=AppiumBy.xpath("//*[contains(@text, 'Select')]");
	
	//public static By CharacterValidationMessage = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\"])[7]");
	
	public static By CharacterValidationMessage = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Passport Place of issuance field length should not exceed 50 characters\"]");
	
	public static By Options = AppiumBy.className("android.widget.TextView");
	
	public static By Options(String options) {
	    return AppiumBy.xpath("//android.widget.TextView[@resource-id='ae.smartdubai.dubainow.enterprise:id/textViewTitle' and @text='" + options + "']");
	}     
	public static By Button(String buttonName) {
	    return AppiumBy.xpath("//android.widget.Button[@text='" + buttonName + "']");
	}
	
	public static By Title(String title) {
	    return AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text='" + title + "']");
	}//
	
	
	public static By JustOnce = AppiumBy.id("android:id/button_once");
	
	public static By PaymentReceiptDoc = AppiumBy.id("ae.uaepass.mainapp.stg:id/document");
	
	public static By Tap = AppiumBy.xpath("//android.widget.TextView[@text=\"Tap anywhere to place a signature\"]"); 
	
	public static By CheckBox = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/checkBox");
	
	public static By Continue = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/button");
	
	public static By Container = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id='ae.smartdubai.dubainow.enterprise:id/mainContainer']");
	
	public static By ViewButton(int index) {
	    return By.xpath("(//android.widget.Button[@text='VIEW'])[" + index + "]");
	}
	public static By viewButton(int index) {
	    return By.xpath("(//android.widget.Button[@text='View'])[" + index + "]");  ////android.widget.TextView[@text='Draft']
	}
	public static By Draft(String draftoptions) {
	    return AppiumBy.xpath("//android.widget.TextView[@text='" + draftoptions + "']");
	}    
}
