import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12selQ1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("http://www.greenstechnologys.com/");
WebElement down = driver.findElement(By.xpath("//span[text()='Greens Technology Anna Nagar']"));

driver.manage().window().maximize();

JavascriptExecutor je = (JavascriptExecutor)driver;

je.executeScript("arguments[0].scrollIntoView(true)",down);

Thread.sleep(5000);

WebElement up = driver.findElement(By.xpath("//a[text()='TESTIMONIALS']"));

je.executeScript("arguments[0].scrollIntoView(false)",up);



















}
}
