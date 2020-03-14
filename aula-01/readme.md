# Introdução

## Apresentação e Boas Vindas

## Dinâmica em Grupo

> Incluir instrutores e monitores

- Formem uma linha ordenados por nome alfabeticamente
- Formem duplas e descubram uma curiosidade de sua dupla
- Apresentem o colega da dupla

## Setup das Máquinas

- Login e senha dos notes emprestados
- SSID e senha do WIFI dedicado
- Validação de usuário admin de todos

## Apresentação do Cronograma

## Sobre o Treinamento

1. **Como serão as aulas?**

   <p>Todas presenciais. Focaremos sempre no processo em 3 etapas: explicação teórica, com exemplo prático; exercício em aula, com apoio de instrutores e monitores; e por último, exercício para ser feito fora do horário de aula.</p>

1. **Como serão as exercícios?**

   <p>Parte em aula, parte em casa. A parte dos exercícios destinada a fazer em casa não deverá seguir um cronograma rígido de entrega, devendo o participante gerenciar o seu tempo da forma que julgar pertinente. Todos exercícios terão como data limite de entrega, a próxima quinta-feira até às 23h59. O participante ainda poderá submeter os trabalhos após esse período, mas não é garantido que será avaliado</p>

1. **Como serão as avaliações?**

   <p>Não há testes. Não há provas. Não há trabalhos. Não há notas. Apenas serão avaliados os exercícios entregues e o comportamento em sala de aula aderente à cultura da empresa. Após o último dia de aula, os participantes serão desafiados com uma entrega maior, que será explicada em detalhes no dia.</p>

1. **O conteúdo das aulas ficará disponível?**

   <p>Sim, durante todo o treinamento. Porém, o conteúdo de cada aula só ficará disponível após o dia da respectiva aula, ou seja, no primeiro dia apenas a aula 01 estará disponível</p>

1. **Como devo submeter os exercícios?**
   <p>Usaremos o GitHub durante todo o treinamento. Se você não possui uma conta ainda, crie agora mesmo. O candidato deverá criar um repositório com o nome `cwi-reset-2020-01`, pessoal e público (criaremos juntos na primeira aula).</p>

> Antes de mais nada pedir para enviarem pro instrutor do dia, pelo Slack, até onde estudaram no guia que fora enviado no e-mail com as dicas de estudos.

# Conteúdo

## Setup Ambiente

