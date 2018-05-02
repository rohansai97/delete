package deliver;

public class FedEx implements IDeliver{

	@Override
	public void deliver(String name, long phone, String address) {
		System.out.println("fedEx"+name +" "+phone+" "+address);	
		
	}

}
