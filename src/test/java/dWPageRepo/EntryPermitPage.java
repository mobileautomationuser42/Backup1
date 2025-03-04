package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class EntryPermitPage {
	public static By ApplicationNo= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Application No.\"]");
	public static By MohreRefNo= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Mohre Ref No.\"]");
	public static By ApplicationStatus= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Application Status\"]");
	
	public static By EntryPermitNo= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Entry Permit No.\"]");
	public static By IssueDate= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Issue Date\"]");
	public static By Expirydate= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Expiry date\"]");
	
	
	public static By WorkerContractView= AppiumBy.xpath("(//android.widget.Button[@text=\"View\"])[1]");
	public static By EntryPermitView= AppiumBy.xpath("(//android.widget.Button[@text=\"View\"])[2]");
	public static By PaymentReceiptView= AppiumBy.xpath("(//android.widget.Button[@text=\"View\"])[3]");
	
	public static By NavigateBackDomesticWorker= AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	public static By WorkerContractpdf= AppiumBy.xpath("//android.widget.TextView[@text=\"Worker_Contract.pdf\"]");  //pdf name
	public static By NavigateBackEntryPermit= AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]");
	public static By Moreoptions= AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
	
	public static By DownloadBtn= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.docs:id/title\" and @text=\"Download\"]");
	public static By PaymentReceiptViewForNewAppli= AppiumBy.xpath("//android.widget.Button[@text=\"View\"]");
	}

