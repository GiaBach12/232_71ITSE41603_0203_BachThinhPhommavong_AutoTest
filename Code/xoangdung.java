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
 
 
public class xoangdung {
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

		// nhap email
		driver.findElement(By.id("i0116")).sendKeys("217480201is002@vanlanguni.vn");

		// chon next
		WebElement nextButton = driver.findElement(By.id("idSIButton9"));
		nextButton.click();
		Thread.sleep(3000);

		// nhap password
		driver.findElement(By.id("i0118")).sendKeys("VLU23012002");
		Thread.sleep(1000);

		// chon dang nhap
		WebElement submitButton1 = driver.findElement(By.id("idSIButton9"));
		submitButton1.click();
		Thread.sleep(15000);

		// Chon dang nhap
		WebElement endButton1 = driver.findElement(By.id("idSIButton9"));
		endButton1.click();
		Thread.sleep(5000);

		//Chon Nguoi dung
		WebElement userButton = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a"));
		userButton.click();
		Thread.sleep(2000);
		//Chon Nguoi dung minh muon xoa
		WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"tblUser_filter\"]/label/input"));
		searchElement.sendKeys("thina thina thina");
		Thread.sleep(2000);

		
		// Chọn icon xóa
		WebElement iconElement = driver.findElement(By.className("feather-trash-2"));
        iconElement.click();
		Thread.sleep(1000);
		// Chọn Xóa
		WebElement submitButton3 = driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]"));
		submitButton3.click();
		Thread.sleep(5000);
		// Đóng trình duyệt
		driver.quit();
		    }
		}


