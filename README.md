# CRUD Back-end Farmacia.

Back-end para uma Farmacia com capacidade de
manipular os dados dos Produtos.


## Começando

1. Camada de model com o nome de Categoria com os atributos.

2. Uma camada de repository com o nome Categoria Repository (com a
capacidade de se comunicar com o banco de dados mysql).

Camada Controller : 

3. Uma camada de Controller com o nome de CategoriaController Com 5
endpoints:
● findAllCategoria = um endPoint com a capacidade de trazer todas as
categorias.
● findByIDCategoria = um endPoint com a função de trazer uma única
categoria por id.
● findByDescricaoCategoria = um endPoint com a função de trazer uma
categoria turma por Descricao.
● postCategoria = um endPoint com a função de gravar uma nova categoria no
banco de dados.
● putCategoria = um endPoint com a função de atualizar dados de uma
categoria.
● deleteCategoria = um endPoint com a função de apagar uma categoria do
banco de dados).


PARTE 2 DO PROJETO-Relacionamento com a tabela Produto

4. Camada de model com o nome de Produto com os seus atributos.
5. Crie um relacionamento de um para muitos/muitos para um, para essas
models (uma categoria para muitos produtos e muitos produtos para uma
categoria)



relacionamento e inibir recursividade através da anotação
@JsonIgnoreProperties.


5. Uma camada de repository com o nome ProdutoRepository (com a
capacidade de se comunicar com o banco de dados mysql).
6. Uma camada de Controller com o nome de ProdutoController Com 5
endpoints:
● findAllProduto = um endPoint com a capacidade de trazer todos os Produtos .
● findByIDProduto = um endPoint com a função de trazer uma único Produto
por id.
findByDescricaoTitulo = um endPoint com a função de trazer um único
Produto por Titulo.
● postProduto = um endPoint com a função de gravar um novo Produto no
banco de dados.
● putProduto = um endPoint com a função de atualizar dados de um Produto .
● deleteProduto = um endPoint com a função de apagar um Produto do banco
de dados).



### Instalando
O que você precisa para instalar o software e como instalá-los

```
Fork do projeto-> git clone -> Abrir com Eclipse
```

## Contribuindo

Leia [CONTRIBUTING.md](https://gist.github.com/hi-hi-ray/a868081e2a63ee47fafa015353d05ae3) para obter detalhes sobre nosso código de conduta e o processo para enviar pedidos de extração para nós.


## Autores
<hr>
<h2>TEAM DEV</h2>



|      |    |        |
| :---         |     :---:      |          ---: |
| [<img src="https://avatars.githubusercontent.com/u/86629815?v=4" width="115"><br><sub>@herculesdevbr</sub>](https://github.com/herculesdevbr)   | [<img src="https://avatars.githubusercontent.com/u/80281695?v=4" width="115"><br><sub>@Mariana Nogueira</sub>](https://github.com/mariana-nogueira21)    |  [<img src="https://avatars.githubusercontent.com/u/93773423?v=4" width="115"><br><sub>@Augusto1</sub>](https://github.com/MuriloAugusto1)   |
| [<img src="https://avatars.githubusercontent.com/u/82280279?v=4" width="115"><br><sub>@luannutels</sub>](https://github.com/luannutels)     | [<img src="https://avatars.githubusercontent.com/u/93775430?v=4" width="115"><br><sub>@Vivian Santana</sub>](https://github.com/Vivian-Santana)      |[<img src="https://avatars.githubusercontent.com/u/93266793?v=4" width="115"><br><sub>@okborges</sub>](https://github.com/okborges)     |

<hr>


## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para obter detalhes

## Agradecimentos

* Generation Brasil
* Michelle 
* Gustavo Boaz
