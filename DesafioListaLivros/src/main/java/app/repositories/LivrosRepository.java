package app.repositories;

import java.util.ArrayList;
import java.util.List;

import app.entities.Autor;
import app.entities.Livro;

public class LivrosRepository {
	
	public static List<Livro> livros = new ArrayList<Livro>();
	
	public static void create(){
		Autor a1 = new Autor("George S Clason");
		Livro l1 = new Livro("O Homem mais rico da Babilônia", 2017, "Romance", 160, a1);
		
		livros.add(l1);
		
		Autor a2 = new Autor("Charles D");
		Livro l2 = new Livro("O poder do hábito", 2012, "Auto ajuda", 408, a2);
		
		livros.add(l2);
	}
	
	public static void createBook(Livro livro) {
		livros.add(livro);
	}

}
