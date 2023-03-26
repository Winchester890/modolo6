import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos serão contabilizados? ");
        int N = Integer.parseInt(scanner.next());
        List<String> nomes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.next();
            nomes.add(nome);
        }
        HashMap<Integer, String> meses = new HashMap<>();
        meses.put(2, "Fevereiro");
        meses.put(3, "Março");
        meses.put(4, "Abril");
        meses.put(5, "Maio");
        meses.put(6, "Junho");
        meses.put(8, "Agosto");
        meses.put(9, "Setembro");
        meses.put(10, "Outubro");
        meses.put(11, "Novembro");

        int mes;
        System.out.print("Indique o mês (pelo n°) para contabilizar as faltas: ");
        do {
            mes = Integer.parseInt(scanner.next());
            if (mes == 1 || mes == 7 || mes == 12) {
                System.out.print("Mês contabilizado como período de férias. Selecione outro: ");
            }
        } while (mes == 1 || mes == 7 || mes == 12);

        int contFaltas = 0;
        List<Integer> faltas = new ArrayList<>();
        System.out.println("Digite quantas faltas cada aluno teve em ordem.");
        int falta;
        for (int i = 0; i < N; i++) {
            System.out.print(nomes.get(i) + ": ");
            falta = Integer.parseInt(scanner.next());
            faltas.add(falta);
            contFaltas = contFaltas + faltas.get(i);
        }
        System.out.println(" ");
        System.out.println("----- Diário de classe no mês de " + meses.get(mes) + " -----");
        System.out.println("Alunos: " + nomes);
        System.out.println("Faltas de cada aluno:");
        for (int i = 0; i < N; i++) {
            System.out.println(nomes.get(i) + ": " + faltas.get(i));
        }
        System.out.println(" ");
        System.out.println("Faltas totais: " + contFaltas);
        float percFaltas = (contFaltas * N) / 20;
        System.out.println("Percentual de faltas: " + percFaltas + "%");
    }
}
