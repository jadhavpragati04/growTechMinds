import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment173 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchArea = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")); 
		searchArea.sendKeys("India");
		Thread.sleep(1000);
		searchArea.sendKeys(Keys.ENTER);
		driver.close();

	}

}
