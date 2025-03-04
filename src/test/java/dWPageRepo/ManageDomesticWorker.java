package dWPageRepo;

import org.openqa.selenium.By;


import io.appium.java_client.AppiumBy;

public class ManageDomesticWorker {

    public static By CancelResidency = AppiumBy.xpath("//*[@text=\"Cancel Residency\"]");
	
	public static By YesCancelResidency = AppiumBy.xpath("//*[@text=\"Yes, Cancel Residency\"]");
	
	public static By NoDontCancel = AppiumBy.xpath("//*[@text=\"No, Don’t Cancel\"]");
	
	public static By NewResidency = AppiumBy.xpath("//*[@text=\"New Residency\"]");
	
	public static By Residency = AppiumBy.xpath("//*[@text=\"Residency\"]");
	public static By CancelResidencyStepper = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Cancel Residency\"]");
	
}
//android.widget.TextView[@resource-id="ae.smartdubai.dubainow.enterprise:id/textViewTitle" and @text="Cancel Residency"]