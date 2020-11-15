<h1>Padrão Strategy - Padrão comportamental</h1>
<h2>Inteção</h2>
<p>Encapsula os comportamentos para torná-los intercambiáveis no projeto.</p>
<h2>Motivação</h2>
<p>Há momentos que se necessita de muitas quebras de linhas ou condicionais, nesses cenários pode ser útil a utilização de uma padrão como o Strategy, que muda o comportamento de acordo com o comportamento requisitado no momento.</p>
<h2>Aplicação</h2>
<p>Utilizar somente quando classes forem diferente no comportamento ou necessitar de variações no algoritmo, e por último uma classe com muitos comportamentos diferentes.</p>
<h2>Estrutura</h2>
<img src="https://www.devmedia.com.br/imagens/articles/169202/estrutura_strategy.png"/>
<h2>Participantes</h2>
<p>Context - possui uma referência para Strategy e configura um ConcreteStrategy.</p>
<p>Strategy - interface que fornece a estrutura para os ConcreteStrategys e chama o código dos ConcreteStrategys.</p>
<p>ConcreteStrategy - implementa o Strategy.</p>
<h2>Exemplo de implementação</h2>
<p>O exemplo utilizado indica os livros disponíveis em uma biblioteca de acordo com o curso do aluno.</p>
<a href="https://github.com/tiagofreitastjf/ProgramacaoAvancada/tree/master/PatternStrategy/PatternStrategy/src">Ver</a>
