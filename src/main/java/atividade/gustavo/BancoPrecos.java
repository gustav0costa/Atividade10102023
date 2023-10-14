package atividade.gustavo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoPrecos {

	//private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	public static List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public void adiciona(Produto prod) {
		prod.setId(chaveSequencial++);
		listaProdutos.add(prod);		
	}
	
	public List<Produto> getEmpresas() {
		return BancoPrecos.listaProdutos;
	}

	public List<Produto> getProdutos() {
		// TODO Auto-generated method stub
		return BancoPrecos.listaProdutos;
	}

	public void removeProduto(Integer idProd) {
		Iterator<Produto> it = listaProdutos.iterator();				
		while(it.hasNext()) {
			Produto prod = it.next();
			if(Integer.valueOf(prod.getId()) == idProd) {
				it.remove();
			}
		}
	}
	public Produto buscaProdutoPeloId (Integer idProd) {
		for (Produto prod: listaProdutos) {
			if(prod.getId()== idProd) {
				return prod;
			}
		}
		return null;
	}
	
	public void alteraProduto(Produto produto) {
		for (Produto prod: listaProdutos) {
			
			if(produto.getId() == prod.getId()) {
				prod.setNome(produto.getNome());
				prod.setPreco(produto.getPreco());
				prod.setData(produto.getData());
			}
		}
	}
	
}
