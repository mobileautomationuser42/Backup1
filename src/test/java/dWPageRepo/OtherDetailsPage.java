package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class OtherDetailsPage {

	public static By ContractingInformationLabel = AppiumBy.xpath("//*[contains(@text,\"CONTRACTING INFORMATION\")]");
	
	public static By PersonalTypeLabel = AppiumBy.xpath("//android.widget.TextView[@text=\"Personal Type\"]");
	
	public static By MediatorTypeLabel = AppiumBy.xpath("//android.widget.TextView[@text=\"Mediator Type\"]");
	
	public static By PersonalTypeOptions = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[1]");
		
	public static By MediatorTypeOptions = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"])[2]");
	
	public static By MediatorAddressField = AppiumBy.xpath("//*[contains(@text,\"Mediator Address\")]");
	
	public static By PersonalTypeValues(String text) {
	    return AppiumBy.xpath("//android.widget.TextView[contains(@text,\"" + text + "\")]");
	}
	
	public static By MediatorTypeValues(String text) {
	    return AppiumBy.xpath("//android.widget.TextView[contains(@text,\"" + text + "\")]");
	}
	
	public static By ContinueButton = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/button");
							
}
