package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ConsultarLocalProva;

@WebServlet("/ConsultaDeLocal")
public class ConsultarLocalProvaControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConsultarLocalProvaControl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int cursoSelecionado = Integer.parseInt(request.getParameter("curso")); // Pega o valor referencia ao radio referente ao curso que o usuário selecionou
		String nomeCandidato = request.getParameter("nome"); // ṕega o nome do candidato do form
		ConsultarLocalProva consultarLocalProva = new ConsultarLocalProva(); // criando objeto consultarLocalProva
		String resultadoSala = consultarLocalProva.localProva(nomeCandidato, cursoSelecionado); // Usando a String resultadoSala para receber a qual sala o candidato pertence segundo o metodo localProva da classe ConsultarLocalProva 
		
		

		request.setAttribute("resultadoSala", resultadoSala); // Responde para a página o resultado
		RequestDispatcher dispatcher = request.getRequestDispatcher("/localProva.jsp"); // indica o caminho para responder para a página
		dispatcher.forward(request, response); // q porra é isso?

		doGet(request, response); // nao mexer/q porra é isso
	}

}
