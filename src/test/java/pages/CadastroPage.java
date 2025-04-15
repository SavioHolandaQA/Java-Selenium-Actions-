package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("https://automationpratice.com.br/register");
        driver.manage().window().maximize();
        waitElementBePresent(By.id("user"), 20);

    }

    public void preencherNome() {
        driver.findElement(By.id("user")).sendKeys("Savio Holanda");

    }

    public void preencherEmail() {
        driver.findElement(By.id("email")).sendKeys(getRandomEmail());

    }

    public void preencherSenha() {
        driver.findElement(By.id("password")).sendKeys("QA@12345");

    }

    public void espera() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(8, 10000)");
        Thread.sleep(2988);

    }

    public void clickEmCadastrar() {
        driver.findElement(By.id("btnRegister")).click();

    }

    public void verificarMensagem() {
        waitElementBePresent(By.id("swal2-title"), 10);

    }
}
