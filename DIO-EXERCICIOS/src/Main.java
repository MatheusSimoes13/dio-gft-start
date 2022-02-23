import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
	int op;
	System.out.println("Qual exercício executar");
	System.out.println("1 - Meses e temperaturas");
	System.out.println("2 - Perguntas sobre crime");
	op = sc.nextInt();
	
	switch(op){
	
	case 1:
		List<Double> temperaturas = new ArrayList<Double>();
		List<String> meses = new ArrayList<String>() {{
			add("Janeiro");
			add("Fevereiro");
			add("Março");
			add("Abril");
			add("Maio");
			add("Junho");
		}};

		double mediaSemestral;
		
		for(int i=0;i<6;i++) {
			System.out.println("Digite a temperatura do mês " + (i+1));
			double temperatura = sc.nextDouble();
			temperaturas.add(temperatura);
		}
		
		mediaSemestral =  temperaturas.stream().mapToDouble(Double::doubleValue).sum()/temperaturas.size();
		System.out.println("Media semestral " + mediaSemestral);
		
		
		for(int i=0;i<temperaturas.size();i++) {
			if(temperaturas.get(i) > mediaSemestral) {
				System.out.println(temperaturas.get(i));
				System.out.println(meses.get(i));
			}
		}
		
		break;
		/////////////////////// FIM DO EXERCÍCIO 1////////////////////
	
	case 2:
		
		int count = 0;
		char resposta;
		List<String> perguntas = new ArrayList<String>() {{
			add("Telefonou para a vítima?");
			add("Esteve no local do crime?");
			add("Mora perto da vítima?");
			add("Devia para a vítima?");
			add("Já trabalhou com a vítima?");
		}};
		
		
		System.out.println("Responda com \" s \" para sim e \" n \" para não ");
		for (String pergunta : perguntas) {
			System.out.println(pergunta);
			do{
				resposta = sc.next().charAt(0);
				if(resposta != 's' && resposta != 'n') {
					System.out.println("Responda com s ou n");
				}
			}while(resposta != 's' && resposta != 'n');
			if(resposta == 's') {
				count++;
			}
			
		}
		
		switch(count) {
		
			case 0:
					System.out.println("Inocente");
				break;
			case 1:
					System.out.println("Inocente");
				break;
			case 2:	
					System.out.println("Suspeita");
				break;
			case 3:
					System.out.println("Cúmplice");
				break;
			case 4:
					System.out.println("Cúmplice");
				break;
			case 5:
					System.out.println("Assassina");
				break;
		}
		
		
		
		break;
		//////////////////////FIM DO EXERCÍCIO 2////////////////////////
	}
	}

}
