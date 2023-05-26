# DSLIST - Consulta de jogos

## Sobre o projeto
DSList é uma API Rest, no qual é capaz de realizar consulta de jogos de um banco de dados.

<br />

Toda a estrutura backend foi construída durante o **Intensivão JAVA SPRING**, evento organizado pela escola [DevSuperior](https://devsuperior.com "Site da DevSuperior").

<br />  

## Tecnologias e Frameworks
- Java
- Spring Boot
- JPA / Hibernate
- Maven (Gerenciador de dependências)
- Postman: Testador de requisições
- Perfil de teste: Banco de dados e banco H2 inserido nas dependências do projeto
- Perfil de Dev: Consulta ao banco de dados local. Obs.: Utilizado banco de dados postgres atraves de container (docker-compose)
- Perfil de Produção: Perfil configurado. Não realizado deploy até o momento.

<br />  

## Exemplo de Utilização
<br />

### Esta API pode ser usada para atender uma consulta de jogos ao qual está dividida em listas ou coleções
![colecao](https://github.com/leoabrantes/dslist/blob/main/img/colecao.jpg)
<br />
<br />

### Ao requisitar a lista especificada, o backend trabalha para que a API envie as informações via JSON
![plataforma](https://github.com/leoabrantes/dslist/blob/main/img/plataforma.jpg)
<br />
<br />

## Estruturação e código
### O projeto foi construido respeitando o sistema de padrão camadas: Controller, Service e repository
![estrutura](https://github.com/leoabrantes/dslist/blob/main/img/estrutura.jpg)
<br />
<br />

### Teste de requisições via postman
![getall](https://github.com/leoabrantes/dslist/blob/main/img/getall.jpg)
<br />
<br />


## O sistem possui um recurso adicional de movimentação do jogo pelo usuário
![movimentacao](https://github.com/leoabrantes/dslist/blob/main/img/movimentacao.jpg)
<br />
### Teste de posição através do postman
![postman](https://github.com/leoabrantes/dslist/blob/main/img/postman.jpg)
<br />
<br />

### Seed do banco de dados para teste no banco H2
![seeding](https://github.com/leoabrantes/dslist/blob/main/img/seeding.jpg)
<br />
<br />

## Modelo de domínio
- Classe de associação "Belonging", utilizada para realizar o relacionamento entre as classes Game e Game List 
<br />

![uml](https://github.com/leoabrantes/dslist/blob/main/img/uml.jpg)

<br />

### Tabela de relacionamento do belonging através do banco de dados local postgres/pgadmin (via docker)
![pgadmin](https://github.com/leoabrantes/dslist/blob/main/img/pgadmin.jpg)
<br />
<br />

### Melhorias futuras da API
-  Realizar deploy na nuvem
-  Aumentar a gama de requisições (CRUD completo)
-  Implementar autorizações
<br />
<br />

## Instalação / Execução
1. Necessário possuir o ambiente JDK/JVM instalado
2. Necessário SpringBoot ou alguma IDE capaz de rodar projetos maven
3. Git clone https://github.com/leoabrantes/dslist.git

<br />
<br />

# Autor

Leonardo Abrantes
https://www.linkedin.com/in/leoabrantesmelo

