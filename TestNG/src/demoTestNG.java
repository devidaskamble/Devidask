import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demoTestNG {

	static WebDriver driver;

	static String Url = "https://www.saucedemo.com/";

	@BeforeTest(alwaysRun = true, groups = "sanity,regression")
	public void initBrowser() {
		System.setProperty("WebDriver.Chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();

	}

	@Test(priority = 0, groups = "sanity")
	void verifyurl() {	
		TestNGPClass obj = new	TestNGPClass();
		SoftAssert sa = new SoftAssert();	
		sa.assertEquals(obj.getPageUrl(), Url ,"verifying url" );
		System.out.println("verifying url of page by using softassert");
		sa.assertAll();
	
	}
	@Test(priority = 1, groups = "regression")
	void verifytitle() {	
		TestNGPClass obj = new	TestNGPClass();
		SoftAssert sa = new SoftAssert();	
		sa.assertEquals(obj.getPageTitle(),"Swag Labs","verifying title" );
		System.out.println("verifying url of page by using softassert");
		sa.assertAll();		
}
	

