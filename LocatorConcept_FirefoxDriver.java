package Selenium_Homework1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LocatorConcept_FirefoxDriver {
    public static void main(String[] args){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");


        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("Parul9441@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@1234");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

    }
}
