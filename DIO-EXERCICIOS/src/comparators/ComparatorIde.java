package comparators;

import java.util.Comparator;

import set.LinguagemFavorita;

public class ComparatorIde implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		
		return o1.getIde().compareTo(o2.getIde());
	}

}
