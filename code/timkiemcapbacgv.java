package hehe;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class timkiemcapbacgv {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/LecturerRank");
WebElement DetailBt = driver.findElement(By.id("details-button")); 
DetailBt.click();
WebElement Proceedlink = driver.findElement(By.id("proceed-link")); 
Proceedlink.click();

Thread.sleep(3000); 
WebElement ChooseSemester = driver.findElement(By.id("select2-term-container")); 
ChooseSemester.sendKeys("1");
ChooseSemester.sendKeys(Keys.RETURN); 
WebElement SeaLecButton = driver.findElement(By.className("form-control")); 
SeaLecButton.sendKeys("D2601"); 
SeaLecButton.sendKeys(Keys.RETURN); 
}
}
