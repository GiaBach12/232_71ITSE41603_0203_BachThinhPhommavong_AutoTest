package hehe; 

  

import java.awt.AWTException; 

import java.awt.Robot; 

import java.awt.Toolkit; 

import java.awt.datatransfer.StringSelection; 

import java.awt.event.KeyEvent; 

  

import org.openqa.selenium.By; 

import org.openqa.selenium.JavascriptExecutor; 

import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.WebElement; 

import org.openqa.selenium.chrome.ChromeDriver; 

import org.openqa.selenium.support.ui.ExpectedConditions; 

import org.openqa.selenium.support.ui.WebDriverWait; 

import org.testng.annotations.AfterClass; 

import org.testng.annotations.BeforeClass; 

import org.testng.annotations.Test; 

  

  

public class xuatthoikhoabieu { 

private WebDriver driver; 

private String baseUrl = "https://cntttest.vanlanguni.edu.vn:18081/Phancong02/"; 

@BeforeClass 

public void setUp() { 

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); 

driver = new ChromeDriver(); 

driver.get(baseUrl); 

driver.manage().window().maximize();  

} 

  

@Test 

public void dangnhap() throws AWTException { 

  

 try { 

Thread.sleep(700); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

  

WebElement advanced = driver.findElement(By.id("details-button")); 

advanced.click(); 

WebElement proceed = driver.findElement(By.id("proceed-link")); 

proceed.click(); 

try { 

Thread.sleep(800); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement dangnhap = driver.findElement(By.id("socialLoginList")); 

dangnhap.click(); 

try { 

Thread.sleep(2000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement email = driver.findElement(By.id("i0116")); 

email.sendKeys("nhien.207ct28287@vanlanguni.vn"); 

WebElement button = driver.findElement(By.id("idSIButton9")); 

button.click(); 

try { 

Thread.sleep(2000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement mk = driver.findElement(By.id("i0118")); 

mk.sendKeys("lethihuynhnhu"); 

WebElement button2 = driver.findElement(By.id("idSIButton9")); 

button2.click(); 

try { 

Thread.sleep(12000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement yesButton = driver.findElement(By.id("idSIButton9")); 

yesButton.click(); 

WebElement clickTKB = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[4]/a/span")); 

clickTKB.click(); 

  

try { 

Thread.sleep(1000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement TKB = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[4]/ul/li[1]/a/span")); 

TKB.click(); 

  

WebElement clicko = driver.findElement(By.className("select2-selection__rendered")); 

  

clicko.click(); 

  

WebElement chonhk = driver.findElement(By.xpath("//li[text()='999']")); 

  

chonhk.click(); 

try { 

Thread.sleep(1000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement clicko1 = driver.findElement(By.id("select2-major-container")); 

  

clicko1.click(); 

  

WebElement chonnganh = driver.findElement(By.xpath("//li[text()='Công nghệ thông tin']")); 

  

chonnganh.click(); 

  

try { 

Thread.sleep(2000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

StringSelection ss = new StringSelection("C:\\TKB.xlsx"); 

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); 

  

try { 

Thread.sleep(2000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement browseButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[1]/div/div/div[2]/form/div[2]/div")); 

browseButton.click(); 

try { 

Thread.sleep(3000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

Robot robot = new Robot(); 

robot.keyPress (KeyEvent. VK_CONTROL); 

robot.keyPress (KeyEvent. VK_V); 

robot.keyRelease (KeyEvent.VK_V); 

robot.keyRelease (KeyEvent. VK_CONTROL); 

robot.keyPress (KeyEvent. VK_ENTER); 

robot.keyRelease (KeyEvent. VK_ENTER); 

try { 

Thread.sleep(5000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement importtkb1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[1]/div/div/div[2]/form/div[3]/button")); 

  

importtkb1.click(); 

try { 

Thread.sleep(5000); 

} catch (InterruptedException e) { 

e.printStackTrace(); 

} 

WebElement thaythe = driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[2]")); 

  

thaythe.click(); 

} 

} 