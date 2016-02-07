import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dz2 {
    public void main (String args[]) throws InterruptedException {
        System.setProperty("webdriver.driver.chrome", "E:\\0_Trane\\external\\chromedriver_win32\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("https://www.google.com.ua/");
        w.findElement(By.xpath("//body//input[@name=\"btnK\"]"));


    }

}
