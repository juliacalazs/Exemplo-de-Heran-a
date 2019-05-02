package view;

import model.PessoaFisica;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Julia");
		pf.setEndereco("Rua do Sono");
		
		System.out.println("Nome: "+ pf.getNome());
		System.out.println("Endereço: "+ pf.getEndereco());
	}

}
