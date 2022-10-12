package capstone.merveozer.exception.table;

public class QueueGreaterThanTenException extends Exception {

	public QueueGreaterThanTenException() {}
	
	public QueueGreaterThanTenException(String message) {
		super(message);
	}
	
	 @Override
	 public String getMessage() {
	     return "We are sorry! Our tables have long queues so we cannot respond to you.";
	 }
}
