# sigt-ine-api

## Itens solicitados no teste:

- Implementar Teste Unitários: ver o diretório `test`.
- Efetuar persistência de logs de acesso e requests: fazer requisições no endpoint `user` e consultar os logs no endpoint `logging/all`. Orientações para teste ver a seção **Testando a aplicação**

## Decisões técnicas que tomei no projeto

#### Uso do DB H2 o invés do Oracle
Estava tendo dificuldades com a instalação do Oracle e do driver jdbc.
Optei por usar o H2 em memória para agilizar o desenvolvimento. Dessa forma toda a aplicação está usando o H2 Database.

#### Criação da API de usuário e log

Uma API para operações de CRUD, endpoint `user`, deixa a aplicação mais robusta para implementar testes e fazer a persistência dos logs. Também tem o endpoint `logging` que retorna os logs da aplicação.

#### Reestruturação do uso do Docker

Quis simplificar o uso do Docker e automatizar todo o processo de build utilizando o mult-stage build. Removi a pasta docker do projeto e criei um `Dockerfile` nas raiz do projeto.

Dentro do Docker está sendo usada a configurações de dev. Não fiz modificações nisso.

## Makefile

Um conjunto de comandos está disponível no arquivo Makefile. Esses comandos facilitam a execução do projeto.

## Testando a aplicação

Nesta seção está descrito como é possível testar a aplicação , principalmente à consulta de logs.

Antes executar os comandos **curl** rode o comando `make docker-run` para subir a API.

> Documentação da API pode ser acessa em http://127.0.0.1:8081/swagger-ui.html

Assim que a aplicação subir os comandos **curl** abaixo podem ser executados.

Health da API
```
curl -i -X GET \
 'http://127.0.0.1:8081/'
```

Obtendo o token para usar nas requisições
```
curl -i -X POST \
   -H "Content-Type:application/json" \
   -d \
'{
  "password" : "1234",
  "username" : "tistech"
}' \
 'http://127.0.0.1:8081/authentication'
```

### Comandos curl para chamar os endpoint.

> É necesário obter o token de autenticação

Cadastrar um novo usuário.

```
curl -i -X POST \
   -H "<token>" \
   -H "Content-Type:application/json" \
   -d \
'{
  "name": "Bill Steave" 
}' \
 'http://127.0.0.1:8081/user'
```

Obter todos os usuários.

```
curl -i -X GET \
 -H "<token>" \
 'http://127.0.0.1:8081/user'
```

Atualizar um usuário.

```
curl -i -X PUT \
   -H "<token>" \
   -H "Content-Type:application/json" \
   -d \
'{
  "name": "Emily Charlotte" 
}' \
 'http://127.0.0.1:8081/user/1'
```

Obter um usuário pelo seu código.

```
curl -i -X GET \
 -H "<token>" \
 'http://127.0.0.1:8081/user/1'
```

Deletar um usuário

```
curl -i -X DELETE \
 -H "<token>" \
 'http://127.0.0.1:8081/user/1'
```

Consulta de logs

```
curl -i -X GET \
 -H "<token>" \
 'http://127.0.0.1:8081/logging/all'
```


