package LinearDataStructures;

import java.util.LinkedList;
import java.util.Queue;

/*
@Queues data structure exercise to demo management of tasks, or requests in the order the arrive FIFO,
ensuring fair processing
@Queue > @Queue Interface (@java.util.queue) > @Java Collection Framework extends @Collection Interface

Collection designed to holding elements priority-based to processing

//CUSTOMER SERVICE SYSTEM
//Customers wait in line @priority to be served.
//Queue can manage order of processing
 */
public class Queue1CustomerService { //1 MANAGE QUEUE OF CUSTOMERS
    //2
    private Queue<Queue1CustomerService_CustomerClass> customerQueue = new LinkedList<>();

    //3 @ARRIVE method f allowing new customers to join the queue
    public void arrive(Queue1CustomerService_CustomerClass customer) {
        customerQueue.add(customer);
        System.out.println(customer.getName());
    }

    //4 @SERVE CUSTOMER f for serving the next customer in the queue (line)
    public void serveCustomer() {
        Queue1CustomerService_CustomerClass customer = customerQueue.poll();
        //Validation
        if (customer != null) {
            System.out.println("Serving customer" + customer.getName());
        }
        else {
            System.out.println("No Customer to serve @Queue empty");
        }
    }

    //5 MAIN
    public static void main(String[] args) {
        Queue1CustomerService service = new Queue1CustomerService();

        //NEW CUSTOMERS ARRIVE
        service.arrive(new Queue1CustomerService_CustomerClass("Alice")); //@Alice arrives and joins the queue
        service.arrive(new Queue1CustomerService_CustomerClass("Luis"));
        service.arrive(new Queue1CustomerService_CustomerClass("Jack"));

        //SERVE CUSTOMERS
        service.serveCustomer(); //@Serve the first customer
        service.serveCustomer(); //@Serve the next customer
        service.serveCustomer();
        service.serveCustomer(); //TRY TO SERVE NO CUSTOMER LEFT
    }
}
