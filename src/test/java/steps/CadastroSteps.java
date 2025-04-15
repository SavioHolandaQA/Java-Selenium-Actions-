package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunnerCucumberTest;

public class CadastroSteps extends RunnerCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Dado("^que estou na tela de cadastro$")
    public void que_estou_na_tela_de_cadastro() {
        cadastroPage.acessarAplicacao();

    }

    @Quando("^eu preencho os campos corretamente$")
    public void eu_preencho_os_campos_corretamente() {
        cadastroPage.preencherNome();
        cadastroPage.preencherEmail();
        cadastroPage.preencherSenha();

    }

    @Quando("^clico no botao Cadastrar$")
    public void clico_no_botao_Cadastrar() throws InterruptedException {
        cadastroPage.espera();
        cadastroPage.clickEmCadastrar();

    }

    @Entao("^deve exibir uma mensagem de sucesso$")
    public void deve_exibir_uma_mensagem_de_sucesso() throws InterruptedException {
        cadastroPage.espera();
        cadastroPage.verificarMensagem();

    }


}
