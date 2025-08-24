
package tnsjavaoops;
//ASIGNMENT WORK 
class Ticket {
    // Private fields
    private String passengerName;
    private int seatNumber;
    private boolean booked;

    // Constructor
    public Ticket(String passengerName, int seatNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.booked = false; // initially not booked
    }

    // Getter and Setter for passengerName
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    // Getter for seatNumber
    public int getSeatNumber() {
        return seatNumber;
    }

    // Method to book the ticket
    public void bookTicket() {
        if (!booked) {
            booked = true;
            System.out.println("Ticket booked successfully for " + passengerName +
                               ", Seat No: " + seatNumber);
        } else {
            System.out.println("Sorry, Seat No: " + seatNumber + " is already booked.");
        }
    }

    // Method to check if ticket is booked
    public boolean isBooked() {
        return booked;
    }
}
