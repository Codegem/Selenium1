import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    @Before
    public void setup(){
        Selenium.setup();
    }

    @Test
    public void searchByKeyword(){
        int result = Selenium.searchByKeyword("Baranauskas");
        Assert.assertEquals(114000, result);
    }

    @After
    public void close (){
        Selenium.close();
    }
}
