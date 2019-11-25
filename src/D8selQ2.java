import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D8selQ2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;

driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");

//WebElement footer = driver.findElement(By.xpath("//frameset[@rows='*,30']"));
//driver.switchTo().frame(footer);


WebElement page1 = driver.findElement(By.xpath("//frame[@name='login_page']"));
driver.switchTo().frame(page1);


WebElement usr = driver.findElement(By.xpath("//input[@class='input_password']"));
Thread.sleep(10000);

usr.sendKeys("soundar");
Thread.sleep(5000);

//js.executeScript("arguments[0].setAttribute('value','12345')", usr);


Object print = js.executeScript("return arguments[0].getAttribute('value')", usr);
String s=(String)print;
System.out.println(s);

driver.manage().window().maximize();














}
}
