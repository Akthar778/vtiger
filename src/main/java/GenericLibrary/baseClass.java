package GenericLibrary;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMpage.CreateNewLeadPage;
import POMpage.CreateNewOrganisationage;
import POMpage.CreatecontactPage;
import POMpage.HomePage;
import POMpage.LeadPage;
import POMpage.LoginPage;
import POMpage.OrganisationInformationPage;
import POMpage.OrganisationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_page.CreateOrganizationPageClass;
import pom_page.CreatingContactpageClass;
import pom_page.HomePageClass;
import pom_page.OrganizationsPageClass;

public class baseClass {
	public static WebDriver driver;
	public propertyUtility ppt;

	public webDriverUtility utility;
	public CreateNewLeadPage leadpage;
	public LoginPage login;
	public HomePage home;
	public LeadPage lead;
	public CreateNewOrganisationage CreatOrgnisationPage;
	public OrganisationInformationPage OrgInfo;
	public OrganisationPage OrgPage;
	public CreatecontactPage createcontPage;


	//class practice 
	public HomePageClass homepage;
	public OrganizationsPageClass orgpage;
	public CreateOrganizationPageClass createorgclass;
	public CreatingContactpageClass createcontact;

	@BeforeClass(alwaysRun = true)
	public void LaunchingBrowser() throws IOException {
		ppt = new propertyUtility();
		utility = new webDriverUtility();

		if (ppt.readingDataFromPropertiesFile("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		driver.get(ppt.readingDataFromPropertiesFile("url"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		leadpage = new CreateNewLeadPage(driver);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		lead = new LeadPage(driver);
		CreatOrgnisationPage = new CreateNewOrganisationage(driver);
		OrgInfo = new OrganisationInformationPage(driver);
		OrgPage = new OrganisationPage(driver);
		createcontPage = new CreatecontactPage(driver);


		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
		login.getLoginclickButton().click();

	}

	@BeforeMethod(alwaysRun = true)
	public void navigateToApplication() throws IOException {		
		homepage=new HomePageClass(driver);
		orgpage=new OrganizationsPageClass(driver);
		createorgclass=new CreateOrganizationPageClass(driver);
		createcontact=new CreatingContactpageClass(driver);
	}

	@AfterClass(alwaysRun = true)
	public void teardownThheBrowser() throws InterruptedException {
		utility.mouseHoveringOnElement(home.getAdministratorButton());
		Thread.sleep(3000);
		home.getSignout().click();
		driver.quit();
	}

}
