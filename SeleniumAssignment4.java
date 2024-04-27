import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of the page is: "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();

	}
}
