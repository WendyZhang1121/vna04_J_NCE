package vna04_J_NCE;

//Client code:
class exampleClientCode {

	private final USCurrency currency = new USCurrency(); // ...
	public exampleClientCode() {
		Thread t1 = new Thread(new Runnable() { 
			@Override public void run() {
			currency.setQuarters(1).setDimes(1);
			}
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() { 
		@Override public void run() {
		currency.setQuarters(2).setDimes(2);
		}
		});
		t2.start();
		//... 
		}
	
	public static void main(String[] args) throws Exception {
		
		exampleClientCode test = new exampleClientCode();
	}
}
