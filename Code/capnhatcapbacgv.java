package hehe;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class capnhatcapbacgv {
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
WebElement UpdLecButton = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]/i[1]")); 
UpdLecButton.click(); 
WebElement LecCode = driver.findElement(By.id("lecturer_staff_id")); 
LecCode.sendKeys("D2601"); 
LecCode.sendKeys(Keys.RETURN); 
WebElement LecName = driver.findElement(By.id("lecturer_full_name")); 
LecName.sendKeys("Duc26012003"); 
LecName.sendKeys(Keys.RETURN); 
WebElement ChooseSemester = driver.findElement(By.id("select2-academic_degree_rank_id-container")); 
ChooseSemester.sendKeys("1");
ChooseSemester.sendKeys(Keys.RETURN); 
WebElement SaveButton = driver.findElement(By.xpath("//button[contains(text(),'Lưu')]")); 
SaveButton.click();
}
}	
