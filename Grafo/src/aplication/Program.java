package aplication;

import entities.Grafo;

public class Program {

	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<String>();
		
		grafo.adicionarVertice("Luan");
		grafo.adicionarVertice("Iago");
		grafo.adicionarVertice("Iuri");
		grafo.adicionarVertice("Cicero");
		grafo.adicionarVertice("Diva");
		
		grafo.adicionarAresta(2.0, "Luan", "Iago");
		grafo.adicionarAresta(3.0, "Iago", "Cicero");
		grafo.adicionarAresta(1.0, "Cicero", "Iuri");
		grafo.adicionarAresta(1.0, "Luan", "Diva");
		grafo.adicionarAresta(2.0, "Diva", "Iuri");
		grafo.adicionarAresta(3.0, "Diva", "Luan");
		
		grafo.buscaEmLArgura();
	}

}
