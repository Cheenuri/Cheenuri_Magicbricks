package com.vnv.magicBricks.steps.definitions;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vnv.magicBricks.runner.MagicbricksPageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definitions {
 private WebDriver driver;
private MagicbricksPageFactory magic;
	XSSFWorkbook wb;
    XSSFSheet sh;
  
	public void openBrowser() throws Exception{
		//launching web browser....
		System.setProperty("webdriver.chrome.driver","C:\\Sprint 2\\com.magicbricks_10\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		magic=new MagicbricksPageFactory(driver);
		driver.manage().window().maximize();
		
		System.setProperty("webdriver.edge.driver","C:\\Sprint 2\\com.magicbricks_10\\Drivers\\msedgedriver.exe");
        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://www.magicbricks.com/");
        driver1.manage().window().maximize();
        
        System.setProperty("webdriver.gecko.driver","‪‪‪F:\\Drivers\\geckodriver.exe");
        WebDriver driver11= new FirefoxDriver();
        driver11.get("https://www.magicbricks.com/");
        driver11.manage().window().maximize();
     
    
//public class Screenshot{
	//File f = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//Files.copy(f,new File("C:\\Users\\CHEARUN\\Desktop\\Magicbricks.jpg"));
	//TakesScreenshot scrShot =((TakesScreenshot)driver);
	//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
  //File DestFile=new File("C:\\Users\\CHEARUN\\Desktop\\Magicbricks.jpg")

		//using pagefactory file as reference....
		magic = MagicbricksPageFactory.initElements(driver, MagicbricksPageFactory .class);

				//reading file from excel....	
	FileInputStream fread=new FileInputStream("C:\\Users\\CHEARUN\\Desktop\\Excel.xlsx")
	wb=new XSSFWorkbook(fread);
}

	
	@Given("User is on homeloans webpage�")
	public void user_is_on_homeloans_webpage1() {
	
		System.out.println("user is on home page");
		driver.navigate().to("https://www.magicbricks.com/homeloan/home");
	   
	}

	@Given("user is on LogIn page")
	public void user_is_on_LogIn_page()
	{
		System.out.println("user is on LogIn page");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
	}
	
	@When("enter registered email_id")
	public void enter_registered_email_id() throws Exception
	{
		System.out.println("user entered valid username");
		sh=wb.getSheet("Sheet1");
		LoanAP.setLoanAP(sh.getRow(1).getCell(0).getStringCellValue());
		
		//login.setPassword(sh.getRow(5).getCell(1).getStringCellValue());
		//driver.findElement(By.id("emailOrMobile")).sendKeys("sh.getRow(5).getCell(0).getStringCellValue()");;
		Thread.sleep(2000);
	}
	
    @When("click on next")
    public void click_on_next()
    {
        login.clickNext();
    	
    }
    
    @When("enter registered password")
    public void When_enter_registered_password() throws Exception
    {
    	System.out.println("user entered password");
    	sh=wb.getSheet("Sheet1");
       login.setPassword(sh.getRow(1).getCell(1).getStringCellValue());
     // login.setPassword(sh.getRow(5).getCell(0).getStringCellValue());y
    	//driver.findElement(By.id("password")).sendKeys("Hemant1997");
        Thread.sleep(2000);
    	
    }
    
    @When("click on logIn")
    public void click_on_logIn()
    {
    	login.clickLogIn();
    }
	
	
	@Given("Click on Loan against property")
	public void click_on_balence_transfer_page() {
		
		LoanAP.clickNext();
	}

	@Given("Enter loan amount")
	public void enter_loan_amount() {
		System.out.println("Enter loan amount");
		sh=wb.getSheet("Sheet1");
		LoanAP.setUname(sh.getRow(1).getCell(0).getStringCellValue());
	   
	}

	@Given("Enter {int}-digit mobile number")
	public void enter_digit_mobile_number(Integer int1) {
		System.out.println("Enter {int}-digit mobile number");
    	sh=wb.getSheet("Sheet1");
       login.setPassword(sh.getRow(1).getCell(1).getStringCellValue());
	   
	}

	@Given("Agree to T&C")
	public void agree_to_T_C() throws InterruptedException {
	   Thread.sleep(6000);
	}

	@When("Clicks on get started button")
	public void clicks_on_get_started_button() {
		Getstarted.clickNext();
	  
	}

	@Then("User should be navigated to next page")
	public void user_should_be_navigated_to_next_page() {
		System.out.println("User navigated to next page");
	  	}

	@When("User is able to enter the one time password")
	public void user_is_able_to_enter_the_one_time_password() throws Exception {
	  Thread.sleep(7000);
	}

	@Then("user is able to Enter current city name")
	public void user_is_able_to_Enter_current_city_name() {
		sh=wb.getSheet("Sheet1");
		Currentcity.setPassword(sh.getRow(1).getCell(2).getStringCellValue());
	   
	}

	@When("User clicks on next button")
	public void user_clicks_on_next_button() {
		Next.clickNext();
	   
	}

	@When("Enter yes or no in have you shortlisted any property?")
	public void enter_yes_or_no_in_have_you_shortlisted_any_property() throws Exception {
		Thread.sleep(5000);
		Next.click();
	}

	@Then("User able to clicks on yes or NO button")
	public void user_able_to_clicks_on_yes_or_NO_button() {
		Next1.clickNext();
	 
	}

	@Then("Enter Email address")
	public void enter_Email_address() {
		sh=wb.getSheet("Sheet1");
	       login.setPassword(sh.getRow(1).getCell(3).getStringCellValue());
	  
	}

	@Then("User able to Enter Full name")
	public void user_able_to_Enter_Full_name() {
		sh=wb.getSheet("Sheet1");
	       login.setPassword(sh.getRow(1).getCell(4).getStringCellValue());
	   
	}

	@Then("User able to click on Enter Nature of income")
	public void user_able_to_click_on_Enter_Nature_of_income() throws Exception {
	  Thread.sleep(5000);
	}

	@Then("User able to Enter monthly income�")
	public void user_able_to_Enter_monthly_income1() {
		sh=wb.getSheet("Sheet1");
	       login.setPassword(sh.getRow(2).getCell(1).getStringCellValue());
	  
	}

	@Then("User able to Enter Property city name")
	public void user_able_to_Enter_Property_city_name() {
		sh=wb.getSheet("Sheet1");
	       login.setPassword(sh.getRow(2).getCell(1).getStringCellValue());
	}

	@Then("User should navigate to next page")
	public void user_should_navigate_to_next_page() {
		System.out.println("User navigate to next page");
	
	}

	@Then("Select bank from bank list")
	public void select_bank_from_bank_list() {
		Apply.clickNext();  
	}

	@When("User clicks on apply button")
	public void user_clicks_on_apply_button() {
		LoanAP.clickNext();
	}

	@Then("Application should be submitted by clicking on apply button")
	public void application_should_be_submitted_by_clicking_on_apply_button() {
	    
	}

	@Then("close")
	public void close1() {
	   
	}

	@Then("Enter incorrect Email address")
	public void enter_incorrect_Email_address() {
	   
	}

	@When("User clicks on next button Then Alert Please enter valid Email")
	public void user_clicks_on_next_button_Then_Alert_Please_enter_valid_Email() {
	  
	}

	@When("Close")
	public void close2() {
	   
	}

	@Given("Click on balance transfer page")
	public void click_on_balance_transfer_page() {
	  
	}

	@Then("When User entered Non-acceptable formatted details")
	public void when_User_entered_Non_acceptable_formatted_details() {
	  
	}

	@Then("Alert Please enter a valid city name")
	public void alert_Please_enter_a_valid_city_name() {
	  
	}

	@Then("Close�")
	public void close3() {
	   
	}

	@Given("User is on homeloans web page")
	public void user_is_on_homeloans_web_page() {
	   
	}

	@Given("Enter mobile number")
	public void enter_mobile_number() {
	   
	}

	@Given("Click on Accept T&C button")
	public void click_on_Accept_T_C_button() {
	   
	}

	@When("click on Send OTP button�")
	public void click_on_Send_OTP_button() {
	   
	}

	@Then("User should able to see the OTP submission box")
	public void user_should_able_to_see_the_OTP_submission_box() {
	  
	}

	@When("Enter the {int}-digit otp")
	public void enter_the_digit_otp(Integer int1) {
	   
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	   
	}

	@Then("Alert Thank you")
	public void alert_Thank_you() {
	   
	}

	@Given("Open the website by using URL")
	public void open_the_website_by_using_URL() {
	   
	}

	@Then("Click on home loan link in Magic Bricks web site")
	public void click_on_home_loan_link_in_Magic_Bricks_web_site() {
	  
	}

	@Then("Close")
	public void close() {
	   
	}

	@Given("User is on homeloans webpage")
	public void user_is_on_homeloans_webpage() {
	   
	}

	@Then("User able to Enter monthly income")
	public void user_able_to_Enter_monthly_income() {
	  
	}

	@When("User clicks on next buttonThen Alert Please enter valid Email")
	public void user_clicks_on_next_buttonThen_Alert_Please_enter_valid_Email() {
	  
	}

	@Given("User is on forgot password page")
	public void user_is_on_forgot_password_page1() {
	  
	}

	@When("enter the registered mail id\\/mobile no")
	public void enter_the_registered_mail_id_mobile_no() {
	   
	}

	@When("enter the {int} digit verification code received on mail\\/mobile no")
	public void enter_the_digit_verification_code_received_on_mail_mobile_no(Integer int1) {
	   
	}

	@When("enter new password")
	public void enter_new_password() {
	   
	}

	@When("re-enter the new password")
	public void re_enter_the_new_password() {
	   
	}

	@When("click on submit")
	public void click_on_submit() {
	    
	}

	@Given("user is on forgot password page")
	public void user_is_on_forgot_password_page() {
	   
	}

	@When("Invalid email address entered")
	public void invalid_email_address_entered() {
	   
	}

	@Then("alert please give a valid Email address")
	public void alert_please_give_a_valid_Email_address() {
	   
	}


}
