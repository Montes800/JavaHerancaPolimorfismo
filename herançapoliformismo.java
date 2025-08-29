// Classe principal
public class HerancaPolimorfismo {
    public static void main(String[] args) {
        // Criando um colaborador (não usado aqui, mas deixei para exemplo)
        Colaborador colaborador = new Colaborador();

        // Criando um manager (gerente), que herda de Colaborador
        Manager manager = new Manager();

        // Definindo atributos do manager
        manager.setName("João");
        manager.setLogin("joao");
        manager.setPassword("123456");

        // Exibindo informações
        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
    }
}
