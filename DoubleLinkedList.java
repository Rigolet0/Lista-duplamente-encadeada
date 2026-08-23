public class DoubleLinkedList {
    Node begin;
    Node tail;

    public DoubleLinkedList() {
        this.begin = null;
        this.tail = null;
    }


    public void addValue(int value) {
        Node newNode = new Node(value);
        if (begin == null) {
            begin = newNode;
            tail = newNode;
            return;
        }

        newNode.previous = tail; //novo no esta apontando para o final
        tail.next = newNode; //o final aponta para o um novo no
        tail = newNode; //novo no vira o ultimo no

    }

    public void printValues() {
        Node currentNode = begin;

        System.out.print("null <= "); //comeco

        while (currentNode != null) {
            System.out.print(currentNode.value);

            if (currentNode.next != null) {
                System.out.print(" <~> ");
            }

            currentNode = currentNode.next;
        }

        System.out.print(" => null"); //fim
    }

    //tenta encontrar um valor dentro da lista
    public boolean containsValue(int value) {
        Node currentNode = begin;

        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    //verifica o tamanho da lista, contando os nos
    public int getSize() {
        int size = 0;

        Node currentNode = begin;

        while (currentNode != null) {
            size++;

            currentNode = currentNode.next;
        }

        return size;
    }



    //deleta um no e ajusta a lista, dependendo de onde foi retirado.
    public boolean deleteValue(int value) {
        Node currentNode = begin;

        //enquanto o no e diferente de null, ele pula para o proximo no,
        // se nao, continua procurando, ate chegar no final.

        if (currentNode == null){
            System.out.println("A lista está vazia, não é possível remover!");
        }

        while (currentNode != null) {
            if (currentNode.value == value) {
                break;
            }
            currentNode = currentNode.next;

        }

        //se o valor estiver no primeiro no:
        if (currentNode != null && currentNode.value == begin.value) {

            if (begin == tail) {
                begin = null;
                tail = null;
            } else {
                begin = currentNode.next;
                begin.previous = null;
            }

            return true;
        }

        //se o no estiver no meio da lista
        if(currentNode != null){
            if (currentNode != tail){
                currentNode.previous.next = currentNode.next;
                currentNode.next.previous = currentNode.previous;
            }

            if (currentNode == tail){
                tail = currentNode.previous;
                tail.next = null;
            }

            return true;
        }

        return false;

    }

}