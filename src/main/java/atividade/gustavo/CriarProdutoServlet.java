package atividade.gustavo;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/criarProduto")
public class CriarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CriarProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeProduto = (String) request.getParameter("nome");
		String precoProduto = (String) request.getParameter("preco");
		String paramData = (String) request.getParameter("data");
		
		Date dataAbertura = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramData);
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		
		Produto prod = new Produto(nomeProduto,precoProduto,dataAbertura);
		//prod.setNome(nomeProduto);
		//prod.setPreco(precoProduto);
		//prod.setData(dataAbertura);
		
		BancoPrecos bancoPrecos = new BancoPrecos();
		bancoPrecos.adiciona(prod);
		
		request.setAttribute("nomeProduto", prod.getNome());
		response.sendRedirect("listarProdutos");
	}


}
