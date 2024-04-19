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
 
 
public class taochuyennganh {
 
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	 
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
	driver.findElement(By.id("i0116")).sendKeys("217480201iS002@vanlanguni.vn");

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
	Thread.sleep(2000);

	        //Chon Nguoi dung
	WebElement userButton = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a"));
	userButton.click();
	Thread.sleep(2000);

	        // Chọn nút Thêm người dùng
	WebElement editButton = driver.findElement(By.xpath("//*[@id=\"tblUser_wrapper\"]/div[1]/div[2]/div/div[2]/button"));
	editButton.click();
	Thread.sleep(2000);

	// Nhập thông tin
	// Mã giảng viên
	WebElement mgvElement = driver.findElement(By.id("staff_id")); 
	mgvElement.sendKeys("217480201iiis002");
	Thread.sleep(1000);

	//Ten giang vien
	WebElement tgvElement = driver.findElement(By.id("full_name")); 
	tgvElement.sendKeys("Thina Thina Thina");
	Thread.sleep(1000);
	
	//Ten giang vien
	WebElement EmailElement = driver.findElement(By.id("email")); 
	EmailElement.sendKeys("217480201is00002@vanlanguni.vn");
	Thread.sleep(1000);




	// Loại giảng viên
	WebElement loaigiangvien = driver.findElement(By.id("select2-type-container"));
	loaigiangvien.click();
    WebElement typeElement = driver.findElement(By.xpath("//li[text()='Cơ hữu']"));
    typeElement.click();
 
    WebElement role = driver.findElement(By.id("select2-role_id-container"));
    role.click();
    WebElement roleElement = driver.findElement(By.xpath("//li[text()='BCN khoa']"));
    roleElement.click();



	//Luu nguoi dung
	WebElement createuserButton = driver.findElement(By.xpath("//*[@id=\"user-form\"]/div[7]/button[2]"));
	createuserButton.click();
	Thread.sleep(2000);

	//Quit
	driver.quit();
	}

 }
