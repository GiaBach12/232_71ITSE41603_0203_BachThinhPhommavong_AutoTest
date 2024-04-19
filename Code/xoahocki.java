package hehe;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xoahocki {

public static void main(String[] args) throws InterruptedException {
	//TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Mở trang web Hoc ky
	driver.get("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/Term");
	// Nhấp nút đăng nhập
	WebElement loginButton = driver.findElement(By.id("OpenIdConnect"));
	loginButton.click();
	//Nhập thông tin Đăng nhập
	WebElement emailElement = driver.findElement(By.id("i0116"));
	emailElement.sendKeys("217480201is002@vanlanguni.vn");
	Thread.sleep(5000);
	//Nhấp nút next
	WebElement nextButton = driver.findElement(By.id("idSIButton9")); 
	nextButton.click();
	//Nhập thông tin Đăng nhập
	WebElement passwordElement = driver.findElement(By.id("i0118"));
	passwordElement.sendKeys("VLU23012002");
	Thread.sleep(5000);	
	// Nhấp nút đăng nhập
	WebElement submitButton = driver.findElement(By.id("idSIButton9"));
	submitButton.click();
	Thread.sleep(5000);

	// Tìm kiếm học kỳ cần xóa
	WebElement searchBoxElement = driver.findElement(By.id("form-control"));
	searchBoxElement.sendKeys("888");

	// Nhấp vào icon Xóa
	WebElement deleteButtonElement = driver.findElement(By.cssSelector("swal2-confirm btn btn-primary"));
	deleteButtonElement.click();

	// Xác nhận học kỳ đã được xóa
	String expectedText = "Xóa thành công!";
	String actualText = driver.findElement(By.cssSelector(".success-message")).getText();

	if (!expectedText.equals(actualText)) {
	throw new AssertionError("Xóa thất bại!");
	  }
	 // Đóng trình duyệt
	 driver.quit();
	}
}
