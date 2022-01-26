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

---------------------------------------------------------------------------------------------------------

# DESAFIO 5 - SERVICE

## a)  Defina  com  suas  palavras  qual  é  a  responsabilidade  das  camadas  vistas  até  agora, entity, controller, repository e service. (máx 10 linhas)
* ENTITY - representa o conjunto de informações sobre determinado conceito do sistema, possuem atributos que são as informações que refenciam a entidade;
* CONTROLLER - faz a ligação da view com as outras partes dos sistema;
* REPOSITORY -  é responsável por obter dados do banco de dados;
* SERVICE - é responsavel pelas regras de negócio;

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 6 - DTO

## a) O que significa DTO, e qual sua importância? (máx 10 linhas)

DTO Data Transfer Object é um padrão de projetos bastante usado em Java para o transporte de dados entre diferentes componentes de um sistema.
A ideia consiste basicamente em agrupar um conjunto de atributos numa classe simples de forma a otimizar a comunicação.
Numa chamada remota, seria ineficiente passar cada atributo individualmente. Da mesma forma seria ineficiente ou até causaria erros passar uma entidade mais complexa. Além disso, muitas vezes os dados usados na comunicação não refletem exatamente os atributos do seu modelo. Então, um DTO seria uma classe que provê exatamente aquilo que é necessário para um determinado processo.

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 7 - TRATAMENTO DE DADOS

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 8 - TRATAMENTO DE EXCEPTIONS

## a) O que são exceptions? (máx 5 linhas)
asicamente falando uma exception é uma ocorrência anormal que afecta o funcionamento da aplicação, qualquer condição de erro ou funcionamento inesperado que encontrado por um programa em execução.

## b) Qual é o funcionamento do try, catch e finally? (máx 10 linhas)
Um bloco try é chamado de bloco protegido porque, caso ocorra algum problema com os comandos dentro do bloco, a execução desviará para os blocos catch correspondentes.O bloco catch possuei comandos especificam o que fazer csao uma exceção seja lançado no bloco try. O bloco finally inclui comandos que liberam recursos que eventualmente possam ter sido alocados durante o processamento do bloco try e que podem ser liberad, a presença desse bloco é opcional.

## c) Qual a relação entre “try, catch e finally” e “throws”? (máx 5 linhas)
Assim como o try, ctach e finnally, o throw também é para tratamento de exceções. Throw serve para lançar uma exceção.

## d) Para que serve a annotation @ExceptionHandler? (máx 5 linhas)
Uma alternativa à interface é a anotação. Você usa a anotação do método dentro de um controlador para especificar qual método é invocado quando uma exceção de um tipo específico é lançada durante a execução dos métodos do controlador.

## e) Para que serve o comando throw? (máx 5 linhas)
Throw serve para lançar uma exceção, usamos quando queremos que a exceção não seja tratada na propria classe, mas sim em outro método. 

## f) Para que serve a annotation @ControllerAdvice? (máx 10 linhas)
Intercepta todos os controladores e procura as exceções lançadas, @ControllerAdvice é muito útil para lidar com exceções quando você tem vários controladores de API REST fazendo muitos trabalhos diferentes.

## VII. Realize novos testes, verifique o resultado final e escreva sua própria conclusão sobre exceptions;
Os excepcios são muitos importante na aplicação pois são responsáveis por capturar dados incorretos inseridos pelo cliente, dentro da regra de negocio os excpecions são muito importantes para: segurança e organização. 

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 9 - ARQUITETURA

## a) O que é um padrão de projeto e por que nós os utilizamos? (máx 5 linhas)
Padrões de projeto são soluções típicas para problemas comuns em projeto de software. A maioria dos padrões são descritos formalmente para que as pessoas possam reproduzi-los em diferentes contextos. O Propósito do padrão descreve brevemente o problema e a solução.vAs Estruturas de classes mostram cada parte do padrão e como se relacionam.Exemplos de código em uma das linguagens de programação populares tornam mais fácil compreender a ideia por trás do padrão.

