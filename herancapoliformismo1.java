package com.example;

import domain.Manager;
import domain.Salesman;
import domain.Colaborador;

/**
 * Classe principal que demonstra os conceitos de Herança e Polimorfismo.
 */
public class HerancaPolimorfismo {     public static void main(String[] args) {
        // Criando instâncias de Manager e Salesman para demonstrar polimorfismo
        printColaborador(new Manager());
        printColaborador(new Salesman());
    }

    /**
     * Imprime informações detalhadas de um objeto Colaborador, demonstrando polimorfismo.
     * Dependendo do tipo real do objeto (Manager ou Salesman), informações específicas são exibidas.
     *
     * @param colaborador O objeto Colaborador a ser impresso.
     */
    public static void printColaborador(Colaborador colaborador) {
        System.out.printf("======== Informações do %s ========\n", colaborador.getClass().getSimpleName());

        // Utilizando pattern matching para instanceof para lidar com tipos específicos
        if (colaborador instanceof Manager manager) {
            // Atribuindo valores para o Manager
            manager.setCode("MN123");
            manager.setName("João Silva");
            manager.setSalary(5000.00);
            manager.setLogin("joao.silva");
            manager.setPassword("senha123");
            manager.setCommission(1200.00);

            // Exibindo informações do Manager
            System.out.println("Código: " + manager.getCode());
            System.out.println("Nome: " + manager.getName());
            System.out.println("Salário Base: " + manager.getSalary());
            System.out.println("Login: " + manager.getLogin());
            System.out.println("Comissão: " + manager.getCommission());
            System.out.println("Salário Total: " + manager.getFullSalary());

        } else if (colaborador instanceof Salesman salesman) {
            // Atribuindo valores para o Salesman
            salesman.setCode("SL456");
            salesman.setName("Lucas Souza");
            salesman.setSalary(2800.00);
            salesman.setPorcentPerSold(10.0);
            salesman.setSoldAmount(10000.00);

            // Exibindo informações do Salesman
            System.out.println("Código: " + salesman.getCode());
            System.out.println("Nome: " + salesman.getName());
            System.out.println("Salário Base: " + salesman.getSalary());
            System.out.println("Porcentagem por Venda: " + salesman.getPorcentPerSold() + "%");
            System.out.println("Valor Vendido: " + salesman.getSoldAmount());
            System.out.println("Salário Total: " + salesman.getFullSalary());

        } else {
            System.out.println("Tipo de colaborador não reconhecido.");
        }
        System.out.println("====================================\n");
    }
}
