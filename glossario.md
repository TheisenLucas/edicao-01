# Glossário

## Versionamento

- **Versionamento**: técnica de desenvolvimento que permite salvar cada pequena alteração, criando um histórico navegável de todas alterações. Permite recuperar o que foi feito em uma data específica ou funcionalidade específica. Atualmente, todo projeto profisisonal usa alguma ferramenta de versionamento.
- **Commit**: conjunto de alterações que desempenham uma funcionalidade específica da aplicação. Se aplica ao contexto do Git
- **Git**: ferramenta de versionamento de código fonte, permite criar várias versões e ramificações do código da aplicação. Principais comandos Git:
  - `git clone <url-repositorio>`: baixa os fontes do servidor remoto criando um vínculo entre máquina local e servidor
  - `git status`: exibe o estado atual das alterações **locais**
  - `git add <path>`: seleciona os arquivos que serão considerados no próximo pacote de alterações
  - `git commit -m "<mensagem>"`: fecha um pacote de alterações dando uma mensagem de identificação a ele
  - `git push`: envia todos os commits (pacotes de alterações) para o servidor remote
  - `git pull`: baixa todas os commits (pacotes de alterações) do servidor remote
- **GitHub**: repositório de código fonte, onde são guardados e compatilhados projetos utilizando Git.

## Programação

- **Booleano**: lógica, valor ou expressão que possui apenas dois resultados possíveis: verdadeiro ou falso
- **Operador**: assim como na matemática, são símbolos utilizados para desempenhar funcões aritméticas, lógicas, entre outras
- **Tipo** de Dado: termo utilizado para designar o comportamento e/ou a estrutura de uma variável
- **Tipos Primitivos**: tipos de dados simplificados. Não possuem comportamentos (métodos) e apenas guardam informações simples como um número ou booleano
- **Variável**: símbolo ou termo usado no código que guarda um valor de um tipo específico. O valor pode ser alterado ao longo da execução, o tipo não
- **Valor**: informação/conteúdo de uma variável ou atributo
- **Manutenibilidade**: caracteristica de um código ou sistema que indica o quão simples é dar manutenção no sistema em questão. É desejável que os sistemas que desenvolvemos não somente funcionem, mas que sejam manuteníveis, para que as próximas alterações no sistema não sejam caras e dolorosas.

## Java

- **Java**: linguagem de programação de alto nível e fortemente tipada, o que significa que todas as variáveis e atributos precisar ter seus tipos de dados definidos de forma explícita.
- **JDK**: Abreviação de Java Development Kit. É um conjunto de ferramentas que incluem o compilador e permitem o desenvolvimento de aplicações Java.
- **JRE**: Abreviação de Java Runtime Environment. É a ferramenta necessária para executar aplicações desenvolvidas em Java, e inclui a JVM além de outras ferramentas.
- **JVM**: Abreviação de Java Virtual Machine. É um software instalado no computador capaz de interpretar o código compilado e transcrevê-lo em linguagem de máquina de acordo com o o sistema operacional em execução.

## Ferramentas

- **IDE**: abreviação de Integrated Development Environment ou Ambiente de Desenvolvimento Integrado, é um programa de computador que reúne características e ferramentas de apoio ao desenvolvimento de software com o objetivo de agilizar este processo.
- **Intellij**: é uma IDE desenvolvida pela JetBrains bastante utilizada no desenvolvimento de aplicações Java.
- **Projeto**: conjunto de classes que criam uma ou mais aplicações que desempenham uma função. No Intellij pode ser criado em `File > New Project` ou importado em `File > Open (selecionando pasta do projeto)`.
- **Slack**: ferramente de comunicação que visa subsituir o e-mail. Permite criar grupos de conversas por assuntos e conversas diretas entre participantes.

## Orientação a Objetos

- **Programação Orientada a Objetos**: também connhecida como OO, é um paradigma de programação, um jeito de escrever código. Prega que o código deve representar o contexto real através de objetos que abstraem a complexidade de tarefas específicas.
  > Objetos são como pessoas. Eles estão vivendo, respirando, realizando ações que têm conhecimento, além de possuírem memória dentro deles para que possam se lembrar de coisas. E ao invés de interagir com eles em um nível muito baixo, você interage com eles em um nível muito alto de abstração, como estamos fazendo aqui. Aqui está um exemplo: se eu sou seu objeto de lavanderia, você pode me dar sua roupa suja e enviar-me uma mensagem que diz: "Você pode pegar minhas roupas lavadas, por favor." Acontece que eu sei onde fica a melhor lavanderia em San Francisco. Eu falo inglês e tenho dólares nos bolsos. Então, eu saio, chamo um táxi e digo ao motorista para me levar a este lugar em San Francisco. Eu pego suas roupas lavadas, entro novamente no táxi e volto aqui. Eu lhe entrego suas roupas limpas e digo: "Aqui estão suas roupas limpas". Você não tem ideia de como eu fiz isso. Você não tem conhecimento do lugar da lavanderia. Talvez você fale francês e não pode sequer chamar um táxi. Você não pode pagar por não ter dólares no bolso. Mas eu sabia como fazer tudo isso. E você não tem que saber de nada disso. Toda essa complexidade estava escondida dentro de mim e fomos capazes de interagir em um nível muito alto de abstração. Isso é o que são objetos. Eles encapsulam a complexidade e as interfaces para que esta complexidade esteja em alto nível (de abstração). Por Steve Jobs.
