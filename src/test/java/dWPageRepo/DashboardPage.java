package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DashboardPage {

	public static By DashboardTitle = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtToolbarTitle");
	public static final By PROFILE_STATUS_LOCATOR = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"]");
	
	// public static final By PROFILE_STATUS_LOCATOR = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"ae.smartdubai.dubainow.enterprise:id/textViewSubDetail\")");
	 public static final By PROFILE_STATUS_And_ID_LOCATOR = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/textViewSubDetail");
	 
	public static By ProfileLabel = AppiumBy.xpath("//*[@text=\"Profile\"]");
	
	public static By NewApplicationButton = AppiumBy.xpath("//*[@text=\"New Application\"]");
	
	public static By ApplicantProfile = AppiumBy.xpath("//*[@index=\"5\"]");
	
	public static By DraftProfileCard = AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[8]");
	
	public static By DraftProfileArrow = AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/mainContainer\"])[8]/android.widget.LinearLayout[2]");

	public static By WPPQuotaStatus = AppiumBy.xpath("//android.widget.TextView[contains(@text,\"WPP Quota: \")]");
	
	public static By NoDependenttoShowLabel = AppiumBy.xpath("//android.widget.TextView[@text=\"No Dependent to Show\"]");
	
	public static By FamilyTab = AppiumBy.accessibilityId("Family");
	
	public static By DomesticWorkerTab = AppiumBy.accessibilityId("Domestic Worker");
	
	//public static By SponsorCardSponsorTitle = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\"])[1]");
	public static By SponsorCardSponsorTitle = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Sponsor\"]");

	public static By SponsorCardSponsorName = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\"])[1]");
	
	//public static By SponsorCardEIDA = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewSubDetail\"])[1]");
	public static By SponsorCardEIDA = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewSubDetail\"]");

	
	public static By HistoryButton = AppiumBy.xpath("//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
	public static By RejectedStepper   = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Rejected\"]");
	public static By ActiveEntryPermitStepper   = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Active | Entry permit\"]");
	public static By DraftStepper= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewTitle\" and @text=\"Draft\"]");
	
}
