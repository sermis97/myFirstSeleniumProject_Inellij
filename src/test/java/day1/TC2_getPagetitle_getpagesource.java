package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_getPagetitle_getpagesource {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.navigate().to("https://udemy.com");
        String udemyUrl = driver.getCurrentUrl();

        System.out.println("Udemy url is : "  + udemyUrl);
        driver.navigate().back();
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.quit();
    }
}
