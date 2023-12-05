package classwork.day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class TestGoogle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String title = driver.getTitle();
        System.out.println(title);

        String pageUrl = driver.getCurrentUrl();
        System.out.println(pageUrl);

        driver.quit();
    }
}
