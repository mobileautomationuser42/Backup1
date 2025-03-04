package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PolicyDetailsPage {

	public static By PolicyNoText = AppiumBy.xpath("//*[contains(@text,\"Policy no\")]");
	
	public static By PaymentReceipt = AppiumBy.xpath("//*[contains(@text,\"Payment Receipt\")]");
	
	public static By PurchaseReceipt = AppiumBy.xpath("//*[contains(@text,\"Purchase Date\")]");
	
	public static By InsuranceReceiptView= AppiumBy.xpath("//android.widget.Button[@text=\"View\"]");
	
}
