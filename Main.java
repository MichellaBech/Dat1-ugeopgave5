package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer firstCustomer = new Customer("Michella", "Bech", "michellabech");
        Customer secondCustomer = new Customer("tanja", "Pedersen", "tanjapedersen");
        Customer thirdCustomer = new Customer("Mark", "Hansen", "markhansen");
        customers.add(firstCustomer);
        customers.add(secondCustomer);
        customers.add(thirdCustomer);
        printCustomers(customers);

        //System.out.println(customers.get(0).getFirstName());
    }

    public static void printCustomers(ArrayList<Customer> customers)
    {
        for( Customer element : customers)
        {
            System.out.println(element + " ");
        }
    }

}
