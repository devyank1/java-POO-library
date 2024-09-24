import java.util.ArrayList;
import java.util.List;

public class Leitor {

    private String nome;

    private List<Livro> livrosEmprestados;

    public Leitor(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro){
        if (livrosEmprestados.size() < 3){
            if (livro.isDisponibilidade()){
                livrosEmprestados.add(livro);
                livro.emprestarLivro();
            }else {
                System.out.println("O LIVRO " + livro.getTitulo() + " JÁ ESTÁ EMPRESTADO");
            }
        }else {
            System.out.println("O LEITOR " + nome + " JÁ ALCANÇOU O LIMITE DE 3 LIVROS");
        }
    }

    public void devolverLivro(Livro livro){
        if (livrosEmprestados.remove(livro)){
            livro.devolverLivro();
        }else {
            System.out.println("ESTE LIVRO NÃO ESTÁ EMPRESTADO AO USUÁRIO " + nome + ".");
        }
    }
}
