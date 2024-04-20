package hehe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dndx {
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

//Khởi động trình duyệt Chrome
 WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/Account/Login");

WebElement acceptButton = driver.findElement(By.id("details-button"));
acceptButton.click();
Thread.sleep(1000);
WebElement acceptLink = driver.findElement(By.id("proceed-link"));
acceptLink.click();

WebElement submitButton = driver.findElement(By.id("OpenIdConnect"));
submitButton.click();
Thread.sleep(3000);

// input email
driver.findElement(By.id("i0116")).sendKeys("hoang.207ct55056@vanlanguni.vn");

// click next
WebElement nextButton = driver.findElement(By.id("idSIButton9"));
nextButton.click();
Thread.sleep(3000);

// input password
driver.findElement(By.id("i0118")).sendKeys("VLU08112002");
 
// click submit
WebElement submitButton1 = driver.findElement(By.id("idSIButton9"));
submitButton1.click();
Thread.sleep(10000);

// enter
WebElement endButton1 = driver.findElement(By.id("idSIButton9"));
endButton1.click();
Thread.sleep(5000);

//Quit
driver.quit();
}
}

