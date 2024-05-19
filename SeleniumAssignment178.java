import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAssignment178 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		ac.moveToElement(logo).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
