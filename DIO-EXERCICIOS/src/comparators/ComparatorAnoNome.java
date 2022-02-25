package comparators;

import java.util.Comparator;

import set.LinguagemFavorita;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		int anoDeCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
		if(anoDeCriacao != 0) {
			return anoDeCriacao;
		}
		return o1.getNome().compareTo(o2.getNome());
	}

}
