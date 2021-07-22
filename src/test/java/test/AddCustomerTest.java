package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ADDCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
	WebDriver driver;
	ExcelReader exkread = new ExcelReader("src\\main\\java\\data\\Source file.xlsx");
	String userName =exkread.getCellData("Sheet 1"," Fullname", 3);
	//String fullName =exkread.getCellData(Sheet1, Fullname, 3) ;
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		driver =BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		LoginPage.insertUserName(userName);
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		
		dashboardPage.validateDashboardHeader();
		dashboardPage.clickOnCustomerButton();
		dashboardPage.clickOnAddCustomerButton();
		ADDCustomerPage addCustomerPage = PageFactory.initElements(driver, ADDCustomerPage.class);
		addCustomerPage.insertUserName(userName);
		String companyName = null;
		addCustomerPage.insertCompanyName(companyName);
		String email = null;
		addCustomerPage.insertEmailAddress(email);
		
		 
	}

}
