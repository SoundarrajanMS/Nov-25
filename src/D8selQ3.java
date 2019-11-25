import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D8selQ3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://greenstech.in/selenium-course-content.html");

Thread.sleep(5000);
 WebElement video = driver.findElement(By.xpath("//iframe[@wmode='Opaque']"));
driver.switchTo().frame(video);
WebElement btn = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
btn.click();
driver.manage().window().maximize();





}
}
