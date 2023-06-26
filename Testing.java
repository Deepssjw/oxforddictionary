package org.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing {

public static void main(String[] args) throws AWTException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium TestSpace\\Driver\\chromedriver.exe");
WebDriver dr=new ChromeDriver();

dr.get("https://www.oxfordlearnersdictionaries.com/");
dr.manage().window().maximize();


dr.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/input")).sendKeys("fish");
dr.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/label/input")).click();
dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/a[1]/div")).click();
dr.close();


}
}
