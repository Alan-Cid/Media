import java.util.Scanner;

class Media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float somaMedias = 0;

        System.out.println("=================================");
        System.out.println("       PROGRAMA DE MÉDIA");
        System.out.println("=================================");

        for (int aluno = 1; aluno <= 5; aluno++) {

            System.out.println();
            System.out.println("----------- ALUNO " + aluno + " -----------");

            System.out.print("Digite a primeira nota (0,0 a 10,0): ");
            float nota1 = sc.nextFloat();

            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0,0 e 10,0.");
                System.out.print("Digite novamente a primeira nota: ");
                nota1 = sc.nextFloat();
            }

            System.out.print("Digite a segunda nota (0,0 a 10,0): ");
            float nota2 = sc.nextFloat();

            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0,0 e 10,0.");
                System.out.print("Digite novamente a segunda nota: ");
                nota2 = sc.nextFloat();
            }

            System.out.print("Digite a terceira nota (0,0 a 10,0): ");
            float nota3 = sc.nextFloat();

            while (nota3 < 0 || nota3 > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0,0 e 10,0.");
                System.out.print("Digite novamente a terceira nota: ");
                nota3 = sc.nextFloat();
            }

            float media = (nota1 + nota2 + nota3) / 3;

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

        float mediaTurma = somaMedias / 5;

        System.out.println();
        System.out.println("=================================");
        System.out.println("       RESULTADO DA TURMA");
        System.out.println("=================================");

        System.out.printf("Média da turma: %.2f%n", mediaTurma);

        sc.close();
    }
}
