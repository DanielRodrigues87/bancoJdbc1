import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud extends SQLException {
    Conexao conn = new Conexao();
    Livros livros = new Livros();
    PreparedStatement stm;

    public void add(String titulo, String autor, String editora, String ano) throws SQLException {
        stm = conn.connection().prepareStatement("INSERT INTO tb_acervo (titulo,autor,editora,ano) VALUES (?,?,?,?)");
        stm.setString(1,titulo);
        stm.setString(2,autor);
        stm.setString(3,editora);
        stm.setString(4,ano);
        stm.executeUpdate();

        stm.executeUpdate();

        livros.setTitulo(titulo);
        livros.setAutor(autor);
        livros.setEditora(editora);
        livros.setAno(ano);

        System.out.println("Dados inseridos com sucesso");

        stm.close();
    }

    public void  getOne(int id) throws SQLException {
        stm = conn.connection().prepareStatement("SELECT * FROM tb_acervo WHERE id=?");
        stm.setInt(1,id);

        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            int livroId = rs.getInt("id");
            String titulo = rs.getString("Título");
            String autor = rs.getString("Autor");
            String editora = rs.getString("Editora");
            String ano = rs.getString("Ano");

            livros.setTitulo(titulo);
            livros.setAutor(autor);
            livros.setEditora(editora);
            livros.setAno(ano);
            livros.toStrings();

        }

        rs.close();
        stm.close();
    }

    public void  getAll() throws SQLException {
        stm = conn.connection().prepareStatement("SELECT * FROM tb_acervo");


        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            int livroId = rs.getInt("id");
            String titulo = rs.getString("Título");
            String autor = rs.getString("Autor");
            String editora = rs.getString("Editora");
            String ano = rs.getString("Ano");

            livros.setTitulo(titulo);
            livros.setAutor(autor);
            livros.setEditora(editora);
            livros.setAno(ano);
            livros.toStrings();

        }

        rs.close();
        stm.close();
    }

    public void delete(int id) throws SQLException {
        stm = conn.connection().prepareStatement("DELETE  FROM tb_acervo WHERE id=?");
        stm.setInt(1,id);

        stm.executeUpdate();

        System.out.println("Livro" + id + "Deletado");
    }


}
