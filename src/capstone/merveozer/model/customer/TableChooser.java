package capstone.merveozer.model.customer;

import java.util.Random;

import capstone.merveozer.exception.table.QueueGreaterThanTenException;
import capstone.merveozer.model.table.Table;

public interface TableChooser {

	 /** 
     * If there is a queue at the table chosen by the customer;
     * @param random gives a random response (true or false)
     * 	if random's response is false, customer leaves restaurant
     * 	but if response is true, we try to find the table with the least queue.
     * If queue size greater than 10, throws an exception.
     * @author Merve Ozer
     */
	public default void checkTablesQueue(Random random, Customer customer) throws QueueGreaterThanTenException{	
		try {	
			if(customer.getChosenTable().getQueueSize() > 10) {
				throw new QueueGreaterThanTenException();
			}
			
			else {
				boolean isWait = random.nextBoolean();	
				if (customer.getChosenTable().getQueueSize() > 0) {
					System.out.println("Will "+ customer + " wait? => " + isWait);
					if (isWait == true) {
						for (Table table : customer.getTables()) {
							if (table != customer.getChosenTable() && table.getQueueSize() < customer.getChosenTable().getQueueSize()) {
								customer.setChosenTable(table);
							}
						}
						System.out.println(customer + " says that can wait for " + customer.getChosenTable());
					} else {
						System.out.println(customer + " leaves restaurant because he or she don't want to wait...");
						try {
							customer.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}catch(QueueGreaterThanTenException e){
			System.out.println(customer + "-" + e.getMessage());
			try {
				customer.join();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}