## b) Cite e explique com suas palavras:
## I. Um dos padrões de criação;
BUILDER - esse padrão oculta as particulariedades de como os componentes são desenvoldivos, caracterizado e integrado. Ele oferece uma interface genérica para a construção incremental de agregações. 

## II. Um dos padrões estruturais;
BRIDGE - Esse padrão separa uma abstração de sua implementação, permitindo que as duas possam variar independente, sendo criada uma ponte entre elas.

## III. Um dos padrões comportamentais;
STATE - Possibilita que um objeto modifique seu comportamento quando seu estado interno é alterado, sendo mudado a classe do objeto.

## c) Explique o conceito de arquitetura de software e seu proposito; (máx 5 linhas) 
É a área que trabalha com as estratégias de um projeto de desenvolvimento de um sistema. Ela define os componentes computacionais, a relação entre estes componentes, os padrões arquiteturais que os guiam e suas restrições. As decisões sobre a estrutura do projeto são atribuições da arquitetura de software para o pleno funcionamento de cada etapa. Assim, diminuem-se os riscos e otimiza o trabalho para os demais profissionais, trazendo um resultado final mais assertivo.

## g) O que significa a sigla SOLID?
SOLID é um acronimo de cinco principios, esses princípios ajudam o programador a escrever códigos mais limpos, separando responsabilidades, diminuindo acoplamentos, facilitando na refatoração e estimulando o reaproveitamento do código.
S — Princípio da responsabilidade única;
O — Princípio Aberto-Fechado;
L — Princípio da substituição de Liskov;
I — Princípio da Segregação da Interface;
D — Princípio da inversão da dependência;

## h) Quais princípios foram utilizados no projeto até o momento? Explique.(máx 10 linhas)
Até o momento utilizamos o principio de responsabilidade única pois cada camada possui sua respondabilidade: 
controllers, entities, repositores, services, etc.

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 10 - SPRING

## a) O que você entende por Spring Framework?
O Sprong foi criado com o objetivo de facilitar o desenvolvimento de aplicações, nos fornecendo os recursos necessários à grande parte das aplicações, como módulos para persistência de dados, integração, segurança, testes, desenvolvimento web.

## b) Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades;
* SPRING BOOT - oferecer dependecias opinativas para simplificar configuração de complilação; 
* SPRING DATA - facilitar o acesso aos dados;
* SPRING SECURITY - gerenciar autenticação e autorizações;

## c) Quais ferramentas do Spring foram utilizadas na trilha até o momento? 
Spring Web, Spring Data, Spring MVC.

## d) Cite 5 vantagens em utilizar Spring;
* 1 — Agilidade para desenvolvimento; 
* 2 — Aumento de produtividade
* 3 - Otimização de tempo;
* 4 - Facilidade de manutenção
* 5 - Implementalão com menos código;

## e) Descreva os passos de criação de uma Web API Spring boot, com conexão com SQL Server;
Acessar o site Spring Initializr, adicionar as dependencias: Spring Web, MS SQL Server Driver, então criar o projeto, baixar e abrir na sua IDE de preferencia para iniciar a criação.

## f) Qual a funcionalidade do pom.xml?
O pom.xml é onde ficam as dependencias e configurações, sendo uns dos arquivos mais importantes do projeto.

## g) Qual a funcionalidades do applications.properties?
O applications.properties são onde ficam as imformações importantes dos projeto, por exemplo as configurações de conexão com bando de dados.

## h) Qual o propósito das Annotations?
As Annototions nos permitem acrescentar informações complementares, fornecendo dados sobre um programa que não faz parte do programa em si.

