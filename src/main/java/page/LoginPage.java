package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver	=driver;
	}
	
	//liberary
	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	static
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@name='login']")
	WebElement SINGIN_BUTTON_FIELD;
	
	
	//interactive actions
	
	public static void insertUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
		
	}
 public void insertPassword(String password) {
	 PASSWORD_FIELD.sendKeys(password);
	 
 }
 public void clickOnSinginButton() {
	 SINGIN_BUTTON_FIELD.clear();
	 
 }
}
