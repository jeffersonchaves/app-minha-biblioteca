package app.controllers;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.entities.Autor;
import app.entities.Livro;
import app.repositories.LivrosRepository;

@WebServlet("/cadastrar")
public class CadastroServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String tituloParam = req.getParameter("tituloField");
		String autorParam = req.getParameter("autorField");
		String generoParam = req.getParameter("generoField");
		String anoParam = req.getParameter("anoField");
		Integer paginasParam = Integer.valueOf(req.getParameter("paginasField"));
		
		Autor autor = new Autor(autorParam);
		Livro livro = new Livro(tituloParam, Integer.valueOf(anoParam), generoParam, paginasParam, autor);
		
		LivrosRepository.createBook(livro);
		
		ServletContext context = this.getServletContext();
		String caminho = context.getContextPath();
		
		resp.sendRedirect(caminho);
		
	}
	
}







