package domain;

/**
 * Representa um cliente, que herda de Salesman.
 * Esta classe pode ser usada para demonstrar herança multinível, embora não seja
 * diretamente utilizada nos exemplos de polimorfismo fornecidos.
 */
public class Client extends Salesman {

    /**
     * Documento de identificação do cliente (ex: CPF, CNPJ).
     */
    private String document;

    /**
     * Construtor padrão para a classe Client.
     */
    public Client() {
        super(); // Chama o construtor padrão da superclasse Salesman
    }

    /**
     * Construtor completo para a classe Client.
     *
     * @param code Código de identificação do cliente.
     * @param name Nome do cliente.
     * @param address Endereço do cliente.
     * @param age Idade do cliente.
     * @param salary Salário base (herdado de Colaborador, pode não ser aplicável a um cliente).
     * @param porcentPerSold Porcentagem por venda (herdado de Salesman, pode não ser aplicável a um cliente).
     * @param soldAmount Valor vendido (herdado de Salesman, pode não ser aplicável a um cliente).
     * @param document Documento de identificação do cliente.
     */
    public Client(String code, String name, String address, int age, double salary, double porcentPerSold, double soldAmount, String document) {
        super(code, name, address, age, salary, porcentPerSold, soldAmount);
        this.document = document;
    }

    /**
     * Retorna o documento de identificação do cliente.
     *
     * @return O documento do cliente.
     */
    public String getDocument() {
        return document;
    }

    /**
     * Define o documento de identificação do cliente.
     *
     * @param document O novo documento do cliente.
     */
    public void setDocument(String document) {
        this.document = document;
    }
}
