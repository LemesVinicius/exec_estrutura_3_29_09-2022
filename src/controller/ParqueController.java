package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class ParqueController {

	public void brinquedo (Fila fila) throws Exception {
		
		int filaSize = fila.size();
		
		for(int i = 0; i < filaSize ; i++ ) {
			
			Pessoa pessoa = (Pessoa) fila.remove();
			
			if (pessoa.altura > 1.59 ){
				if(pessoa.idade > 16) {
					System.out.println("Nome: " + pessoa.nome + " pode ir ao brinquedo");
				}else{
					System.out.println("Nome: "+ pessoa.nome + " não tem idade para o brinquedo");
				}
			}else {
				if(pessoa.idade < 16 ){
					System.out.println("Nome: " + pessoa.nome + " não tem altura nem idade para o brinquedo" );
				}else{
					System.out.println("Nome: " + pessoa.nome + " não tem altura para o brinquedo");
				}
			}
			
		}
		
	}
	
}