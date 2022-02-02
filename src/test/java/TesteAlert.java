import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAlert {

    @Test
    public void Testandoalert () {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/cassi/Downloads/campo_treinamento/componentes.html");

        driver.findElement(By.id("alert")).click();
        Alert gato = driver.switchTo().alert();
        String pulo = gato.getText();
        Assert.assertEquals("Alert Simples", pulo);
        gato.accept();

        driver.findElement(By.id("elementosForm:nome")).sendKeys(pulo);

        Assert.assertEquals(pulo, driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));

    }
}
