import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
			WebElement textBox =	driver.findElement(By.id("APjFqb"));
			textBox.sendKeys("India");
			textBox.sendKeys(Keys.ENTER);
	}

}
