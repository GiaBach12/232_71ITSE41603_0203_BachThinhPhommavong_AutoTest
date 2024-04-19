package hehe;

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

public class hocvivaxemmonhoc {
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
    public void dangnhap() {
    	
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
        email.sendKeys("thinh.2174802010323@vanlanguni.vn");
        WebElement button = driver.findElement(By.id("idSIButton9"));
        button.click();
        
        try {
         	Thread.sleep(2000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
        
        WebElement mk = driver.findElement(By.id("i0118"));
        mk.sendKeys("VLU28112003");
        WebElement button2 = driver.findElement(By.id("idSIButton9"));
        button2.click();
        
        try {
         	Thread.sleep(12000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
        
        WebElement yesButton = driver.findElement(By.id("idSIButton9"));
        yesButton.click();
        
    	WebElement clickthulao = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[6]/a/i"));
    	clickthulao.click();
    	
    	try {
         	Thread.sleep(1000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
        
        WebElement hocvi = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[6]/ul/li[1]/a"));
        hocvi.click();
        
        try {
         	Thread.sleep(1200);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
      
        WebElement so2 = driver.findElement(By.linkText("2"));
        so2.click();
        
        try {
         	Thread.sleep(1000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
       
        WebElement so3 = driver.findElement(By.linkText("3"));
        so3.click();
        
        try {
         	Thread.sleep(1000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
       
        WebElement themhv = driver.findElement(By.cssSelector("button.dt-button.createNew.btn.btn-primary"));
        themhv.click();
       
        try {
         	Thread.sleep(1000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
//        
        JavascriptExecutor mahv = (JavascriptExecutor) driver;
        mahv.executeScript("document.getElementById('id').value = 'kakakak';");
        
        JavascriptExecutor tenhv = (JavascriptExecutor) driver;
        tenhv.executeScript("document.getElementById('name').value = 'mememe';");
        
        try {
         	Thread.sleep(1000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
        
        WebElement saveButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/button[2]"));
        saveButton.submit();
        
        try {
         	Thread.sleep(1000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
       
        JavascriptExecutor chinhsua = (JavascriptExecutor) driver;
        chinhsua.executeScript("document.querySelector('.editRow').click();");
      
        try {
         	Thread.sleep(1500);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
       
        JavascriptExecutor doitenhv = (JavascriptExecutor) driver;
        doitenhv.executeScript("var inputElement = document.getElementById('name');" +
                         "inputElement.value = '';" +
                         "inputElement.value = 'jkjk';");
        
        try {
         	Thread.sleep(1300);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
       
        WebElement luuchinhsua = driver.findElement(By.xpath("//*[@id=\"academicdegree-form\"]/div[4]/button[2]"));
        luuchinhsua.click();
        
        try {
         	Thread.sleep(1300);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
     
////        XÓA HỌC VỊ
        WebElement xoahocvi = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/table/tbody/tr[6]/td[5]/a[2]/i"));
        xoahocvi.click();
//        
        try {
         	Thread.sleep(1000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
        
        WebElement deleteButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.swal2-confirm.btn.btn-primary")));
        deleteButton.click();
        
        try {
         	Thread.sleep(1000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
        
////        TÌM KIẾM HỌC VỊ
        WebElement searchInput = driver.findElement(By.cssSelector("input.form-control"));
        searchInput.sendKeys("YAMERO");
        
        try {
         	Thread.sleep(2000);
         } catch (InterruptedException e) {
         	e.printStackTrace();
         }
        
//		THÊM CẤP BẬC
        
        WebElement capbac = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/ul/li[2]/a"));
        capbac.click();
        
        try {
       	Thread.sleep(1500);
       } catch (InterruptedException e) {
       	e.printStackTrace();
       }
        
        WebElement themcapbac = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/button"));
        themcapbac.click();
       
        try {
           	Thread.sleep(1000);
           } catch (InterruptedException e) {
           	e.printStackTrace();
           }
   
        WebElement academicDegreeElement = driver.findElement(By.cssSelector(".select2-selection__rendered[id='select2-academic_degree_id-container']"));
        academicDegreeElement.click();
        WebElement option = driver.findElement(By.xpath("//li[contains(text(), 'Phần Mềm Thông Tin')]"));
        option.click();
       
        try {
           	Thread.sleep(500);
           } catch (InterruptedException e) {
           	e.printStackTrace();
           }
      
        WebElement idInput = driver.findElement(By.id("id"));
        idInput.click();
        idInput.sendKeys("ddd122222d2ssss");
        
        try {
           	Thread.sleep(500);
           } catch (InterruptedException e) {
           	e.printStackTrace();
           }
        
        WebElement luucapbac = driver.findElement(By.xpath("//*[@id=\"academicdegreerank-form\"]/div[3]/button[2]"));
     	luucapbac.click();
        
        

        
//    	THAY ĐỔI CẤP BẬC
          
      try {
       	Thread.sleep(999);
       } catch (InterruptedException e) {
       	e.printStackTrace();
       }
      
      WebElement chon = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/table/tbody/tr[2]/td[2]/a[1]/i"));
      chon.click();
      
     try {
      	Thread.sleep(999);
       } catch (InterruptedException e) {
	e.printStackTrace();
       }
           	
 
 	
    	WebElement luuthaydoicapbac = driver.findElement(By.xpath("//*[@id=\"academicdegreerank-form\"]/div[3]/button[2]"));
     	luuthaydoicapbac.click();
      
      try {
       	Thread.sleep(1000);
       } catch (InterruptedException e) {
       	e.printStackTrace();
       }
        
//		XÓA CẤP BẬC
        
        WebElement xoacapbac = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/table/tbody/tr[2]/td[2]/a[2]/i"));
     	xoacapbac.click();
     	
     	try {
       	Thread.sleep(1000);
       } catch (InterruptedException e) {
       	e.printStackTrace();
       }
     	
     	WebElement xacnhanxoa = driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]"));
     	xacnhanxoa.click();
      
//		TÌM KIẾM CẤP BẬC
      WebElement ssearchInput = driver.findElement(By.cssSelector("input[type='search']"));
      ssearchInput.click();
      ssearchInput.sendKeys("DAN");
 
//		XEM DANH SÁCH MÔN HỌC
    	
	     	try {
	   	Thread.sleep(1000);
	   } catch (InterruptedException e) {
	   	e.printStackTrace();
	   }
	    	
	      WebElement clickmonhoc = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[6]/ul/li[3]/a/span"));
	      clickmonhoc.click();
	      
	    try {
	   	Thread.sleep(1200);
	   } catch (InterruptedException e) {
	   	e.printStackTrace();
	   }
	  
	  WebElement ss2 = driver.findElement(By.linkText("2"));
	  ss2.click();
	  
	  try {
	   	Thread.sleep(1000);
	   } catch (InterruptedException e) {
	   	e.printStackTrace();
	   }
	  
	  WebElement ss3 = driver.findElement(By.linkText("3"));
	  ss3.click();
	  
	  try {
	   	Thread.sleep(1000);
	   } catch (InterruptedException e) {
	   	e.printStackTrace();
	   }
	  
//	TÌM KIẾM MÔN HỌC
	  
	  WebElement SubName = driver.findElement(By.className("form-control"));
	  SubName.sendKeys("Cơ sở lập trình"); 
     	
     	
   }
}