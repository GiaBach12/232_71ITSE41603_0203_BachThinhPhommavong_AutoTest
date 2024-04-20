package hehe ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capnhatnganhhoc {
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
		Thread.sleep(2000);
		// input email
		driver.findElement(By.id("i0116")).sendKeys("thinh.2174802010323@vanlanguni.vn");
		// click next
		WebElement nextButton = driver.findElement(By.id("idSIButton9"));
		nextButton.click();
		Thread.sleep(2000);
		// input password
		driver.findElement(By.id("i0118")).sendKeys("VLU28112003");
		WebElement submitButton1 = driver.findElement(By.id("idSIButton9"));
		submitButton1.click();
		Thread.sleep(10000);
		// enter
		WebElement endButton1 = driver.findElement(By.id("idSIButton9"));
		endButton1.click();
		Thread.sleep(2000);
		//chon hoc ky va nganh
		WebElement userButton = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a/i"));
		userButton.click();
		Thread.sleep(1000);
		//chon nganh
		WebElement nganh = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/ul/li[2]/a"));
		nganh.click();
		Thread.sleep(1000);
		//chon nganh can cap nhat
		WebElement chonnganh = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[6]/a[1]/i"));
		chonnganh.click();
		Thread.sleep(1000);
		//nhap ten nganh
		WebElement tennganh = driver.findElement(By.id("name"));
		tennganh.clear();
		tennganh.sendKeys("Sinh học");
	 //nhap  ten viet tat
		WebElement tvt = driver.findElement(By.id("abbreviation"));
		tvt.clear();
		tvt.sendKeys("SH");
		 //luu
        WebElement luu = driver.findElement(By.xpath("//*[@id=\"major-form\"]/div[5]/button[2]"));
		luu.click();
		
		

		
        
		}
		
	}

