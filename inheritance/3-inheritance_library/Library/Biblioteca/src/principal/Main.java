package principal;

import java.util.Arrays;
import java.util.List;

import entities.Biblioteca;
import entities.ItemBibliografico;
import entities.Livro;
import entities.Revista;

public class Main {
	public static void main(String [] args) {
		
		// Variáveis
		String titulo1 = "Vikings Valhalla";
		int anoPublicacao1 = 2023;
		String autor1 = "Joanna Dale";
		
		String titulo2 = "Far Cry 3";
		int anoPublicacao2 = 2020;
		String autor2 = "Oliver Osbourne";
		
		String titulo3 = "Lord of Rings";
		
		int edicao1 = 2019;
		int edicao2 = 2015;
		
		// Instanciar objetos: livros e revistas
		Livro livro1 = new Livro(titulo1, anoPublicacao1, autor1);
		Livro livro2 = new Livro(titulo1, anoPublicacao1, autor1);
		Livro livro3 = new Livro(titulo2, anoPublicacao2, autor2);

		Revista revista1 = new Revista(titulo1, anoPublicacao1, edicao1);
		Revista revista2 = new Revista(titulo3, anoPublicacao2, edicao2);
		
		// Criar biblioteca
		Biblioteca biblioteca1 = new Biblioteca();
		
		biblioteca1.AdicionarItem(livro1);
		biblioteca1.AdicionarItem(livro3);
		biblioteca1.AdicionarItem(revista1);
		
		System.out.println("Biblioteca:  " + biblioteca1);
		
		ItemBibliografico item1 = biblioteca1.buscarPorTitulo(titulo1);
		ItemBibliografico item3 = biblioteca1.buscarPorTitulo(titulo3); // é para retornar null porque não adicionei o titulo3 na biblioteca1
		
		System.out.println("Livros iguais 1 e 2?  " + livro1.equalsLivro(livro2));
		System.out.println("Livros iguais 1 e 3?  " + livro1.equalsLivro(livro3));
		
		System.out.println("\nLivro 1:  " + livro1.toString());
		System.out.println("Livro 2:  " + livro2.toString());
		System.out.println("Livro 3:  " + livro3.toString());
		
		
		System.out.println("Busca por titulo do livro 1 na biblioteca: " + item1);
		System.out.println("Busca por titulo do livro 3 na biblioteca: " + item3);
		
		
		
	}
}
