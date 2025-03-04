package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class HomePage {
	
	public static By QA = AppiumBy.xpath("//android.widget.TextView[@text='QA']");
	
	public static By Skip = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/buttonSkip");
	
	public static By WelcomeToDubaiNow = AppiumBy.xpath("//android.widget.TextView[@text='Welcome to DubaiNow!']");
	
	public static By Residency = AppiumBy.xpath("//*[@text=\"Residency\"]");
	
}
