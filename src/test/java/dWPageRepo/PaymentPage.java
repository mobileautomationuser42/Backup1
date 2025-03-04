package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PaymentPage {
	                                          
	public static By PayButton = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/button");
	
	public static By Pay = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/buttonConfirm");
	
	public static By EntryPermitFees = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Entry Permit Fees\"]");

	public static By TotalFees= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"285.75 AED \"]");



}
