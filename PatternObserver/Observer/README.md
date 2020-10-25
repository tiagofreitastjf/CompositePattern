<h1>Padrão Observer - Padrão comportamental</h1>
<h2>Inteção</h2>
<p>Define dependências entre objetos, por meio de um para muitos, permitindo que quando um objeto mude de estado todos os outros dependentes sejam atualizados.</p>
<h2>Motivação</h2>
<p>Há momentos na construção de sistemas que existe a necessidade da comunicação entre os objetos, e essa comunicação precisa ser consistente, sem que precise acoplar muito os objetos envolvidos, como exemplo temos as interfaces gráficas, onde um label recebe o texto de uma caixa de texto logo quando é inserido um texto.</p>
<h2>Aplicação</h2>
<p>Usar esse padrão quando um objeto precisa ser atualizado conforme a mudança de outro objeto, também quando dois objetos dependem um do outro.</p>
<h2>Estrutura</h2>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/500px-Observer.svg.png"/>
<h2>Participantes</h2>
<p>Subject - este conhecer seus objetos e tem uma interface para permitir adicionar e remover objetos.</p>
<p>Observer - interface que sera implementada pelos objetos que seram notificados.</p>
<p>ConcreteSubject - armazena os estados do objeto e notifica cada um dos objetos dependentes.</p>
<p>ConcreteObserver - implementa a interface Observer e armazena os estados de Subject, mantendo também uma referência para ConcreteSubject.</p>
<h2>Exemplo de implementação</h2>
<p>O exemplo implementado utiliza o Subject como se fosse um Textbox, quando inserido texto nele atualiza os dependentes, que são um label e o texto dentro de um botão.</p>
<a href="https://github.com/tiagofreitastjf/ProgramacaoAvancada/tree/master/PatternObserver/Observer">Ver</a>
