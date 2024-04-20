package hehe;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class capnhathesothusao {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/PriceCoefficient");
WebElement DetailBt = driver.findElement(By.id("details-button")); 
DetailBt.click();
WebElement Proceedlink = driver.findElement(By.id("proceed-link")); 
Proceedlink.click();
Thread.sleep(3000); 	
WebElement RemCoe = driver.findElement(By.className("feather feather-edit font-medium-3 me-1")); 
RemCoe.sendKeys(Keys.ENTER);
WebElement VietCoe = driver.findElement(By.id("vietnamese_coefficient")); 
for (int i = 0; i < 4; i++) {
VietCoe.sendKeys(Keys.ARROW_RIGHT);
VietCoe.sendKeys(Keys.BACK_SPACE);
}
RemCoe.sendKeys("9.00");
WebElement ForeCoe = driver.findElement(By.id("foreign_coefficient")); 
for (int i = 0; i < 4; i++) {
ForeCoe.sendKeys(Keys.ARROW_RIGHT);
ForeCoe.sendKeys(Keys.BACK_SPACE);
}
RemCoe.sendKeys("9.00");
WebElement TheoCoe = driver.findElement(By.id("theoretical_coefficient")); 
for (int i = 0; i < 4; i++) {
TheoCoe.sendKeys(Keys.ARROW_RIGHT);
TheoCoe.sendKeys(Keys.BACK_SPACE);
}
RemCoe.sendKeys("9.00");
WebElement PracCoe = driver.findElement(By.id("practice_coefficient")); 
for (int i = 0; i < 4; i++) {
PracCoe.sendKeys(Keys.ARROW_RIGHT);
PracCoe.sendKeys(Keys.BACK_SPACE);
}
RemCoe.sendKeys("9.00");

WebElement SaveButton = driver.findElement(By.className("btn btn-primary waves-effect waves-float waves-light")); 
SaveButton.click();
}
}
