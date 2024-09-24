import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livrosBiblioteca;
    private List<Leitor> leitoresCadastrados;

    public Biblioteca() {
        this.livrosBiblioteca = new ArrayList<>();
        this.leitoresCadastrados = new ArrayList<>();
    }

    public List<Livro> getTodosOsLivros() {
        return livrosBiblioteca;
    }

    public List<Leitor> getLeitores() {
        return leitoresCadastrados;
    }

    public void cadastrarLivros(Livro livro){
        livrosBiblioteca.add(livro);
        System.out.println("LIVRO " + livro.getTitulo() + " CADASTRADO NA BIBLIOTECA");
    }

    public void cadastrarLeitor(Leitor leitor){
        leitoresCadastrados.add(leitor);
        System.out.println("LEITOR " + leitor.getNome() + " CADASTRADO NO SISTEMA");
    }

    public void emprestarLivro(Leitor leitor, Livro livro){
        leitor.emprestarLivro(livro);
    }

    public void devolverLivro(Leitor leitor, Livro livro){
        leitor.devolverLivro(livro);
    }

    public List<Livro> getLivrosDisponiveis(){
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro l : livrosBiblioteca){
            if (l.isDisponibilidade()){
                disponiveis.add(l);
            }
        }
        return disponiveis;
    }


}
