# 🌍 Mundo e as Fake News: Simulação de Propagação de Desinformação em Agentes

[![Language](https://img.shields.io/badge/Language-Java%20-ED8B00?style=flat-square&logo=java)](https://www.java.com/)
[![Paradigm](https://img.shields.io/badge/Paradigm-OOP-00599C?style=flat-square)](https://pt.wikipedia.org/wiki/Programa%C3%A7%C3%A3o_orientada_a_objetos)
[![Topic](https://img.shields.io/badge/Topic-Agent%20Simulation-FE7A15?style=flat-square)](https://pt.wikipedia.org/wiki/Sistema_multiagente)

## 📝 Descrição do Projeto

Este projeto consiste em uma **simulação baseada em agentes** que modela a dinâmica de propagação de **Fake News** e o impacto de fontes de informação confiáveis e esforços de "checagem de fatos" em uma população.

A simulação é executada em um mapa 2D discreto, onde 100 agentes (Pessoas) se movem aleatoriamente e interagem com diferentes zonas que representam fontes de informação e desinformação.

### Mecanismos Principais:

1.  **Movimentação:** As pessoas se movem aleatoriamente pelo mapa a cada segundo.
2.  **Contágio (Fake News):** Ao entrar na **Zona de Fake News** ou ter contato (estar adjacente) com uma pessoa que está nessa zona, um agente se torna **Pessoa Desinformada**.
3.  **Cura (Informação Correta):** Ao entrar na **Zona de Informação Certa**, um agente desinformado é "curado" e retorna ao estado **Informado**.
4.  **Imunidade (Emissora Confiável):** Ao entrar na área da **Emissora Confiável**, um agente se torna **Pessoa Segura**, ganhando uma imunidade temporária (30 segundos) contra as Fake News.

---

## 💻 Estrutura e Classes Principais

O projeto é organizado em classes Java que definem o ambiente, os agentes e as entidades de controle.

| Arquivo | Descrição |
| :--- | :--- |
| `main.java` | Ponto de entrada da simulação. Inicializa o `Mundo` e executa o *loop* principal de tempo, controlando a sequência de ações (movimentação, propagação, cura, etc.). |
| `mundo.java` | A classe central do ambiente. Gerencia o **mapa** (`mapaMundo`), o `ArrayList` de todas as `Pessoa`s, define as **zonas de interação** e implementa a lógica de propagação e cura (`AInformacaoFake`, `DestroiAInformacaoFake`, `Emissora`). |
| `pessoa.java` | Classe base que implementa a interface `IMovable`. Define atributos básicos dos agentes (posição X/Y, velocidade, lista de contatos) e o método de movimento aleatório. |
| `IMovable.java` | Interface que define o contrato de movimentação para as classes de agentes. |
| `PessoaInformada.java` | Subclasse de `Pessoa`. Estado inicial (neutro) dos agentes. |
| `PessoaInformacaoFake.java` | Subclasse de `Pessoa`. Estado de um agente que está espalhando Fake News. |
| `PessoaSegura.java` | Subclasse de `Pessoa`. Estado de um agente imune temporariamente. |
| `IAInformacaoFake.java` | Classe simples para contagem de quantas vezes a Fake News foi transmitida. |
| `IAInformacaoCerta.java` | Classe simples para contagem de quantas vezes a informação correta foi transmitida (cura). |
| `EmissoraConfiavel.java`| Classe simples para contagem de quantas vezes a Emissora gerou imunidade. |
| `FakeNews.java`| (Não fornecida, mas inferida) Classe auxiliar para contagem relacionada às Fake News. |

---

## 🎨 Legenda do Mapa e Agentes

O mapa é renderizado no console usando códigos de cores ANSI (o que depende do terminal). A cor de fundo de cada célula representa o tipo de área ou o estado do agente:

| Código | Cor (Fundo) | Entidade | Descrição |
| :--- | :--- | :--- | :--- |
| `1` | **Branco** | Muros/Bordas | Limites inamovíveis do mapa. |
| `3` | **Azul** | Zona de Fake News | Área de alta incidência de desinformação. Agentes informados que entram aqui ficam **desinformados** (vermelho). |
| `2` | **Roxo/Magenta** | Zona de Informação Certa | Área de "cheque de fatos". Agentes desinformados que entram aqui ficam **informados** (amarelo). |
| `4` | **Ciano** | Emissora Confiável | Área que confere **imunidade** aos agentes que passam por ela. |
| `5` | **Amarelo** | **Pessoa Informada** | Agente no estado neutro/informado. |
| `6` | **Vermelho** | **Pessoa Desinformada (Fake News)** | Agente que está transmitindo Fake News. |
| `7` | **Verde** | **Pessoa Segura** | Agente temporariamente imune à Fake News. |
| `0` | (Vazio) | Espaço Vazio | Área livre para movimentação. |

---

## 🚀 Como Executar o Projeto

Para executar esta simulação, você precisará de um ambiente Java configurado (JDK) e de um IDE, como NetBeans ou IntelliJ, que suporte a execução de projetos Java.

### Pré-requisitos
* **Java Development Kit (JDK) 8+**
* Um IDE Java (recomendado).

### Passos:
1.  Organize todos os arquivos `.java` na mesma pasta ou dentro de um projeto Java na estrutura de pacotes correta.
2.  Compile todas as classes.
3.  Execute a classe principal: `Main.java`.

A simulação será iniciada, exibindo a evolução do mapa a cada segundo, juntamente com as estatísticas em tempo real:
