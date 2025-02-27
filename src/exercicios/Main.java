package exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        //entradad de dados
        System.out.print("Nome: ");
        jogador.nome = sc.nextLine();
        for(int i = 0; i = Jogador.score.length; i++){
            System.out.println("Pontuação1 : " + (i +1) );
            jogador.score[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Nome: " + jogador.nome);
        System.out.println("Score Total " + jogador.calcularScoreTotal());
    }
}