## i) Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização;
* @Configuration - indica que determinada classe possui métodos que expõe novos beans;
* @Controller - Associada com classes que possuem métodos que processam requests numa aplicação web;
* @Repository - Associada com classes que isolam o acesso aos dados da sua aplicação;
* @Service - Associada com classes que representam a ideia do Service do Domain Driven Design;
* @Component - A annotation básica que indica que uma classe vai ser gerenciada pelo container do Spring;
* @Bean - utilizada em cima dos métodos de uma classe, indicando que o Spring deve invocar aquele método e gerenciar o objeto retornado por ele;
* @Autowired - utilizada para marcar o ponto de injeção na sua classe;
* @RequestMapping - Serve para você colocar os endereços da sua aplicação que, quando acessados por algum cliente, deverão ser direcionados para o determinado método;
* @ResponseBody - Indicar que o retorno do método deve ser automaticamente escrito na resposta para o cliente;
* @Primary - Indica qual é a opção padrão de injeção;

## j) O que é um advice em Spring? Quais os tipos de advice para o Spring?
É a ação executada pelo aspecto em um join point particular. Esta ação pode executar antes, após ou mesmo envolver o join point para decidir se o mesmo deve realmente ser executado;
* Before: executa antes do join point, mas não tem o poder de evitar que o join point execute;
* After returning: Advice que executa após o join point apenas se este terminar de forma bem sucedida;
* After throwing: Advice que executa após o join point quando ele finaliza enviando uma exceção;
* After (finally): Advice que executa após o join point independentemente de sua forma de retorno;
* Around: Advice que envolve a execução de um join point. Pode realizar ações antes e após a execução do join point;

## k) O que é Spring IoC Container?
É uma injeção de dependecia do Srping, responsável  por criar os objetos, conectar e configurar.

## l) Como adicionamos segurança à nossa aplicação Spring?
Instalando um framework do projeto Spring que possui um sistema de autenticação e autorização de alto nível e altamente customizável para aplicações Java, que é o o Spring Security.
                                                                            
## m) Qual é o pacote Spring responsável pelas conexões com os bancos de dados?
O pacote responsável pelas conexões é o Spring data;

## n) Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade
Podemos criar um agendamento de execução usando a annotatios @Scheduled, para isso temos que adicionar a classe em a annotation @Componet e informar ao spring que queremos habilitar o agendamento para ela por meio da annotation @EnableScheduling. Pode ser usado se o cliente pedir um relatório final sobre as vendas do dia. 

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 11 - LIBS/DRIVERS
 
## a) O que são libs quando se trata de código? (máx 3 linhas)
Lib é um conjunto de funcionalidades que podem ser reaproveitadas pelos seus projetos, assim poupandoo tempo que seria gasto em configurações.

## b) Cite 2 libs populares no Java e seu objetivo; (máx 3 linhas)
* Jackson - é um conjunto de bibliotecas de processamento de dados para Java, Jackson JSON é a biblioteca de gerador / analisador JSON de streaming de fato. 
* JAXB - oferece tudo que você precisa para trabalhar com XML em Java, ele fornece uma maneira padrão e eficiente de mapeamento entre o código XML e Java. 
 
## c) Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo pom.xml? (máx 5 linhas)
Maven é uma ferramenta de automação e gerenciamento de projetos, as funções são adicionadas atraves de plugins, o pom.xml é o arquivo que contém todas as configurações que o mavem precisa para interagir corretamente com o prjeto.
 
## d) Qual é a diferença do Maven para o Grandle? (máx 3 linhas)
O maven é uma ferramenta de gerenciamento e compreensão de projetos de software que gerencia projetos, relatórios e documentos, enquanto o gradle é uma ferramenta de automação de desenvolvimento de código aberto com foco em flexibilidade e desempenho.
 
## e) Com os conhecimentos adquiridos até o agora, realize uma conexão com o desafio 3 onde falamos sobre JDBC, os drivers de comunicação com os bancos de dados. 
## I. Qual a relação entre os termos lib, driver e JDBC?  
JDBC é a API que contém as classem que emglobam os drivers para realizar a conexão banco de dados.

