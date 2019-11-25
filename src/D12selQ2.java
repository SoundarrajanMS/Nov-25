import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12selQ2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.toolsqa.com/");

WebElement address = driver.findElement(By.xpath("//span[text()='Recent Articles']"));

JavascriptExecutor js = (JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true)",address);
Thread.sleep(10000);
driver.manage().window().maximize();

WebElement top = driver.findElement(By.xpath("(//span[text()='DEMO SITES'])[1]"));
Thread.sleep(5000);
js.executeScript("arguments[0].scrollIntoView(false)",top);

}
}
