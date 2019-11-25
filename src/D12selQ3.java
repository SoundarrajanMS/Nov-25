import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12selQ3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	JavascriptExecutor je =(JavascriptExecutor)driver;
	
	
	
	
	
driver.get("http://www.greenstechnologys.com/selenium-course-content.html");



WebElement close = driver.findElement(By.xpath("//button[@class='close']"));
je.executeScript("arguments[0].click()", close);



WebElement s = driver.findElement(By.xpath("//h2[contins(text(),'OMR']"));
	
	je.executeScript("arguments[0].scrollIntoView(true)",s);

	WebElement best = driver.findElement(By.xpath("//h2[contins(text(),'OMR']"));

	highLightElement(driver,best);

	}

	private static void highLightElement(WebDriver driver, WebElement best) {
		JavascriptExecutor je =(JavascriptExecutor)driver;
		je.executeScript("arguments[0].setAttribute('background:red')", best);
				
	}
}