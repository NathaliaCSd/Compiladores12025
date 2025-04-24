# Compiladores12025
Repositório da matéria de Construção de Compiladores com o professor Daniel Lucredio na UFSCar de São Carlos
Nathalia Cristina Santos 795698
Guilherme Silva Castro 769763

Esse repositória implementa um analisador léxico capaz se interpretar a linguagem LA, desenvolvida pelo professor Jander.

Para que o projeto funcione é necessario:
Java instalado
Maven instalado (para compilar o projeto)
ANTLR instalado

No projeto as depencias ja estão definidas no arquivo pom.xml

Para a compilação correta do analisador da linguagem é necessario colocar o codigo a ser trabalhado no arquivo programa.txt, localizado em 'Compiladores12025\programa.txt', e sua saída será encontrada em 'Compiladores12025\saida.txt'
(importante colocar o código antes da compilação)

O comando para compilar o projeto é mvn package no caminho 'Compiladores12025\T1\t1' 

E para rodar o executavel jar gerado o comando é:
java -jar "\Compiladores12025\T1\t1\target\t1Jander-1.0-SNAPSHOT-jar-with-dependencies.jar" "\Compiladores12025\programa.txt" "\Compiladores12025\saida.txt".

Sendo primeiro o caminho pro executavel, depois o primeiro argumento do código(a entrada) e o segundo argumento o caminho para o arquivo de saída.
