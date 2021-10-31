package entities;

public class Aresta<TIPO> {
	// nível de amizade
	private Double peso;
	// relações de começo
	private Vertice<TIPO> inicio;
	// relação final
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
