import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumAssignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of the page is: "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();

	}
}
