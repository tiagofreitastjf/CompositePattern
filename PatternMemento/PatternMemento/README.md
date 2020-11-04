<h1>Padrão Memento - Padrão comportamental</h1>
<h2>Inteção</h2>
<p>Salvar o último estado de um objeto, sem prejudicar o encapsulamento do objeto, e permitir a restauração posteirior caso necessário.</p>
<h2>Motivação</h2>
<p>O desfazer de ações em programas é muito comum quando se trabalha com computadores, para isso salvar o estado do objeto pode ser muito útil, porém é preciso fazer isso de uma maneira que o acesso aos dados não seja violado por outras classes, para que assim o dados não sejam comprometido e a aplicação não sofra com confiabilidade.</p>
<h2>Aplicação</h2>
<p>Utilizar sempre que um estado de um objeto precisa ser salvo e caso necessário restaurado.</p>
<h2>Estrutura</h2>
<img src="https://brizeno.files.wordpress.com/2011/11/memento.png?w=682"/>
<h2>Participantes</h2>
<p>Memento - responsável por armazenar o estado interno do Originator, pode armazena muito ou pouco, também deve proteger contra acesso que não seja o Originator.</p>
<p>Originator - utiliza o Memento para restaurar o seu estado interno quando preciso.</p>
<p>Caretaker - responsável por proteger o Memento e nunca pode ter acesso ou modificar o estado salvo do Originator.</p>
<h2>Exemplo de implementação</h2>
<p>O exemplo utilizado salva o estado das últimas formas geométricas.</p>
<a href="https://github.com/tiagofreitastjf/ProgramacaoAvancada/tree/master/PatternMemento/PatternMemento">Ver</a>
