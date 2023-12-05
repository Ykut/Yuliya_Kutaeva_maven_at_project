package homework.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WildberriesPart1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.manage().window().maximize();

        driver.get("https://www.wildberries.by");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Принять')]"))).click();

        driver.findElement(By.cssSelector("[aria-label='Главное меню']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Дом')]"))).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Гостиная')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Коробки для хранения')]")).click();

        driver.findElement(By.cssSelector("[aria-label='Фильтры']")).click();



    }
}
