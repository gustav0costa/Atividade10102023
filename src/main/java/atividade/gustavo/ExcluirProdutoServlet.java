package atividade.gustavo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeProduto")
public class ExcluirProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ExcluirProdutoServlet() {
        super();
       
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String idProduto = (String) request.getParameter("id");
    	Integer idProd = Integer.parseInt(idProduto);
    	
    	BancoPrecos banco = new BancoPrecos();
    	Produto prod = banco.buscaProdutoPeloId(idProd);
    	
    	request.setAttribute("produto", prod);
    	
    	RequestDispatcher rd = request.getRequestDispatcher("/excluir.jsp");
    	rd.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idProd = (String) request.getParameter("id");
		Integer id = Integer.parseInt(idProd);
		
		BancoPrecos banco = new BancoPrecos();
		
		banco.removeProduto(id);
		
		response.sendRedirect("listarProdutos");
		
	}

}
