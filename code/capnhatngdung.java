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

public class capnhatngdung {

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
	driver.findElement(By.id("i0116")).sendKeys("217480201IS002@vanlanguni.vn");

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

	//Chon Nguoi dung
	WebElement userButton = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a"));
	userButton.click();
	Thread.sleep(2000);

	//Tim giang vien muon chinh sua
	WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"tblUser_filter\"]/label/input"));
	searchElement.sendKeys("thina thina thina");
	Thread.sleep(2000);

	// Chọn nút chinh sua
	WebElement editButton = driver.findElement(By.xpath("//*[@id=\"tblUser\"]/tbody/tr/td[7]/a[1]/i"));
	editButton.click();
	Thread.sleep(2000);

	// Chinh sua thông tin
	// Mã giảng viên
	WebElement mgvElement = driver.findElement(By.id("staff_id"));
	mgvElement.clear();
	Thread.sleep(2000);
	mgvElement.sendKeys("217480201is00000000000001");
	Thread.sleep(2000);

	//Chon luu chinh sua
	WebElement updateButton = driver.findElement(By.xpath("//*[@id=\"user-form\"]/div[7]/button[2]"));
	updateButton.click();
	Thread.sleep(2000);	
	}

 }
