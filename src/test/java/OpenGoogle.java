import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	
	
	public void openGoogle() {
		System.out.println("This is a test to open Google");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title of the page is: " + driver.getTitle());
		
	}

}
