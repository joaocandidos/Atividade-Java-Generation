import java.util.Scanner;

public class TestarLacos {
    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////////////////
        //exercicio while
        /*
        int idade = 0, total1=0,total2= 0;
        Scanner ler = new Scanner(System.in);
        while (idade >= 0){
            System.out.print("Digite uma idade:");
            idade = ler.nextInt();

            if(idade < 21 && idade > 0){
                total1 ++;


            }else if(idade > 50 ){
                total2 ++;

            }
        }
        System.out.println("Total de pessoas menores de 21 anos:"+(total1));
        System.out.println("Total de pessoas maiores de 50 anos:"+(total2));*/



        //////////////////////////////////////////////////////////////////////////////////
        //exercicio for
        /*
        int n,pares = 0,impares = 0;
        Scanner ler = new Scanner(System.in);
        for (int c = 1;c <= 10;c++){
            System.out.print("Digite o "+c+"°Numero: ");
            n = ler.nextInt();
            if(n % 2 == 0){
                pares++;
            }else {
                impares++;
            }


        }
        System.out.println("Total de números pares: "+pares);
        System.out.println("Total de números impares: "+impares);*/


        //////////////////////////////////////////////////////////////////////////////
         // exercicio de  (do  while)
        int numero = 0,soma = 0;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.print("digite um numero: ");
            numero = ler.nextInt();
            if(numero > 0 ){
                soma +=numero;
            }


        }while (numero != 0 );
        System.out.println("A soma dos números positivos é: "+soma);


    }
}































