import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import comparators.ComparatorAnoNome;
import comparators.ComparatorAnoNomeIde;
import comparators.ComparatorIde;
import set.LinguagemFavorita;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
	int op;
	System.out.println("Qual exercício executar");
	System.out.println("1 - Meses e temperaturas");
	System.out.println("2 - Perguntas sobre crime");
	System.out.println("3 - Cores do arco-íris");
	System.out.println("4 - Linguagem Favorita");
	System.out.println("5 - Populações");
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
		//////////////////////SET,HASHSET,TREESET///////////////////////
		
			case 3:
				HashSet<String> cores = new HashSet<String>() {{
					add("vermelho");
					add("laranja");
					add("amarelo");
					add("verde");
					add("azul");
					add("anil");
					add("violeta");
				}};
				
				Iterator<String> it = cores.iterator();
				
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				System.out.println("Quantidade de cores: " + cores.size());

				System.out.println("Ordem alfabética");
				TreeSet<String> coresArvore = new TreeSet<String>(cores);
				Iterator<String> itArvore = coresArvore.iterator();
				
				while(itArvore.hasNext()) {
					System.out.println(itArvore.next());
				}
				
				System.out.println("Ordem inversa");
				LinkedList<String> coresReversa = new LinkedList<String>(cores);
				Iterator<String> itReversa = coresReversa.iterator();
				
				Collections.reverse(coresReversa);
				
				while(itReversa.hasNext()) {
					System.out.println(itReversa.next());
				}
				
				System.out.println("Cores com V");
				
				for (String cor: cores) {
					if(cor.startsWith("v")) {
						System.out.println(cor);
					}
				}
		
				System.out.println("Removendo cores que não começam com V");
				
				Iterator<String> it2 = cores.iterator();
				
				while(it2.hasNext()) {
					if(!it2.next().startsWith("v")) {
						it2.remove();
					}
				}
				
				System.out.println(cores);
				
				System.out.println("Limpando o conjunto");
				
				cores.clear();
				
				System.out.println(cores);
				
				System.out.println("Está vazio?");
				
				System.out.println(cores.isEmpty());
				
				break;
		
				////////////////FIM EXERCICIO 3///////////////
		
			case 4:
				
				LinguagemFavorita java = new LinguagemFavorita("Java",1991,"Eclipse");
				LinguagemFavorita php = new LinguagemFavorita("PHP",1994,"PHPStorm");
				LinguagemFavorita javascript = new LinguagemFavorita("Javascript",1995,"VSCode");
				
				Set<LinguagemFavorita> linguagens = new LinkedHashSet<LinguagemFavorita>() {{
					
					add(java);
					add(php);
					add(javascript);
					
				}};
				Iterator<LinguagemFavorita> itLinguagem = linguagens.iterator();
				
				System.out.println("Ordem de inserção");
				
				while(itLinguagem.hasNext()) {
					System.out.println(itLinguagem.next().getNome());
				}
				
				System.out.println("Ordem natural(nome)");
				
				TreeSet<LinguagemFavorita> arvoreLinguagem = new TreeSet<LinguagemFavorita>(linguagens);
				Iterator<LinguagemFavorita> itArvoreLinguagem = arvoreLinguagem.iterator();
				
				while(itArvoreLinguagem.hasNext()) {
					System.out.println(itArvoreLinguagem.next().getNome());
				}
				
				System.out.println("IDE");
				Set<LinguagemFavorita> linguagens2 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
				linguagens2.addAll(linguagens);
				for(LinguagemFavorita linguagem : linguagens2) {
					System.out.println(linguagem);
				}
				
				System.out.println("Ano de criação e nome");
				Set<LinguagemFavorita> linguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorAnoNome());
				linguagens3.addAll(linguagens);
				for(LinguagemFavorita linguagem : linguagens3) {
					System.out.println(linguagem);
				}
				
				System.out.println("Nome, Ano de criacação e IDE");
				Set<LinguagemFavorita> linguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoNomeIde());
				linguagens4.addAll(linguagens);
				for(LinguagemFavorita linguagem : linguagens4) {
					System.out.println(linguagem);
				}
				break;
				///////////////////////// FIM DO EXERCÍCIO 4////////////////////
				///////////////////////// MAPS /////////////////////
				
				
			case 5:
				
				Map<String,Integer> populacoes = new HashMap();
				
				populacoes.put("PE",9616621);
				populacoes.put("AL",3351543);
				populacoes.put("CE",9187103);
				populacoes.put("RN",3534265);
				
				System.out.println(populacoes.toString());
				
				System.out.println("Substituir população do RN");
				
				populacoes.put("RN",3534165);
				System.out.println(populacoes.get("RN"));
				
				System.out.println("Se não tiver PB, adicione PB,4039277");
				
				if(!populacoes.containsKey("PB")) {
					populacoes.put("PB",4039277);
				}
				
				System.out.println("População PE");
				
				System.out.println(populacoes.get("PE"));
				
				System.out.println("Estados e Populações");
				
				Map<String,Integer> populacoesOrdem = new LinkedHashMap(populacoes);
				
				for(Entry<String, Integer> populacao : populacoesOrdem.entrySet()) {
					System.out.println(populacao.getKey() + " - " + populacao.getValue());
				}
				
				System.out.println("Ordem alfabética");
				
				Map<String,Integer> populacoesAlfabetica = new TreeMap(populacoes);
				
				for(Entry<String, Integer> populacao : populacoesAlfabetica.entrySet()) {
					System.out.println(populacao.getKey() + " - " + populacao.getValue());
				}
				
				System.out.println("Menor população");
				
				Entry<String,Integer> min = null;
				for(Entry<String,Integer> populacao : populacoes.entrySet()) {
					if(min == null || min.getValue() > populacao.getValue()) {
						min = populacao;
					}
				}
				
				System.out.println(min.getKey() + " - " + min.getValue());
				
				System.out.println("Maior população");
				
				Entry<String,Integer> max = null;
				for(Entry<String,Integer> populacao : populacoes.entrySet()) {
					if(max == null || max.getValue() < populacao.getValue()) {
						max = populacao;
					}
				}
				
				System.out.println(max.getKey() + " - " + max.getValue());
				
				System.out.println("Soma");
				
				int soma;
				
				soma = min.getValue() + max.getValue();
				System.out.println(soma);
				
				System.out.println("Média das populações");
				
				int somaTodos = 0;
				double media = 0;
				
				for(Entry<String,Integer> populacao : populacoes.entrySet()) {
					somaTodos += populacao.getValue();
				}
				
				media = somaTodos/populacoes.size();
				
				System.out.println(media);
				
				System.out.println("Remover estados com população menor que 4.000.000");
				
				Iterator<Integer> itMap = populacoes.values().iterator();
				
				while(itMap.hasNext()) {
					if(itMap.next() < 4000000) {
					itMap.remove();
						System.out.println("Removeu");
					}
				}
				
				
				for(Entry<String, Integer> populacao : populacoesOrdem.entrySet()) {
					System.out.println(populacao.getKey() + " - " + populacao.getValue());
				}
				
				System.out.println("Apagar tudo");
				
				populacoes.clear();
				
				System.out.println("Está vazio?");
				
				System.out.println(populacoes.isEmpty());
				
				
				break;
				
	}
	}

}
