package dWPageRepo;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
 
public class ProfilePage {
	public static By ProfileLabel = AppiumBy.accessibilityId("Profile");
	
	public static By LogoutButton = AppiumBy.accessibilityId("Log out\nVersion 4.5.5");
	
	public static By LogoutButtonOnPopup = AppiumBy.accessibilityId("Log out");
}
