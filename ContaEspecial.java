// Resposta para CT Execício 1

public class ContaEspecial extends Conta {
  protected double limite;

  ContaEspecial () {
    this.limite = 0.0;
  }

  ContaEspecial (String nome_titular, int numero, double limite) {
    super(nome_titular, numero);
    this.limite = limite;
    numero++;
  }

  @Override
  public boolean sacar(double valor) {
    if (this.getSaldo() + this.limite == 0) {
      System.out.println("Esta conta não tem mais limite!");
      return false;
    } else {
      if (this.getSaldo() + this.limite >= valor){
        this.saldo -= valor;
        return true;
      } else {
        return false;
      }
    }
  }

  @Override
  public void exibirDados() {
    System.out.println("Nome do titular: "+this.nome_titular);
    System.out.println("Saldo: "+this.saldo);
    System.out.println("Numero da conta: "+this.numero);
    this.exibirDados();
    System.out.println("Limite: "+this.limite);
  }

  public double getLimite() {
    return this.limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }
}