package bank;

public class CustomerDetails {
    String name="Ravi";
    double avilAmount=34156.67;
    long accNumber=12345678l;


    public void transferAmount(double amount){
        avilAmount=avilAmount-amount;
        System.out.println(avilAmount);
    }

    public static void main(String[] args) {
         CustomerDetails customerDetails = new CustomerDetails();
         customerDetails.transferAmount(500);

    }
}
