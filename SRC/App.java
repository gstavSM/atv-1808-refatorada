package SRC;
import java.util.Scanner;


public class App{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ContaBancaria conta; 
        int numero, agencia;
        String cpf, senha, email;
        

        System.out.println("Digite o número da conta:");
        numero = scan.nextInt();
        System.out.println("Digite a agência da conta:");
        agencia = scan.nextInt();
        System.out.println("Digite o cpf da conta:");
        scan.nextLine();
        cpf = scan.nextLine();
        System.out.println("Digite a senha da conta:");
        senha = scan.nextLine();

        conta = new ContaBancaria(numero,agencia,0.0,cpf,senha,"teste@email.com");

        conta.setNumero (numero);
        conta.setAgencia(agencia);
        conta.setCpf(cpf);
        conta.setSenha(senha);

        System.out.println("Dados da conta");
        System.out.println(conta.toString());
        
        conta.sacar(10);

        System.out.println("Dados da conta");
        System.out.println(conta.toString());

        conta.depositar(50);

        System.out.println("Dados da Conta:");
        System.out.println(conta.toString());


        


    }
}