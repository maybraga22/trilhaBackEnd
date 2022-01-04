# DESAFIO 1 - GIT

## A) Com suas palavras defina o que é um sistema de controle de versões (VCS)?
É o gerenciamento das versões que a gente faz dentro de um projeto, o controle de versões trata como você vai gerenciar as versões, modificações ou alterações que vão acontecendo durante o projeto. Um VCS é um software que se encarrega de gerenciar as mudanças nos arquivos físicos, mas não somente códigos fonte, também imagens e documentos. Enfim gerenciar mudança significa avisar se teve alterações, por exemplo quem fez, quando fez.

## B) Cite 5 vantagens em utilizar um VCS:
* VERSIONAMENTO: criar várias versões do mesmo arquivo, e caso quiser voltar a versão anterior é de forma simples, porque o você pode criar versões conforme for trabalhando na aplicação;

* SEGURANÇA: pois apenas pessoas autorizadas podem ter acesso ao código fonte, colaborar na recuperação de arquivos em caso de problema em uma máquina especifica e também é possível testar atualizações sem prejudicar a base principal;

* ORGANIZAÇÃO: os sistemas que tem interface visual oferecem a visualização total de cada arquivo controlado, a partir da criação até a atualidade;

* RASTREABILIDADE: você consegue identificar as alterações no arquivo: como, quem, quando e porque realizou a alteração;

* COLABORAÇÃO: trabalho em equipe, é possível que várias pessoas de diferentes lugares colaborem no mesmo projeto;

## C) Cite 3 exemplos de VCS:
* LOCAIS: primeiros `VCS` criados, armazenamento local em um único computador. Ex: `SCCS - Source Code Central System`;

* CENTRALIZADAS: armazenamento em servidor
 acessado por clientes, necessita de conexão de rede constante. Ex: `CVS - Concurrent Version System`;

* DISTRIBUIDOS: Cada cliente possui uma cópia do repositório e histórico de alterações, não necessita de conexão de rede permanente. Ex: `GIT`;

## D) Crie um repositório no seu git pessoal "trilhaBackEnd" e utilize para entrega de todos os desafios. 

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 2 - POO

## a) Com suas palavras defina o que é programação orientada a objetos (POO) e cite seus pilares? (máx 10 linhas)  
Programação Orientada a Objetos é um paradigma de desenvolvimento usado massivamente na maioria dos sistemas atuais, suportada por varias linguguagens, e que bate de frence com o paradigma prossidural chamado também de estruturado. Esta presente nas fases de analise, levantamento e projetos. motivação do POO é representar cada elemento do mundo real para um objeto. 

## b) Exemplifique e explique um cenário de abstração; 
É representar o objeto de uma forma abstrata, que seja obrigatoriamente herdado por outras classes. voce pode criar uma classe abstratata com atributos e metodos mas a implementação precisa ser feita nas classes filhas.

## c) Exemplifique e explique um cenário de encapsulamento;
É somente a capacidade de esconder detalhes da implementação do objeto, mostrando apenas o que pode ser acessado publicamente, assim podendo programar com segurança.

## d) Exemplifique e explique um cenário de herança;
É a capacidade de um objeto ser idealizado baseado em outro objeto, ou seja, se no seu objeto pai tem propridades e metodos, podem ser extendidos aos objeto filho. 

## e) Exemplifique e explique um cenário de polimorfismo;
É a caopacidade de um objeto que seja compativeis se passar por outro, em determinada circustancia. Depois que um objeto é herdado mesmo trazendo as carateristicas de um objeto pai, uma ou mais caracteristicas precisam ser reescritas. 

## f) Cite 5 vantagens da POO;
* Os programas são mais faceis de modificar;
* Elimina o Código desnecessario;
* Facilita a reutilização de objetos em outros programas;
* Mais faceis de ler e entender;
* Melhor representação do mundo real; 

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 3 - CONTROLLER

## a) Com suas palavras defina: (máx 5 linhas)
## I. O que é o protocolo de comunicação HTTP e como ele funciona;
Hypertext Transfer Protocol é o protocolo principal de cominucação de computadores utilizados na internet, é um protocolo na camada de aplicação.
a comunicação é Resquest e Response, comunicando a o navegador com o servidor, que devolve o conteudo em html, pou seja o site que voce deseja acessar.

## II. O que é REST, e qual é a sua relação com o protocolo HTTP;   
Representational State Transfer é um estilo de arquitetura para desenvolvimento de web services que define como as camadas back-end e front-end irão se comunicar, esta ligado ao desenvolvimento de aplicações web que fazem comunicação através do protocolo HTTP.

## III. O que é Web API, e qual é a sua relação com REST;
Application Programming Interface é a interface entre aplicativo e programação, é a interface idedal para que um sistema se comunique com outro sistema. API REST é uma api utilizando o protocolo HTTP, são api melhores e padronizadas.

## b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades;
GET: usado para que oservido encie um recurso;
POST: Envia dados de entrada para o servidor;
PUT: edita e atualiza documentos em um servidor;
DELETE: deleta dado expecifico ou coelçao do servidor;

## i) O que é Swagger? (máx 5 linhas)
É uma framework que facilita o design de APIs, possue diversas ferramentas que auxiliam o comsumo e a visulaização de serviços da API Rest, independente da linguagem de programação.

**Done! 😊**

---------------------------------------------------------------------------------------------------------


# DESAFIO 4 - REPOSITORY

## a) Com suas palavras conceitue: (máx 5 linhas/cada)     
## I. O que é JDBC?    
A JDBC é uma API do Java que possibilita que uma aplicação consiga acessar um banco de dados configurado local ou remotamente. É composta pelos pacotes java.sql e javax.sql, as pessoas podem desenvolver softwares que acessem qualquer fonte de dados, por meio das classes e interfaces fornecidas por esses dois pacotes

## II. O que é ORM, cite 3 exemplos?   
ORM mapeamento objeto-relacional, é uma técnica para aproximar o paradigma de desenvolvimento de aplicações orientadas a objetos ao paradigma do banco de dados relacional.
* Java – Hibernate, EclipseLink, ActiveJPA;
* C# - Entity Framework, Nhibernate;
* Kotlin – Exposed;

 
## III. O que é JPA e qual é a sua relação com os ORM’s?     
JPA é um framework leve, baseado em POJOS (Plain Old Java Objects) para persistir objetos Java, oferece diversas funcionalidades essenciais em qualquer aplicação corporativa. É um framework para ORM (mapeamento objeto-relacional) .

## IV. O que é Spring Data?
O Spring Data é um conjunto de projetos do Spring para a manipulação de dados de diversas formas, entre elas em bancos de dados relacionais e em bancos de dados NoSQL.

## d) O que caracteriza um projeto “CRUD básico”? (máx 10 linhas);
CRUD é a sigla para as quatro operações básicas utilizadas em bases de dados relacionais
* Create (criar) - criar um novo registro;
* Read (ler) - ler (exibir) as informações de um registro;
* Update (atualizar) - atualizar os dados do registro;
* Delete (apagar) - apagar um registro;

**Done! 😊**