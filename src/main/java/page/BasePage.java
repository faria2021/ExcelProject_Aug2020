package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	
	
		public void waitForElement(WebDriver driver, int timeInSeconds, WebElement elementLocator) {
				
				WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
				wait.until(ExpectedConditions.invisibilityOf(elementLocator));
			}

		public int randomGenerator(int boundryNumber) {
			
			 Random rnd = new Random();
			   rnd.nextInt(999);
			   int randomNumber =rnd.nextInt(boundryNumber);
			return randomNumber;
			   
		}
		public void selectDropDown(WebElement element, String visibleTest) {
			
			Select sel = new Select(element);
			sel.selectByVisibleText(visibleTest);
		}

}
