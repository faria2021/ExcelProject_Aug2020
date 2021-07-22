package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	
	WebDriver driver;
	ExcelReader exkread = new ExcelReader("src\\main\\java\\data\\Source file.xlsx");
	String userName =exkread.getCellData("Sheet 1"," Fullname", 3);
	
	
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		 driver = BrowserFactory.init();
		
		 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		 
		 loginPage.insertUserName(userName);
		// loginPage.insertPassword(password);
		 loginPage.clickOnSinginButton();
		 
		 
		 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		 dashboardPage.validateDashboardHeader();
		 BrowserFactory.tearDown();
		 
	}

}
