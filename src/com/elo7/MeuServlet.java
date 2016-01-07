package com.elo7;

import java.io.IOException;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elo7.controllers.ControladorNoPacote;

@WebServlet("/meuservlet")
public class MeuServlet  extends HttpServlet{

	@Inject
	ControladorNoPacote controladorNoPacote;
	
	@Inject
	QualquerController qualquerController;

	public MeuServlet() {
		System.out.println("Instanciando a Servlet...");
	}

	@PostConstruct
	public void ok() {
		System.out.println("Servlet pronta.");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.getOutputStream().print("OK.");
		System.out.println("Invocando doGet da Servlet.");
	}
}