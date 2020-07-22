import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    static WebDriver webdriver;
    public static void main(String[] args) {
        System.out.println("Selenium");
}
    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                "ChromeDriver/chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.bing.com/");
        WebElement searchField = webdriver.findElement(By.id("sb_form_q"));
        searchField.sendKeys("Baranauskas");
        searchField.sendKeys(Keys.ENTER);
        int result = searchByKeyword("Baranauskas");
    }

    public static int searchByKeyword(String keyword){
        WebElement searchField = webdriver.findElement(By.className("sb_count"));
        searchField.sendKeys(keyword);
        searchField.sendKeys(Keys.ENTER);
        WebElement result2 = webdriver.findElement(By.xpath("//*[@id=\"b_tween\"]/span"));
        String resultStr = result2.getText()
                .replaceAll("[a-zA-z]","")
                .replaceAll("[ ,]","");
        int resultPart = Integer.parseInt(resultStr);
        return resultPart;
    }
    public static void close(){
        webdriver.close();
    }

}

