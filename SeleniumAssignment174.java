import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment174 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Pragati");
		fname.sendKeys(Keys.CONTROL, "A");
		fname.sendKeys(Keys.CONTROL, "C");
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys(Keys.CONTROL,"V");
		Thread.sleep(1000);
		driver.quit();
	}

}
