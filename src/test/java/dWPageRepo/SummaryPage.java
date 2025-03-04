package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class SummaryPage {
	
	//public static By SummaryTitle = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtToolbarTitle");
	public static By SummaryTitle = AppiumBy.id("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/txtToolbarTitle\"]");

	
	public static By IBANField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"IBAN Number\"]");
	
	public static By SponsorSalaryField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Sponsor Salary\"]");
	
	public static By CheckBox = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/checkBox");
	
	public static By AcknowledgeMessage = AppiumBy.xpath("//android.widget.TextView[@text=\"I hereby acknowledge that once I continue with my application to the next screen to upload required documents, I will not be able to edit all data I provided in previous screens\"]");

	public static By EditButtonPersonalDetailsSection =  AppiumBy.xpath("(//android.widget.Button[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/button\"])[2]");
}
