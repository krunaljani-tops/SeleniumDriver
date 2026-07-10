import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XPathLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  // Set path to chromedriver
        //System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		String path=System.getProperty("user.dir");
		System.out.println(path);
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
        WebDriver driver = new ChromeDriver();

        // Load local HTML file
        driver.get("file:///C:\\Users\\user\\eclipse-workspace_new\\SeleniumDriver\\src\\main\\java\\demo_xpath.html");

        // 1. Absolute XPath (not recommended in real projects)
        WebElement usernameAbs = driver.findElement(By.xpath("/html/body/div/input[@id='username']"));
        usernameAbs.sendKeys("absolute");
        System.out.println("Absolute "+usernameAbs);

        // 2. Relative XPath
        WebElement usernameRel = driver.findElement(By.xpath("//input[@id='username']"));
        usernameRel.clear();
        usernameRel.sendKeys("relative");
        System.out.println("Relative "+usernameRel);

        // 3. contains()
        WebElement passwordContains = driver.findElement(By.xpath("//input[contains(@placeholder, 'Password')]"));
        passwordContains.sendKeys("contains123");
        System.out.println("Contain "+passwordContains);

        // 4. starts-with()
        WebElement usernameStart = driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Enter')]"));
        usernameStart.clear();
        usernameStart.sendKeys("startsWith");
        System.out.println("usernameStart "+usernameStart);

        // 5. text()
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        System.out.println("Text Found: " + registerLink.getText());

        // 6. XPath using AND
        WebElement userByAnd = driver.findElement(By.xpath("//input[@type='text' and @id='username']"));
        userByAnd.clear();
        userByAnd.sendKeys("andUsed");

        // 7. XPath using OR
        WebElement passByOr = driver.findElement(By.xpath("//input[@type='text' or @type='password']"));
        System.out.println("OR matched element placeholder: " + passByOr.getAttribute("placeholder"));

        // 8. XPath using parent axis
        WebElement parent = driver.findElement(By.xpath("//input[@id='username']/parent::*"));
        System.out.println("Parent tag name: " + parent.getTagName());

        // 9. XPath using following
        WebElement followingElement = driver.findElement(By.xpath("//label[text()='Username:']/following::input[1]"));
        followingElement.clear();
        followingElement.sendKeys("followed");
        System.out.println("Followed "+followingElement);

        // 10. XPath using preceding
        WebElement precedingLabel = driver.findElement(By.xpath("//input[@id='username']/preceding::label[1]"));
        System.out.println("Preceding label: " + precedingLabel.getText());

        // Finish test
        Thread.sleep(3000);
       // driver.quit();


	}

}
