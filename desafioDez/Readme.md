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