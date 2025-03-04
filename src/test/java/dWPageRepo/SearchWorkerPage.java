package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class SearchWorkerPage {

	public static By SearchWorkerDetailsLabel = AppiumBy.xpath("//*[contains(@text,\"Search Worker Details\")]");
	
	public static By EnterWorkerDetailsManuallyButton = AppiumBy.xpath("//android.widget.Button[contains(@text,\"Enter Worker Details Manually\")]");
	
	public static By EmiratesIDRadioButton = AppiumBy.xpath("//*[contains(@text,\"Emirates ID\")]");
	
	public static By UnifiedNoRadioButton = AppiumBy.xpath("//*[contains(@text,\"Unified No (UDB)\")]");
	
	public static By EnterEmiratesIDDetailsLabel = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Enter Emirates ID details\"]");

	public static By EnterUnifiedNoDetailsLabel = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Enter Unified No details\"]");
	
	public static By EmiratesIDNumber = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Emirates ID Number\"]");
	
	public static By PassportNumber = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Passport Number\"]");
	
	public static By NationalityText = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Nationality\"]");
	
	public static By YearOfBirth = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Year of Birth\"]");
	
	public static By NationalityOptions = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/lbl_description");
	
	public static By SearchButton = AppiumBy.xpath("//android.widget.Button[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/button\" and @text=\"Search\"]");
	
	public static By UnifiedNumber = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Unified Number\"]");
	
	//No Profile Found Screen Locators
	public static By NoProfileFoundLabel = AppiumBy.xpath("//*[@text=\"No Profile Found\"]");
	
	public static By TryToSearchWithUnifiedNoButton = AppiumBy.xpath("//*[@text=\"Try to search with Unified No\"]");
	
}
