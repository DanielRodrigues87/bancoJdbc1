public class Livros {

    private int id;



    private String titulo;
    private String autor;
    private String editora;
    private String ano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    void toStrings() {
        System.out.println("Título" + this.getTitulo() +
        "\nAutor" + this.getAutor() +
        "\nEditora" + this.getEditora() +
        "\nAno" + this.getAno());
    }
}
