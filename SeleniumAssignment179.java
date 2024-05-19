import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAssignment179 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement fashionLogo = driver.findElement(By.xpath("//span[contains(text(),\"Fashion\")]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(fashionLogo).perform();
		Thread.sleep(2000);
		WebElement shirtSelect = driver.findElement(By.xpath("//div[@class='_31z7R_']//child::a[2]"));
		shirtSelect.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
