package util;

public class List {

    private Node head; //Primeiro nó da lista ou seja a cabeça;

    public void add(Double value){

        //Métodos para inserção de elemento á lista: line 9,10,11,12;
        Node node =  new Node();   //Instanciando nó;
        node.setValue(value);      //Atribuição de valor;
        node.setNext(head);        //Receber o head;
        head = node;               //Head agora recebe o node;

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();   //StringBuffer economiza espaço na memória quando se utilizará muitos sout;
        sb.append("[");          //StringBuffer abrindo o colchete "[" ;

        Node p = head;                                  //Variável p recebe head;
         while (p != null){                             //Laço de repetição iniciado;
             sb.append(p.getValue() + " ");
             p = p.getNext();                          // variável p aponta para o próximo elemento;
         }

         sb.append("]");
         return sb.toString();
    }
}
