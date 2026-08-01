# Sistema de Votação em Java 🗳️

Uma aplicação interativa de linha de comando (CLI) desenvolvida em Java para simular o funcionamento de uma urna eletrônica, registrando e apurando votos.

## 🚀 Funcionalidades

* **Votação Contínua:** Estrutura de repetição que permite registrar múltiplos votos em uma única sessão de execução.
* **Opções de Voto:** Suporte para escolha entre 3 candidatos distintos, além das opções de voto Nulo e voto em Branco.
* **Validação de Entrada:** Tratamento de erros que impede a inserção de números inválidos, solicitando que o usuário digite novamente caso a opção fuja do menu (1 a 5).
* **Apuração Automática:** Ao encerrar o sistema (digitando 0), a aplicação exibe um balanço final contendo:
  * O total de votos recebidos por cada candidato.
  * O total de votos Nulos e em Branco.
  * A soma geral de todos os votos computados.

## 🛠️ Tecnologias Utilizadas

* **Java:** Linguagem principal do projeto (utilizando a classe `Scanner` para leitura de dados do teclado e variáveis contadoras para a lógica de apuração).

## 🎮 Como Executar

1. Certifique-se de ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Clone este repositório ou faça o download do arquivo `Votacao.java`.
3. Abra o terminal e navegue até a pasta onde o arquivo está salvo.
4. Compile o código com o comando:
   ```bash
   javac Votacao.java
