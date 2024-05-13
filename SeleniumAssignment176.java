import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAssignment176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement signInTile = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(signInTile);
		WebElement signIntooltip = driver.findElement(By.id("nav-signin-tooltip"));
		signIntooltip.click();

	}

}
