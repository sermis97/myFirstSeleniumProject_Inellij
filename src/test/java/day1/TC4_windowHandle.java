package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_windowHandle {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String googleHandle = driver.getWindowHandle();
        System.out.println(googleHandle);
        Thread.sleep(4000);
        driver.quit();
        driver.close();
    }
}


/*
konsolda run edildiğinde CDwindow-664544D8ADDE3BC373F2E1A99A227516
şeklinde bir output verir
 */