- **Objeto**: algum elemento do contexto que estamos querendo reproduzir em código. Um objeto pode ser uma Pessoa, um Animal, um Carro, uma Conta, um Gerenciador, um Emissor de Nota Fiscal, enfim. "Um objeto é uma instância de um tipo de objeto", MARTIN, 1994
- **Classe**: é a definição de como um objeto se comporta. Atenção aqui ao termo **definição**, que no dicionário significa "delimitação exata, estabelecimento de limites". Ou seja, um mesmo objeto pode ter definições diferentes de acordo com o contexto no qual ele é aplicado. Pense nas características de um carro. Entre as diversas características de um carro, podemos dizer que ele possui um dono, certo? Então podemos ter uma classe `Carro` que possui um atributo `dono`. Mas e se estivermos falando de uma loja de carros novos? O atributo `dono` faz algum sentido? Sendo assim, o objeto carro pode ser definido de formas diferentes, por classes diferentes, de acordo com o contexto no qual ele é inserido.
- **Instância**: representa, em código, um objeto criado a partir de uma classe. A intância é o resultado do operador `new`. O valor de uma variável, é uma instância do tipo dessa variável. No exemplo `Mago patologica = new Mago("Maga Patológica")`, temos que `Mago` é a classe; `patologica` é a variável; e o **valor** da variável `patologica` é uma **instância** de `Mago`. E onde, nesse exemplo, está o **objeto**? O objeto transcende o código, ele é a própria representação do contexto. Posso dizer que eu tenho, nesse exemplo, um **objeto** _mago_, definido pela **classe** `Mago`.
- **Atributo**: atributo é uma variável da classe. Ou seja, é uma característica de um objeto expressa em código através de uma variável definida em uma classe. A cor de um carro, por exemplo, pode ser representada pelo atributo `cor` na classe `Carro`.
- **Método**: são as funções ou ações que um objeto pode fazer. Se um carro é capaz de ligar (e essa informação é importande no nosso cenário), então precisamos de um método `ligar`, que nada mais é do que uma função específica de uma classe. Métodos podem possuir um retorno e parâmetros.
- **Construtor**: é um tipo especial de método de uma classe que é invocado quando uma classe é instanciada. Quando usamos o operador `new` estamos invocando um construtor da classe que será responsável por inicializar o estado daquela instância.
- **Parâmetro**: um método pode possuir parâmetros, que são variáveis que ele aceita que serão úteis para desempenhar a função desejada. Se temos um método que soma dois números, precisamos definir que esse método possui 2 parâmetros. São um tipo especial de variável, que existem apenas dentro do escopo do método e podem ter seu valor definido por quem invoca o método.
- **Argumento**: o argumento é o valor de um parâmetro de um método. Quando invocamos um método que possui parâmetros, precisamos definir o valor deles, esse valor é o argumento. No exemplo `double andar(double velocidade, double aceleracao, int segundos)`, temos um **método** `andar`, que possui três **parâmetros**. Ao executarmos esse método `carro.andar(0.0, 10.0, 5)`, estamos passando `0.0`, `10.0` e `5` como **arguementos** do método.
- **Retorno de método**: é o valor de resultado da execução desse método. Quando invocado, o método poderá produzir um resultado e esse resultado chamamos de retorno.
- **Invocar**: Ação de executar ou chamar um método. Um método pode ser chamado ou executado ou invocado - são sinônimos.

## Escrita

- **Case**: é o padrão de escrita de texto, que define o padrão de caracteres para escritas de texto. Ligado principalmente a letras maiúsculas e minúsculas.
- **Case Sensitive**: Indica que, para um determinado sistema ou ambiente, a diferença de letras maiúsculas e minúsculas faz diferença para o sistema. Dizemos que Java é **case sensitive** por que ele considera que, por exemplo, a variável `velocidade` é diferente da variável `Velocidade` ou `velocidadE`.
- **UpperCase**: Modo de escrever onde são usadas apenas letras maiúsculas. `TEXTO`. Também conhecida como **PascalCase**.
- **LowerCase**: Modo de escrever onde são usadas apenas letras minúsculas. `texto`.
- **CamelCase**: Modo de escrever onde são usadas apenas letras minúsculas, porém, quando existem mais deuma palavra, as palavras subsequentes à primeira possuem a primeira letra maiúscula. `textoAdicional`. Possui duas variações, que é o `LowerCamelCase`, que é o mesmo que `CamelCase`; e o `UpperCamelCase`, onde todas as palavras começam com maiúsculo, inclusive a primeira: `TextoAdicional`.
- **Indentação**: São os recuos no texto de um código usados para organizar visualmente, melhorar a leitura, separando escopos que são aninhados.
- **Comentário**: trecho de código ignorado pelo compilador, feito por humanos para humanos. Serve para adicionar clareza a um trecho complexo e de difícil entendimento.
