public class Empresa {
    String nomeFuncionario;
    int senhaFuncionario;
    boolean autenticadoFuncionario;

    public Empresa(String nomeFuncionario, int senhaFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.autenticadoFuncionario = true;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(int senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public boolean isAutenticadoFuncionario() {
        return autenticadoFuncionario;
    }

    public void setAutenticadoFuncionario(boolean autenticadoFuncionario) {
        this.autenticadoFuncionario = autenticadoFuncionario;
    }
}
