<div align="center">
    <h1>Exercício Avaliativo I - Programação Orientada a Objetos</h1>  
</div>
    
<div align="left">
    <p>O objetivo do exercício é desenvolver um aplicativo que controlará os atletas 
    e as medalhas de uma competição internacional.</p>
    <p>Para melhor entendimento do contexto, o professor disponibilizou um arquivo com
    informações sobre os requisitos do aplicativo e o diagrama de classes UML.</p>
    <p>O funcionamento da aplicação funciona através da leitura e saída de dados por
    arquivos de texto, disponibilizados pelo professor.</p>
</div>

#

<div class="requisitos">
    <h3>Requisitos</h3>
        <p>Para atender aos requisitos obrigatórios, o aplicativo deve conter as seguintes classes:</p>
        <h4>Atleta: classe que representa um atleta da competição:</h4>
        <ul>
            <li>adicionaMedalha(Medalha): adiciona uma nova medalha ao atleta.</li>
            <li>consultaQuantidadeMedalhas(): retorna a quantidade de medalhas do atleta.</li>
        </ul>
        <h4>Medalha: classe que representa uma medalha da competição:</h4>
        <ul>
            <li>adicionaAtleta(Atleta): adiciona um atleta à medalha.</li>
        </ul>
        <h4>Plantel: classe catálogo que gerencia o cadastro de atletas:</h4>
        <ul>
            <li>cadastraAtleta(Atleta): recebe como parâmetro um novo Atleta e o cadastra no sistema. Não pode haver atletas com o mesmo número. Retorna true se o cadastro teve sucesso; ou false em caso contrário.</li> 
            <li>consultaAtleta(String): retorna o atleta com o nome indicado. Se não houver nenhum atleta com este nome retorna null.</li>
            <li>consultaAtleta(int): retorna o atleta com o número indicado. Se não houver nenhum atleta com este número retorna null.</li>
        </ul>
        <h4>Medalheiro: classe catálogo que gerencia o cadastro de medalhas:</h4>
        <ul>
            <li>cadastraMedalha(Medalha): recebe como parâmetro uma nova medalha e a cadastra no sistema. Não pode haver medalhas com o mesmo código. Retorna true se o cadastro teve sucesso; ou false em caso contrário.</li>
            <li>consultaMedalha(int): retorna a medalha com o código indicado. Se não houver medalha com este código retorna null.</li>
            <li>consultaMedalhas(String): retorna uma coleção de medalhas com a modalidade indicada. Se não houver nenhuma medalha com esta modalidade retorna null.</li>
        </ul>
        <h4>ACMESports: classe do aplicativo:</h4>
        <ul>
            <li>ACMESports(): construtor do aplicativo.</li>
            <li>executa(): executa o funcionamento do aplicativo.</li>
        </ul>
        <h4>Main: classe principal (inicial) do sistema:</h4>
        <ul>
            <li>main(String[]): cria um objeto ACMESports e depois chama o método executa().</li>
        </ul>
        <h4>Ponto extra:</h4>
        <p>Mostrar o quadro geral de medalhas por país: nome de cada país, quantidade de medalhas de ouro, quantidade de medalhas de prata, quantidade de medalha de bronze.</p>
</div>    
    
#

<div class="observações">
    <h3>Observações</h3>
    <h4>Passo 1</h4>
    <p>Cadastrar atletas: cada linha corresponde ao número, nome e país de um atleta. Quando o número lido for -1, não há mais atletas a serem cadastrados.</p>
    <h4>Passo 2</h4>
    <p>Cadastrar medalhadas: cada linha corresponde ao código, tipo, se é individual, e modalidade de uma medalha. Quando o código lido for -1, não há mais medalhas a serem cadastradas.</p>
    <h4>Passo 3</h4>
    <p>Cadastrar medalhas e atletas correspondentes: cada linha corresponde ao código de uma medalha e ao número de um atleta correspondente. Quando o código lido for -1, não há mais dados a serem cadastrados.</p>
    <h4>Para a execução do projeto</h4>
    <p>Toda entrada e saída de dados com o usuário deve ocorrer apenas na classe ACMESports.</p>
    <p>É permitida a criação de novos métodos, atributos, classes e relacionamentos, mas as informações definidas no diagrama de classes original não podem ser alteradas.</p>
</div>

#
    
