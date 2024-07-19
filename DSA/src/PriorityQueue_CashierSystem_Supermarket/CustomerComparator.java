package PriorityQueue_CashierSystem_Supermarket;

import java.util.Comparator; //Comparator interface from java.util package @Custom ordering of objects

//Comparator Interface
public class CustomerComparator implements Comparator<Customer> { //@Customer type objs
    @Override //@Override for custom comparison logic
    public int compare(Customer c1, Customer c2) {
        if (c1.getMembershipStatus().equals(c2.getMembershipStatus())) {
            return 0; //EQUAL PRIORITY
        }
        if (c1.getMembershipStatus().equals("VIP")) {
            return -1; //HIGHER PRIORITY OVER C2 (-1 == BEFORE)
        }
        return 1; //c2 PRIORITY IF c1 NOT "VIP"
    }
}
