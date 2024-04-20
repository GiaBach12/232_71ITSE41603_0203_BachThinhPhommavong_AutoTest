package hehe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class taohk {

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

	//Chon Hoc ki
	WebElement userButton = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a/i"));
	userButton.click();
	Thread.sleep(2000);

	// Chọn nút Thêm hoc ki
	WebElement editButton = driver.findElement(By.xpath("//*[@id=\"tblTerm_wrapper\"]/div[1]/div[2]/div/div[2]/button"));
	editButton.click();
	Thread.sleep(2000);

	// Nhập thông tin
	// Hoc ki
	WebElement tgvElement = driver.findElement(By.id("id")); 
	tgvElement.sendKeys("888");
	Thread.sleep(1000);

	// Nam bat dau
	WebElement spanElement = driver.findElement(By.id("select2-start_year-container"));
    spanElement.click();
    WebElement yearElement = driver.findElement(By.xpath("//li[text()='2024']"));
    yearElement.click();

	// Nam ket thuc
    WebElement EndElement = driver.findElement(By.id("select2-end_year-container"));
    EndElement.click();
    WebElement yearendElement = driver.findElement(By.xpath("//li[text()='2025']"));
    yearendElement.click();

    WebElement inputElement = driver.findElement(By.cssSelector("input.flatpickr-input"));

    // Gọi hàm JavaScript để đặt giá trị ngày
    String script = "arguments[0].setAttribute('value', '04/19/2024')";
    ((JavascriptExecutor) driver).executeScript(script, inputElement);
    Thread.sleep(2000);
    WebElement luuElement = driver.findElement(By.xpath("//*[@id=\"term-form\"]/div[7]/button[2]"));
    luuElement.click();
    
    
	//Quit
	//driver.quit();
	}
	 
 }
