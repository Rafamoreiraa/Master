package Steps.uol;

import java.io.IOException;

import Elementos.uol.Elementos;
import Metodos.uol.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Pages {

	Elementos e = new Elementos();
	
	@Given("que acesse a URl {string}")
	public void que_acesse_a_u_rl(String site) throws Exception {
		executarNavegador(site, "CHROME", "executar navegador");
	}

	@When("adicionar o item no carrinho")
	public void adicionar_o_item_no_carrinho() throws IOException, InterruptedException {
		pauser(10000, "pausa");
	    clicar(e.getCookiesauto(), "ok");
		escrever(e.getCampoBusca(), "PS4", "Preechendo campo de busca");
		clicar(e.getLupa(), "clicar lupa");
       pauser(5000, "");
		clicar(e.getLego(), "Clicar no lego");
		pauser(3000, "");
		clicar(e.getAddCarrinho(), "");

	}

	@Then("Valido resumo da compra")
	public void valido_resumo_da_compra() throws InterruptedException, IOException {
		pauser(3000, "");
		validarTexto(e.getResumo(), "Resumo do pedido", "validando texto");
        fecharBrowser("fechar navegador");

	}

}
