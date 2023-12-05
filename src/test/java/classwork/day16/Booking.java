package classwork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Booking {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        driver.findElement(By.name("ss")).sendKeys("Париж");
        driver.findElement(By.xpath("//div[text()='Париж']")).click();
        driver.findElement(By.xpath("//span[text()='Дата заезда']")).click();


    }
}
