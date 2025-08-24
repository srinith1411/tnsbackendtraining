package tnsjavaoops;
//ASSIGNMENT WORK. 
public class TicketBooking {
    public static void main(String[] args) {
        // Create ticket objects
        Ticket ticket1 = new Ticket("Srinith", 101);
        Ticket ticket2 = new Ticket("Rahul", 102);

        // Book tickets
        ticket1.bookTicket();
        ticket2.bookTicket();

        // Try booking same seat again..
        ticket1.bookTicket();

        // Access data via getters
        System.out.println("Passenger Name: " + ticket2.getPassengerName() +
                           ", Seat No: " + ticket2.getSeatNumber() +
                           ", Booked: " + ticket2.isBooked());
    }
}