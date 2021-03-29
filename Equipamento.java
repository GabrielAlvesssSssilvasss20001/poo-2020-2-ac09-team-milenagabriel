// Resposta da BMExercicio04, BMExercicio06

public class Equipamento {
  private String nome;
  private int ano_fabricacao;

  Equipamento () {
    this.nome = "";
    this.ano_fabricacao = 0;
  }

  Equipamento (String nome, int ano_fabricacao) {
    this.nome = nome;
    this.ano_fabricacao = ano_fabricacao;
  }

  public String getNome() {
    return this.nome;
  }

  public int getAnoFabricacao() {
    return this.ano_fabricacao;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAnoFabricacao(int ano_fabricacao) {
    this.ano_fabricacao = ano_fabricacao;
  }
}