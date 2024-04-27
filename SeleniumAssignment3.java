import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement title = driver.findElement(By.tagName("title"));
		System.out.println("Title of the page is: "+title);
		Thread.sleep(2000);
		driver.close();

	}

}
