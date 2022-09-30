package view;

import java.text.DecimalFormat;
import java.util.Random;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;
import model.Pessoa;

public class Principal {

	public static void main(final String[] args) throws Exception {
		
		
		Random rand = new Random();
		
		Fila fila = new Fila();
	
		for(int i = 0; i < 30 ; i++) {
			
			Pessoa pessoa = new Pessoa();
			
			int randomIdade;
			float randomAltura;
			double randomFloat;
			String FormatedDouble;
			
			do {
				randomIdade = rand.nextInt(41);
			}while(randomIdade < 10);
			
			do {
				randomFloat = (rand.nextFloat()*(2.00));
			}while(randomFloat < 1.30 || randomFloat > 2.00);
			
			
			FormatedDouble = new DecimalFormat("######.00").format(randomFloat);
			
			randomAltura = Float.parseFloat(FormatedDouble.replace(',', '.'));
			
			pessoa.nome = "Pessoa"+i;
			pessoa.idade = randomIdade;
			pessoa.altura = randomAltura;
			
			fila.insert(pessoa);
			
			
		}
		
		ParqueController parquecontroller = new ParqueController();
		
		parquecontroller.brinquedo(fila);
		
		
	}
	
}