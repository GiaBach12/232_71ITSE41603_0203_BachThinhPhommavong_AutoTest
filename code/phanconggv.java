package hehe;

import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.WebElement; 

import org.openqa.selenium.chrome.ChromeDriver; 

  

public class phanconggv { 

  

public static void main(String[] args) throws InterruptedException { 

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); 

  

WebDriver driver = new ChromeDriver(); 

  

driver.get("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/Timetable/Assign"); 

  

Thread.sleep(5000); 

  

WebElement inputElement = driver.findElement(By.id("input-id")); 

  

inputElement.sendKeys("Tên giảng viên cần phân công"); 

  

WebElement saveButton = driver.findElement(By.id("save-button-id")); 

saveButton.click(); 

  

Thread.sleep(5000); 

driver.quit(); 

} 

} 