package SRC;
public class ContaBancaria {

    private int numero;
    private int agencia;
    private double saldo;
    private String cpf;
    private String senha;
    private String email;

    public ContaBancaria(int numero, int agencia, double saldo, String cpf, String senha, String email){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;

    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }


    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getAgencia(){
        return agencia;
    }


    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }


    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    }


    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }


    private boolean testarValor(double valor){
        if(valor > 0){
            return true;
        }else{
            return false;
        }
    }

    private boolean valorMenorOuIgualQueSaldo(double valor){
        return valor < saldo;
    }

    private boolean valorValidoSaque(double valor){
        boolean maiorQueZero = testarValor(valor);
        boolean menorQueZero = valorMenorOuIgualQueSaldo(valor);


        if(maiorQueZero && menorQueZero){
            return true;
        }
        else{
            return false;
        }
    }

    public String sacar(double valor){
        if(valorValidoSaque(valor)){
            saldo = saldo - valor;
            return "Saque realizado";  
        }
        else{
            return "Valor inválido";
        }
         
    }
           

    public String depositar(double valor){
        if (testarValor(valor)){
            saldo = saldo + valor;
            return "Depósito realizado";
        }
            return "Valor inválido";
        
    }

    public String toString(){
        return "\nNúmero:"+numero+"\nAgência:"+agencia+"\nSaldo: R$ "+saldo+"\nCpf:"+cpf+"\nSenha:"+senha;
        
    }
}
