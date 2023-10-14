package atividade.gustavo;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/editaProduto")
public class AtualizarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AtualizarProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProduto = (String) request.getParameter("id");
		
		Integer idProd = Integer.parseInt(idProduto);
		
		BancoPrecos banco = new BancoPrecos();
		Produto prod = banco.buscaProdutoPeloId(idProd);
		
		
		request.setAttribute("produto", prod);
		//response.sendRedirect("editaProduto");
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/atualizar.jsp");		
		rd.forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProduto = (String) request.getParameter("id");
		String NomeProd = (String) request.getParameter("nome");
		String PrecoProd = (String) request.getParameter("preco");
		String DataProd = (String) request.getParameter("data");
		
		Integer idProd = Integer.parseInt(idProduto);
		Date dataP = null;
		
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataP = sdf.parse(DataProd);
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		
		BancoPrecos banco = new BancoPrecos();
		Produto prod = new Produto(NomeProd,PrecoProd,dataP);
		prod.setId(idProd);
		banco.alteraProduto(prod);
		
		response.sendRedirect("listarProdutos");
		
	}
}
