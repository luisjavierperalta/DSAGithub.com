package PriorityQueue_CashierSystem_Supermarket;

import java.util.PriorityQueue;

/*
Use the @PriorityQueue
 */
public class CashierSystem { //1
    //2
    public static void main(String[] args) {
        long startTime = System.nanoTime(); //Start timing
        //3
        PriorityQueue<Customer> queue = new PriorityQueue<>(new CustomerComparator());
        //Use @CustomerComparator for order of customers
        //VIP Customers have higher priority over Regular

        queue.add(new Customer("Luis", "Regular"));
        queue.add(new Customer("Jenny", "VIP"));
        queue.add(new Customer("Tom", "Regular"));
        queue.add(new Customer("Carolina", "VIP"));

        //4 WHILE LOOP runs until queue isEmpty
        while (queue.isEmpty() == false) {
            System.out.println("Serving" + queue.poll()); //SERVING NEXT CUSTOMER

            long endTime = System.nanoTime(); //End timing
            long durationTime = endTime - startTime; //Calculate elapse time
            System.out.println("Time taken:" + durationTime);
        }

    }
}
