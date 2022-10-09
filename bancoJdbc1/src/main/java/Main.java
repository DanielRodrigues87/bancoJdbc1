import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Crud myCrud = new Crud();


        //myCrud.add("Harry Potter","J.K.Rowling","Rocco","1997");
        //myCrud.getOne(1);
        //myCrud.getAll();
        myCrud.delete(2);
    }
}
