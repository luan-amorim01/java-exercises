package entities;

public class Aresta<TIPO> {
	// n�vel de amizade
	private Double peso;
	// rela��es de come�o
	private Vertice<TIPO> inicio;
	// rela��o final
	private Vertice<TIPO> fim;
	
	public Aresta(Double peso, Vertice incio, Vertice fim) {
		this.peso = peso;
		this.inicio = inicio;
		this.fim = fim;
	}
	
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Vertice<TIPO> getInicio() {
		return inicio;
	}
	public void setInicio(Vertice<TIPO> inicio) {
		this.inicio = inicio;
	}
	public Vertice<TIPO> getFim() {
		return fim;
	}
	public void setFim(Vertice<TIPO> fim) {
		this.fim = fim;
	}
	
	
}
