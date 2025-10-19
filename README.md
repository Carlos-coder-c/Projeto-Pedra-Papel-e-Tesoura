# JOKENPO

🎮 JOKENPO - Jogo Pedra, Papel e TesouraUm jogo clássico de Pedra, Papel e Tesoura (Jokenpô) desenvolvido em Java, onde você enfrenta a máquina em uma melhor de 5 rodadas (primeiro a conquistar 3 pontos vence)!📋 Sobre o ProjetoEste é um jogo simples de console que implementa as regras tradicionais do Jokenpô:
Pedra vence Tesoura
Tesoura vence Papel
Papel vence Pedra
O jogador compete contra a máquina (que faz escolhas aleatórias) até que um dos dois alcance 3 vitórias.🚀 Funcionalidades
✅ Sistema de pontuação (melhor de 5)
✅ Escolhas aleatórias da máquina
✅ Validação de entrada do jogador
✅ Exibição do placar em tempo real
✅ Interface de console interativa
✅ Detecção automática de vencedor
🛠️ Tecnologias Utilizadas
Java (JDK 8 ou superior)
Scanner - Para entrada de dados do usuário
Random - Para gerar escolhas aleatórias da máquina
📦 Como ExecutarPré-requisitos
Java JDK instalado (versão 8 ou superior)
Terminal/Prompt de Comando
Passos
Clone ou baixe o projeto
bashCopy code[data-radix-scroll-area-viewport]{scrollbar-width:none;-ms-overflow-style:none;-webkit-overflow-scrolling:touch;}[data-radix-scroll-area-viewport]::-webkit-scrollbar{display:none}git clone <seu-repositorio>
cd jokenpo
Compile o código
bashCopy code[data-radix-scroll-area-viewport]{scrollbar-width:none;-ms-overflow-style:none;-webkit-overflow-scrolling:touch;}[data-radix-scroll-area-viewport]::-webkit-scrollbar{display:none}javac main.java
Execute o programa
bashCopy code[data-radix-scroll-area-viewport]{scrollbar-width:none;-ms-overflow-style:none;-webkit-overflow-scrolling:touch;}[data-radix-scroll-area-viewport]::-webkit-scrollbar{display:none}java main🎯 Como Jogar

Ao iniciar o jogo, você verá as opções disponíveis:

1 - Pedra
2 - Papel
3 - Tesoura



Digite o número correspondente à sua escolha e pressione Enter


O programa mostrará:

Sua escolha
A escolha da máquina
O resultado da rodada (vitória, derrota ou empate)
O placar atualizado



O jogo continua até que você ou a máquina alcance 3 vitórias


Ao final, será exibido o resultado final do jogo

📸 Exemplo de UsoDigite sua opção Pedra, papel ou tesoura
Pedra == 1
Papel == 2
Tesoura == 3

Escolha: 1 - PEDRA, 2 - PAPEL, 3 - TESOURA
> 1
Você escolheu: Pedra
A maquina escolheu: Tesoura
Parábens, Você ganhou!
Placar: Jogador 1 x Máquina 0
