public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R Tolkien");
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes");

        biblioteca.cadastrarLivros(livro1);
        biblioteca.cadastrarLivros(livro2);
        biblioteca.cadastrarLivros(livro3);

        Leitor leitor1 = new Leitor("Ana");
        Leitor leitor2 = new Leitor("Carlos");

        biblioteca.cadastrarLeitor(leitor1);
        biblioteca.cadastrarLeitor(leitor2);

        biblioteca.emprestarLivro(leitor1, livro1);
        biblioteca.emprestarLivro(leitor2, livro2);

        biblioteca.emprestarLivro(leitor2, livro1);

        biblioteca.devolverLivro(leitor1, livro1);

        biblioteca.devolverLivro(leitor2, livro1);
    }
}