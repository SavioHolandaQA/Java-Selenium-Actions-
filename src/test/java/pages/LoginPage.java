package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessar_tela_login() {
        driver.get("https://automationpratice.com.br/login");
        driver.manage().window().maximize();

        waitElementBePresent(By.id("password"), 20);

    }

    public void preencher_os_Campos_de_logim() {
        driver.findElement(By.id("user")).sendKeys(getRandomEmail());
        driver.findElement(By.id("password")).sendKeys("QA@12345");
    }

    public void aguarda() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(8, 10000)");
        Thread.sleep(2988);

    }

    public void clicar_no_Botao_Login() {
        driver.findElement(By.id("btnLogin")).click();


    }

    public void valida_Mensagem_de_Login_com_Sucesso() {
        waitElementBePresent(By.id("swal2-title"), 10);

    }
}
