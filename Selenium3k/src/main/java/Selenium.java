import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    static WebDriver webdriver;

    public static void main(String[] args) {
        System.out.println("Selenium");
        // koda jungiam su draiveriu
        System.setProperty("webdriver.chrome.driver",
                "ChromeDriver/chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.bing.com/");
        WebElement searchField = webdriver.findElement(By.id("sb_form_q"));
        searchField.sendKeys("Baranauskas");
        searchField.sendKeys(Keys.ENTER);
        int result = searchByKeyword("Baranauskas");
        if(result >50000)

    {
        System.out.println("Popular");
    }
        else

    {
        System.out.println("Nepopular");
    }

}

    public static int searchByKeyword(String keyword){
        return 1;
    }
}

