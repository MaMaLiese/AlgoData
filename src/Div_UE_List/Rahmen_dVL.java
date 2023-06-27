package Div_UE_List;

import org.w3c.dom.Node;

public class Rahmen_dVL {
    private Node first;
    private Node last;

    public void setFirst(Node first) {
        this.first = first;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }
    public void addBookingToLastPos(Booking newBooking)
    {
        Node newNode = new Node(); //habe nur Node erstellt. sonst ist alles leer
        newNode.setBooking(newBooking);

        //Fall: Liste ist leer
        if (first ==null) {
            first = newNode;
            last = newNode;
        }

        //Fall2: liste besteht bereits aus ein/mehreren Elementen
        else {
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }
    }
    public void addBookingAtIndex(int index, Booking newBooking)
    {
        Node newNode = new Node();
        newNode.setBooking(newBooking);

        //Definition: wenn ein zu großer Index angegeben wird, dann fügen wir es am Ende hinzu
        //Beispiel: Liste besteht aus 4 Knoten. Angabe Index 9. dh neues Element wird der fünfte Knoten in dem Fall
        //Fall: Liste ist noch leer
        if(first == null)
        {
            first=newNode;
            last= newNode;
        }
        else {
            //Vorgänger vom übergebenen Index finden
            Node predecessorNode = first;
            for (int i = 0; i < index; i++) {
               //weiterhüpfen zur nächsten Node
               predecessorNode = predecessorNode.getNext();

               //Wenn Index größer als die Liste - dann stoppen
                //zb Index = 9, Anzahl der Knoten in der Liste = 4
                if (predecessorNode == last)
                    break;


            }
            newNode.setNext(predecessorNode.getNext());
            newNode.setPrev(predecessorNode);
            predecessorNode.setNext(newNode);
            Node helperNode = newNode.getNext() //kann getNext verwenden, es steht im helperNode lediglich null
            if(helperNode != null)
            {
            newNode.getNext().setPrev(newNode);
            //NULL.setPrev --> Exception (darum verhindern)

        }
            //Neues Element ist jetzt letztes Element. Darum last anpassen.
            else
                last=newNode;
    }
}