## II. Como é adicionado uma lib no projeto?   
Usando um gerenciador de projetos do mavem ou aytravés do import.

## III.  Escolha  um  banco  de  dados  (menos  o  H2)  e  explique  como  utilizar  o  driver  de  comunicação.
Para usar o MySQL primeiro deve ser feita a configuração através do pom.xml e depois para estabelecer a conexão e as configurações do banco é utilizado o application.properties.

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 12 - TESTES

## a) Explique o conceito de teste unitário?
Um teste de unidade basicamente é o menor componente testável de um software, podendo ser esse componente uma função, procedimento, método, classe, objeto.. Garantindo que sua aplicação continue funcionando após alguma alteração em sua base de código.

## b) Descreva como fazer um código de teste.
Criar uma classe de testes, nessa classe voce passa os valores a aserem testado e as exceções que ele espera quando o codigo for executad, essa classe tera as anotações escolhidas @Mock, e também inserimos a anotação @Test em cima de cada método de teste.

## c) Qual o intuito do teste unitário?
Validar que cada unidade de trabalho se comporta como projetada, esperada ou pretendida, fornecendo feedback quase instantâneo sobre o projeto e a implementação de seu código.

## d)  Quais  são  as  ferramentas  que  utilizamos  para  realizar  testes  unitários(2  pelo  menos).
JUnit e Mockito.

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO 13 - INTEGRAÇÃO

## CONFIGURAÇÃO

