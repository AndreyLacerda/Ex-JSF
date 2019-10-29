package beans;

public class LoginBean {
    private String usuario;
    private String senha;
    
    public LoginBean() {
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String logarUsuario(){
        if (usuario.equals("joao") && senha.equals("123"))
            return "sucesso";
        else
        return "erro";
    }
} 