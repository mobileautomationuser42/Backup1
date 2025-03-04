package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ResidencyDurationPage {
	public static By ResidencyYears = AppiumBy.androidUIAutomator("new UiSelector().text(\"Residency Years\")");
	public static By SelectResidency = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/lbl_description");



}
