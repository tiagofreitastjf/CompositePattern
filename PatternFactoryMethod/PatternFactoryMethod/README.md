<h1>Padrão Factory Method - Padrão criacional</h1>
<h2>Inteção</h2>
<p>Delega a instanciação de objetos para as subclasses</p>
<h2>Motivação</h2>
<p>O padrão Factory é útil ao se trabalhar com frameworks, pois ele encapsula o conhecimento sobre a subclasse que devem ser criadas, movendo assim a criação dos objetos para fora do framework.</p>
<h2>Aplicação</h2>
<p>Usar principalmente quando as subclasses precisarem criar e especificar os objetos.</p>
<h2>Estrutura</h2>
<img src="https://upload.wikimedia.org/wikipedia/commons/e/ed/Factory_Method_UML_class_diagram.png"/>
<h2>Participantes</h2>
<p>Product - define a interface que a fábrica cria.</p>
<p>ConcreteProduct - responsável por implementar a interface de Product.</p>
<p>Creator - Declara o método fábrica, que retorna Product.</p>
<p>ConcreteCreator - retornar uma instância de um ConcreteProduct.</p>
<h2>Exemplo de implementação</h2>
<p>O exemplo utilizado usa seleção de treino de academia.</p>
<a href="https://github.com/tiagofreitastjf/ProgramacaoAvancada/tree/master/PatternState/PatternState/src">Ver</a>
