// Respostas de BMExercicio 07 e 08

public class TestaEquipamento {
  public static void main (String[] args) {
    Equipamento equipamento = new Equipamento();
    
    equipamento.setNome("Novo Dell G3 15");
    equipamento.setAnoFabricacao(2021);
    equipamento.setPreco(5999.90);

    Computador computador = new Computador();

    computador.setNome("Novo Dell G3 15");
    computador.setAnoFabricacao(2021);
    computador.setPreco(5999.90);

    computador.setPropriedadesHardware(" Processador: Intel® Core™ i5-10300H (2.5 GHz até 4.5 GHz, cache de 8MB, quad-core, 10ª geração) \n SO: Windows 10 Home Single Language, de 64 bits - em Português (Brasil) \n GPU: Placa de vídeo dedicada NVIDIA® GeForce® GTX 1650 com 4GB de GDDR6 \n Memória Principal: Memória de 8GB (2x4GB), DDR4, 2933MHz, Expansível até 16GB (2 slots soDIMM, sem slot livre) \n HD: SSD de 256GB PCIe NVMe M.2 \n cor: Preto \n Suporte adicional de complete care, assistência técnica e serviços estendidos de bateria");

    computador.setSoftwaresAcoplados("Gratuitos: versões básicas do Office, de software de segurança e de edição \n Pagos: 3 versões pagas de software de segurança, 3 versões pagas de software de edição de fotos e vídeos e 3 versões pagas do MS Office");

    String produto = " %s \n R$ %2f \n Ano de fabricação: %d \n Especificações técnicas: %s \n Softwares Extra:\n %s";

    String finalS = String.format(produto, computador.getNome(), computador.getPreco(), computador.getAnoFabricacao(),computador.getPropriedadesHardware(), computador.getSoftwaresAcoplados());

    System.out.println(finalS);
  }
}