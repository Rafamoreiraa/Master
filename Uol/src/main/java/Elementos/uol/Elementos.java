package Elementos.uol;

import org.openqa.selenium.By;

import lombok.Getter;


@Getter
public class Elementos {
	
	private By campoBusca = By.id("input-search");
	private By lego = By.id("CC-product-list-name-LVL230496-00");
	private By addCarrinho = By.xpath("//*[@id=\"wi4300078-product-filter-box-catalog-id\"]/div/div[2]/div[2]/div[1]/button");
	private By resumo = By.xpath("//h2[normalize-space()='Resumo do pedido']");
	private By lupa = By.id("span-searchIcon");
	private By cookies = By.id("btGo");
	private By cookiesauto = By.id("btn-authorizeCoookies");
	

}
