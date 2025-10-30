public class Login {
    String nome;
    int senha;
    boolean autenticado;

    public Login(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
        this.autenticado = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isAutenticado() {
        return autenticado;
    } 

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
   
}
