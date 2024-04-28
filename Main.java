import com.google.common.base.Verify;
import dev.failsafe.internal.util.Assert;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static dev.failsafe.internal.util.Assert.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        WebElement button = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        button.click();
        WebElement element= driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > h2"));
        String par= element.getText();
        System.out.println(par);
        boolean payment=!driver.findElements(By.xpath("//*[@alt=\"Visa\"]")).isEmpty();
        boolean payment2=!driver.findElements(By.xpath("//*[@alt=\"Verified By Visa\"]")).isEmpty();
        boolean payment3=!driver.findElements(By.xpath("//*[@alt=\"MasterCard\"]")).isEmpty();
        boolean payment4=!driver.findElements(By.xpath("//*[@alt=\"MasterCard Secure Code\"]")).isEmpty();
        boolean payment5=!driver.findElements(By.xpath("//*[@alt=\"Белкарт\"]")).isEmpty();
        boolean payment6=!driver.findElements(By.xpath("//*[@alt=\"Мир\"]")).isEmpty();
       WebElement service=driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        WebElement service1 = service;
        service1.click();
        WebElement MTS=driver.findElement(By.xpath("//*[@alt=\"МТС\"]"));
        WebElement mts = MTS;
        mts.click();
        WebElement phonenumber=driver.findElement(By.xpath("//*[@class=\"phone\"]"));
        phonenumber.sendKeys("297777777", Keys.ENTER);
        WebElement money=driver.findElement(By.xpath("//*[@class=\"total_rub\"]"));
        money.sendKeys("100", Keys.ENTER);
        WebElement contiNue=driver.findElement(By.xpath("//*[@class=\"button button__default \"]"));
        WebElement contiNue1 = contiNue;
        contiNue1.click();
        driver.quit();
    }
}