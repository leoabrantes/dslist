# DSLIST - Consulta de jogos

## Sobre o projeto
DSList é uma API Rest, que responde requisições via Jason e é capaz de realizar consulta de jogos de um banco de dados.

<br />

Obs.: Toda a estrutura backend foi construída durante o **Intensivão JAVA SPRING**, evento organizado pela escola [DevSuperior](https://devsuperior.com "Site da DevSuperior").

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

Esta API pode ser usada para atender uma consulta de jogos ao qual está dividida em listas ou coleções.
Abaixo, temos um modelo front end, ao qual este projeto pode ser aplicado:
<br />
<br />

![plataforma](https://github.com/leoabrantes/dslist/blob/main/img/plataforma.jpg)

<br />
<br />

Obs.: Depois de receber a requisição da lista especificada, o backend trabalha para que a API envie as informações via JSON.
<br />
Até momento é possível realizar as seguintes requisições:
<br />
<br />
          - COMANDO GET: 
               Obter dados dos jogos, busca por id e busca por listas
<br />
<br />
          - COMANDO POST: 
               Realocação de posição dos jogos
<br />
<br />

![getall](https://github.com/leoabrantes/dslist/blob/main/img/getall.jpg)
<br />
Obs.: Os testes de requisições foram aplicado via Postman
<br />
<br />


## Estruturação e código
### O projeto foi construido respeitando o sistema de padrão camadas: Controller, Service e repository
![estrutura](https://github.com/leoabrantes/dslist/blob/main/img/estrutura.jpg)
<br />
<br />



## Recursos adicionais
- O sistema possui um recurso adicional de movimentação do jogo pelo usuário
![movimentacao](https://github.com/leoabrantes/dslist/blob/main/img/movimentacao.jpg)
<br />

- O recurso de troca de posição foi testado via Postman:

![postman](https://github.com/leoabrantes/dslist/blob/main/img/postman.jpg)
<br />
<br />

## Perfis de Testes
Para testar as requisições do projeto foram criados 3 perfis de projeto:

1) Perfil de teste
- Inseridos informações ao banco H2 local apenas para testes iniciais
![seeding](https://github.com/leoabrantes/dslist/blob/main/img/seeding.jpg)
<br />
<br />

2) Perfil de dev
- Utilização do banco de dados postgres via Docker
- ![docker](https://github.com/leoabrantes/dslist/blob/main/img/dockerpgadmin.jpg)
<br />
<br />
   
3) Perfil de produção
   Implementação do deploy na nuvem, em fase de implementação.
   
## Modelo de domínio
- Classe de associação "Belonging", utilizada para realizar o relacionamento entre as classes Game e Game List 
<br />

![uml](https://github.com/leoabrantes/dslist/blob/main/img/uml.jpg)

<br />

Tabela de relacionamento do belonging através do banco de dados local postgres/pgadmin (via docker)
![pgadmin](https://github.com/leoabrantes/dslist/blob/main/img/pgadmin.jpg)

<br />
<br />


## Instalação / Execução
1. Necessário possuir o ambiente JDK/JVM instalado
2. Necessário SpringBoot ou alguma IDE capaz de rodar projetos maven
3. Git clone https://github.com/leoabrantes/dslist.git

<br />
<br />


## Melhorias futuras da API
-  Efetuar o perfil de produção e realizar deploy na nuvem
-  Aumentar a gama de requisições (CRUD completo)
-  Implementar autorizações de acesso e login
<br />
<br />


# Autor

Leonardo Abrantes
https://www.linkedin.com/in/leoabrantesmelo

