package br.com.dio.util;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BoardChallengeCreator {

    private static final int SIZE = 9;

    public String createChallenge(String fullBoardString, int cellsToRemove) {
        // Extrai as células do tabuleiro
        String[] cells = fullBoardString.substring(1, fullBoardString.length() - 1).split(", ");
        boolean[] isRemoved = new boolean[cells.length];

        // Seleciona aleatoriamente as posições a serem removidas
        Random rand = new Random();
        int removed = 0;
        while (removed < cellsToRemove) {
            int idx = rand.nextInt(cells.length);
            if (!isRemoved[idx]) {
                // Troca o "true" por "false" apenas se ainda for "true"
                if (cells[idx].endsWith("true")) {
                    cells[idx] = cells[idx].replace("true", "false");
                    isRemoved[idx] = true;
                    removed++;
                }
            }
        }

        // Monta a string de volta ao formato original
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < cells.length; i++) {
            sb.append(cells[i]);
            if (i < cells.length - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    // Exemplo de uso
    public static void main(String[] args) {
        String fullBoard = "{0,0=9,true, 0,1=2,true, 0,2=3,true, 0,3=7,true, 0,4=5,true, 0,5=6,true, 0,6=8,true, 0,7=4,true, 0,8=1,true, 1,0=5,true, 1,1=7,true, 1,2=6,true, 1,3=4,true, 1,4=8,true, 1,5=1,true, 1,6=3,true, 1,7=2,true, 1,8=9,true, 2,0=4,true, 2,1=8,true, 2,2=1,true, 2,3=3,true, 2,4=2,true, 2,5=9,true, 2,6=6,true, 2,7=5,true, 2,8=7,true, 3,0=1,true, 3,1=5,true, 3,2=4,true, 3,3=8,true, 3,4=7,true, 3,5=2,true, 3,6=9,true, 3,7=3,true, 3,8=6,true, 4,0=8,true, 4,1=6,true, 4,2=7,true, 4,3=9,true, 4,4=4,true, 4,5=3,true, 4,6=5,true, 4,7=1,true, 4,8=2,true, 5,0=2,true, 5,1=3,true, 5,2=9,true, 5,3=6,true, 5,4=1,true, 5,5=5,true, 5,6=4,true, 5,7=7,true, 5,8=8,true, 6,0=3,true, 6,1=1,true, 6,2=8,true, 6,3=2,true, 6,4=9,true, 6,5=4,true, 6,6=7,true, 6,7=6,true, 6,8=5,true, 7,0=6,true, 7,1=9,true, 7,2=5,true, 7,3=1,true, 7,4=3,true, 7,5=7,true, 7,6=2,true, 7,7=8,true, 7,8=4,true, 8,0=7,true, 8,1=4,true, 8,2=2,true, 8,3=5,true, 8,4=6,true, 8,5=8,true, 8,6=1,true, 8,7=9,true, 8,8=3,true}";
        BoardChallengeCreator creator = new BoardChallengeCreator();
        String challenge = creator.createChallenge(fullBoard, 40); // Remove 40 células
        System.out.println(challenge);
    }
}