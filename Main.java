void main() {
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

    //se a lista estiver vazia e deletar um
    doubleLinkedList.deleteValue(2);

    //insere apenas um valor com a lista vazia
    doubleLinkedList.addValue(2);
    doubleLinkedList.printValues();
    System.out.println(" ");

    //deleteValue na lista contendo 1 valor
    doubleLinkedList.deleteValue(2);
    doubleLinkedList.printValues();

    //completando a lista
    doubleLinkedList.addValue(3);
    doubleLinkedList.addValue(4);
    doubleLinkedList.addValue(5);
    doubleLinkedList.addValue(7);
    doubleLinkedList.addValue(10);
    System.out.println(" ");
    doubleLinkedList.printValues();

    //remove a primeira ocorrencia na lista
    System.out.println(" ");
    doubleLinkedList.deleteValue(3);
    doubleLinkedList.printValues();

    //deleta um no no final da lista
    System.out.println(" ");
    doubleLinkedList.deleteValue(10);
    doubleLinkedList.printValues();

    //deleta um no do meio
    System.out.println(" ");
    doubleLinkedList.deleteValue(5);
    doubleLinkedList.printValues();

    //retorna a quantidade de elementos da lista
    System.out.println(" ");
    System.out.println("Quantidade de Nós na lista: " + doubleLinkedList.getSize());






}

