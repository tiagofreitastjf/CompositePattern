<h1>Padrão State - Padrão comportamental</h1>
<h2>Inteção</h2>
<p>Tem a intenção de alterar o comportamento do objeto de acordo com os estados do objeto.</p>
<h2>Motivação</h2>
<p>Um exemplo de uso para entender a utilidade desse padrão de projeto são as conexões TCP, que necessitam ter os estados das conexões durante a comunicação, esses estados podem ser representados pelo padrão de projeto State, dependendo do estado da conexão adota-se um comportamento diferente, por exemplo, quando a conexão está concluída o comportamento deve ser de encerrar as operações da conexão.</p>
<h2>Aplicação</h2>
<p>Utilizar sempre que for necessário ter estados de um objeto no software.</p>
<h2>Estrutura</h2>
<img src="https://www.thiengo.com.br/img/post/normal/f8vu2jt9hh2fcendvulf6qb7t25c6729cbf88ac0a377c8f7003bf9365e.jpg"/>
<h2>Participantes</h2>
<p>Context - responsável por definir a interface e criar a instância que gerencia o estado atual.</p>
<p>State - interface responsáve por encapsular os estados.</p>
<p>ConcreteState - representa os estado(s) implementados.</p>
<h2>Exemplo de implementação</h2>
<p>O exemplo utilizado indica os estados do objeto durante o envio de uma mensagem.</p>
<a href="https://github.com/tiagofreitastjf/ProgramacaoAvancada/tree/master/PatternState/PatternState/src">Ver</a>
