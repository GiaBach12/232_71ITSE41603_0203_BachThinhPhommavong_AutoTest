package hehe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class xoalophoc {
     public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/Timetable/Assign");
        Thread.sleep(5000);
        WebElement classToDelete = driver.findElement(By.xpath("//div[@class='221_71ITBS10103_04']"));
        classToDelete.findElement(By.xpath("//button[@id='delete-button']")).click();
        System.out.println("Lớp học đã được xóa thành công!");
        driver.quit();
    }
}
