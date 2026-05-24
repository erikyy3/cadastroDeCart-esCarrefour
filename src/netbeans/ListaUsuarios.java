
package netbeans;

import java.util.ArrayList;
import java.util.List;


public class ListaUsuarios {
    private static final List<Usuario> lista = new ArrayList<Usuario>();
    
    public static List<Usuario> listar(){
        return lista;
    }
    
    public static void adicionarUsuario(Usuario usuario){
        lista.add(usuario);
    }
    
    public static void removerUsuario(Usuario usuario){
        lista.remove(usuario);
    }
}
