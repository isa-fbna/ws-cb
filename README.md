# Programa de Caixa de Supermercado em Java

Este programa em Java permite simular operações de caixa em um supermercado. Ele oferece funcionalidades como registro de produtos, cálculo do total da compra, troco e impressão de recibo.

## Funcionalidades

### Classe Produto

A classe Produto representa um item disponível para compra no supermercado. Cada produto possui um nome, preço e quantidade.

**Atributos:**
- `nome`: O nome do produto.
- `preco`: O preço unitário do produto.
- `quantidade`: A quantidade de unidades do produto.

### Classe CaixaSupermercado

A classe CaixaSupermercado é responsável por gerenciar as operações relacionadas à compra de produtos. Ela permite adicionar produtos à compra, calcular o total da compra, calcular o troco a ser dado ao cliente e imprimir um recibo detalhado da compra.

**Atributos:**
- `produtos`: Uma lista que armazena os produtos adicionados à compra.
- `subtotal`: O subtotal da compra antes de impostos.

**Métodos:**
- `adicionarProduto(Produto produto)`: Adiciona um produto à lista de produtos da compra e atualiza o subtotal.
- `calcularTotal(double taxaImposto)`: Calcula o valor total da compra, incluindo impostos, com base na taxa de imposto fornecida.
- `calcularTroco(double valorPago)`: Calcula o troco a ser dado ao cliente com base no valor pago.
- `imprimirRecibo(double valorPago)`: Imprime um recibo detalhado da compra, incluindo os produtos adquiridos, subtotal, impostos, total e troco.

### Método main na classe Main

O método main é o ponto de entrada do programa. Ele cria uma instância da classe CaixaSupermercado, adiciona alguns produtos à compra, define o valor pago pelo cliente e imprime um recibo da compra.
