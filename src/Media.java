import java.util.Scanner;

class Media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       PROGRAMA DE MÉDIA");
        System.out.println("=================================");

        System.out.println();
        System.out.println("Este programa calcula");
        System.out.println("a média e a situação dos alunos.");

        System.out.println();
        System.out.println("Situações:");
        System.out.println("Aprovado");
        System.out.println("Recuperação");
        System.out.println("Reprovado");

        System.out.println();
        System.out.println("Ao final, será calculada a média da turma.");

        System.out.println();

        System.out.print("Digite a primeira nota: ");
        byte nota1 = sc.nextByte();

        System.out.print("Digite a segunda nota: ");
        byte nota2 = sc.nextByte();

        System.out.print("Digite a terceira nota: ");
        byte nota3 = sc.nextByte();

        System.out.println();
        System.out.println("Notas digitadas:");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);

        sc.close();
    }
}
