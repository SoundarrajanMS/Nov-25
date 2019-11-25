import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12selQ4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");

driver.manage().window().maximize();
WebElement user = driver.findElement(By.id("email"));

JavascriptExecutor je = (JavascriptExecutor)driver;

je.executeScript("arguments[0].setAttribute('value','mssoundr09')",user);


WebElement pas = driver.findElement(By.id("pass"));
je.executeScript("arguments[0].setAttribute('value','995105007')", pas);

Object pruser = je.executeScript("return arguments[0].getAttribute('value')",user);
String s1 = (String)pruser;
System.out.println(s1);

Object prpass = je.executeScript("return arguments[0].getAttribute('value')",pas);
String s2 = (String)prpass;
System.out.println(s2);



















}
}
