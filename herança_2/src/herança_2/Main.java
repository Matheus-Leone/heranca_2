package herança_2;

import java.time.LocalDate;

//Classe Principal para Teste
public class Main {
 public static void main(String[] args) {
	 
     // Criando um objeto Vendedor
     Vendedor vendedor1 = new Vendedor("Carlos Mendes", "111.222.333-44", LocalDate.of(1985, 5, 20), LocalDate.of(2010, 6, 1), 3000.0, 10.0);

     // Criando um objeto Gerente
     Gerente gerente1 = new Gerente("Ana Silva", "222.333.444-55", LocalDate.of(1978, 8, 15), LocalDate.of(2005, 3, 15), 5000.0, "Vendas");

     // Criando um objeto Cliente
     Cliente cliente1 = new Cliente("Mariana Souza", "333.444.555-66", LocalDate.of(1990, 12, 25), "mariana@email.com", "1234567890", "(11) 98765-4321");

     // Exibindo as informações dos objetos criados
     System.out.println("---- Vendedor 1 ----");
     vendedor1.exibirInformacoes();
     System.out.println();

     System.out.println("---- Gerente 1 ----");
     gerente1.exibirInformacoes();
     System.out.println();

     System.out.println("---- Cliente 1 ----");
     cliente1.exibirInformacoes();
 }
}