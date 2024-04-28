import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		WebElement registerLink = driver.findElement(By.id("register_Layer"));
		registerLink.click();
		WebElement continueBtn = driver.findElement(By.name("google-register"));
		continueBtn.click();
		Thread.sleep(1000);
		driver.close();

	}

}
