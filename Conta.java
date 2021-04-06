// Classe Conta utilizada em atividades anteriores
// Reutilizada para responder CT Execício 1

public class Conta {
  protected String nome_titular;
  protected double saldo;
  protected int numero;

  public Conta (){
    this.nome_titular = "";
    this.saldo = 0.0;
    this.numero = 0;
  }

  public Conta (String nome_titular, int numero) {
    this.nome_titular = nome_titular;
    this.numero = numero;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public boolean sacar(double valor) {
    if (this.saldo >= valor){
      this.saldo -= valor;
      return true;
    }
    else{
      return false;
    }
  }

  public void setNome(String nome) {
    this.nome_titular = nome;
  }

  public void setNum(int numero) {
    this.numero = numero;
  }

  public String getNome() {
    return this.nome_titular;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void exibirDados() {
    System.out.println("Nome do titular: "+this. nome_titular);
    System.out.println("Saldo: "+this.saldo);
    System.out.println("Numero da conta: "+this.numero);
  }

  public int imprimirTipoConta() {
    if(this.getClass() == Conta.class){
        System.out.println("\nConta Simples\n");
        return 1;
    }
    else if(this.getClass() == ContaEspecial.class){
        System.out.println("\nConta Especial\n");
        return 2;
    }
    else if(this.getClass() == ContaPoupanca.class){
        System.out.println("\nConta Poupanca\n");
        return 3;
    }
    return 0;
  }
}