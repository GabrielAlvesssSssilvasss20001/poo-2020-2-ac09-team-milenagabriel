// Resposta de BMExercicio 04 e 06

public class Equipamento {
  private String nome;
  private int ano_fabricacao;
  private double preco;

  public Equipamento () {
    this.nome = "";
    this.ano_fabricacao = 0;
    this.preco = 0.0;
  }

  public Equipamento (String nome, int ano_fabricacao, double preco) {
    this.nome = nome;
    this.ano_fabricacao = ano_fabricacao;
    this.preco = preco;
  }

  public String getNome() {
    return this.nome;
  }

  public int getAnoFabricacao() {
    return this.ano_fabricacao;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAnoFabricacao(int ano_fabricacao) {
    this.ano_fabricacao = ano_fabricacao;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }
}
