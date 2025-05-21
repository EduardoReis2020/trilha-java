package br.com.dio;

import br.com.dio.ui.custom.screen.MainScreen;
import br.com.dio.util.BoardGenerator;
import br.com.dio.util.BoardTemplate;
import br.com.dio.util.BoardChallengeCreator;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class UIMain {

    public static void main(String[] args) throws IOException {
        // 1. Gerar tabuleiro completo
        BoardGenerator generator = new BoardGenerator();
        String fullBoard = generator.generateFullBoard();

        // 2. Criar desafio removendo algumas células (ex: 40 células removidas)
        BoardChallengeCreator challengeCreator = new BoardChallengeCreator();
        String challengeBoard = challengeCreator.createChallenge(fullBoard, 40);

        // 3. Converter o desafio para Map<String, String>
        // Formato esperado: {linha,coluna=valor,false, ...}
        Map<String, String> gameConfig = new HashMap<>();
        String content = challengeBoard.substring(1, challengeBoard.length() - 1); // remove { }
        String[] entries = content.split(", ");
        for (String entry : entries) {
            // Exemplo de entry: 0,0=9,false
            String[] parts = entry.split("=");
            String key = parts[0]; // "0,0"
            String value = parts[1]; // "9,false"
            gameConfig.put(key, value);
        }

        // 4. Iniciar a interface gráfica com o desafio
        MainScreen mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }
}