"# exercicio-produtos-java" 
Neste exercício, criei dois pacotes: Application e Entities.
No pacote Application encontra-se o código Main do sistema, aonde criamos uma variável "produto" da classe "Product" que contém nome, preço e quantidade.
Assim, no código Main é requisitado do usuário que ele defina quais serão essas três variáveis. 
Após seu input, as informações são impressas junto do valor total do estoque (função será comentada a seguir), em seguida, o sistema pede para que o usuário adicione uma quantidade ao estoque e remova uma quantidade do estoque, ambos seguidos de uma impressão atualizada dos dados.

No pacote Entities encontra-se o código da classe "Product", contendo as três variáveis "nome", "preco" e "quant" (quantidade do produto em estoque).
Neste código também criei as funções que são chamadas na Main para adicionar produtos ao estoque e removê-los, além uma que calcula o valor total do estoque. Todas essas estão devidamente comentadas e indicadas dentro do próprio código
São elas: "adicionarProdutos", "removerProdutos" e "valorTotalNoEstoque"
Por fim, existe também a função toString (padrão do Java) com a impressão definida para o padrão que eu desejei.

Esse projeto foi feito apenas por razões de estudo dos conceitos de classe e object.
