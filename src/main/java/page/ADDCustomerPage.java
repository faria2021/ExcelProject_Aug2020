package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ADDCustomerPage extends BasePage{

	WebDriver driver;

	// make the constactor

	public ADDCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='state']']")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='zip']']")
	WebElement ZIP_FIELD_LOCATOR;
    @FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_FIELD_LOCATOR;
	
	public void insertUserName(String userName) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(999);

		int genNum = randomGenerator(999);

		USERNAME_FIELD_LOCATOR.sendKeys(userName + genNum);
	}

	public void insertCompanyName(String companyName) {

		selectDropDown(COMPANY_FIELD_LOCATOR, companyName);

	}

	public void insertEmailAddress(String email) {
		int genNum = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(genNum + email);

	}
	public void insertPhoneNumber(String phone) {
		
		int genNum =randomGenerator(999);
		PHONE_FIELD_LOCATOR.sendKeys(phone + genNum);	
	}
 public void insertAddress(String address) {
	 ADDRESS_FIELD_LOCATOR.sendKeys(address);
	 
 }
 public void insertCity(String city) {
	 CITY_FIELD_LOCATOR.sendKeys(city); 
 }
 
 public void insertState(String state) {
	STATE_FIELD_LOCATOR.sendKeys(state);
 }
 public void insertZip(String zip) {
	 ZIP_FIELD_LOCATOR.sendKeys(zip); 
 }
 
	public void enterCountryName(String countryName ) {
selectDropDown(COUNTRY_FIELD_LOCATOR, countryName);
}
//tbody/tr[1]/td[3]
	//tbody/tr[2]/td[3]
	//tbody/tr[3]/td[3]
	//tbody/tr[4]/td[3]
	
	public void verifyEnteredNameAndDelete() {
	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[3]";
	
	for(int i =1; i<=10; i++) {
		
		String name =driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		System.out.println(name);
	
		}
	}
	
}