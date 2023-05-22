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
        // TODO: Implementierung vervollständigen - liste ist momentan noch leer
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
        // TODO: Implementierung vervollständigen
    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}
