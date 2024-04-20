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
import org.openqa.selenium.support.ui.Select;

public class xoanganhhoc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
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
	driver.findElement(By.id("i0116")).sendKeys("217480201is002@vanlanguni.vn");
	// click next
	WebElement nextButton = driver.findElement(By.id("idSIButton9"));
	nextButton.click();
	Thread.sleep(3000);
	// input password
	driver.findElement(By.id("i0118")).sendKeys("VLU23012002");
	Thread.sleep(1000);
	// click submit
	WebElement submitButton1 = driver.findElement(By.id("idSIButton9"));
	submitButton1.click();
	Thread.sleep(15000);
	// enter
	WebElement endButton1 = driver.findElement(By.id("idSIButton9"));
	endButton1.click();
	Thread.sleep(2000);


		//Chon hoc ky va nganh
	WebElement userButton = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a/i"));
	userButton.click();
	Thread.sleep(2000);

		// Chọn nút nganh
	WebElement editButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/ul/li[2]/a"));
	editButton.click();
	Thread.sleep(2000);

		// tim kiem chuyen nganh 
	WebElement findmajor = driver.findElement(By.xpath("//*[@id=\"tblMajor_filter\"]/label/input")); 
	findmajor.sendKeys("bohocdcko");
	Thread.sleep(1000);

		// xoa chuyen nganh
	WebElement deletemajor = driver.findElement(By.xpath(("//*[@id=\"tblMajor\"]/tbody/tr/td[6]/a[2]/i")));
	deletemajor.click();
	Thread.sleep(2000);
		// xoa chuyen nganh
	WebElement confirmDelete = driver.findElement(By.xpath(("/html/body/div[3]/div/div[6]/button[1]")));
	confirmDelete.click();
	Thread.sleep(2000);
		
	driver.quit();

	}
}