<div class="testes">
    <h3>Testes</h3>
        <p>Para testar o programa, foram feitos 3 tipos diferentes de testes.</p> 
        <p>O 1° teste é de nível inicial, com poucas informações a serem processadas, mas
        utilizando todos os métodos obrigatórios.</p>
        <p>O 2° teste é de nível intermediário, possui diversas informações para que
        seja avaliado se a aplicação consegue processar diversas entradas.</p>
        <p>O 3° teste possui erros entre as entradas, avaliando assim se o programa é
        capaz de processar as informações corretas e esteja preparado para lidar com
        exceções/erros.</p>
    <div class="teste-1">
        <h4>Teste 1</h4>
        <div class="entrada-de-dados">
            <h4>Entrada de dados</h4>
            <ul>
                <li>11</li>
                <li>Maria da Silva</li>
                <li>Brasil</li>
                <li>-1</li>
                <li>111</li>
                <li>1</li>
                <li>true</li>
                <li>Salto em altura</li>
                <li>-1</li>
                <li>111</li>
                <li>11</li>
                <li>-1</li>
                <li>11</li>
                <li>Maria da Silva</li>
                <li>111</li>
                <li>Brasil</li>
                <li>1</li>
                <li>Salto em altura</li>
            </ul>
        </div>
        <div class="saida-de-dados">
            <h4>Saída de dados esperada</h4>
            <p>1:11,Maria da Silva,Brasil</p>
            <p>2:111,1,true,Salto em altura</p>
            <p>3:111,11</p>
            <p>4:11,Maria da Silva,Brasil</p>
            <p>5:11,Maria da Silva,Brasil</p>
            <p>6:111,1,true,Salto em altura</p>
            <p>7:11,Maria da Silva,Brasil</p>
            <p>8:11,Maria da Silva,Brasil</p>
            <p>9:Salto em altura,1,11,Maria da Silva,Brasil</p>
            <p>10:11,Maria da Silva,Brasil,Ouro:1,Prata:0,Bronze:0</p>
        </div>
    </div>
    <div class="teste-2">
        <h4>Teste 2</h4>
        <div class="entrada-de-dados">
            <h4>Entrada de dados</h4>
            <ul>
                <li>11</li>
                <li>Maria da Silva</li>
                <li>Brasil</li>
                <li>22</li>
                <li>Jose da Silva</li>
                <li>Brasil</li>
                <li>33</li>
                <li>Mario de Souza</li>
                <li>Brasil</li>
                <li>44</li>
                <li>Madeleine Dubois</li>
                <li>Franca</li>
                <li>55</li>
                <li>Jean Philippe</li>
                <li>Franca</li>
                <li>66</li>
                <li>John Doe</li>
                <li>EUA</li>
                <li>77</li>
                <li>Mary Smith</li>
                <li>EUA</li>
                <li>-1</li>
                <li>111</li>
                <li>1</li>
                <li>true</li>
                <li>Salto em altura</li>
                <li>222</li>
                <li>2</li>
                <li>true</li>
                <li>Salto em altura</li>
                <li>333</li>
                <li>3</li>
                <li>true</li>
                <li>Salto em altura</li>
                <li>444</li>
                <li>1</li>
                <li>false</li>
                <li>Futebol de campo</li>
                <li>555</li>
                <li>2</li>
                <li>false</li>
                <li>Futebol de campo</li>
                <li>666</li>
                <li>3</li>
                <li>false</li>
                <li>Futebol de campo</li>
                <li>-1</li>
                <li>111</li>
                <li>11</li>
                <li>222</li>
                <li>22</li>
                <li>333</li>
                <li>55</li>
                <li>444</li>
                <li>22</li>
                <li>444</li>
                <li>33</li>
                <li>555</li>
                <li>66</li>
                <li>-1</li>
                <li>55</li>
                <li>Maria da Silva</li>
                <li>333</li>
                <li>Franca</li>
                <li>1</li>
                <li>Futebol de campo</li>
            </ul>
        </div>
        <div class="saida-de-dados">
            <h4>Saída de dados esperada</h4>
            <p>1:11,Maria da Silva,Brasil</p>
            <p>1:22,Jose da Silva,Brasil</p>
            <p>1:33,Mario de Souza,Brasil</p>
            <p>1:44,Madeleine Dubois,Franca</p>
            <p>1:55,Jean Philippe,Franca</p>
            <p>1:66,John Doe,EUA</p>
            <p>1:77,Mary Smith,EUA</p>
            <p>2:111,1,true,Salto em altura</p>
            <p>2:222,2,true,Salto em altura</p>
            <p>2:333,3,true,Salto em altura</p>
            <p>2:444,1,false,Futebol de campo</p>
            <p>2:555,2,false,Futebol de campo</p>
            <p>2:666,3,false,Futebol de campo</p>
            <p>3:111,11</p>
            <p>3:222,22</p>
            <p>3:333,55</p>
            <p>3:444,22</p>
            <p>3:444,33</p>
            <p>3:555,66</p>
            <p>4:55,Jean Philippe,Franca</p>
            <p>5:11,Maria da Silva,Brasil</p>
            <p>6:333,3,true,Salto em altura</p>
            <p>7:44,Madeleine Dubois,Franca</p>
            <p>7:55,Jean Philippe,Franca</p>
            <p>8:11,Maria da Silva,Brasil</p>
            <p>8:22,Jose da Silva,Brasil</p>
            <p>8:33,Mario de Souza,Brasil</p>
            <p>9:Futebol de campo,1,22,Jose da Silva,Brasil</p>
            <p>9:Futebol de campo,1,33,Mario de Souza,Brasil</p>
            <p>9:Futebol de campo,2,66,John Doe,EUA</p>
            <p>9:Futebol de campo,3,Sem atletas com medalha.</p>
            <p>10:22,Jose da Silva,Brasil,Ouro:1,Prata:1,Bronze:0</p>
        </div>
    </div>
    <div class="teste-3">
        <h4>Teste 3</h4>
        <div class="entrada-de-dados">
            <h4>Entrada de dados</h4>
            <ul>
                <li>11</li>
                <li>Maria da Silva</li>
                <li>Brasil</li>
                <li>22</li>
                <li>Jose da Silva</li>
                <li>Brasil</li>
                <li>33</li>
                <li>Mario de Souza</li>
                <li>Brasil</li>
                <li>22</li>
                <li>Joseph Smith</li>
                <li>EUA</li>
                <li>44</li>
                <li>Madeleine Dubois</li>
                <li>Franca</li>
                <li>55</li>
                <li>Jean Philippe</li>
                <li>Franca</li>
                <li>66</li>
                <li>John Doe</li>
                <li>EUA</li>
                <li>77</li>
                <li>Mary Smith</li>
                <li>EUA</li>
                <li>-1</li>
                <li>111</li>
                <li>11</li>
                <li>222</li>
                <li>22</li>
                <li>333</li>
                <li>55</li>
                <li>777</li>
                <li>11</li>
                <li>444</li>
                <li>22</li>
                <li>444</li>
                <li>33</li>
                <li>555</li>
                <li>66</li>
                <li>666</li>
                <li>99</li>
                <li>-1</li>
                <li>88</li>
                <li>Joseph Smith</li>
                <li>777</li>
                <li>Argentina</li>
                <li>9</li>
                <li>Basquetebol</li>
            </ul>
        </div>
        <div class="saida-de-dados">
            <h4>Saída de dados esperada</h4>
            <p>1:11,Maria da Silva,Brasil</p>
            <p>1:22,Jose da Silva,Brasil</p>
            <p>1:33,Mario de Souza,Brasil</p>
            <p>1:44,Madeleine Dubois,Franca</p>
            <p>1:55,Jean Philippe,Franca</p>
            <p>1:66,John Doe,EUA</p>
            <p>1:77,Mary Smith,EUA</p>
            <p>2:111,1,true,Salto em altura</p>
            <p>2:222,2,true,Salto em altura</p>
            <p>2:333,3,true,Salto em altura</p>
            <p>2:444,1,false,Futebol de campo</p>
            <p>2:555,2,false,Futebol de campo</p>
            <p>2:666,3,false,Futebol de campo</p>
            <p>3:111,11</p>
            <p>3:222,22</p>
            <p>3:333,55</p>
            <p>3:444,22</p>
            <p>3:444,33</p>
            <p>3:555,66</p>
            <p>4:Nenhum atleta encontrado.</p>
            <p>5:Nenhum atleta encontrado.</p>
            <p>6:Nenhuma medalha encontrada.</p>
            <p>7:Pais nao encontrado.</p>
            <p>8:Nenhum atleta encontrado.</p>
            <p>9:Modalidade nao encontrada.</p>
            <p>10:22,Jose da Silva,Brasil,Ouro:1,Prata:1,Bronze:0</p>
        </div>
    </div>
</div>
