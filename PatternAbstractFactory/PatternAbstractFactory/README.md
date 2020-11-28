<h1>Padrão Abstract Factory - Padrão criacional</h1>
<h2>Inteção</h2>
<p>Cria uma interface para criação de objetos relacionados ou dependentes sem especificar suas classes.</p>
<h2>Motivação</h2>
<p>As interfaces grafiças podem ser tornar complexas e difíceis de fazer manutenção, com o uso do Abstract Factory no projeto fica mais fácil a implementação e manutenção, pois podemos resolver esse problema criando classes e interfaces básicas para os componentes da interface.</p>
<h2>Aplicação</h2>
<p>Usar quando for necessário a criação de uma família de objetos, objetos independentes do sistema.</p>
<h2>Estrutura</h2>
<img src="https://narbase.com/wp-content/uploads/2020/06/SecondImage-1024x479.jpeg"/>
<h2>Participantes</h2>
<p>AbstractFactory - define uma interface para criar os objetos-produto abstratos.</p>
<p>ConcreteFactory - implementa o código que cria objetos-produto concretos.</p>
<p>AbstractProduct - define uma interface para um objeto-produto.</p>
<p>ConcreteProduct - responsável por implementar a interface de Abstract Product.</p>
<p>Client - utiliza as interfaces declaradas pelas classes Abstract Factory e Abstract Product.</p>
<h2>Exemplo de implementação</h2>
<p>O exemplo utilizado em sala de aula.</p>
<a href="https://github.com/tiagofreitastjf/ProgramacaoAvancada/tree/master/PatternAbstractFactory/PatternAbstractFactory">Ver</a>
