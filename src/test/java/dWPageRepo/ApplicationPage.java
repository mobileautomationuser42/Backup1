package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApplicationPage {

	public static By ApplicationLabel = AppiumBy.xpath("//*[@text=\"Application\"]");
	
	public static By ApplicationForDomesticWorkerText = AppiumBy.xpath("//*[@text=\"Application for Domestic Worker\"]");
	
	public static By IsTheDomesticWorkerInsideTheCountryText = AppiumBy.xpath("//*[@text=\"Is the Domestic Worker Inside the Country?\"]");
	
	public static By InsideTheUAERadioButton = AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/checkBox\"])[1]");
	
	public static By OutsideTheUAERadioButton = AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/checkBox\"])[2]");
	
	public static By ContinueButton = AppiumBy.xpath("//*[@text=\"Continue\"]");
	
	public static By WhatDoYouPreferText = AppiumBy.xpath("//*[@text=\"What do you Prefer?\"]");
	
	public static By ChangeStatusRadioButton = AppiumBy.xpath("//*[@text=\"Change Status\"]");
	
	public static By ExitAndRenterUAERadioButton = AppiumBy.xpath("//*[@text=\"Exit and re-enter UAE\"]");
}
