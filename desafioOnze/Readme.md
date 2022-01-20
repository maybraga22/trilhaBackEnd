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
