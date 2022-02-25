package comparators;

import java.util.Comparator;

import set.LinguagemFavorita;

public class ComparatorAnoNomeIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		int nome = o1.getNome().compareTo(o2.getNome());
		int anoDeCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
		if(nome != 0) { 
			return nome;
			}
		if(anoDeCriacao != 0) {
			return anoDeCriacao;
				}
		return o1.getIde().compareTo(o2.getIde());
	}

}
