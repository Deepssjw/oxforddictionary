package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {


public static void main(String[] args) throws AWTException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium TestSpace\\Driver\\chromedriver.exe");
WebDriver dr=new ChromeDriver();

dr.get("https://www.oxfordlearnersdictionaries.com/");
dr.manage().window().maximize();
/*WebElement name1 = dr.findElement(By.xpath("//input[@id='fullName']"));
Robot ro=new Robot(); //robet class for keyboard operation
name1.click();
ro.keyPress(KeyEvent.VK_D);
ro.keyRelease(KeyEvent.VK_D);*/

/*WebElement name2 = dr.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[3]/div/button"));
name2.click();
Alert a=dr.switchTo().alert(); //handle alerts
a.sendKeys("Deepak");
a.accept();*/



/*TakesScreenshot tk=(TakesScreenshot)dr; //take Scrren Shots
File st = tk.getScreenshotAs(OutputType.FILE);
File ed=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium TestSpace\\SS.jpg") ;
FileUtils.copyFile(st, ed);*/



/*dr.switchTo().frame("firstFr"); //switch to iframes

dr.findElement(By.name("fname")).sendKeys("hi");

WebElement f2 = dr.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));

dr.switchTo().frame(f2);

dr.findElement(By.name("email")).sendKeys("two");

dr.switchTo().parentFrame(); //back to one frame

dr.findElement(By.name("lname")).sendKeys("ok");

dr.switchTo().defaultContent(); //come out of all frames*/




/*WebElement f3 = dr.findElement(By.xpath("/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[1]/div/div/select"));

Select sc=new Select(f3);    //select text
sc.selectByVisibleText("Apple");

WebElement f4 = dr.findElement(By.xpath("/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[3]/div/div/select"));

Select sc1 =new Select(f4);
sc1.selectByValue("java");
List<WebElement> f5 = sc1.getAllSelectedOptions();
for(WebElement ac:f5) {
System.out.println(ac.getText());
} */



/*String parent = dr.getWindowHandle();  //windows handling
dr.findElement(By.id("home")).click();
Set<String> allwin = dr.getWindowHandles();
for (String che : allwin) {
	if(!che.equals(parent)) {
		dr.switchTo().window(che);
	}
	
}

dr.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();
dr.close();
dr.switchTo().window(parent);*/


dr.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/input")).sendKeys("fish");
dr.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/label/input")).click();
dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/a[1]/div")).click();
dr.close();









}
}
