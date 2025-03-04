package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class HistoryPage {
	public static By DashboardTitle = AppiumBy.id("ae.smartdubai.dubainow.enterprise:id/txtToolbarTitle");
	public static By Status = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewDetail\" and @text=\"Status: Draft\"]");
	public static By Timestamp=AppiumBy.xpath("//android.widget.TextView[@resource-id=\"ae.smartdubai.dubainow.enterprise:id/textViewCaption\"]");
	//android.widget.TextView[@resource-id="ae.smartdubai.dubainow.enterprise:id/textViewCaption"]
	
}
