import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) throws Exception {
        //valores de entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Aliquota de 5% em cima do salario
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            //Aliquota de 10% em cima do salario
            valorImposto = 0.10F * valorSalario;
        } else {
            //Aliquota de 15% em cima do salario
            valorImposto = 0.15F * valorSalario;
        }

        //calcula e imprime a saída com 2 casas decimais
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
