package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class SalaryDetailsPage {
	
	public static By SaveAndExitButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Save & Exit\"]");
	
	public static By SalaryDetailsLabel = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtToolbarTitle");
	
	public static By BasicSalaryField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Basic Salary\"]");
	public static By BasicSalaryValue = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"10000\"]");
	
	//public static By AccommodationText = AppiumBy.xpath("//*[@text=\"Accommodation (Optional)\"]");
	
	//public static By TravelAllowanceText = AppiumBy.xpath("//*[@text=\"Travel Allowance (Optional)\"]");
	
	public static By TotalSalaryText = AppiumBy.xpath("//*[@text=\"Total Salary (AED)\"]");
	
	public static By AmountField = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @index=\"1\"]");

	public static By ContinueButton = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/button");
	 
}