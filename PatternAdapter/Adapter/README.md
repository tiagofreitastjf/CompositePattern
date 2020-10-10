<h1>Padrão Adapter - Padrão de estrutural</h1>
<h2>Inteção</h2>
<p>Adaptar uma interface em outra interface para que possa ser utilizada no projeto, por meio do Adapter podemos torna compatíveis interfaces que eram imcompatíveis.</p>
<h2>Motivação</h2>
<p>Em programação de computadores os softwares podem ficar obsoletos rapidamente, muitas vezes será necessário escrever usar um sistema legado que não é compatível com o novo software, é devido a esse problema que o Adapter foi criado, tornar compatível interfaces antigas para serem utilizadas no novo projeto, como exemplo podemos citar interfaces gráficas que possuem botões, caixas de textos e menus, mas que não se enquadram no projeto e precisam ser adaptadas para uso.</p>
<h2>Aplicação</h2>
<p>Deve ser usado quando existir uma classe existente que não é conciliável, quando não corresponde à necessidade e adaptar varias subclasses, nesses último caso quando existir várias subclasses para não precisar criar uma para cada uma, cria-se somente uma classe mãe.</p>
<h2>Estrutura</h2>
<img src="https://upload.wikimedia.org/wikipedia/commons/4/4e/Adapter_pattern.png"/>
<h2>Participantes</h2>
<p>Target</p>
<p>Client</p>
<p>Adaptee</p>
<p>Adapter</p>
<h2>Exemplo de implementação</h2>
<p>O exemplo utilizado é uma interface gráfica que precisa ser adaptada.</p>
<a href="https://github.com/tiagofreitastjf/ProgramacaoAvancada/tree/master/PatternAdapter/Adapter">Ver</a>
