# Lista duplamente encadeada

## Nome Completo
Gabriel Ramos Rigobelo


## Breve descrição do projeto 
Primeiro foi realizado uma lista simples encadeada, onde um nó tem referência apenas do próximo nó, depois foi implementado uma lista duplamente encadeada, onde 
o nó tem referência do anterior e do próximo.

## Implementação
Primeiro, na classe Node precisava ser adicionado o "Node = previous" para que seja possível referenciar o nó anteriror, dessa forma cada nó
consegue referenciar tanto o próximo quanto o anterior, formando uma lista duplamente encadeada.
Depois, eu fiz as alterações necessárias no código da lista simples encadeada, que foi no addValues, printValues e deleteValues,
o único que eu não precisei modificar foi o getSize, pois independente do que os nós estão se referenciando, ele conta 
a quantidade de nós numa lista.

## Exemplo de utilização da lista
* Inserção: doubleLinkedList.addValue(x); -> Adiciona um nó na lista. 
* Remoção: doubleLinkedList.deleteValue(x); -> deleta um nó na lista.
* Impressão dos elementos: doubleLinkedList.printValues(); -> vai mostrar no output os nós da lista.
    
