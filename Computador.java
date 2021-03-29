// Resposta de BMExercicio 04, 05 e 06

public class Computador extends Equipamento {
  private String propriedades_hardware;
  private String softwares_acoplados;

  public Computador () {
    super("", 0, 0.0);
    this.propriedades_hardware = "";
    this.softwares_acoplados = "";
    
  }

  public Computador (String nome, int ano_fabricacao,double preco, String propriedades_hardware, String softwares_acoplados) {
    super(nome, ano_fabricacao, preco);
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