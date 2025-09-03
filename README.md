## 👨‍💻 Projeto de Herança e Polimorfismo em Java
Este documento resume os principais conceitos de Programação Orientada a Objetos (POO) 
que foram aplicados e demonstrados no projeto, focando em como esses pilares se manifestam no código. Estudo feito pelo curso da DIO.me

# Conceitos Abordados neste Projeto
Herança 🧬: Utilizada para criar uma hierarquia de classes, onde Manager e Salesman herdam de Colaborador, permitindo
o compartilhamento de atributos e métodos comuns.

Polimorfismo ✨: Demonstrado pelo método printColaborador, que aceita diferentes tipos de objetos (Manager e Salesman) e
se comporta de maneira diferente para cada um, usando o mesmo nome de método (getFullSalary).

Encapsulamento 🔒: As classes protegem seus atributos (private e protected), e o acesso a eles é feito através de 
métodos públicos (getters e setters), controlando como os dados podem ser manipulados.

Abstração 🧠: A classe Colaborador foi definida como abstract, o que significa que ela não pode ser instanciada diretamente.
Em vez disso, ela serve como um modelo para as classes filhas, garantindo que o método getFullSalary() seja implementado por todas elas.

Classes sealed e non-sealed 🚧: O uso de sealed abstract class Colaborador permits Manager, Salesman restringe quais classes podem herdar de
Colaborador, enquanto non-sealed class Manager extends Colaborador permite que Manager seja estendida por outras classes.

# Visão Geral da Arquitetura 🏢
O projeto é estruturado em classes que representam diferentes tipos de colaboradores, cada uma com suas responsabilidades e comportamentos específicos.

Colaborador.java 📄: Classe base abstrata.

Manager.java 📄: Subclasse que herda de Colaborador e adiciona atributos e comportamentos específicos de um gerente.

Salesman.java 📄: Subclasse que herda de Colaborador e adiciona atributos e comportamentos específicos de um vendedor.

HerancaPolimorfismo.java 📄: Classe principal que demonstra a aplicação prática dos conceitos de POO.

Client.java 📄: Uma classe simples que mostra um exemplo de uma entidade que não se encaixa na hierarquia de Colaborador.
