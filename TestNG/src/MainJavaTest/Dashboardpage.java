package MainJavaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.BaseTest;

public class Dashboardpage extends BaseTest {
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement titleDashBoard;

	public Dashboardpage  (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String gettitleofDashBard() {
		String str =titleDashBoard.getText();
		return str;
	
	}

	

	
}
