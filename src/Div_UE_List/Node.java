package Div_UE_List;

public class Node {
    private Booking booking;
    private org.w3c.dom.Node next;
    private org.w3c.dom.Node prev;
    public Booking getBooking() {
        return booking;
    }
    public void setBooking(Booking booking) {
        this.booking = booking;
    }
    public org.w3c.dom.Node getNext() {
        return next;
    }
}
