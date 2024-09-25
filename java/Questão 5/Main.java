import java.util.Scanner;

abstract class Funcionario {
    public abstract double calcularSalario();
}

class FuncionarioCLT extends Funcionario {
    private final double salarioBase;
    private final double bonus;

    public FuncionarioCLT(double salarioBase, double bonus) {
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    public static FuncionarioCLT novoFuncionarioCLT() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o salário do funcionário CLT? ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Qual o bônus do funcionário CLT? ");
        double bonus = scanner.nextDouble();

        return new FuncionarioCLT(salarioBase, bonus);
    }
}

class FuncionarioPJ extends Funcionario {
    private final double valorHora;
    private final int horasTrabalhadas;

    public FuncionarioPJ(double valorHora, int horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    public static FuncionarioPJ novoFuncionarioPJ() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor por hora do funcionário PJ? ");
        double valorHora = scanner.nextDouble();

        System.out.print("Quantas horas o funcionário PJ trabalhou? ");
        int horasTrabalhadas = scanner.nextInt();

        return new FuncionarioPJ(valorHora, horasTrabalhadas);
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario clt = FuncionarioCLT.novoFuncionarioCLT();
        System.out.println("Salário Funcionário CLT: " + clt.calcularSalario());

        Funcionario pj = FuncionarioPJ.novoFuncionarioPJ();
        System.out.println("Salário Funcionário PJ: " + pj.calcularSalario());
    }
}
