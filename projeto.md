# Tinder Evolution

Vamos construir uma aplicação como o Tinder, porém baseada em gostos em comum, incluindo músicas, filmes, séries, jogos, esportes, entre outros. Essa aplicação deverá ter as seguintes funcionalidades:

## Funcionalidades

### Usuário

- Cadastrar usuário
- Listar usuário
- Pesquisar usuário
- Deletar usuário
- Editar usuário
- Dados de um usuário:
  - Id
  - Nome
  - Email
  - Telefone
  - Data de Nascimento
  - Bio
  - Localização:
    - Latitude
    - Longitude

### Músicas

- Cadastrar música
- Listar música
- Pesquisar música
- Deletar música
- Editar música
- Dados de uma música:
  - Id
  - Nome
  - Autor
  - Data de Lançamento
  - Estilo

### Filmes

- Cadastrar filme
- Listar filme
- Pesquisar filme
- Deletar filme
- Editar filme
- Dados de um filme:
  - Id
  - Nome
  - Diretor
  - Data de Lançamento
  - Categoria
  - Sinopse

### Séries

- Cadastrar série
- Listar série
- Pesquisar série
- Deletar série
- Editar série
- Dados de uma série:
  - Id
  - Nome
  - Diretor
  - Data de Lançamento
  - Número de temporadas
  - Número de episódios
  - Categoria
  - Sinopse

### Jogos

- Cadastrar jogo
- Listar jogo
- Pesquisar jogo
- Deletar jogo
- Editar jogo
- Dados de um jogo:
  - Id
  - Nome
  - Publisher
  - Data de Lançamento
  - Categoria
  - Plataforma

### Esportes

- Cadastrar esporte
- Listar esporte
- Pesquisar esporte
- Deletar esporte
- Editar esporte
- Dados de um esporte:
  - Id
  - Nome

### Curiosidades

- Cadastrar curiosidade
- Listar curiosidade
- Pesquisar curiosidade
- Deletar curiosidade
- Editar curiosidade
- Dados de uma curiosidade:
  - Id
  - Descrição
  - Categoria

### Avaliações

- Um usuário poderá avaliar uma música
- Um usuário poderá avaliar um filme
- Um usuário poderá avaliar uma série
- Um usuário poderá avaliar um jogo
- Um usuário poderá avaliar um esporte
- Um usuário poderá definir uma curiosidade

### Pesquisas

- Listar usuários que gostem de determinada música
- Listar usuários que gostem de determinado filme
- Listar usuários que gostem de determinada série
- Listar usuários que gostem de determinado jogo
- Listar usuários que gostem de determinado esporte
- Listar usuários que possuem determinada curiosidade

### Match

- Permitir que um usuário dê "like" em outro usuário
- Permitir que um usuário dê "dislike" em outro usuário
- Quando dois usuários derem "like" entre si, deverá ser criado um match
- Listar os matches de um determinado usuário
- Obter o usuário com mais características em comum que já não tenha um match ou dislike

### Foto

- Cadastrar foto de um usuário
- Listar fotos de um usuário
- Deletar foto de um usuário

### Bônus

- Obter o usuário com mais características em comum que já não tenha um match ou dislike dentro de uma distância de 10km

## Regras

### Usuário

- O e-mail não pode repetir
- O e-mail deve ter um formato válido
- O telefone deve ter um formato válido
- O usuário deve ter mais de 18 anos de idade
- Todos os campos são obrigatórios

### Música

- Não pode existir duas músicas com o mesmo nome
- A data de lançamento não pode ser uma data futura
- Os estilos aceitos são { funk | pagode | rock | indie | sertanejo | metal }
- Todos os campos são obrigatórios

### Filme

- Não pode existir dois filmes com o mesmo nome
- A data de lançamento não pode ser uma data futura
- As categorias aceitas são { drama | comédia | suspense | terror | ação | musical }
- Todos os campos são obrigatórios

