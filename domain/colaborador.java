package domain;

/**
 * Classe abstrata que representa um colaborador genérico.
 * É uma classe selada, o que significa que apenas as classes Manager e Salesman podem estendê-la.
 */
public sealed abstract class Colaborador permits Manager, Salesman {

    /**
     * Código de identificação do colaborador.
     */
    protected String code;

    /**
     * Nome completo do colaborador.
     */
    protected String name;

    /**
     * Endereço do colaborador.
     */
    protected String address;

    /**
     * Idade do colaborador.
     */
    protected int age;

    /**
     * Salário base do colaborador.
     */
    protected double salary;

    /**
     * Construtor completo para a classe Colaborador.
     *
     * @param code Código de identificação do colaborador.
     * @param name Nome do colaborador.
     * @param address Endereço do colaborador.
     * @param age Idade do colaborador.
     * @param salary Salário base do colaborador.
     */
    public Colaborador(final String code, final String name, final String address, final int age, final double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Construtor padrão para a classe Colaborador.
     */
    public Colaborador() {
    }

    /**
     * Retorna o código do colaborador.
     *
     * @return O código do colaborador.
     */
    public String getCode() {
        return code;
    }

    /**
     * Define o código do colaborador.
     *
     * @param code O novo código do colaborador.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Retorna o nome do colaborador.
     *
     * @return O nome do colaborador.
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome do colaborador.
     *
     * @param name O novo nome do colaborador.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna o endereço do colaborador.
     *
     * @return O endereço do colaborador.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define o endereço do colaborador.
     *
     * @param address O novo endereço do colaborador.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retorna a idade do colaborador.
     *
     * @return A idade do colaborador.
     */
    public int getAge() {
        return age;
    }

    /**
     * Define a idade do colaborador.
     *
     * @param age A nova idade do colaborador.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Retorna o salário base do colaborador.
     *
     * @return O salário base do colaborador.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Define o salário base do colaborador.
     *
     * @param salary O novo salário base do colaborador.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Método abstrato para calcular o salário total do colaborador.
     * Deve ser implementado pelas subclasses.
     *
     * @return O salário total do colaborador.
     */
    public abstract double getFullSalary();
}