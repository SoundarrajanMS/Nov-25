import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D8selQs1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/test/guru99home/");


Thread.sleep(10000);
List<WebElement> li = driver.findElements(By.tagName("iframe"));
int size = li.size();
System.out.println(size);

Thread.sleep(5000);

driver.manage().window().maximize();

JavascriptExecutor js = (JavascriptExecutor)driver;


/*WebElement outer1 = driver.findElement(By.xpath("//iframe[@id='primis_playerSekindoSPlayer5dce0b6f454ee']"));
driver.switchTo().frame(outer1);

WebElement outerlast = driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_dummy_sekindoParent864']"));
driver.switchTo().frame(outerlast);*/

WebElement lastvedio = driver.findElement(By.xpath("//iframe[@src='about:blank']"));
driver.switchTo().frame(lastvedio);

js.executeScript("arguments[0].scrollInView(true)",lastvedio);

WebElement btn1 = driver.findElement(By.xpath("//div[@id='playBtn']"));
btn1.click();

/*WebElement videof = driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
driver.switchTo().frame(videof);
WebElement lastbtn = driver.findElement(By.xpath("//button[@aria-label='Play']"));
lastbtn.click();
*/




}

}
