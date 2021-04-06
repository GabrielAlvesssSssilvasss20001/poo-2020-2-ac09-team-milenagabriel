import java.io.Console;
import java.util.ArrayList;

// Resposta para CT Exercício 2

public class Main {
  public static void main (String[] args) {
    ArrayList<Conta> contasVector = new ArrayList<>();

    Console console = System.console();

    int entrada;
    int idConta = 1;
    
    do {
      System.out.println("\nMenu");
      System.out.println("1 - Criar nova conta \n");
      System.out.println("2 - Exibir saldo de conta \n");
      System.out.println("3 - Depositar\n");
      System.out.println("4 - Sacar\n");
      System.out.println("5 - Reajustar Conta Poupança\n");
      System.out.println("6 - Alterar limite de conta\n");
      System.out.println("Outro - Sair\n");
      System.out.println("Escolha uma opção: \n");
      
      entrada = Integer.parseInt(console.readLine());

      switch (entrada){
        case 1:
          Conta conta = null;
          System.out.println("Agora, informe \n C, para criar uma Conta Simples; \n E, para criar uma Conta Especial (com limite); \n ou P, para criar uma Conta Poupança ... \n");
          String opt = console.readLine().toUpperCase();

          switch (opt) {
            case "C":
              System.out.println("Informe o nome do titular:");
              String nome_titular = console.readLine();
              
              conta = new Conta(nome_titular, idConta);

              idConta++;
              break;

            case "E":
              System.out.println("Informe o nome do titular:");
              nome_titular = console.readLine();

              System.out.println("Informe o limite da conta atual:");
              double limite = Double.parseDouble(console.readLine());
              
              conta = new ContaEspecial(nome_titular, idConta, limite);

              idConta++;
              break;

            case "P":
              System.out.println("Informe o nome do titular:");
              nome_titular = console.readLine();
              
              conta = new ContaPoupanca(nome_titular, idConta);

              idConta++;
              break;
            
            default:
              System.out.println("Opção Inválida.");
          }

          conta.imprimirTipoConta();
          System.out.print("\nCriada!\n");

          contasVector.add(conta);
          break;
          
        case 2:
          int cont = 0;
          System.out.println("Informe o número da conta a ser consultada: ");
          int num = Integer.parseInt(console.readLine());
          System.out.println("Agora, iforme o tipo da conta a ser consultada\n(1 para Conta Simples, 2 para ContaEspecial e 3 para Conta Poupança");
          int tipo = Integer.parseInt(console.readLine());

          for (Conta contaItem:contasVector) {
            if (contaItem.getNumero() == num && contaItem.imprimirTipoConta() == tipo) {
              if (tipo == 1) {
                contaItem.imprimirTipoConta();
                contaItem.exibirDados();
                cont++;
              }
              else if (tipo == 2) {
                ContaEspecial contaN = (ContaEspecial) contaItem;
                contaN.imprimirTipoConta();
                contaN.exibirDados();
                cont++;
              } 
              else if (tipo == 3) {
                ContaPoupanca contaN = (ContaPoupanca) contaItem;
                contaN.imprimirTipoConta();
                contaN.exibirDados();
                cont++;
              }
            }
          }
          if (cont==0) {
            System.out.println("\nConta não existe ou id não corresponde ao tipo especificado! Tente novamente.");
          }
          cont = 0;
        break;

        case 3:
          cont = 0;
          System.out.println("Informe o número da conta a ser consultada: ");
          num = Integer.parseInt(console.readLine());
          System.out.println("Agora, iforme o tipo da conta a ser consultada\n(1 para Conta Simples, 2 para ContaEspecial e 3 para Conta Poupança");
          tipo = Integer.parseInt(console.readLine());

          for (Conta contaItem:contasVector) {
            if (contaItem.getNumero() == num && contaItem.imprimirTipoConta() == tipo) {
              if (tipo == 1) {
                double valor = Double.parseDouble(console.readLine("\nInforme o valor que deseja depositar: "));
                contaItem.depositar(valor);

                contaItem.imprimirTipoConta();
                contaItem.exibirDados();
                cont++;
              }
              else if (tipo == 2) {
                ContaEspecial contaN = (ContaEspecial) contaItem;

                double valor = Double.parseDouble(console.readLine("\nInforme o valor que deseja depositar: "));
                contaN.depositar(valor);

                contaN.imprimirTipoConta();
                contaN.exibirDados();
                cont++;          
              } 
              else if (tipo == 3) {
                ContaPoupanca contaN = (ContaPoupanca) contaItem;

                double valor = Double.parseDouble(console.readLine("\nInforme o valor que deseja depositar: "));
                contaN.depositar(valor);

                contaN.imprimirTipoConta();
                contaN.exibirDados();
                cont++;
              }
            }
          }
          if (cont==0) {
            System.out.println("\nConta não existe ou id não corresponde ao tipo especificado! Tente novamente.");
          }
          cont = 0;
        break;

        case 4:
          cont = 0;
          System.out.println("Informe o número da conta a ser consultada: ");
          num = Integer.parseInt(console.readLine());
          System.out.println("Agora, iforme o tipo da conta a ser consultada\n(1 para Conta Simples, 2 para ContaEspecial e 3 para Conta Poupança");
          tipo = Integer.parseInt(console.readLine());

          for (Conta contaItem:contasVector) {
            if (contaItem.getNumero() == num  && contaItem.imprimirTipoConta() == tipo) {
              if (tipo == 1) {
                double valor = Double.parseDouble
                (console.readLine("\nInforme o valor que deseja sacar: "));
                String valid = contaItem.sacar(valor)?"\nSaque realizado com sucesso!":"\nFalha ao sacar. Sua conta não possui o valor que se deseja retirar.";
                System.out.println(valid);

                contaItem.imprimirTipoConta();
                contaItem.exibirDados();
                cont++;
              }
              else if (tipo == 2) {
                ContaEspecial contaN = (ContaEspecial) contaItem;

                double valor = Double.parseDouble
                (console.readLine("\nInforme o valor que deseja sacar: "));
                String valid = contaN.sacar(valor)?"\nSaque realizado com sucesso!":"\nFalha ao sacar. Sua conta não possui o valor que se deseja retirar.";
                System.out.println(valid);

                contaN.imprimirTipoConta();
                contaN.exibirDados();
                cont++;
              } 
              else if (tipo == 3) {
                ContaPoupanca contaN = (ContaPoupanca) contaItem;

                double valor = Double.parseDouble
                (console.readLine("\nInforme o valor que deseja sacar: "));
                String valid = contaN.sacar(valor)?"\nSaque realizado com sucesso!":"\nFalha ao sacar. Sua conta não possui o valor que se deseja retirar.";
                System.out.println(valid);

                contaN.imprimirTipoConta();
                contaN.exibirDados();
                cont++;
              }

              cont++;
            }
          }
          if (cont==0) {
            System.out.println("\nConta não existe ou id não corresponde ao tipo especificado! Tente novamente.");
          }
          cont = 0;
        break;

        case 5:
          cont = 0;
          System.out.println("Informe o número da Conta Poupança a ser consultada: ");
          num = Integer.parseInt(console.readLine());

          for (Conta contaItem:contasVector) {
            if (contaItem.getNumero() == num && contaItem.imprimirTipoConta() == 3) {
              double percentual = Double.parseDouble(console.readLine("\nInforme o percentual de reajuste: "));

              ContaPoupanca contaP = (ContaPoupanca) contaItem;

              contaP.reajustar(percentual);

              contaP.exibirDados();
              contaP.imprimirTipoConta();
              cont++;
            }
          }
          if (cont==0) {
            System.out.println("\nConta não existe ou id não corresponde ao tipo especificado! Tente novamente.");
          }
          cont = 0;
        break;

        case 6:
          cont = 0;
          System.out.println("Informe o número da Conta Especial a ser consultada: ");
          num = Integer.parseInt(console.readLine());

          for (Conta contaItem: contasVector){
            if (contaItem.getNumero() == num && contaItem.imprimirTipoConta() == 2) {
              System.out.println("CUIDADO! ESTA OPERAÇÃO PODE GERAR A PERDA DE VALORES DEPOSITÁDOS. GARANTA QUE SUA CONTA ESTÁ ZERADA OU NEGATIVADA PARA PROSSEGUIR:");

              double novoLimite = Double.parseDouble(console.readLine("\nInforme o novo limite:"));

              ContaEspecial contaE = (ContaEspecial) contaItem;

              contaE.setLimite(novoLimite);;

              contaE.exibirDados();
              contaE.imprimirTipoConta();
              cont++;
            }
          }  
          if (cont==0) {
            System.out.println("\nConta não existe ou id não corresponde ao tipo especificado! Tente novamente.");
          }
          cont = 0;
        break;

        default:
          System.out.println("\nSaiu");
          System.exit(0);
      }
    }while (true);
  }
}