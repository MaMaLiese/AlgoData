package UE1_TodoLinkedList;

public class TodoLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;  //damit ich first und last abspeichern kann

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***



    public Node getFirst() {
       return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        // Implementierung vervollständigen - liste ist momentan noch leer
        Node newNode = new Node();
        newNode.setTodoText(todoText);

        //1. Durchlauf todoText ist kochen
        //2. Durchlauf todoText ist essen
        //3. Durchlauf todoText ist spülen

        //Fall 1: Liste ist leer, und wir wollen das first und last nicht mehr auf NULL zeigen, sondern auf newNode
        if (first == null)
        {
            first = newNode;
            last = newNode;
        }
        //Fall 2: Liste is NICHT leer
        else {
            last.setNext(newNode);
            last = newNode;
        }

    }

    public void deleteLastTodoText() {
        //Fall 3: Liste hat genau 1 Element
        if (first == last)
        {
            first = null;
            last = null;
        }
        else
        {

        //Fall 1: Liste hat mehr als 1 Element

        //vorletztes Element finden
        Node current = first;
        //weiterspringen, bis vorletztes Element gefunden wurde
        while (current.getNext() != last)
        {                          //um einen Knoten weiterspringen
            current = current.getNext();
        }
        last = current;
        current.setNext(null);

    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}
