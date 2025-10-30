
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       try (Scanner sc = new Scanner(System.in)) {
       ArrayList <Login> logins = new ArrayList<>();
       ArrayList <Empresa> funcionarios = new ArrayList<>();

       logins.add(new Login("admin", 1234));
       funcionarios.add(new Empresa("Anthony", 7020));

       for (Login Login : logins) {
        System.out.println("Login: ");
        String nomeInput = sc.nextLine();
        System.out.println("Senha: ");
        int senhaInput = sc.nextInt();
        sc.nextLine();

        if (nomeInput.equals(Login.getNome()) && senhaInput == Login.getSenha()) {
            System.out.println("Acesso concedido! ");
        } else {
            System.out.println("Acesso negado! ");
        }
        break;
       }
       for (Empresa Empresa : funcionarios) {
        System.out.println("Nome do funcionario: ");
        String nomeFuncInput = sc.nextLine();
        System.out.println("Senha do funcionario: ");
        int senhaFuncInput = sc.nextInt();
        sc.nextLine();
        
        if (nomeFuncInput.equals(Empresa.getNomeFuncionario()) && senhaFuncInput == Empresa.getSenhaFuncionario()) {
            System.out.println("Acesso do funcionario concedido! ");
        } else {
            System.out.println("Acesso do funcionario negado! ");
        }
       break;
    }
       }
   }
}
