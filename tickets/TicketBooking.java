package tickets;

public class TicketBooking {
    String name;
    int totalSeats=1000;
    double ticketPrice;
    double totalAmount;


    public void selection(int noSeats,String name,double ticketPrice){
        totalSeats=totalSeats-noSeats;
        totalAmount=noSeats*ticketPrice;
        System.out.println( "Name:" +name);
        System.out.println( "RemainingSeats:" +totalSeats);
        System.out.println( "Total Amount:" +totalAmount);
    }

    public static void main(String[] args) {
        TicketBooking ticketBooking=new TicketBooking();
        ticketBooking.selection(5,"Ram",200.56);

    }

}
