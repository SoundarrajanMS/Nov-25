import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12selQ5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor je = (JavascriptExecutor)driver;
	
	
	
	driver.get("http://www.adactin.com/HotelApp/");
	WebElement usrnme = driver.findElement(By.xpath("//input[@id='username']"));
	
	je.executeScript("arguments[0].setAttribute('value','chandru')", usrnme);
	
	Object out1 = je.executeScript("return arguments[0].getAttribute('value')", usrnme);
	
	String s1 = (String)out1;
	System.out.println(s1);
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
	je.executeScript("arguments[0].setAttribute('value','1234577890')",pass);
	
	WebElement log = driver.findElement(By.xpath("//input[@id='login']"));
	je.executeScript("arguments[0].click()",log);
	
	
	
	}

}
