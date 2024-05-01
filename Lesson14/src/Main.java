import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement button = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        button.click();
        // Услуги связи
      boolean conPhone=!driver.findElements(By.xpath("//*[@id=\"connection-phone\"]")).contains("Номер телефона");
       boolean conMoney= !driver.findElements(By.xpath("//*[@for=\"connection-phone\"]")).contains("Сумма");
       boolean conMail= !driver.findElements(By.xpath("//*[@id=\"connection-email\"]")).contains("E-mail для отправки чека");
        //Домашний интернет
        boolean interPhone=!driver.findElements(By.xpath("//*[@id=\"internet-phone\"]")).contains("Номер абонента");
        boolean interMoney=!driver.findElements(By.xpath("//*[@id=\"internet-sum\"]")).contains("Сумма");
        boolean interMail=!driver.findElements(By.xpath("//*[@id=\"internet-email\"]")).contains("E-mail для отправки чека");
        //Рассрочка
        boolean instalmentScore=!driver.findElements(By.xpath("//*[@data-mask=\"account-num-instalment\"]")).contains("Номер счета на 44");
        boolean instalmentSum=!driver.findElements(By.xpath("//*[@id=\"instalment-sum\"]")).contains("Сумма");
        boolean instalmentMail=!driver.findElements(By.xpath("//*[@id=\"instalment-email\"]")).contains("E-mail для отправки чека");
        //Задолженность
        boolean arrearsPhone=!driver.findElements(By.xpath("//*[@id=\"score-arrears\"]")).contains("Номер счета на 2073");
        boolean arrearsSum=!driver.findElements(By.xpath("//*[@id=\"arrears-sum\"]")).contains("Сумма");
        boolean arrearsMail=!driver.findElements(By.xpath("//*[@id=\"arrears-email\"]")).contains("E-mail для отправки чека");
        //Пункт 2
        WebElement phonenumber=driver.findElement(By.xpath("//*[@class=\"phone\"]"));
        phonenumber.sendKeys("297777777", Keys.ENTER);
        WebElement money=driver.findElement(By.xpath("//*[@class=\"total_rub\"]"));
        money.sendKeys("100", Keys.ENTER);
        WebElement contiNue=driver.findElement(By.xpath("//*[@class=\"button button__default \"]"));
        WebElement contiNue1 = contiNue;
        contiNue1.click();
        boolean descriptionCost=!driver.findElements(By.xpath("//*[@class=\"pay-description__cost\"]")).contains("100.00 BYN");
        boolean descriptionText=!driver.findElements(By.xpath("pay-description__text")).contains("Оплата: Услуги связи\n" +
                "Номер:375297777777");
        boolean creditCard=!driver.findElements(By.xpath("//*[@src=\"assets/images/payment-icons/card-types/mastercard-system.svg\"]")).isEmpty();
        boolean creditCard1=!driver.findElements(By.xpath("//*[@src=\"assets/images/payment-icons/card-types/visa-system.svg\"]")).isEmpty();
        boolean creditCard2=!driver.findElements(By.xpath("//*[@src=\"assets/images/payment-icons/card-types/belkart-system.svg\"]")).isEmpty();
        boolean creditCard3=!driver.findElements(By.xpath("//*[@src=\"assets/images/payment-icons/card-types/mir-system-ru.svg\"]")).isEmpty();
        boolean validityPer=!driver.findElements(By.xpath("//*[@class=\"content ng-tns-c45-4\"]")).contains("Срок действия");
        boolean verificationValue=!driver.findElements(By.xpath("//*[@class=\"content ng-tns-c45-5\"]")).contains("CVC");
        boolean holder=!driver.findElements(By.xpath("//*[@class=\"content ng-tns-c45-3\"]")).contains("Имя держателя (как на карте)");
        boolean buttonPay=!driver.findElements(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button")).contains(" Оплатить  100.00 BYN ");
        driver.quit();

    }
}
