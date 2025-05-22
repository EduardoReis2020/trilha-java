# Sudoku Java

Uma aplicação de Sudoku desenvolvida em Java, com suporte para interface gráfica (Swing) e modo console. O projeto é modular, organizado para facilitar manutenção, testes e extensões.

## 📚 Sobre o Projeto

Este projeto foi desenvolvido como parte de um **desafio de projeto** do curso **Trilha Java** da plataforma [DIO](https://www.dio.me/). A estrutura foi baseada no repositório original da DIO: [digitalinnovationone/sudoku](https://github.com/digitalinnovationone/sudoku/), com diversas melhorias e organização de pacotes.

## 🎯 Objetivo

Permitir que usuários joguem Sudoku via terminal ou interface gráfica, com desafios gerados automaticamente e validações de jogadas.

## ⚙️ Funcionalidades

- Geração automática de tabuleiros completos válidos.
- Criação de desafios com solução única.
- Interface gráfica com componentes personalizados em Swing.
- Modo console com leitura de configuração por arquivo.
- Validação automática das jogadas e verificação de vitória.

## 🧠 Arquitetura

A aplicação segue uma arquitetura modular, separando claramente domínio, lógica de negócio, utilidades e interface:

### 📁 `model/`
Contém as entidades principais do domínio:
- `Board.java`: representa o tabuleiro do Sudoku.
- `Space.java`: representa uma célula.
- `GameStatusEnum.java`: estados do jogo.

### 📁 `service/`
Contém a lógica de negócio e sistema de eventos:
- `BoardService.java`: gerencia regras do tabuleiro.
- `NotifierService.java`: sistema de notificação por eventos.
- `EventEnum.java` e `EventListener.java`: implementação do sistema de eventos.

### 📁 `ui/`
Contém a interface gráfica:
- `custom/`: componentes Swing personalizados como botões, campos e telas.
- `MainScreen.java`: janela principal do jogo.

### 📁 `util/`
Contém os utilitários do jogo:
- `BoardGenerator.java`: geração de tabuleiros completos.
- `BoardChallengeCreator.java`: remoção de células para formar desafios.
- `BoardTemplate.java`: exibição do tabuleiro no console.

### 🎮 Entrypoints
- `Main.java`: executa o modo console.
- `UIMain.java`: executa a interface gráfica Swing.

## 🔄 Fluxo do Jogo

1. Gera um tabuleiro completo com solução válida.
2. Remove células para criar um desafio com solução única.
3. Inicializa o modelo do jogo com a configuração do desafio.
4. A interface (console ou Swing) permite o usuário jogar.
5. O sistema de eventos mantém a interface atualizada com o estado do jogo.

## 🛠️ Configuração no VS Code

### Pré-requisitos

- [Java JDK 17+](https://adoptium.net/)
- [Visual Studio Code](https://code.visualstudio.com/)
- Extensão [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

### Execução

- **Modo Console**:  
  Clique com o botão direito em `Main.java` e selecione **Run Java**.

- **Modo Gráfico (Swing)**:  
  Clique com o botão direito em `UIMain.java` e selecione **Run Java**.

## 📁 Estrutura do Projeto

```
sudoku/
├── src/
│ └── br/com/dio/
│ ├── model/
│ ├── service/
│ ├── ui/custom/
│ ├── util/
│ ├── Main.java
│ └── UIMain.java
├── config.txt
├── sudoku.iml
└── README.md
```

## 👨‍💻 Autor

Desenvolvido por [Eduardo dos Reis Souza](https://github.com/EduardoReis2020)  
🔗 Repositório: [github.com/EduardoReis2020/trilha-java/tree/main/desafios/sudoku](https://github.com/EduardoReis2020/trilha-java/tree/main/desafios/sudoku)
