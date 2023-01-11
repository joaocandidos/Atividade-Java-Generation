import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ////////////////////////////////////////////////
        //exercicio 01
        /*Scanner ler = new Scanner(System.in);
        int a, b, c, soma;
        System.out.print("Digite o numero A : ");
        a = ler.nextInt();
        System.out.print("Digite o numero B : ");
        b = ler.nextInt();
        System.out.print("Digite o numero C : ");
        c = ler.nextInt();
        soma = (a + b);
        if (soma > c) {
            System.out.print("A Soma de A + B é Maior que C");

        } else if (soma < c) {
            System.out.print("A Soma de A + B é Menor que C");
        }else{
            System.out.print("A Soma de A + B é Igual que C");
        }*/
        /////////////////////////////////////////////////////
        //exercicio 02
        /*
         Scanner ler = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero : ");
        n = ler.nextInt();
        if(n > 0 ){
            System.out.print("O Numero "+n+" é par positivo!");
        }else{
            System.out.print("O Numero "+n+" é impar negativo!");
        }*/

        ///////////////////////////////////////////////////
        //exercicio 3

        int opcao,quantidade;
        float total;
        Scanner leia = new Scanner(System.in);

        System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

        System.out.println("\nDigite 1 para Cachorro Quente ");
        System.out.println("Digite 2  para X-Salada");
        System.out.println("Digite 3 para X-Bacon");
        System.out.println("Digite 4 para Bauru");
        System.out.println("Digite 5 para Refrigerante");
        System.out.println("Digite 3 para Suco de Laranja");
        opcao = leia.nextInt();
        System.out.println("Quantidade : ");
        quantidade = leia.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(" Produto : Cachorro Quente");
                total = quantidade * 10;
                System.out.printf("Valor Total : %.2f",total);

                break;
            case 2:
                System.out.println("Produto : X-Salada");
                total = quantidade * 15;
                System.out.printf("Valor Total : %.2f",total);

                break;
            case 3:
                System.out.println("Produto : X-Bacon");
                total = quantidade * 18;
                System.out.printf("Valor Total : %.2f",total);
                break;
            case 4:
                System.out.println("Produto : Bauru");
                total = quantidade * 12;
                System.out.printf("Valor Total : %.2f",total);
                break;
            case 5:
                System.out.println("Produto : Refrigerante");
                total = quantidade * 8;
                System.out.printf("Valor Total : %.2f",total);
                break;
            case 6:
                System.out.println("Produto : Suco de Laranja");
                total = quantidade * 13;
                System.out.printf("Valor Total : %.2f",total);
                break;


            default:
                System.out.println("Opção inválida!");
        }



        ////////////////////////////////////////////////////////////////////














    }
    }