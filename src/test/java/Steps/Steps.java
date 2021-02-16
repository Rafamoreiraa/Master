package Steps;

import java.io.IOException;

import Elementos.elementos;
import Massa.Massa;
import Metodos.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	elementos e = new elementos();
	Massa m = new Massa();
	Page p = new Page();

	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String site) throws IOException {
		p.abrirNavegador(site, "CHROME", "ABRINDO NAVEGADOR");

	}

	@When("Preencher os  campos de Cadastro")
	public void preencher_os_campos_de_cadastro() throws IOException, InterruptedException {
		p.pausa(4000, "pausa para carregar a tela");
		p.clicar(e.getUser(), "clicando no botão user");
		p.pausa(2000, "pausa para carregar a tela");
		p.clicar(e.getCreateNewAccunt(), "clicando no botão creat new accunt");
		p.pausa(7000, "pausa para carregar a tela");
		p.preencher(e.getUserName(), m.setNome(), "Preenchendo nome");
		p.preencher(e.getEmail(), m.setEmail(), "Preenchendo Email");
		p.preencher(e.getPassoword(), m.setSenha(), "Preenchendo senha");
		p.preencher(e.getConfirmPassoword(), m.setSenha(), " Confirmando senha");
		p.preencher(e.getFirstName(), m.setNome(), "Preenchendo nome");
		p.preencher(e.getLastName(), m.setSegundoNome(), " Preenchendo nome do meio");
		p.preencher(e.getPhoneNumber(), m.setTelefone(), "Preenchendo telefone");
		p.selecionarComboPosicao(e.getCountry(), 180, "Selecionando Pais");
	    p.preencher(e.getCity(), m.setCidade(), "Preenchendo Cidade");
        p.preencher(e.getAddress(), m.setRua(), "Preenchendo rua");
	    p.preencher(e.getState(), m.setEstado(), "Preenchendo Estado");
        p.preencher(e.getPostal(), m.setCep(),"Preenchendo codigo Postal");
        p.clicar(e.getCheckBoxIgred(), "Selecionando CHeckbox");
 	  
	}

	@When("Clicar no botao registrar")
	public void clicar_no_botao_registrar() throws IOException {
		p.clicar(e.getBtnRegister(), "Clicando no botao Registrar");
		
		
	}

	@Then("Cadastro sera realizado co sucesso")
	public void cadastro_ser_realizado_co_sucesso() throws IOException, InterruptedException {
		p.pausa(3000,"Pausa para carregar a tela");
		p.validarTexto(e.getBtnRegister(), "REGISTER", "Validando nome do Botão register");
		String Evidencia = "Cadastro Login";
		p.screnShoot("./printEvidencia/" + Evidencia + ".png");
	    p.fecharBrowser("Fechando navegador");
	}

	@When("Preencher os dados de Login")
	public void preencher_os_dados_de_login() throws IOException, InterruptedException {
		p.pausa(5000,"Pausa para carregar a tela");
		p.clicar(e.getUser(), "clicando no botao ");
		p.preencher(e.getUserNameLogin(), m.setNome(), "Preenchendo nome do usuario");
		p.pausa(2000,"Pausa para carregar a tela");
		p.preencher(e.getPassowordLogin(), m.setSenha(), "Preenchendo Passoword");
		p.clicar(e.getCheckboxremember(), "Selecionando checkbox");
		
	}

	@When("Clicar em Sign In")
	public void clicar_em_sign_in() throws InterruptedException, IOException {
		p.pausa(2000, "Pausa para carregar a tela");
		p.clicar(e.getBtnSign(), "Clicando no botão Saing");
	}

	@Then("Login sera realizado com sucesso")
	public void login_sera_realizado_com_sucesso() throws IOException, InterruptedException {
		p.pausa(2000, "Pausa para carregar a tela");
		p.validarTexto(e.getNome(), "Rafael","validadno nome do usuario");
		String Evidencia = "Tela de Login";
		p.screnShoot("./printEvidencia/" + Evidencia + ".png");
        p.fecharBrowser("fechando navegador");
	}
}
