## Exercício Avaliativo I - Programação Orientada a Objetos

O objetivo do exercício é desenvolver um aplicativo que controlará os atletas 
e as medalhas de uma competição internacional.

Para melhor entendimento do contexto, o professor disponibilizou um arquivo com
informações sobre os requisitos do aplicativo e o diagrama de classes UML.

O funcionamento da aplicação funciona através da leitura e saída de dados por
arquivos de texto, disponibilizados pelo professor.

#

### Testes
Para testar o programa, foram feitos 3 tipos diferentes de testes. 

O 1° teste é de nível inicial, com poucas informações a serem processadas, mas
utilizando todos os métodos obrigatórios.

O 2° teste é de nível intermediário, possui diversas informações para que
seja avaliado se a aplicação consegue processar diversas entradas.

O 3° teste possui erros entre as entradas, avaliando assim se o programa é
capaz de processar as informações corretas e esteja preparado para lidar com
exceções/erros.

#### Teste 1
##### Entrada de dados
11
Maria da Silva
Brasil
-1
111
1
true
Salto em altura
-1
111
11
-1
11
Maria da Silva
111
Brasil
1
Salto em altura


##### Saída de dados esperada
1:11,Maria da Silva,Brasil
2:111,1,true,Salto em altura
3:111,11
4:11,Maria da Silva,Brasil
5:11,Maria da Silva,Brasil
6:111,1,true,Salto em altura
7:11,Maria da Silva,Brasil
8:11,Maria da Silva,Brasil
9:Salto em altura,1,11,Maria da Silva,Brasil
10:11,Maria da Silva,Brasil,Ouro:1,Prata:0,Bronze:0

#### Teste 2
##### Entrada de dados
11
Maria da Silva
Brasil
22
Jose da Silva
Brasil
33
Mario de Souza
Brasil
44
Madeleine Dubois
Franca
55
Jean Philippe
Franca
66
John Doe
EUA
77
Mary Smith
EUA
-1
111
1
true
Salto em altura
222
2
true
Salto em altura
333
3
true
Salto em altura
444
1
false
Futebol de campo
555
2
false
Futebol de campo
666
3
false
Futebol de campo
-1
111
11
222
22
333
55
444
22
444
33
555
66
-1
55
Maria da Silva
333
Franca
1
Futebol de campo

##### Saída de dados esperada
1:11,Maria da Silva,Brasil
1:22,Jose da Silva,Brasil
1:33,Mario de Souza,Brasil
1:44,Madeleine Dubois,Franca
1:55,Jean Philippe,Franca
1:66,John Doe,EUA
1:77,Mary Smith,EUA
2:111,1,true,Salto em altura
2:222,2,true,Salto em altura
2:333,3,true,Salto em altura
2:444,1,false,Futebol de campo
2:555,2,false,Futebol de campo
2:666,3,false,Futebol de campo
3:111,11
3:222,22
3:333,55
3:444,22
3:444,33
3:555,66
4:55,Jean Philippe,Franca
5:11,Maria da Silva,Brasil
6:333,3,true,Salto em altura
7:44,Madeleine Dubois,Franca
7:55,Jean Philippe,Franca
8:11,Maria da Silva,Brasil
8:22,Jose da Silva,Brasil
8:33,Mario de Souza,Brasil
9:Futebol de campo,1,22,Jose da Silva,Brasil
9:Futebol de campo,1,33,Mario de Souza,Brasil
9:Futebol de campo,2,66,John Doe,EUA
9:Futebol de campo,3,Sem atletas com medalha.
10:22,Jose da Silva,Brasil,Ouro:1,Prata:1,Bronze:0

#### Teste 3
##### Entrada de dados
11
Maria da Silva
Brasil
22
Jose da Silva
Brasil
33
Mario de Souza
Brasil
22
Joseph Smith
EUA
44
Madeleine Dubois
Franca
55
Jean Philippe
Franca
66
John Doe
EUA
77
Mary Smith
EUA
-1
111
1
true
Salto em altura
222
2
true
Salto em altura
333
3
true
Salto em altura
222
1
true
Basquetebol
444
1
false
Futebol de campo
555
2
false
Futebol de campo
666
3
false
Futebol de campo
-1
111
11
222
22
333
55
777
11
444
22
444
33
555
66
666
99
-1
88
Joseph Smith
777
Argentina
9
Basquetebol

##### Saída de dados esperada
1:11,Maria da Silva,Brasil
1:22,Jose da Silva,Brasil
1:33,Mario de Souza,Brasil
1:44,Madeleine Dubois,Franca
1:55,Jean Philippe,Franca
1:66,John Doe,EUA
1:77,Mary Smith,EUA
2:111,1,true,Salto em altura
2:222,2,true,Salto em altura
2:333,3,true,Salto em altura
2:444,1,false,Futebol de campo
2:555,2,false,Futebol de campo
2:666,3,false,Futebol de campo
3:111,11
3:222,22
3:333,55
3:444,22
3:444,33
3:555,66
4:Nenhum atleta encontrado.
5:Nenhum atleta encontrado.
6:Nenhuma medalha encontrada.
7:Pais nao encontrado.
8:Nenhum atleta encontrado.
9:Modalidade nao encontrada.
10:22,Jose da Silva,Brasil,Ouro:1,Prata:1,Bronze:0