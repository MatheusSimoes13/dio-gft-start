package set;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

	String nome;
	int anoDeCriacao;
	String ide;
	
	public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}
	public void setAnoDeCriacao(int anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public int compareTo(LinguagemFavorita linguagemfavorita) {
		
		return this.getNome().compareTo(linguagemfavorita.getNome());
	}
	
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
	
}
