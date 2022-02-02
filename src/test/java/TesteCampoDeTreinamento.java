import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import java.nio.channels.SelectableChannel;

public class TesteCampoDeTreinamento {

    @Test
    public void testedecadastro () {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/cassi/Downloads/campo_treinamento/componentes.html");

        driver.findElement(By.id("elementosForm:nome")).sendKeys("Assis");

        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Cassiano");

        driver.findElement(By.id("elementosForm:sexo:0")).click();

        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();

        new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("2o grau completo");

        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");

        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Pulo do Gato");

        driver.findElement(By.id("elementosForm:cadastrar")).click();

        Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));

        Assert.assertTrue(driver.findElement(By.id("descNome")).getText().endsWith("Assis"));

        Assert.assertEquals("Sobrenome: Cassiano", driver.findElement(By.id("descSobrenome")).getText());

        Assert.assertTrue(driver.findElement(By.id("descSexo")).getText().endsWith("Masculino"));

        Assert.assertTrue(driver.findElement(By.id("descComida")).getText().endsWith("Carne"));

        Assert.assertTrue(driver.findElement(By.id("descEscolaridade")).getText().endsWith("2graucomp"));

        Assert.assertTrue(driver.findElement(By.id("descEsportes")).getText().endsWith("Corrida"));

        Assert.assertTrue(driver.findElement(By.id("descSugestoes")).getText().endsWith("Pulo do Gato"));


    }


}
