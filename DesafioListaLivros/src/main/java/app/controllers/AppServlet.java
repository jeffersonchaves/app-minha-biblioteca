package app.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.entities.Livro;
import app.repositories.LivrosRepository;

@WebServlet("")
public class AppServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private List<Livro> livros = new ArrayList<Livro>();
	
	@Override
	public void init() throws ServletException {
		LivrosRepository.create();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		livros = LivrosRepository.livros;
		
		req.setAttribute("livrosAttr", livros);
		
		RequestDispatcher disp = req.getRequestDispatcher("lista-livros.jsp");
		disp.forward(req, resp);
		
	}

}
