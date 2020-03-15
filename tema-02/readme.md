# Tema de Casa

> Refatorar tema-01, aplicando os conceitos abordados em aula referentes a console, condicionais, herança, polimorfismo, modificadores de acesso, enum e coleções. Para isso, o **simulador de combate** de rpg deve seguir as seguintes regras:

## Desafio 01 - Refatorar

1. Implementar as mesmas regras do tema-01
1. As regras bônus do tema-01 agora são essenciais
1. O cálculo de dano deve estar em apenas 1 classe
1. O usuário poderá definir os atributos de cada personagem pelo console
1. O usuário poderá criar pelo menos 6 personagens - o usário decide quais classes
1. Utilizar os modificadores de acesso de acordo com a necessidade:
   1. Não deve ser possível instanciar um Arcano, Sacerdote, etc.
   1. Não deve ser possível alterar o nome, ataque e defesa dos personagens
   1. Não deve ser possível alterar os atributos dos personagens fora de suas classes (no App)

## Desafio 02 - Equipar && Ataque em Área

1. Homens de Armas poderão equipar uma arma em algum momento
   1. Eles não precisam mais especificar a arma ao atacar, e passam a usar a arma equipada
   1. Somente uma arma pode ser equipada por vez
1. Magias e Poderes Divinos podem ter o ataque em área, ou seja, ter vários alvos
   1. Em casos de ataque em área, cada dano deve ser calculado considerando a defesa de cada alvo
   1. Uma magia ou poder divino de ataque individual não pode atacar um grupo de alvos
   1. Uma magia ou poder divino de ataque em área deve receber um grupo de alvos
   1. Devem ser gerados registros de acordo com o número de alvos
   1. No registro de combate deve ser possível identificar que foi usado um ataque em área

## Desafio 03 - Registro de Combate

1. Ao realizar ataques, não deve ser impresso o que aconteceu
   1. Ao invés disso, deverá ser possível guardar esse registro em uma lista de todo combate
   1. No final do combate, essa lista deverá ser percorrida e exibidos os registros
1. No início de cada registro deve ser informado a data, hora, minuto, segundo e milissegundo do acontecimento
   1. Exemplo: `[14/03/2020 15:01:35.0001] Ramza atacou Wiegraf com Espada Longa causando 45 de dano`
1. Ao final do combate, além do resumo do tema-01, deve ser exibida a duração do combate em segundos e milissegundos
   1. Exemplo: `Duração total do combate: 23s 555ms`

## Desafio 04 - Controle Absoluto (super blaster bônus)

1. Usuário pode criar quantos personagens quiser, ele que decide quantos combatentes vão existir
1. Usuário que define o roteiro do combate:
   1. Poderá escolher entre "equipar", "atacar" ou "encerrar"
   1. Se escolher "equipar", poderá escolher um homem de armas e a arma a ser equipada
   1. Se escolher "atacar", poderá escolher qual o atacante, qual habilidade (se for arcano ou sacerdote) e qual alvo (ou quais alvos, se for uma habilidade em área)
   1. Enquanto o usuário selecionar a opção "atacar", _the show must go on_.
1. Só deverá listar como opções de personagem atacante, aqueles que ainda estiverem vivos
1. Só deverá listar como opções de personagem alvo, aqueles que ainda estiverem vivos
1. Para personagens arcanos, não deve ser possível selecionar uma magia se o atacante não tiver mana suficiente
   1. Recomendado criar uma magia de custo zero para não ficar travado caso acabe a mana
1. Para personagens sacerdotes, não deve ser possível selecionar um poder divino se o atacante não tiver fé suficiente
   1. Recomendado criar um poder divino de custo zero para não ficar travado caso acabe a fé
