package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class AssertionsUtils {

    private WebDriver driver;

    public AssertionsUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void assertElementPresent(By by) {
        try {
            Assert.assertTrue(isElementPresent(by), "Element not present: " + by.toString());
        } catch (Exception e) {
            handleAssertionException(e);
        }
    }
    
    

    public void assertElementNotPresent(By by) {
        try {
            Assert.assertFalse(isElementPresent(by), "Element present but should not be: " + by.toString());
        } catch (Exception e) {
            handleAssertionException(e);
        }
    }

    public void assertTextEquals(By by, String expectedText) {
        try {
            WebElement element = driver.findElement(by);
            String actualText = element.getText().trim();
            Assert.assertEquals(actualText, expectedText, "Text mismatch for element " + by.toString());
        } catch (Exception e) {
            handleAssertionException(e); ////android.widget.TextView[@resource-id="ae.smartdubai.dubainow.enterprise:id/textViewTitle" and @text="Passport Expiry Date should be at least 6 months from today!"]
        }
    }

    public void assertTitleEquals(String expectedTitle) {
        try {
            String actualTitle = driver.getTitle().trim();
            Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
        } catch (Exception e) {
            handleAssertionException(e);
        }
    }

    public void assertContainsText(By locator, String expectedText) {
        try {
            WebElement text = driver.findElement(locator);
            String actualText = text.getText();          
            Assert.assertTrue(actualText.contains(expectedText), "Text does not contain the expected part: " + expectedText);
        } catch (Exception e) {
            handleAssertionException(e);
        }
    }
    
    public void assertUrlContains(String expectedUrlPart) {
        try {
            String actualUrl = driver.getCurrentUrl();
            Assert.assertTrue(actualUrl.contains(expectedUrlPart), "URL does not contain the expected part: " + expectedUrlPart);
        } catch (Exception e) {
            handleAssertionException(e);
        }
    }

    public void assertElementDisplayed(By by) {
        try {
            WebElement element = driver.findElement(by);
            Assert.assertTrue(element.isDisplayed(), "Element is not displayed: " + by.toString());
        } catch (Exception e) {
            handleAssertionException(e);
        }
    }

    public void assertElementSelected(By by) {
        try {
            WebElement element = driver.findElement(by);
            Assert.assertTrue(element.isSelected(), "Element is not selected: " + by.toString());
        } catch (Exception e) {
            handleAssertionException(e);
        }
    }

    public void assertElementEnabled(By by) {
        try {
            WebElement element = driver.findElement(by);
            Assert.assertTrue(element.isEnabled(), "Element is not enabled: " + by.toString());
        } catch (Exception e) {
        	Assert.fail("Element not found: " + by.toString()); 
        }
    } 
    
    public void assertElementDisabled(By by) {
        try {
            WebElement element = driver.findElement(by);
            Assert.assertFalse(element.isEnabled(), "Element is not disabled: " + by.toString());
        } catch (Exception e) {
        	Assert.fail("Element not found: " + by.toString()); 
        }
    }
    
    public void assertElementNotClickable(By by) {
        try {
            WebElement element = driver.findElement(by);
            boolean isClickable = Boolean.parseBoolean(element.getAttribute("clickable"));
            Assert.assertFalse(isClickable, "Element is clickable: " + by.toString());
        } catch (Exception e) {
            handleAssertionException(e);
        }
    }
    
    public void assertElementAttribute(By by, String attributeName, String expectedValue) {
        try {
            // Locate the element
            WebElement element = driver.findElement(by);

            // Get the attribute value
            String attributeValue = element.getAttribute(attributeName);

            // Assert the attribute value
            Assert.assertEquals(attributeValue, expectedValue, "Attribute value does not match: " + attributeName);
        } catch (Exception e) {
            handleAssertionException(e, by, attributeName);
        }
    }

    private void handleAssertionException(Exception e, By by, String attributeName) {
		// TODO Auto-generated method stub
		
	}

	private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    private void handleAssertionException(Exception e) { 
        System.err.println("Assertion Exception: " + e.getMessage());
    }

	
}
