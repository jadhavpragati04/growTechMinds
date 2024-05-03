import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment161 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement clickArrow = driver.findElement(By.id("nav-search-dropdown-card"));
		clickArrow.click();
		Thread.sleep(1000);
		Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
		select.selectByVisibleText("Amazon Devices");
		Thread.sleep(1000);
		driver.quit();
		
		

	}

}
