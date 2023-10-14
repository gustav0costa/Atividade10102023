package atividade.gustavo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listarProdutos")
public class ListarProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BancoPrecos banco = new BancoPrecos();
		List<Produto> lista = banco.getProdutos();
		
		RequestDispatcher rd = req.getRequestDispatcher("/listar.jsp");
		req.setAttribute("listaProdutos", lista);
		rd.forward(req, resp);
	}

}
