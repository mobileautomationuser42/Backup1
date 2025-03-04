package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PersonalDetailsPage {

	public static By StartButton = AppiumBy.xpath("//android.widget.Button[@text=\"START\"]");
	
	public static By ContinueButton = AppiumBy.xpath("//*[@text=\"Continue\"]");
	
	public static By PersonalDetailsText = AppiumBy.xpath("//*[@text=\"Personal Details\"]");
	
	public static By DomesticWorkerPersonalDetailsText = AppiumBy.xpath("//android.widget.TextView[@text=\"Domestic Worker Personal Details\"]");
	
	public static By FirstNameEnglishField = AppiumBy.xpath("//android.widget.EditText[@text=\"First Name (English)\"]");
	
	public static By MiddleNameEnglishField = AppiumBy.xpath("//android.widget.EditText[@text=\"Middle Name (English) (Optional)\"]");
	
	public static By LastNameEnglishField = AppiumBy.xpath("//android.widget.EditText[@text=\"Last Name (English)\"]");
	
	public static By NationalityText= AppiumBy.xpath("//android.widget.TextView[@text=\"Nationality\"]");
	
	public static By JobText = AppiumBy.xpath("//android.widget.TextView[@text=\"Job\"]");
	
	public static By GenderText = AppiumBy.xpath("//android.widget.TextView[@text=\"Gender\"]");
	
	public static By DateOfBirthText = AppiumBy.xpath("//android.widget.TextView[@text=\"Date of birth\"]");
	
	public static By PlaceOfBirthText = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"Place of Birth (English)\"]");
	
	public static By CountryOfBirthText = AppiumBy.xpath("//android.widget.TextView[@text=\"Country of Birth\"]");
	
	public static By ReligionText = AppiumBy.xpath("//android.widget.TextView[@text=\"Religion\"]");
	
	public static By FaithText = AppiumBy.xpath("//android.widget.TextView[@text=\"Faith\"]");
	
	public static By MaritalStatusText = AppiumBy.xpath("//android.widget.TextView[@text=\"Marital Status\"]");
	
	public static By PreviousNationalityText = AppiumBy.xpath("//android.widget.TextView[@text=\"Previous Nationality\"]");
	
	public static By EducationText = AppiumBy.xpath("//android.widget.TextView[@text=\"Education\"]");
	
	public static By EducationCountryText = AppiumBy.xpath("//android.widget.TextView[@text=\"Education Country\"]");
	
	public static By MotherNameText = AppiumBy.xpath("//android.widget.EditText[@text=\"Mother's Name (English)\"]");
	
	public static By FirstLanguageText = AppiumBy.xpath("//android.widget.TextView[@text=\"First Language\"]");
	
	//
	
	public static By FirstNameEnglishFieldEdit = AppiumBy.xpath("(//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\"])[1]");
	public static By EmirateText = AppiumBy.xpath("//android.widget.TextView[@text=\"Emirate (Birth)\"]");
	public static By BirthText = AppiumBy.xpath("//android.widget.TextView[@text=\"City (Birth)\"]");
//for Renew residency
	public static By SelectedEmirate = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\" and @text=\"DUBAI\"]");
	public static By SelectedCity = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\" and @text=\"DUBAI \"]");
	public static By SelectedEducationCountry = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\" and @text=\"NEPAL\"]");
	public static By SelectedMotherName = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/edit_input\" and @text=\"MAAN\"]");
	

}
