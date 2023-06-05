package TeamPackage.Day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {


    //Bir class oluşturun : CheckBoxTest
    // Gerekli yapiyi olusturun ve aşağıdaki tamamlayın.
    //  a. Verilen web sayfasına gidin.
    //  https://the-internet.herokuapp.com/checkboxes
     // b. Checkbox1 ve checkbox2 elementlerini locat edin.
    //  c. Checkbox1 seçili değilse onay kutusunu tıklayın
    // d. Checkbox2 seçili değilse onay kutusunu tıklayın

     WebDriver driver;

    @Before
    public void setUp() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() throws InterruptedException {

      driver.get(" https://the-internet.herokuapp.com/checkboxes");

        //b. Checkbox1 ve checkbox2 elementlerini locateedin.

        WebElement checkbox1 = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
        if (!checkbox1.isSelected()) {
            checkbox1.click(); // Checkbox1 seçili değilse tıklayın
        }
        Thread.sleep(1500);

// Checkbox2'yi bulma ve seçilip seçili olmadığını kontrol etme
        WebElement checkbox2 = driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));
        if (checkbox2.isSelected()) {
            checkbox2.click(); // Checkbox2 seçili değilse tıklayın

    }



}

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }
}
