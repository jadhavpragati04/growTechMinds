import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class TakeSnapWithTime {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		Date date = new Date();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		TakesScreenshot ss = driver;
		File src = ss.getScreenshotAs(OutputType.FILE); 
		File des = new File("C:\\Users\\Pragati\\Desktop\\Grotechminds\\AutomationAssignmentAB40\\src\\screenshot"+date.getTime()+".png");
		FileHandler.copy(src, des);
		driver.quit();
		

	}

}
