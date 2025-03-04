package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class CancelResidency {

	public static By CancellationDetails = AppiumBy.xpath("//*[@text=\"Cancellation Details\"]");
	
	public static By SelectCancelReason = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/lbl_description\"]");
	
}
	
	 
