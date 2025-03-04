package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PassportDetailsPage {

	//public static By BackButton = AppiumBy.accessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎");
	public static By BackButton =AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	public static By PassportNumberField = AppiumBy.xpath("//android.widget.EditText[@text=\"Passport No\"]");
	
	public static By PassportTypeText = AppiumBy.xpath("//*[@text=\"Passport Type\"]");
	
	public static By PassportTypeOptions = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Normal\"]");
	
	public static By TextMessage = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Passport Expiry Date should be at least 6 months from today!\"]");
	
	public static By PassportIssueDateText = AppiumBy.xpath("//*[@text=\"Passport Issue Date\"]");
	
	public static By PassportExpiryDateText = AppiumBy.xpath("//*[@text=\"Passport Expiry Date\"]");
	
	public static By PlaceOfIssueField = AppiumBy.xpath("//android.widget.EditText[@text=\"Place of Issue (English)\"]");
	
	public static By CountryOfIssueText = AppiumBy.xpath("//*[@text=\"Country of Issue\"]");
	
	public static By CountryOfIssueGovText = AppiumBy.xpath("//*[@text=\"Country of Issue (Government)\"]");
	
	public static By ContinueButton = AppiumBy.xpath("//*[@text=\"Continue\"]");
	
	public static By SaveAndExitButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Save & Exit\"]");
	
	public static By WorkerFileDetails = AppiumBy.xpath("//*[@text=\"Worker's File Details\"]");
	
	public static By EIDANo = AppiumBy.xpath("//*[@text=\"EIDA Number (Optional)\"]");
	
	public static By OldPassportNumber = AppiumBy.xpath("//*[@text=\"Old Passport Number (Optional)\"]");
	
	
	public static By PassportIssueDateBtn = AppiumBy.xpath("(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[1]");
	public static By PassportExpiryDateBtn =AppiumBy.xpath("(//android.view.ViewGroup[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[2]");
	public static By NextMonthArrow= AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_next_month_arrow");
	public static By PreviousMonthArrow= AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_previous_month_arrow");
	public static By OkBtn= AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/mdtp_ok");
	public static By PreviousDate=AppiumBy.xpath("//android.view.View[@content-desc=\"02 January 2025\"]");
	public static By NextDate=AppiumBy.xpath("//android.view.View[@content-desc=\"02 June 2025\"]");
	//for Renew
	public static By PassportNumberFieldText = AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input_layout\"])[1]");
	//public static By PassportText = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Normal\"]");
	public static By IssueDateField = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/calendarValue\" and @text=\"2021-05-01\"]");
	public static By ExpiryDateField = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/calendarValue\" and @text=\"2025-12-18\"]");
	public static By SelectedCountry = AppiumBy.xpath("//*[@text=\"UNITED ARAB EMIRATES\"]");
	public static By SelectedCountryGov = AppiumBy.xpath("//*[@text=\"UNITED ARAB EMIRATES\"]");
	
}
