import org.openqa.selenium.By;

public class TestNGPClass extends demoTestNG {

	public String getPageUrl() {
		String Url = driver.getCurrentUrl();
		return Url;

	}

	public String getPageTitle() {
		String Title = driver.getTitle();
		return Title;
	}
	public void loginCredential(String user, String pass) {
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
	}
	
	public String getPageText (String txtt) {
		String txt = driver.findElement(By.xpath("//[text()='" + txtt + "']")).getText();
		return txt;
	}
	public String getPageItems (String txtt) {
		String txt = driver.findElement(By.xpath("//[text()='" + txtt + "']")).getText();
		return txt;	
	}
		
		
}

