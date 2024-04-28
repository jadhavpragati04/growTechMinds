import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement imgLink = driver.findElement(By.partialLinkText("Imag"));
		Thread.sleep(1000);
		imgLink.click();
		System.out.println("Clicked on the link successfully");
		driver.close();

	}

}