### Série

- Não pode existir duas séries com o mesmo nome
- A data de lançamento não pode ser uma data futura
- As categorias aceitas são { drama | comédia | suspense | terror | ação | sitcom }
- Deve possuir ao menos 1 temporada
- Deve possuir ao menos 1 episódio por temporada
- Todos os campos são obrigatórios

### Jogo

- Não pode existir dois jogos com o mesmo nome na mesma plataforma
- A data de lançamento não pode ser uma data futura
- As categorias aceitas são { drama | comédia | suspense | terror | ação | musical }
- As plataformas aceitas são { xbox | ps4 | pc | snes }
- Todos os campos, exceto publisher, são obrigatórios

### Esporte

- Não pode existir dois esportes com o mesmo nome
- Todos os campos são obrigatórios

### Curiosidade

- Não pode existir duas curiosidades com a mesma descrição
- As categorias aceitas são { comportamento | evento | aparência | alimentação }
- Todos os campos são obrigatórios

### Avaliação

- No mínimo 1
- No máximo 5
- No caso de curiosidades, o usuário apenas tem ou não tem uma curiosidade

### Pesquisas

- Limitar resultado da pesquisa em 10 registros

## Endpoints

### Usuários

- GET `/usuarios` (listar)
- GET `/usuarios/{id}` (pesquisar)
- POST `/usuarios` (cadastrar)
- PUT `/usuarios/{id}` (editar)
- DELETE `/usuarios/{id}` (deletar)

#### Usuários por Preferências

- GET `/usuarios/musicas/{id-musica}`
- GET `/usuarios/filmes/{id-filme}`
- GET `/usuarios/series/{id-serie}`
- GET `/usuarios/jogos/{id-jogo}`
- GET `/usuarios/esportes/{id-esporte}`
- GET `/usuarios/curiosidades/{id-curiosidade}`

### Músicas

- GET `/musicas` (listar)
- GET `/musicas/{id}` (pesquisar)
- POST `/musicas` (cadastrar)
- PUT `/musicas/{id}` (editar)
- DELETE `/musicas/{id}` (deletar)

### Filmes

- GET `/filmes` (listar)
- GET `/filmes/{id}` (pesquisar)
- POST `/filmes` (cadastrar)
- PUT `/filmes/{id}` (editar)
- DELETE `/filmes/{id}` (deletar)

### Séries

- GET `/series` (listar)
- GET `/series/{id}` (pesquisar)
- POST `/series` (cadastrar)
- PUT `/series/{id}` (editar)
- DELETE `/series/{id}` (deletar)

### Jogos

- GET `/jogos` (listar)
- GET `/jogos/{id}` (pesquisar)
- POST `/jogos` (cadastrar)
- PUT `/jogos/{id}` (editar)
- DELETE `/jogos/{id}` (deletar)

### Esportes

- GET `/esportes` (listar)
- GET `/esportes/{id}` (pesquisar)
- POST `/esportes` (cadastrar)
- PUT `/esportes/{id}` (editar)
- DELETE `/esportes/{id}` (deletar)

### Curiosidades

- GET `/curiosidades` (listar)
- GET `/curiosidades/{id}` (pesquisar)
- POST `/curiosidades` (cadastrar)
- PUT `/curiosidades/{id}` (editar)
- DELETE `/curiosidades/{id}` (deletar)

### Match

- POST `/matches/{id-avaliado}/avaliador/{id-avaliador}/like` (like)
- POST `/matches/{id-avaliado}/avaliador/{id-avaliador}/dislike` (dislike)
- DELETE `/matches/{id-avaliado}/avaliador/{id-avaliador}/like` (desfazer like)
- DELETE `/matches/{id-avaliado}/avaliador/{id-avaliador}/dislike` (desfazer dislike)
- GET `/matches/{id}` (listar matches)
- GET `/matches/{id}/best` (mais características em comum)
