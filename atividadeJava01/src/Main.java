import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ////////////////////////////////////////////////////
        //exercicio 01
        /*
        float salario,abono,novoSalario;
        System.out.print("digite o salario : ");
        salario = ler.nextFloat();
        System.out.print("digite o abono : ");
        abono = ler.nextFloat();
        novoSalario = salario + abono;
        System.out.printf("Novo Salario = %.2f",novoSalario);*/

        //////////////////////////////////////////////////////////
        //exercicio 02
        /*

        float nota1,nota2,nota3,nota4,media;
        System.out.print("Nota 1 : ");
        nota1 = ler.nextFloat();
        System.out.print("Nota 2 : ");
        nota2 = ler.nextFloat();
        System.out.print("Nota 3 : ");
        nota3 = ler.nextFloat();
        System.out.print("Nota 4 : ");
        nota4 = ler.nextFloat();
        media = (nota1+nota2+nota3+nota4)/4;

        System.out.printf("Media Final = %.1f",media);*/

        ///////////////////////////////////////////////////////////////////////
        //exercicio 03

        /*

        float salarioB,adicionalN,horasE,descontos,salarioL;
        System.out.print("Salario Bruto : ");
        salarioB = ler.nextFloat();
        System.out.print("Adicional Noturno : ");
        adicionalN = ler.nextFloat();
        System.out.print("Horas Extras : ");
        horasE = ler.nextFloat();
        System.out.print("Descontos : ");
        descontos = ler.nextFloat();
        salarioL = salarioB+adicionalN+(horasE * 5)- descontos;


        System.out.printf("Salario Liquido : %.2f",salarioL);*/

        ///////////////////////////////////////////////////////////////////////////
        //exercicio 04

        float numero1,numero2,numero3,numero4,diferenca;
        System.out.print("Numero1 : ");
        numero1 = ler.nextFloat();
        System.out.print("Numero2 : ");
        numero2 = ler.nextFloat();
        System.out.print("Numero3 : ");
        numero3 = ler.nextFloat();
        System.out.print("Numero4 : ");
        numero4 = ler.nextFloat();

        diferenca = (numero1 * numero2)- (numero3 * numero4);


        System.out.printf("Diferença : %.1f",diferenca);













    }
}