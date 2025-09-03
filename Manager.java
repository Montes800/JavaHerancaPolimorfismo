package domain;

/**
 * Representa um gerente, que é um tipo de Colaborador.
 * Esta classe não pode ser estendida por outras classes (non-sealed).
 */
public non-sealed class Manager extends Colaborador {

    /**
     * Login de acesso do gerente.
     */
    private String login;

    /**
     * Senha de acesso do gerente.
     */
    private String password;

    /**
     * Comissão do gerente.
     */
    private double commission;

    /**
     * Construtor completo para a classe Manager.
     *
     * @param code Código de identificação do gerente.
     * @param name Nome do gerente.
     * @param address Endereço do gerente.
     * @param age Idade do gerente.
     * @param salary Salário base do gerente.
     * @param login Login de acesso do gerente.
     * @param password Senha de acesso do gerente.
     * @param commission Comissão do gerente.
     */
    public Manager(String code, String name, String address, int age, double salary, String login, String password, double commission) {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }

    /**
     * Construtor padrão para a classe Manager.
     */
    public Manager() {
    }

    /**
     * Retorna o código do gerente com o prefixo "MN".
     *
     * @return O código formatado do gerente.
     */
    @Override
    public String getCode() {
        return "MN" + this.code;
    }

    /**
     * Retorna o login de acesso do gerente.
     *
     * @return O login do gerente.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o login de acesso do gerente.
     *
     * @param login O novo login do gerente.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retorna a senha de acesso do gerente.
     *
     * @return A senha do gerente.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define a senha de acesso do gerente.
     *
     * @param password A nova senha do gerente.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retorna a comissão do gerente.
     *
     * @return A comissão do gerente.
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Define a comissão do gerente.
     *
     * @param commission A nova comissão do gerente.
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }

    /**
     * Calcula o salário total do gerente, incluindo o salário base e a comissão.
     *
     * @return O salário total do gerente.
     */
    @Override
    public double getFullSalary() {
        return this.salary + this.commission;
    }
}
