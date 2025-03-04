package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ResidencyPage {

	public static By DomesticWorker = AppiumBy.xpath("//*[@text=\"Domestic Worker\"]");
	
	
	//Residency Section
	public static By NoOfYearsLabel = AppiumBy.xpath("//android.widget.TextView[@text=\"NUMBER OF YEARS\"]");
	
	public static By ApplyForMedicalTestLabel = AppiumBy.xpath("//*[contains(@text,\"APPLY FOR MEDICAL TEST\")]");
	
	public static By After5DaysRadioButton = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"After 5 Days\"]");	

	public static By ResidencyPageTitle = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtToolbarTitle");
	
	public static By ImmediatelyRadionButton = AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/checkBox\"])[1]");
	
	public static By ImmediatelyText = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Immediately\"]");
}
