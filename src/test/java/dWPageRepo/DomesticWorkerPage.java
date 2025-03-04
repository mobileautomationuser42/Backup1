package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DomesticWorkerPage {
	public static By SteppersTitle = AppiumBy.xpath("//android.widget.TextView[@resource-id='ae.smartdubai.dubainow.enterprise:id/textViewTitle']");
	public static By StartButton = AppiumBy.xpath("//*[@text=\"START\"]");
	
	public static By EditButton = AppiumBy.xpath("//android.widget.Button[@text=\"EDIT\"]");
	
	public static By DeleteApplicationButton = AppiumBy.xpath("//android.widget.Button[@text=\"Delete Application\"]");
	
	public static By YesDeleteApplicationButton = AppiumBy.xpath("//*[@text=\"Yes, Delete Application\"]");
	
	public static By PayButton = AppiumBy.xpath("//android.widget.Button[@text=\"PAY\"]");
	
	//public static By StatusText =  AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\"])[5]");
	public static By StatusText =  AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Ready to Pay - EP\"]");

    public static By QuotaNotAvailableText = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Quota Not Available\"]");

    public static By PurchaseButton = AppiumBy.xpath("//android.widget.Button[@text=\"PURHCASE\"]");
    
    public static By GoToDashboardButton = AppiumBy.xpath("//*[@text=\"Go To Dashboard\"]");
    
    public static By View = AppiumBy.xpath("(//android.widget.Button[@text=\"VIEW\"])[2]");
    
    public static By NotStarted = AppiumBy.xpath("//*[@text=\"Not Started\"]");
    
    public static By ChangeStatus = AppiumBy.xpath("//*[@text=\"Change Status\"]");
    
    public static By MedicalTest = AppiumBy.xpath("//*[@text=\"Medical Test- DAHC\"]");
    public static By DHAView =AppiumBy.xpath("(//android.widget.Button[@text=\"VIEW\"])[3]");
    public static By EmiratesId= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Emirates Id\"]");
    public static By TraveltoUAE= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Travel to UAE\"]");
    public static By EntryPermitRejectedStepper= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Travel to UAE\"]");

}
