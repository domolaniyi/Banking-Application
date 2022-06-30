import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Customer> customers;
    private String bankName;


    Bank(String bankName){
        this.customers = new ArrayList<>();
        this.bankName = bankName;
    }

    public void createAccount(int customerID, String customerName){

        customers.add(new Customer(customerID,customerName));
    }

    public void setBalance(int customerID,int amount){
        int customerIndex = getAccount(customerID);

        if(customerIndex == -1){
            System.out.println("Customer doesn't exist");
        }else{
            customers.get(customerIndex).setBalance(amount);
        }
    }

    public void updateBalance(int customerID,int amount){
        int customerIndex = getAccount(customerID);

        if(customerIndex == -1){
            System.out.println("Customer doesn't exist");
        }else{
            customers.get(customerIndex).updateBalance(amount);
        }

    }

    public void addToPot(int customerID,int amount){
        int customerIndex = getAccount(customerID);

        if(customerIndex == -1){
            System.out.println("Customer doesn't exist");
        }else{
            customers.get(customerIndex).updatePotBalance(amount);
        }

    }

    public void getBalance(int customerID){
        int customerIndex = getAccount(customerID);

        if(customerIndex == -1){
            System.out.println("Customer doesn't exist");
        }else{
            System.out.println(customers.get(customerIndex).getBalance());
        }
    }

    public void getPot(int customerID){
        int customerIndex = getAccount(customerID);

        if(customerIndex == -1){
            System.out.println("Customer doesn't exist");
        }else{
            System.out.println(customers.get(customerIndex).getPotBalance());
        }
    }

    public int getAccount(int customerID){

        int index = -1;
        for (int i = 0; i < customers.size() ; i++) {
            if(customers.get(i).getCustomerID() == customerID){
                index = i;
                break;
            }
        }
        return index;
    }

    public void menu(){
        boolean end = false;

        while(!end){

            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Create Customer");
            System.out.println("2. Set balance");
            System.out.println("3. Update Balance");
            System.out.println("4. Add to pot");
            System.out.println("5. Get Balance");
            System.out.println("6. Get Pot Balance");
            System.out.println("0. End");

            System.out.println("Enter number");
            int a = scanner.nextInt();


            switch (a){

                case 1:
                    System.out.println("Enter ID");
                    int ID = scanner.nextInt();
                    System.out.println("Enter name: ");
                    String name = scanner.next();
                    createAccount(ID,name);
                    System.out.println("Account created!");
                    break;

                case 2:

                    System.out.println("Enter ID");
                    int ID2 = scanner.nextInt();
                    if (getAccount(ID2) == -1){
                        System.out.println("Account doesn't exist!");
                    }else{
                        System.out.println("Enter amount:");
                        int amount = scanner.nextInt();
                        setBalance(ID2,amount);
                        System.out.println("Balance set");
                    }

                    break;

                case 3:
                    System.out.println("Enter ID");
                    int ID3 = scanner.nextInt();
                    if(getAccount(ID3) == -1){
                        System.out.println("Customer doesn't exist!");
                    }else{
                        System.out.println("Enter amount:");
                        int amount1 = scanner.nextInt();
                        updateBalance(ID3,amount1);
                        System.out.println("Balance updated");
                    }
                    break;

                case 4:
                    System.out.println("Enter ID");
                    int ID4 = scanner.nextInt();
                    if(getAccount(ID4) == -1){
                        System.out.println("Account doesn't exist!");
                    }else{
                        System.out.println("Enter amount:");
                        int amount2 = scanner.nextInt();
                        addToPot(ID4,amount2);
                        System.out.println("Pot updated");
                    }
                    break;


                case 5:
                    System.out.println("Enter customer ID:");
                    int ID5 = scanner.nextInt();
                    if(getAccount(ID5) == -1){
                        System.out.println("Account doesn't exist!");
                    }else{
                        getBalance(ID5);
                    }
                    break;

                case 6:
                    System.out.println("Enter customer ID:");
                    int ID6 = scanner.nextInt();
                    if(getAccount(ID6) == -1){
                        System.out.println("Account doesn't exist!");
                    }else{
                        getPot(ID6);
                    }
                    break;

                case 0:
                    end = true;
                    break;
            }
        }
    }

}
