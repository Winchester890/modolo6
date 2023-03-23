import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import Pacote.Aluno;
import Pacote.Presenca;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<String> dias = new ArrayList<>();
        List<String> presentes = new ArrayList<>();
        List<String> ausentes = new ArrayList<>();
        System.out.print("Quantos alunos serão digitados? ");
        int N = Integer.parseInt(scanner.next());
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o nome do(a) aluno(a): ");
            String nome = String.join(scanner.next());
            nomes.add(nome);
        }
        System.out.print("Quantos dias serão contabilizados? ");
        N = Integer.parseInt(scanner.next());
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o dia: ");
            String dia = String.join(scanner.next());
            dias.add(dia);
            System.out.print("Qual(is) aluno(s) estive(ram) presente(s) neste dia? ");
            String presente = String.join(scanner.next());
            presentes.add(presente);
            System.out.print("Qual(is) aluno(s) estive(ram) ausente(s) neste dia? ");
            String ausente = String.join(scanner.next());
            ausentes.add(ausente);
        }
        System.out.println("---- Diário de classe ----");
        System.out.println("Sala: " + nomes);
        for (int i = 0; i < N; i++) {
            System.out.println("Dia " + dias.get(i) + ":");
            System.out.println("Alunos presentes: " + presentes.get(i));
            System.out.println("Alunos ausentes: " + ausentes.get(i));
        }
    }
}
