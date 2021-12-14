import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
        exercicio9();
        exercicio10();

    }

    //●Leia as medidas(b, h) de um retângulo. Escreva a
    //área calculada.
    public static void exercicio1() {
        Scanner scr = new Scanner(System.in);
        System.out.print("digite a base\n");
        double b = scr.nextDouble();

        System.out.print("digite a altura\n");
        double h = scr.nextDouble();

        System.out.println(b * h);
    }

    //Sabendo que cada cavalo precisa de 4 ferraduras e
    //que cada unidade custa 9,90, pergunte quantos
    //cavalos precisam de ferraduras. Depois calcule e
    //informe o valor final.
    public static void exercicio2() {
        Scanner scr = new Scanner(System.in);
        System.out.print("quantos Cavalos Precisam de ferradura\n");
        int cavalos = scr.nextInt();
        System.out.println(cavalos * 4 * 9.90);


    }

    public static void exercicio3() {
        //● Leia dois valores (A e B) e informe a soma.

        Scanner scr = new Scanner(System.in);

        int a;
        int b;
        int soma;

        System.out.print("informe o valor A\n");
        a = scr.nextInt();

        System.out.print("informe o valor B\n");
        b = scr.nextInt();
        System.out.print("Resultado é \n");
        System.out.println(a + b);


    }

    public static void exercicio4() {

        //Leia três valores (A, B e C). Informe média.

        Scanner scr = new Scanner(System.in);

        int a;
        int b;
        int c;
        int media;

        System.out.print("informe o valor A\n");
        a = scr.nextInt();

        System.out.print("informe o valor B\n");
        b = scr.nextInt();

        System.out.print("informe o valor C\n");
        c = scr.nextInt();

        System.out.print("A média do aluno é\n");

        media = (a + b + c) / 3;

        System.out.println((media));


    }

    public static void exercicio5() {

        //Faça um algoritmo para uma loja de 1,99. Leia
        //quantos itens foram vendidos. Conceda um desconto
        //de 5% e informe o valor final.


        Scanner scr = new Scanner(System.in);
        double itens, desconto;

        System.out.print("quantos itens foram vendidos\n");
        itens = scr.nextDouble();


        System.out.print("informe o desconto\n");
        desconto = scr.nextDouble();


        itens = desconto * 1.99 * 5;

        System.out.println(itens);


    }

    public static void exercicio6() {

//Crie um algoritmo que peça a altura e o peso de uma
//pessoa. Calcule e informe o IMC.
//Considere a fórmula: IMC = peso / ( altura )²
        Scanner scr = new Scanner(System.in);
        double altura, peso, imc;

        System.out.print("informe o peso:\n");
        peso = scr.nextDouble();

        System.out.print("informe a altura:\n");
        altura = scr.nextDouble();

        System.out.print("o resultado do imc é:\n");
        double resultado = peso / Math.pow(altura, 2);

        System.out.println(resultado);
    }

    public static void exercicio7() {
        //Pedrinho tem um cofrinho com muitas moedas, e
        //deseja saber quantos reais conseguiu poupar. Faça
        //um algoritmo para ler a quantidade de cada tipo de
        //moeda, e imprimir o valor total economizado, em
        //reais. Considere que existam moedas de 1, 5, 10, 25
        // e 50 centavos, e ainda moedas de 1 real.

        Scanner scr = new Scanner(System.in);

        System.out.print("informe a quantidade de moeda de 1 centavo:\n");
        double moeda1Centavo = scr.nextInt();

        System.out.print("informe a quantidade de moeda de 5 centavos:\n ");
        double moeda5Centavo = scr.nextInt();

        System.out.print("informe a quantidade de moeda de 10 centavos:\n ");

        double moeda10Centavo = scr.nextInt();

        System.out.print("informe a quantidade de moeda de 25 centavos:\n");

        double moeda25Centavo = scr.nextInt();

        System.out.print("informe a quantidade de moeda de 50 centavos:\n ");

        double moeda50Centavos = scr.nextInt();

        System.out.print("informe a quantidade de moeda de 1 real:\n");

        double moeda1Real = scr.nextInt();

        System.out.print("informe  o valor total economizado;\n");
        double resultado;

        resultado = (double) (moeda1Centavo / 100) + (moeda5Centavo / 20) + (moeda25Centavo / 4) + (moeda50Centavos / 2) + moeda1Real;

        System.out.println(resultado);


    }

    public static void exercicio8() {

        //Uma fábrica de refrigerantes vende seu produto em
        //três formatos: lata de 350 ml, garrafa de 600 ml e
        // garrafa de 2 litros. Se um comerciante compra uma
        //determinada quantidade de cada formato, faça um
        //algoritmo para calcular quantos litros de refrigerante
        // ele comprou.

        Scanner scr = new Scanner(System.in);
        System.out.print("informe a quantidade de latas de 350ml;\n");
        double lata350Ml = scr.nextDouble();

        System.out.print("informe a quantidade de Garrafas de 600ml;\n");
        double garrafas600Ml = scr.nextDouble();

        System.out.print("informe a quantidade de Garrafas de 2 litros;\n");
        double garrafas2Litros = scr.nextDouble();

        System.out.print(" total de refrigerante comprado:\n");
        double resultado;

        resultado = (double) lata350Ml / 2.85 + garrafas600Ml / 1.66 + garrafas2Litros * 2;

        System.out.println(resultado);

    }

    public static void exercicio9() {

        //Leia um número de 1 a 10, calcule e mostre a
        // tabuada

        int contador = 1;
        int numeroDigitado;
        Scanner scr = new Scanner(System.in);
        System.out.println("digite o valor da tabuada;\n");
        numeroDigitado = scr.nextInt();
        while (contador <= 10) {
            ;
            System.out.println(numeroDigitado + contador * numeroDigitado);
            contador++;
        }


    }

    public static void exercicio10() {

        // ● Leia as medidas(b, h) de um retângulo. Informe a
        // área calculada e se é um quadrado ou não.

        Scanner scr = new Scanner(System.in);
        System.out.print("digite a base\n");
        double b = scr.nextDouble();

        System.out.print("digite a altura\n");
        double h = scr.nextDouble();

        System.out.println(b * h);
        if (b == h) {
            System.out.println("será um quadrado");
        }
    }
}
