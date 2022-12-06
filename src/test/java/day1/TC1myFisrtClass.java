package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1myFisrtClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();             //5th method
        driver.get("http://www.google.com");
        driver.navigate().to("https://udemy.com");  //first navigate method
        driver.navigate().back();                       // second navigate method
        driver.getCurrentUrl();
        String googleUrl= driver.getCurrentUrl();
        System.out.println("Google Url is :" + googleUrl);


        driver.manage().window().fullscreen();          // 6th method
        Thread.sleep(1000);
        driver.navigate().refresh();                    //third navigate method
        driver.navigate().forward();                    //4th navigate method
        Thread.sleep(1000);
        driver.quit();
    }
}
 /*
 This is first test automation script
 navigate
  */