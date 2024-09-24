public class Livro {

    private String titulo;
    private String autor;
    private boolean disponibilidade;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = true;
    }

    public void emprestarLivro() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("O LIVRO " + titulo + " FOI EMPRESTADO");
        }else {
            System.out.println("O LIVRO " + titulo + " NÃO ESTÁ DISPONÍVEL");
        }
    }

    public void devolverLivro(){
        disponibilidade = true;
        System.out.println("O LIVRO " + titulo + " FOI DEVOLVIDO");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

}