- [Instalar JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Instalar Maven](https://maven.apache.org/download.cgi)
- [Instalar Intellij Community Edition](https://www.jetbrains.com/idea/download/#section=windows)
- [Instalar Git](https://git-scm.com/download/win)
- [Configurar variáveil de ambiente do Java](https://mkyong.com/java/how-to-set-java_home-on-windows-10)
- [Configurar variáveil de ambiente do Maven](https://mkyong.com/maven/how-to-install-maven-in-windows/)
- [Criar repositório do GitHub](https://help.github.com/pt/github/getting-started-with-github/create-a-repo)
- [Configurar Git](https://help.github.com/pt/github/getting-started-with-github/set-up-git)
- [Clonar repositório local](https://help.github.com/pt/github/creating-cloning-and-archiving-repositories/cloning-a-repository-from-github)

## Git Básico

### O que é

Ferramenta de versionamento distribuído de código. Permite salvar o código produzido e integrar o trabalho de diferentes colaboradores, permitindo criar diferentes versões do mesmo código e uni-las quando necessário.

### Remoto vs Local

O código fica salvo tanto no servidor central quanto distribuído na máquina de cada desenvolvedor. Todo mundo tem uma cópia do código em sua máquina. Existem comandos que permitem atualizar a versão local trazendo as novidades do servidor ou ainda atualizar o servidor com as novas alterações feitas na máquina do desenvolvedor.

### Comandos básicos

- `git clone <url-repositório>` => `git clone https://github.com/robsonrosa/meu-projeto.git`

  > Faz uma cópia do repositório remoto para a máquina do desenvolvedor

- `git add <caminho>` => `git add .`

  > Seleciona quais arquivos alterados o desenvolvedor devem ser considerados para enviar ao servidor. O ponto indica "todos alterados"

- `git commit -m "<mensagem>"` => `git commit -m "Cria a nova tela de cadastro de produtos"`

  > Empacota as alterações selecionadas com o `git add` e cria um "checkpoint", ou seja, um conjunto de alterações que desempenham uma função

- `git push`

  > Submete todos os commits feitos anteriormentes, enviando-os ao servidor remoto para que fique disponível para os demais desenvolvedores

- `git pull`
  > Atualiza o código local, trazendo as alterações feitas no servidor remoto por outros desenvolvedores

### Dica

Quem usa notebook emprestado durante o treinamento deverá seguir um processo simples toda vez que for iniciar algum trabalho. Como terá um computador em casa e outro no treinamento, ambos deverão estar atualizados. Então, assim que iniciar os trabalhos em uma das máquinas, deverá realizar o `git pull` pra baixar as alterações feitas na outra máquina e submetidas pro servidor remoto. Isso significa que ao terminar as atividades, deverá realizar o `git push` para que as alterações fiquem online no servidor. Caso esqueça do push, as alterações ficarão apenas na máquina em que foram desenvolvidas.

## Programação Básica

### Hello World

Vamos construir juntos nossa primeira aplicação Java Console

### Variáveis

- Como o nome já diz, são símbolos cujo o valor pode variar
- No Java as variáveis são tipadas, ou seja, trabalham com dados do tipo especificado em sua declaração

### Comentários

- Adicionar alguma informação que não será interpretada pelo compilador

```java
// comentário em uma linha
// comentário em outra linha
/*
  bloco de comentário
  nada aqui será considerado
*/
```

### Tipos de Dados

#### Tipos Primitivos

- int => 1
- float => 1.23
- boolean => true | false
- void => nada

#### Outros Tipos de Dados

- String
- Integer
- Double
- Boolean
- BigDecimal
- LocalDate
- LocalTime

### Operadores

#### Operadores Aritméticos

| Operador | Descrição     |  Cenário | Resultado |
| :------: | ------------- | -------: | :-------- |
|   `+`    | Soma          | `10 + 2` | `12`      |
|   `-`    | Subtração     | `10 - 2` | `8`       |
|   `*`    | Multiplicação | `10 * 2` | `20`      |
|   `/`    | Divisão       | `10 / 2` | `5`       |
|   `%`    | Módulo        | `10 % 2` | `0`       |

#### Operadores de Atribuição

| Operador | Descrição |         Cenário | Resultado                            |
| :------: | --------- | --------------: | :----------------------------------- |
|   `=`    | Simples   | `contador = 10` | `contador` agora possui o valor `10` |

#### Operadores de Incremento

| Operador | Descrição     |          Cenário | Resultado                              |
| :------: | ------------- | ---------------: | :------------------------------------- |
|   `++`   | Incremento    |     `contador++` | o mesmo que `contador = contador + 1`  |
|   `--`   | Decremento    |     `contador--` | o mesmo que `contador = contador - 1`  |
|   `+=`   | Soma          | `contador += 10` | o mesmo que `contador = contador + 10` |
|   `-=`   | Subtração     | `contador -= 10` | o mesmo que `contador = contador - 10` |
|   `*=`   | Multiplicação | `contador *= 10` | o mesmo que `contador = contador * 10` |
|   `/=`   | Divisão       | `contador /= 10` | o mesmo que `contador = contador / 10` |
|   `%=`   | Módulo        | `contador %= 10` | o mesmo que `contador = contador % 10` |

#### Operadores de Igualdade

| Operador | Descrição    | Cenário 1 | Resultado 1 |  Cenário 2 | Resultado 2 |  Cenário 3 | Resultado 3 |
| :------: | ------------ | --------: | :---------- | ---------: | :---------- | ---------: | :---------- |
|   `==`   | Igual a      | `9 == 10` | `false`     | `10 == 10` | `true`      | `11 == 10` | `false`     |
|   `!=`   | Diferente de | `9 != 10` | `true`      | `10 != 10` | `false`     | `11 != 10` | `true`      |

#### Operadores Relacionais

| Operador | Descrição        | Cenário 1 | Resultado 1 |  Cenário 2 | Resultado 2 |  Cenário 3 | Resultado 3 |
| :------: | ---------------- | --------: | :---------- | ---------: | :---------- | ---------: | :---------- |
|   `>`    | Maior que        |  `9 > 10` | `false`     |  `10 > 10` | `false`     |  `11 > 10` | `true`      |
|   `<`    | Menor que        |  `9 < 10` | `true`      |  `10 < 10` | `false`     |  `11 < 10` | `false`     |
|   `>=`   | Maior ou igual a | `9 >= 10` | `false`     | `10 >= 10` | `true`      | `11 >= 10` | `true`      |
|   `<=`   | Menor ou igual a | `9 <= 10` | `true`      | `10 <= 10` | `true`      | `11 <= 10` | `false`     |

#### Operadores Lógicos

|         Operador          | Descrição                                      |                           Cenário 1 | Resultado 1 |                            Cenário 2 | Resultado 2 |                             Cenário 3 | Resultado 3 |
| :-----------------------: | ---------------------------------------------- | ----------------------------------: | :---------- | -----------------------------------: | :---------- | ------------------------------------: | :---------- |
|            `!`            | Negação - inverte o valor booleano             |                            `!false` | `true`      |                              `!true` | `false`     |                         `!(10 == 10)` | `false`     |
|           `&&`            | E lógico - true se ambos argumentos forem true |                      `true && true` | `true`      |                      `true && false` | `false`     |                      `false && false` | `false`     |
| <code>&#124;&#124;</code> | OU lógico - true se um dos argumentos for true | <code>true &#124;&#124; true</code> | `true`      | <code>true &#124;&#124; false</code> | `true`      | <code>false &#124;&#124; false</code> | `false`     |

## Orientação a Objetos

### Conceito

- Representar elementos em termos de um objeto
- Aproximar o sistema que está sendo criado ao mundo real
- Objetos têm características e ações (assim como na vida real)
- Melhor legibilidade
- Consequentemente, maior manutenibilidade
- Maior reaproveitamento dos componentes do sistema

### Classes

> Uma espécie de “planta baixa” para a criação de objetos

- Possui a definição de atributos que um objeto deverá possuir
- Possui a definição de métodos que um objeto deverá possuir
- Padrão de nomenclatura `UpperCamelCase`

```java
class Mago {

}
```

#### Atributos

- As caracterísitcas de um objeto
- Cada atributo possui um tipo de dado
- Padrão de nomenclatura `lowerCamelCase`
- Nomes claros e objetivos, sem abreviações

```java
class Mago {

  String nome;

  int nivel;

  int vida;

  int mana;

  float poder;

  boolean descansando;

}
```

#### Métodos

- As ações de um objeto
- Um método pode possuir argumentos (parâmetros de entrada)
- Um método pode possuir um resultado
- Um método deve possuir um corpo, ou seja, o trecho de código que será executado quando o método for invocado
- Tanto o retorno quanto os argumentos devem ter tipos definidos

```java
class Mago {

  int prepararMagias() {
    ...
    return numeroMagiasPreparadas;
  }

  void lancarMagia(String nomeMagia) {
    ...
  }

  void descansar() {
    this.descansando = true;
  }

}
```

#### Construtor

- É um tipo especial de método
- Uma classe pode ter vários construtores diferentes
- Construtores podem ter argumentos
- Construtores não tem um retorno
- Ele é invocado automaticamente sempre que um objeto for criado (instanciado)
- Quando nenhum construtor é declarado, um `construtor padrão` será utilizado (não possui argumentos nem corpo)

```java
class Mago {

  String nome;

  int nivel;

  int vida;

  int mana;

  float poder;

  boolean descansando;

  /*
  construtor default (não precisa ser declarado)
  Mago() {
  }
  */

  Mago(String nome, int vida, int mana, float poder) {
    this.nome = nome;
    this.vida = vida;
    this.mana = mana;
    this.poder = poder;
    this.nivel = 1;
  }

}
```

#### Instanciando um objeto

```java
// Mago é o nome da classe | gandalf é o nome do objeto
Mago gandalf = new Mago("Gandalf", 100, 150, 200f);
// Mago é o nome da classe | presto é o nome do objeto
Mago presto = new Mago("Presto", 50, 20, 1000f);
// Nesse ponto, existe uma classe e dois objetos
```

## Tipo Valor vs Tipo Referência

### Tipo Valor

- Tipos valor existem por si só e são únicos, gerando cópias quando atribuídos à novas variáveis. Tipos valor são tipos primitivos
- Os tipos primitivos são boolean, byte, char, short, int, long, float e double
- As variáveis de instância de tipo primitivo são inicializadas por padrão, as variáveis dos tipos byte, char, short, int, long, float e double são inicializadas como 0, e as variáveis do tipo boolean são inicializadas como false.

```java
int a = 1;
int b = a;

a = 2;

// a vale {2}
// b vale {1}
```

### Tipo Referência

- Ao ser criado, ele aponta para uma referência de memória onde está o conteúdo da variável
- Assinar esta variável à outra do mesmo tipo apenas cria mais um ponteiro para o mesmo conteúdo

```java
Mago gandalf = new Mago("Gandalf", 100, 150, 200f);
Mago outroGandalf = gandalf;

// gandalf.descansando é {false}
// outroGandalf.descansando é {false}

gandalf.descansar();

// gandalf.descansando é {true}
// outroGandalf.descansando é {true}
```

### Nulo

Variáveis do tipo referência podem não possuir uma referência (ponteiro), nesse caso elas apontam para o nada. Nesse caso dizemos que o valor dela é nulo (`null`).

```java
Mago gandalf = new Mago("Gandalf", 100, 150, 200f);
Mago outroMago; // se nenhuma referência foi atribuída a essa variável, ela é nula

gandalf.descansar(); // ok
outroMago.descansar(); // nok - não podemos executar uma ação em uma variável nula - isso irá gerar o erro NullPointerException (vão ver muito disso)
outroMago.descansando; // nok - também não podemos acessar um atributo de um objeto nulo pelo mesmo motivo

```
