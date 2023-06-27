package Div_UE_List;

public class Main {
    public static void main(String[] args) {
        Rahmen_dVL dVL = new Rahmen_dVL();


        Booking booking1 = new Booking();
        booking1.setDescription("Miete");
        booking1.setAmount(500.00);

        dVL.addBookingToLastPos(booking1);
        System.out.println("Last: " + dVL.getLast().getBooking().getDescription());

        Booking booking2 = new Booking();
        booking2.setDescription("Lebensmitteleinkauf");
        booking2.setAmount(12.32);

        dVL.addBookingToLastPos(booking2);
        System.out.println("(C) First:" + dVL.getFirst().getBooking().getDescription());
        System.out.println("(C) Last:" + dVL.getLast().getBooking().getDescription);



    }
}
