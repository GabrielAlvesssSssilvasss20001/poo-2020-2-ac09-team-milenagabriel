// Resposta da BMExercicio04, BMExercicio05, BMExercicio06

public class Computador extends Equipamento {
  private String propriedades_hardware;
  private String softwares_acoplados;

  Computador () {
    // chamada implícita do construtor vazio da superclasse
    this.propriedades_hardware = "";
    this.softwares_acoplados = "";
    
  }

  Computador (String nome, int ano_fabricacao, String propriedades_hardware, String softwares_acoplados) {
    super(nome, ano_fabricacao);
    this.propriedades_hardware = propriedades_hardware;
    this.softwares_acoplados = softwares_acoplados;
  }

  public String getPropriedadesHardware() {
    return this.propriedades_hardware;
  }

  public String getSoftwaresAcoplados() {
    return this.softwares_acoplados;
  }

  public void setPropriedadesHardware(String propriedades_hardware) {
    this.propriedades_hardware = propriedades_hardware; 
  }

  public void setSoftwaresAcoplados(String softwares_acoplados) {
    this.softwares_acoplados = softwares_acoplados;
  }
}