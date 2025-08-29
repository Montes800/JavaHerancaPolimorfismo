// Classe principal
public class HerancaPolimorfismo {
    public static void main(String[] args) {
        // Criando um colaborador (não usado aqui, mas deixei para exemplo)
       // Colaborador manager = new Manager(); // Polimorfismo: Manager é um Colaborador

        // Criando um manager (gerente), que herda de Colaborador
     //   Manager manager = new Manager();
     printColaborador(new Manager());
     printColaborador(new Salesman());



/*
        // Definindo atributos do manager
        manager.setName("João");
        manager.setLogin("joao");
        manager.setPassword("123456");

        // Exibindo informações
        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
        */
    }

    public static void printColaborador(colaborador colaborador) {
        if (colaborador instanceof Manager manager)
        switch (colaborador) {
            case Manager manager -> {

                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());

            }

            
            }
        System.out.println("===%s===/n", colaborador.getClass().getCanonicalName());
        System.out.println(colaborador.getName());
        System.out.println(((Manager)colaborador).getLogin());
        System.out.println(((Manager)colaborador).getPassword());
        System.out.println("============");

    }

    case Salesman -> {
        salesman.setCode("123");
        salesman.setName("Joao");
        salesman.setSalary(5000);
      

        System.out.println(salesman.getCode());
        System.out.println(salesman.getSalary());
        System.out.println(salesman.getName());
        System.out.println(salesman.getLogin());
        System.out.println(salesman.getPassword());
    }
}