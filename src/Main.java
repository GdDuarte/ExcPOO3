import entities.Nota;


import java.util.Scanner;

/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Nota nota = new Nota();

        nota.nome = sc.nextLine();
        nota.a = sc.nextDouble();
        nota.b = sc.nextDouble();
        nota.c = sc.nextDouble();

        System.out.printf("Final grade = %.2f " , nota.notaFinal());

        if(nota.notaFinal() > 60){
            System.out.println("PASS");
        }else{
            System.out.println("");
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", nota.notaFaltante());
        }


    }
}
