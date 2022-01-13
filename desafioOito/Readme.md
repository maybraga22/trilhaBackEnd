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