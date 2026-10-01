import java.util.Scanner;

class Media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double somaMedias = 0;

        System.out.println("=================================");
        System.out.println("       PROGRAMA DE MÉDIA");
        System.out.println("=================================");

        for (int aluno = 1; aluno <= 5; aluno++) {

            System.out.println();
            System.out.println("----------- ALUNO " + aluno + " -----------");

            System.out.print("Digite a primeira nota: ");
            byte nota1 = sc.nextByte();

            System.out.print("Digite a segunda nota: ");
            byte nota2 = sc.nextByte();

            System.out.print("Digite a terceira nota: ");
            byte nota3 = sc.nextByte();

            double media = (nota1 + nota2 + nota3) / 3.0;

            somaMedias = somaMedias + media;

            System.out.printf("Média: %.2f%n", media);

            if (media >= 7) {
                System.out.println("Resultado: Aprovado");
            } else if (media >= 5) {
                System.out.println("Resultado: Recuperação");
            } else {
                System.out.println("Resultado: Reprovado");
            }
        }

        double mediaTurma = somaMedias / 5;

        System.out.println();
        System.out.println("=================================");
        System.out.println("       RESULTADO DA TURMA");
        System.out.println("=================================");

        System.out.printf("Média da turma: %.2f%n", mediaTurma);

        sc.close();
    }
}
