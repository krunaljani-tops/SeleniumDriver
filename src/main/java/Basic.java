import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String path=System.getProperty("user.dir");
		//System.out.println(path);
		//String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver_137.exe";
	//	System.out.println("full path "+fullpath);
		//System.setProperty("webdriver.chrome.driver",fullpath);
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String Url=driver.getCurrentUrl();
		System.out.println("Current Url "+Url);
		String Actualtitle=driver.getTitle();
		String ExpectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("Title "+Actualtitle);
		if(Actualtitle.equals(ExpectedTitle)) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		String source=driver.getPageSource();
		System.out.println("Page Source "+source);
		
		String window=driver.getWindowHandle();
		System.out.println("Window "+window);
	}

}
