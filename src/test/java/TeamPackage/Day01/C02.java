package TeamPackage.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {

    public static void main(String[] args) {


        System.setProperty("chromeDriver","src/resource/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());

        try {
            Thread.sleep(5000);             //beklemek icin
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.get("http://techproeducation.com");
    }
}
