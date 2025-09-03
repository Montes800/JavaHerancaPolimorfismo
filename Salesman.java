package domain;

/**
 * Representa um vendedor, que é um tipo de Colaborador.
 * Esta classe não pode ser estendida por outras classes (non-sealed).
 */
public non-sealed class Salesman extends Colaborador {

    /**
     * Porcentagem de comissão por venda.
     */
    private double porcentPerSold;

    /**
     * Valor total vendido pelo vendedor.
     */
    private double soldAmount;

    /**
     * Construtor completo para a classe Salesman.
     *
     * @param code Código de identificação do vendedor.
     * @param name Nome do vendedor.
     * @param address Endereço do vendedor.
     * @param age Idade do vendedor.
     * @param salary Salário base do vendedor.
     * @param porcentPerSold Porcentagem de comissão por venda.
     * @param soldAmount Valor total vendido pelo vendedor.
     */
    public Salesman(String code, String name, String address, int age, double salary, double porcentPerSold, double soldAmount) {
        super(code, name, address, age, salary);
        this.porcentPerSold = porcentPerSold;
        this.soldAmount = soldAmount;
    }

    /**
     * Construtor padrão para a classe Salesman.
     */
    public Salesman() {
    }

    /**
     * Retorna o código do vendedor com o prefixo "SL".
     *
     * @return O código formatado do vendedor.
     */
    @Override
    public String getCode() {
        // O método 'code()' não existe na superclasse Colaborador.
        // Assumindo que 'code' é um atributo protegido na superclasse.
        return "SL" + this.code;
    }

    /**
     * Retorna a porcentagem de comissão por venda.
     *
     * @return A porcentagem de comissão.
     */
    public double getPorcentPerSold() {
        return porcentPerSold;
    }

    /**
     * Define a porcentagem de comissão por venda.
     *
     * @param porcentPerSold A nova porcentagem de comissão.
     */
    public void setPorcentPerSold(double porcentPerSold) {
        this.porcentPerSold = porcentPerSold;
    }

    /**
     * Retorna o valor total vendido pelo vendedor.
     *
     * @return O valor total vendido.
     */
    public double getSoldAmount() {
        return soldAmount;
    }

    /**
     * Define o valor total vendido pelo vendedor.
     *
     * @param soldAmount O novo valor total vendido.
     */
    public void setSoldAmount(final double soldAmount) {
        this.soldAmount = soldAmount;
    }

    /**
     * Calcula o salário total do vendedor, incluindo o salário base e a comissão sobre as vendas.
     *
     * @return O salário total do vendedor.
     */
    @Override
    public double getFullSalary() {
        return this.salary + (this.soldAmount * (this.porcentPerSold / 100));
    }
}
