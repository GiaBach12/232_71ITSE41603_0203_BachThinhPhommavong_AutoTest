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

public class capnhathocki {
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
		Thread.sleep(1000);		
		// click submit
		WebElement submitButton1 = driver.findElement(By.id("idSIButton9"));
		submitButton1.click();
		Thread.sleep(10000);			
		// enter
		WebElement endButton1 = driver.findElement(By.id("idSIButton9"));
		endButton1.click();
		Thread.sleep(2000);

		//Chon Hoc ki
		WebElement userButton = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a/i"));
		userButton.click();
		Thread.sleep(2000);

		//Tim hoc ki muon chinh sua
		WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"tblTerm_filter\"]/label/input"));
		Thread.sleep(2000);
		searchElement.sendKeys("998");
		Thread.sleep(2000);

		// Chọn nút chinh sua
		WebElement editButton = driver.findElement(By.xpath("//*[@id=\"tblTerm\"]/tbody/tr/td[9]/a[1]/i"));
		editButton.click();
		Thread.sleep(2000);

		// Chinh sua thông tin
		// Nam bat dau
		WebElement spanElement = driver.findElement(By.id("select2-start_year-container"));
        spanElement.click();
        WebElement yearElement = driver.findElement(By.xpath("//li[text()='2021']"));

        yearElement.click();


		//Chon luu chinh sua
		WebElement updateButton = driver.findElement(By.xpath("//*[@id=\"term-form\"]/div[7]/button[2]"));
		updateButton.click();
		Thread.sleep(2000);

		//Quit
		driver.quit();
		}
		}

