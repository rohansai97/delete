package deliver;

public class DHL implements IDeliver{

	@Override
	public void deliver(String name, long phone, String address) {
		System.out.println("DHL"+name +" "+phone+" "+address);	
	}

}
