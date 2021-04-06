// Resposta para CT Execício 1

public class ContaPoupanca extends Conta {
  ContaPoupanca () {}

  ContaPoupanca (String nome_titular, int numero) {
    super(nome_titular, numero);
    numero++;
  }

  public void reajustar(double percentual) {
    double saldoAtual = this.getSaldo();
    double reajuste = saldoAtual * percentual;
    this.depositar(reajuste);
  }
}