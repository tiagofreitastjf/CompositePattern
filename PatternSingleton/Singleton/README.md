<h1>Padrão Singleton</h1>
<h2>Inteção</h2>
<p>A inteção do padrão singleton é instanciar uma única vez uma classe.</p>
<h2>Motivação</h2>
<p>Há momentos na programação, dependendo do projeto, que será necessário criar uma única instância de uma classe, como exemplo deve haver somente um gerenciador de janelas, essa necessidade é a motivação do padrão singleton. Esse controle é por meio da própria classe controlando a criação de um objeto e impedindo outros de serem criados.</p>
<h2>Aplicação</h2>
<p>Deve ser usado somente quando for necessário exatamente uma instância de uma classe, essa classe também deve ser extensível por meio de subclasses, será possível assim acrescentar implementações necessárias ao projeto.</p>
<h2>Estrutura</h2>
<img src="https://lh3.googleusercontent.com/proxy/gwkx-hA5KecP1vGhUH8ZTuFMJ2AyvVm9ENGwwapTZ6Qw_oiLRsnVC6xY3CErN8w7MD-C7xqsVfOuLLt8bRgugojNqZZUwZ6gDV1026h3km58WuMAHCmsP58Ju_ol"/>
<h2>Participantes</h2>
<p> - Singleton</p>
<p>O único participante é o singleton, este é responsável por criar sua própria instância e gerenciar e fornecer o acesso ao clientes.</p>
<h2>Exemplo de implementação</h2>
<a href="https://github.com/tiagofreitastjf/ProgramacaoAvancada/tree/master/PatternSingleton/Singleton">Ver</a>
