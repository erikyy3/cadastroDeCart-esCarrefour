
package netbeans;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;


public class Usuario {
    private int id;
    private String cpf;
    private String telefone;
    private String email;
    private LocalDate dataCadastro;
    
    public int getId(){
        return id;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public LocalDate getDataCadastro(){
        return dataCadastro;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setDataCadastro(LocalDate data){
        this.dataCadastro = data;
    }
    
    public boolean validacaoCPF(String cpf){
        List<Usuario> listagem = ListaUsuarios.listar();
        
        for(int i = 0; i < listagem.size(); i++){
            Usuario usuario = listagem.get(i);
           
           if(usuario.getCPF().equals(cpf)){                                      
            LocalDate dataCadastro = usuario.getDataCadastro();    
            
            if(dataCadastro != null && dataCadastro.isAfter(LocalDate.now().minusDays(30))){
              return true;  
            }
           }
        }
        return false;
    }
    
    
}
