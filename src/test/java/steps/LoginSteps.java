package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunnerCucumberTest;

public class LoginSteps extends RunnerCucumberTest {

    LoginPage loginPage = new LoginPage(driver);


    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        loginPage.acessar_tela_login();

    }

    @Quando("^eu preencho os campos$")
    public void eu_preencho_os_campos() {
        loginPage.preencher_os_Campos_de_logim();

    }

    @Quando("^clico no botao Login$")
    public void clico_no_botao_Login() throws InterruptedException {
        loginPage.aguarda();
        loginPage.clicar_no_Botao_Login();

    }

    @Entao("^devo visualizar uma mensagem de sucesso$")
    public void devo_visualizar_uma_mensagem_de_sucesso() {
        loginPage.valida_Mensagem_de_Login_com_Sucesso();

    }

}






