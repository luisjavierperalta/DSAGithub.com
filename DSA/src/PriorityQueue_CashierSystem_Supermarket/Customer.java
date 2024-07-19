package PriorityQueue_CashierSystem_Supermarket;

/*
@Cashier System Supermarket where customers to serve have different levels
of priority based on they're membership status.
VIP Customers > served first
Regular Customer > Server after
(ARRIVAL TIME INDEPENDENT)

1 Use @PriorityQueue class to manage customers based on priority
2 Create custom @Comparator ro prioritize VIP over Regular customers
 */

public class Customer { //1 @Customer representation
    //2 Customer fields
    private String name;
    private String membershipStatus; //VIP or Regular

    public Customer(String name, String membershipStatus) {
        this.name = name;
        this.membershipStatus = membershipStatus;
    }

    public String getName() {
        return name;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    @Override
    public String toString() {
        return name + membershipStatus;

    }
}
