import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAssignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of the page is: "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();

	}
}
