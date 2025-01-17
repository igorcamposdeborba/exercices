package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Biblioteca {
	private List<ItemBibliografico> itens = new ArrayList<>(); // Agregação: porque biblioteca depende em parte dos ItemBibliografico (livros e revistas) para existir. 
	// Lembre-se: existe Associação, Agregação e Composição e todas elas são escritas da mesma forma no java. A diferença é só a teoria (conceito)
	// Usei ArrayList porque eu acesso o índice no método ItemBibliografico para buscar por titulo e retornar o objeto
	
	public Biblioteca() { // construtor vazio porque eu posso ter uma biblioteca vazia
	}

	// Access methods
	public List<ItemBibliografico> getItens(){
		return this.itens;
	}
	
	// Logic methods
	public void AdicionarItem(ItemBibliografico item) { // adicionar livro ou revista
		this.itens.add(item);
	}
	
	
	public ItemBibliografico buscarPorTitulo(String titulo) throws NoSuchElementException{ // buscar pelo título o livro ou revista
		
		for (int i=0; i < this.itens.size(); i++) { // passar por cada item do ArrayList
			if (this.itens.get(i).getTitulo().equals(titulo)) { // comparar se o título é igual do parâmetro
				return itens.get(i);
			}
		}
		return null;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); // SringBuilder usado para string grandes
		sb.append("[");
		
		for(int i=0; i<this.itens.size(); i++) {
			 sb.append(itens.get(i).toString());
			 
			 if (i < this.itens.size() - 1) {
				 sb.append(", ");
			 }
		}
		sb.append("]");
		
		return sb.toString();
	}
}
