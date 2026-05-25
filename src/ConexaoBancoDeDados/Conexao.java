
package ConexaoBancoDeDados;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    Connection conn;
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancocarrefourdb", "AdministradorBancoCarrefour", "Adm@1406");
            System.out.println("Conexão feita com sucesso!");
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Falha ao conectar! " + ex.getMessage());
            return false;
        }
    }
    

}
