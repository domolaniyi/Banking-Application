public class Customer {

   private int customerID;
   private String customerName;
   private int Balance;
   private int potBalance;

    Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void updateBalance(int amount){
        this.Balance += amount;
    }

    public void updatePotBalance(int amount){
        this.Balance += amount;
    }

    public void setPotBalance(int potBalance) {
        this.potBalance = potBalance;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getBalance() {
        return Balance;
    }

    public int getPotBalance() {
        return potBalance;
    }
}
