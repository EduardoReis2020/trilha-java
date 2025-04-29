# Collection Framework API

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade; estes elementos precisam ser objetos.
- Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo específico.
- O núcleo principal das coleções é formado pelas interfaces da figura abaixo; essas interfaces permitem manipular a coleção independentemente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: List (lista), Set (conjunto), Queue (fila) e Map (mapa). A partir dessas interfaces, temos muitas subclasses concretas que implementam várias formas diferentes de se trabalhar com cada coleção.

<p align="center">
<img src="https://raw.githubusercontent.com/cami-la/collections-java-api-2023/master/assets/image/collection-framework.png"><br>
<a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
</p>


- Todas as interfaces e classes são encontradas dentro do pacote (package) java.util.
- Embora a interface Map não seja filha direta da interface Collection, ela também é considerada uma coleção devido à sua função.

<p align="center">
<img src="https://raw.githubusercontent.com/cami-la/collections-java-api-2023/master/assets/image/collection-framework-methods.png" alt="List interface hierarchy Java"><br>
<a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html">Method Sumary Collection Interface</a>
</p>


---

### Referências:

[1] "Java Collections - Universidade Java." Universidade Java. Disponível em: http://www.universidadejava.com.br/java/java-collection/.

[2] "Java™ Platform, Standard Edition 17 API Specification - Interface Collection." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html.

[3] "Java Comparator and Comparable - Baeldung." Baeldung. Disponível em: https://www.baeldung.com/java-comparator-comparable.

[4] "Java™ Platform, Standard Edition 17 API Specification - Class Collections." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html.

---
Se você preferir usar o protocolo SSH para comunicação com o repositório, siga as etapas abaixo:

1. Abra o terminal ou prompt de comando.
2. Navegue até o diretório do projeto.
3. Execute o seguinte comando para mudar a URL remota para SSH:

   ```shell
   git remote set-url origin git@github.com:cami-la/collections-java-api-2023.git

---

## 📚 Créditos e Referência

Este material foi adaptado a partir do conteúdo original de [Camila Cavalcante](https://github.com/cami-la), publicado no repositório:

> [Conhecendo Collections Java - DIO (Digital Innovation One)](https://github.com/cami-la/collections-java-api-2023/blob/master)

A versão original está disponível sob os termos definidos pela autora e tem como objetivo o aprendizado sobre o `Collection Framework` da linguagem Java, com foco educacional e prático.