![cConfiguracao](https://i.postimg.cc/xdfWW0xp/Imagem9.png)

``` 
C:\Users\mayro\OneDrive\Área de Trabalho\trilhaBackEnd\controle-financeiro>ng serve
Your global Angular CLI version (13.1.4) is greater than your local version (11.0.2). The local Angular CLI version is used.

To disable this warning use "ng config -g cli.warnings.versionMismatch false".
- Generating browser application bundles...(node:47852) [DEP0111] DeprecationWarning: Access to process.binding('http_parser') is deprecated.
(Use `node --trace-deprecation ...` to show where the warning was created)
√ Browser application bundle generation complete.

Initial Chunk Files                                                                | Names                                                                           |      Size
vendor.js                                                                          | vendor                                                                          |   3.08 MB
scripts.js                                                                         | scripts                                                                         | 667.48 kB
styles.css, styles.js                                                              | styles                                                                          | 559.40 kB
polyfills.js                                                                       | polyfills                                                                       | 467.41 kB
main.js                                                                            | main                                                                            |  15.52 kB
runtime.js                                                                         | runtime                                                                         |   9.27 kB

                                                                                   | Initial Total                                                                   |   4.76 MB

Lazy Chunk Files                                                                   | Names                                                                           |      Size
default~pages-categorias-categorias-module~pages-lancamentos-lancamentos-module.js | default~pages-categorias-categorias-module~pages-lancamentos-lancamentos-module |   1.29 MB
pages-lancamentos-lancamentos-module.js                                            | pages-lancamentos-lancamentos-module                                            | 125.25 kB
pages-categorias-categorias-module.js                                              | pages-categorias-categorias-module                                              |  32.78 kB

Build at: 2022-01-25T16:26:11.637Z - Hash: 51ea015210025736ad1c - Time: 19668ms

Warning: C:\Users\mayro\OneDrive\Área de Trabalho\trilhaBackEnd\controle-financeiro\src\app\pages\lancamentos\lancamento-list\lancamento-list.component.ts depends on 'currency-formatter'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies



** Angular Live Development Server is listening on localhost:4200, open your browser on http://localhost:4200/ **


√ Compiled successfully. 
```

## APLICAÇÃO

### Listar:
![Entry](https://i.postimg.cc/1Xr0hZYM/Imagem1.png)
![Category](https://i.postimg.cc/bYx92QNb/Imagem2.png)

### Criar:
![Entry](https://i.postimg.cc/s2bb1pfq/Imagem5.png)
![Category](https://i.postimg.cc/R0wNbLYL/Imagem3.png)

### Editar:
![Entry](https://i.postimg.cc/jjy4QNQG/Imagem6.png)
![Category](https://i.postimg.cc/d14QzHjr/Imagem4.png)

### Deletar:
![Entry](https://i.postimg.cc/6pr8MhgL/Imagem8.png)
![Category](https://i.postimg.cc/25xBSxx8/Imagem7.png)

**Done! 😊**

---------------------------------------------------------------------------------------------------------

# DESAFIO FINAL

## a) Desafio 1 - Git:
### I. Dê 2 exemplos de situações onde é necessário utilizar merge:
Quando queremos juntas os commits da branch com a main e também quando voce esta desenvolvento em equipe e precisa fazer a fusão das branches.

### II. Com qual objetivo realizamos o commit?III. Qual a diferença entre:     
* git add -all : coloca todos os arquivos no index/stage;    
* git add  -u : coloca em stage apenas arquivos modificados e removidos;
* git add -A : coloca em stage as mudanças no diretorio local;
* git add . : coloca em stage todos os arquivosa novos ou modificados;

### IV.  Qual  é  a  ordem  dos  comandos  para  subir  novas  atualizações,  verificando  se existem alterações a serem recebidas?
git init > git status > git add . > git status > git commit -m "nome do commit" > git push -u origin main

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 1? Se não, justifique;
Sim.

## b) Desafio 2 - POO e Entity:
### I. Qual é a finalidade da camada Entity?
A finalidade da camada Entity é onde são criadas as classes com as caracteristicas dos objetos.

### II. Para você, por que acha que seguimos a programação orientada a objetos?
Porque a POO propõe uma representação mais facil de ser compreendida, a leitura, manutenção e também a reutilização de código.. Além das camadas que tornam a palicação mais segura.

### III. Qual é o ideal por trás de utilizar os métodos getters e setters?
os getters retornam um valor e os setters atribuem um valor, nos ajudando a encapsular e proteger as propriedades, facilitando o trabalho com o objeto.

### IV. Qual o propósito de um construtor em uma classe? Podemos criar uma classe sem construtor?
Os construtores são funções de iniciarmos uma classe, criando o objeto em memória. Os construtores são obrigatorios, caso não seja criado um construtor é criado um construtor vazio.

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 2? Se não, justifique;
Sim.

## c) Desafio 3 - HTTP, REST e Controller:
### I. Qual é o objetivo da camada Controller?
A controller é a camada responsável por fazer a ponte entre as regras de negócio e front-end, facilitando a manutenção da aplicação.

### II. No que os padrões REST nos auxiliam?
Determinar como deve ser realizada a Transferência de Estado Representacional, essa transmissão de estados se dá a partir da especificação de parâmetros que podem ser aplicados a web services.

### III. Quais métodos HTTP utilizamos para montar um CRUD?
Create, Read, Update e Delete.

### IV. Qual a diferença entre as annotations @PathVariable, @RequestParam, @RequestBody? E com quais métodos HTTP elas podem ser utilizadas respectivamente?
* @PathVariable: é utilizado quando o valor da variável é passada diretamente na URL, mas não como um parametro que você passa após o sinal de interrogação mas sim quando o valor faz parte da url.
* @RequestParam: faz o Spring mapear os parâmetros de requisição da requisição GET/POST para o seu argumento de método. 
* @RequestBody: faz com que o Spring mapeie a solicitação inteira para uma classe de modelo e, a partir dela, você pode recuperar ou definir valores de seus métodos getter e setter.

### V. Para que serve ResponseEntity?
usamos o ResponseEntity quandoprecisamos ter mais controle sobre a resposta HTTP em um endpoint.

### VI. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 3? Se não, justifique
Sim.

## d) Desafio 4 - JPA e Repository:
### I. Qual é o propósito da camada Repository?
É isolar os objetos do domínio do código que acessa o banco de dados, ele abstrai armazenamento e consulta de um ou mais entidades de domínio.

### II. De maneira prática como funciona a injeção do Repository? E qual a sua relação com @Autowired?
A injeção do repository funciona coma anotação @Autowired que conecta a classe a ser injetada.

### III. Quais são as facilidades em utilizar JPA?
* Indepêndencia, consultas de objetos, configuração simples, conversão de querys em objetos, cache de dados..

### IV. Quais são os passos para configurar um banco de dados em um projeto Spring?
Injetar as dependencias do banco de dados no maven do seu projeto e configurar a classe com login e senha do banco de dados no application.properties.

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 4? Se não, justifique;
Sim.

## e) Desafio 5 - Service:
### I. Qual é a finalidade da camada Service?
O a camada service é onde são desenvolvidas as regras de negócio, onde fica toda a lógica da aplicação.

### II. Qual o sentido de um método ter apenas um propósito?
Pois a classe deve ter uma única tarefa ou ação para executar.

### III. Qual a diferença entre um método void e métodos tipados?
Um método é void quando ele não tem nenhum retorno, um metodo tipado é quando ele ter um retorno ai voce precisa especificar o que le vai retornar.

### IV. É normal um serviço chamar outro?
Sim, os services podem interagirem com outros services.

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 5? Se não, justifique;
Sim.

## f) Desafio 6 - DTO:
### I. Quais problemas conseguimos resolver utilizando a camada DTO?
COm o DTO conseguimos apresnetar para os usuarios apenas o que queremos mostrar, conseguindo ocutar dados, assim reforçando a segurança.

### II.  Qual  a  diferença  de  realizarmos  o  “de  para”  utilizando  constructor  ou  getters  e  setters?
Os contrutores são iniciados quando a classe é instanciada, e os getter e setters são patra encapsular os dados.

### III. No que a utilização do Mapper nos auxilia? Achou fácil a implementação?
o modelmapper é um framework que realiza o mapeamento de modelos de forma simples, sim após aprender sobre o modelmapper foi facil a implementação.

### IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 6? Se não, justifique;
Sim.

## g) Desafio 7 - Manipulação de dados:
### I. Qual é a forma de validar os dados de uma requisição sem utilizar @Valid?
Uma das formas é criando um ENUM, onde serão aceitos apenas os valores atribuidos na classe.

### II. Para que serve um ENUM? Cite exemplos;
Enum serve para validar os valores constantes pré-definidos. 
Exemplo: public enum TypeEnum { REVENUE("revenue"), EXPENSE("expense");}

### III. Como criamos um custom validator? E qual o objetivo de criar um?
Injetar as dependencias configurações no maven do seu projeto, criar a anotação e a lógica, adicionar na classe que vai ser validada e adicionar o tratamento de exceções.   

### IV. Qual foi a diferença entre utilizar for e streams no desafio 6? 
O stream facilitou muito o desenvolvimento, e diminiu muito a quantidade de código, deixando mais limpo.

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 7? Se não, justifique;
Sim.

## h) Desafio 8 - Tratamento de exceptions:
### I. Qual a finalidade de trata-las?
Quando se cria a aplicação pode acontecerem erros imprevistos durante sua execução, permitindo capturar exceções e tratá-las sem interromper o fluxo normal de execução do programa.

### II. Como as descobrimos?
Quando ocorre um erro é exibida uma mensagem no console.

### III. Como fazemos para estourar um exception em uma determinada linha?
fazendo o throws new

### IV. Qual é a melhor forma de implementarmos nosso controle de exceções?
Criando uma classe para exceção central  para aapi com a anotação na classe com  @Controlleadvice

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 8? Se não, justifique;
Sim.

## i) Desafio 9 - Patterns, SOLID e Arquitetura:
### I. O que é Singleton Pattern?
Singleton especifica que apenas uma instância da classe pode existir, e esta será utilizada por toda a aplicação. Dessa forma temos mais controle sobre o acesso às propriedades e métodos de uma classe, e também reduzimos o consumo de memória desnecessário por utilizar várias instancias desnecessárias de uma classe.

### II. O que significa a letra D de SOLID e como se aplica na camada de Repository?
D — Princípio da inversão da dependência, os módulos de alto nível não devem depender de módulos de baixo nível, ambos devem depender da abstração. 

### III. Qual o objetivo das camadas?
Separar o código em camadas torna os aplicativos mais fáceis de entender, testar e manter.

### IV. Qual arquitetura é melhor DDD, Hexagonal ou Clean?
Todas as arquiteturas tem suas vantagens, mas a proposta da Arquitetura Hexagonal é uma pouco mais alto nível, pelas questões de arquitetura e segurança.

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 9? Se não, justifique;
Sim.

## j) Desafio 10 - Spring:
### I. Qual a diferença entre Java e Spring?
Java é uma linguagem de programação, enquanto Spring é uma estrutura de aplicativo de código aberto.

### II. É possível utilizar Spring Data sozinho?
Não, porque é preciso escolher com qual framework de persistencia ele vai se relacionar.

### III. É possível utilizar Spring Boot, Spring Data e Spring Security em apenas um projeto? Se sim, como é feito a integração? 
Sim, injetando as dependencias no maven do seu projeto e usuando as anotações nos metodos e nas classes.

### IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 10? Se não, justifique;
Sim.

## k) Desafio 11 - Libs:
### I. Cite 5 libs que utilizou durante a trilha e suas respectivas funcionalidades;
* ModelMapper - trans formação de código;
* Lombok - criação automatica de código;
* Swagger - auxilia a descrição, consumo e visualização de serviços;
* JUnit - Utilizado para testes;
* Mockito - é instanciar classes e controlar o comportamento dos métodos;

### II. Qual a diferença entre uma lib e um driver?
LIB é um conjunto de funcionalidades que podem ser reaproveitadas pelos seus projetos e o Driver nada mais é do que uma classe cuja funcionalidade precisa ser disponibilizada para a aplicação. 

### III. Existe limite de libs por projeto?
Não. 

### IV. Por que utilizar um gerenciador de dependências?
Para que as configurações do projeto fiquem em um ponto central.

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 11? Se não, justifique;
Sim.

## l) Desafio 12 - Testes unitários:
### I. Por que DEVOPS exige uma porcentagem de cobertura mínima nos projetos?
porque a metodologia devops compartilhar responsabilidade de segurança da aplicação, sendo assim a parte de desenvolvimentos e teste é imprescindível para a garantia de que o software esta em bom estado de funcionamento antes de subir a aplicação

### II. Qual o objetivo de utilizar Mockito? Dê um exemplo;
Seu principal objetivo é simular a instancia de classes e comportamento de métodos, simulando o método testado e suas dependências. 

### III. O que é o Sonar? E qual é o seu papel?
É uma plataforma de código aberto para inspeção contínua da qualidade do código, para executar revisões automáticas com análise estática do código para detectar bugs, odores de código e vulnerabilidades de segurança.

### IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 12? Se não, justifique;
Sim.

## m) Desafio 13 - Integração:
### I. Como foi o processo de integração?
O processo de integração foi tranquilo, seguindo todas as orientações, fazendo apenas alguns ajustes nos end-points.

### II. Quais foram as principais dificuldades?
Tive um pouco de dificuldade com as configurações do angular, mas foi resolvido. 

### III. Obteve algum erro de CORS?
Sim.

### IV. O que é CORS?
É um mecanismo que permite que recursos restritos em uma página da web sejam recuperados por outro domínio fora do domínio ao qual pertence o recurso que será recuperado.

### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 13? Se não, justifique;
Sim.