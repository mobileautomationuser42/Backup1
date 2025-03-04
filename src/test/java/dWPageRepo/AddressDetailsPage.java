package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class AddressDetailsPage {

	public static By AddressText = AppiumBy.xpath("//*[@text=\"Address\"]");
	
	//OUTSIDE UAE
	public static By PermanentCountryText = AppiumBy.xpath("//android.widget.TextView[@text=\"Permanent Country\"]");
	
	public static By PermanentCountryOption = AppiumBy.xpath("(//*[@text=\"Select\"])[1]");
	
	public static By CityField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"City\"]");

	public static By AbroadAddress = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Abroad Address\"]");

	public static By AbroadMobileNumberField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Abroad Mobile No. (00xxxxxxxxxx)\"]");
	
	//INSIDE UAE
	public static By AdressInsideUAEText = AppiumBy.xpath("//*[@text=\"ADDRESS (INSIDE UAE)\"]");
	
	public static By EmirateText = AppiumBy.xpath("//*[@text=\"Emirate\"]");
	
	public static By EmirateOptions = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[1]");
	
	public static By CityText = AppiumBy.xpath("//*[@text=\"City\"]");
	
	public static By CityOptions = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[2]");
	
	public static By AreaText = AppiumBy.xpath("//*[@text=\"Area\"]");
	
	public static By AreaOptions = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[3]");
	
	public static By StreetField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Street\"]");
	
	public static By BuildingField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Building\"]");
	
	public static By FloorField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Floor\"]");
	
	public static By ApartmentNoField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Apartment No.\"]");
	
	public static By MakaniNoField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Makani No. (Optional)\"]");
	
	public static By CheckboxDisclaimer = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/checkBox");
	
	public static By DisclaimerMessage = AppiumBy.xpath("//*[@text=\"I hereby declare that the provided information is accurate to the best of my knowledge\"]");
	
	public static By ContinueButton = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/button");
	
	public static By BackButton = AppiumBy.accessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎");
	
	public static By SaveAndExitButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Save & Exit\"]");
}
