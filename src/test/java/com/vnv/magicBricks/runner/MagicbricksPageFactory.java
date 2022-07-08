package com.vnv.magicBricks.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagicbricksPageFactory {
WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"loanList\"]/li[2]/a")
	@CacheLookup
	WebElement LoanAP;
	
	@FindBy(xpath = "//*[@id=\"loanAmount\"]")
	@CacheLookup
	WebElement Loanamount;
	
	@FindBy(xpath = "//*[@id=\"mobileNumberLoggedIn\"]")
	@CacheLookup
	WebElement MobileNo;
	
	@FindBy(xpath ="//*[@id=\"mobileNumberLoggedIn\"]")
	@CacheLookup
	WebElement Getstarted;
	
	//@FindBy(xpath="/html/body/section[1]/div[1]/div[2]/div/a")
	//@CacheLookup
	//WebElement Submit;
	
	@FindBy(xpath = "//*[@id=\"15\"]")
	@CacheLookup
	WebElement Currentcity;
	
	@FindBy(xpath ="//*[@id=\"qusfoot15\"]/div[2]/a")
	@CacheLookup
	WebElement Next;
	
	@FindBy(xpath = "//*[@id=\"answer17\"]")
	@CacheLookup
	WebElement EmailID;
	
	@FindBy(xpath ="//*[@id=\"qusfoot17\"]/div[2]/a")
	@CacheLookup
	WebElement Next1;

	@FindBy(xpath = "//*[@id=\"answer19\"]")
	@CacheLookup
	WebElement Fullname;
	
	@FindBy(xpath ="//*[@id=\"qusfoot19\"]/div[2]/a")
	@CacheLookup
	WebElement Next2;
	
	@FindBy(xpath = "//*[@id=\"question21\"]/div[2]/span[1]")
	@CacheLookup
	WebElement NatureEMP;
	
	@FindBy(xpath ="//*[@id=\"qusfoot21\"]/div[2]/a")
	@CacheLookup
	WebElement Next3;
	
	@FindBy(xpath = "//*[@id=\"answer23\"]")
	@CacheLookup
	WebElement MonthlyI;
	
	@FindBy(xpath ="//*[@id=\"qusfoot23\"]/div[2]/a")
	@CacheLookup
	WebElement Next4;
	
	@FindBy(xpath = "//*[@id=\"25\"]")
	@CacheLookup
	WebElement Propertloc;
	
	@FindBy(xpath ="//*[@id=\"qusfoot25\"]/div[2]/a")
	@CacheLookup
	WebElement Next5;

	@FindBy(xpath = "home-loan__action--btn btn-red medium")
	@CacheLookup
	WebElement Apply;
	
	@FindBy(id = "emailOrMobile")
	@CacheLookup
	WebElement email;
	
	@FindBy(id = "btnStep1")
	@CacheLookup
	WebElement nextButton;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement password1;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement login1;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div[3]/div[2]/a")
	@CacheLookup
	WebElement forgetpassword;
	
	

	
	
	
	
	public WebElement fieldUname(){
		return LoanAP;
		}
	
	
	public void clickLoanAP()
	{
		this.LoanAP.click();
	}
	
	public WebElement fieldLoanamount1(){
		return Loanamount;
		}
	
	
	public void setLoanamount(String Loanamount)
	{
	this.Loanamount.sendKeys(Loanamount);
	
	}
	public WebElement fieldMobileNo(){
		return MobileNo;
		}
	
	
	public void setMobileNo1(String MobileNo)
	{
	this.MobileNo.sendKeys(MobileNo);
	
	}

	public WebElement GetstartedField1()
	   {
		return Getstarted;
		}

		public void clickGetstarted()
		{
		this.Getstarted.click();
		}
		
		public void setCurrentcity(String Currentcity)
		{
		this.Currentcity.sendKeys(Currentcity);
		
		}
		public WebElement NextField()
		   {
			return Next;
			}

			public void clickNext1()
			{
			this.Next.click();
			}
	
			public void setEmailID(String EmailID)
			{
			this.EmailID.sendKeys(EmailID);
			
			}
			public WebElement Next1Field()
			   {
				return Next1;
				}

				public void clickNext11()
				{
				this.Next1.click();
				}
		
	
				public void setFullname(String Fullname)
				{
				this.Fullname.sendKeys(Fullname);
				
				}
				public WebElement Next2Field()
				   {
					return Next2;
					}

					public void clickNext2()
					{
					this.Next2.click();
					}

					public void setNatureEMP(String NatureEMP)
					{
					this.NatureEMP.sendKeys(NatureEMP);
					
					}
					public WebElement Next3Field()
					   {
						return Next3;
						}

						public void clickNext3()
						{
						this.Next3.click();
						}
	
						public void setMonthlyI(String MonthlyI)
						{
						this.MonthlyI.sendKeys(MonthlyI);
						
						}
						public WebElement Next4Field()
						   {
							return Next4;
							}

							public void clickNext4()
							{
							this.Next4.click();
							}
						
							public void setPropertloc(String Propertloc)
							{
							this.Propertloc.sendKeys(Propertloc);
							
							}
							public WebElement Next5Field()
							   {
								return Next5;
								}

								public void clickNext5()
								{
								this.Next5.click();
								}			
						
						
								public WebElement ApplyField()
								   {
									return Apply;
									}

									public void clickApply()
									{
									this.Apply.click();
									}					
						
						
	
	
		public MagicbricksPageFactory (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			}


		public static MagicbricksPageFactory initElements(WebDriver driver2, Class<MagicbricksPageFactory> class1) {
			// TODO Auto-generated method stub
			return null;
		}
}
