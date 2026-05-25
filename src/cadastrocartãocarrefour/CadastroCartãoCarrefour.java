
package cadastrocartãocarrefour;

import views.CadastroCartao;
import ConexaoBancoDeDados.Conexao;

public class CadastroCartãoCarrefour {


    public static void main(String[] args) {
        Conexao conn = new Conexao();
        conn.conectar();
        CadastroCartao telaCadastro = new CadastroCartao();
        telaCadastro.setVisible(true);
    }
    
}
