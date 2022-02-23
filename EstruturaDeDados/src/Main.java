import java.util.*;

import arvore.BinaryTree;


public class Main {

	public static void main(String[] args) {


		int vetor[] = {1,2,3,4,5,6,7,8};
		
		System.out.println("vetor: ");
		for(int i = 0;i<vetor.length;i++) {
			
			System.out.print(vetor[i] + ",");
		}
		
		int tamanhoMatriz = 3;
		int matriz[][] = new int[3][3];
	
		System.out.println();
		System.out.print("Matriz");
		
		for(int i=0;i<tamanhoMatriz;i++) {
			for(int j=0;j<tamanhoMatriz;j++) {
				if(i==0) {
					matriz[i][j] = 1;
				}
				if(i==1){
					matriz[i][j] = 2;
				}
				if(i==2) {
					matriz[i][j] = 3;
				}
				
			}
		}
		for(int i=0;i<tamanhoMatriz;i++) {
			
			System.out.println("");
			for(int j=0;j<tamanhoMatriz;j++) {
				System.out.print(matriz[i][j]);
			}
		}

		System.out.println("Lista ligada");
		
		LinkedList<String> nomes = new LinkedList<String>();
		
		nomes.add("Matheus");
		nomes.add("Lucas");
		nomes.add("João");
		
		System.out.println(nomes);
		
		System.out.println("Pilha");
		
		Stack<Integer> pilha = new Stack<Integer>();
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		
		pilha.forEach(System.out::println);
		System.out.println("Removendo 1 elemento");
		pilha.pop();
		
		pilha.forEach(System.out::println);
		
		System.out.println("Fila");
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Matheus");
		fila.add("Lucas");
		fila.add("João");
		
		fila.forEach(System.out::println);
		System.out.println("Removendo 1 elemento");
		fila.remove();
		
		fila.forEach(System.out::println);
		
		System.out.println("Arvore Binaria");
		
		BinaryTree arvore = new BinaryTree();
		
		arvore.add(6);
		arvore.add(4);
		arvore.add(5);
		arvore.add(10);
		arvore.add(20);
		
		
	}

}
