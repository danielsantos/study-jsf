package com.gank.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
// @RequestScoped // Zera a cada requisição
@ViewScoped // Zera se o usuario sair da pagina e voltar
// @SessionScoped // Mantem em quanto a sessão estiver ativa e apenas para o mesmo usuario
// @ApplicationScoped // Mantem para todos os usuários
public class NomesBean {

	private String nome;
	private List<String> nomes = new ArrayList<>();

	private HtmlInputText inputNome;
	private HtmlCommandButton botaoAdicionar;

	public String adicionar() {
		this.nomes.add(nome);

		// desativa campo e botão quando mais que 3 nomes
		// forem adicionados
		if (this.nomes.size() > 3) {
			this.inputNome.setDisabled(true);
			this.botaoAdicionar.setDisabled(true);
			this.botaoAdicionar.setValue("Muitos nomes adicionados...");
			return "Ola?faces-redirect=true";
		}

		return null;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public HtmlInputText getInputNome() {
		return inputNome;
	}

	public void setInputNome(HtmlInputText inputNome) {
		this.inputNome = inputNome;
	}

	public HtmlCommandButton getBotaoAdicionar() {
		return botaoAdicionar;
	}

	public void setBotaoAdicionar(HtmlCommandButton botaoAdicionar) {
		this.botaoAdicionar = botaoAdicionar;
	}

}
