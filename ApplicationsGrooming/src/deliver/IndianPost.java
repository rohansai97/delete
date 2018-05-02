package deliver;

public class IndianPost implements IDeliver{

	@Override
	public void deliver(String name, long phone, String address) {
System.out.println("indian post"+name +" "+phone+" "+address);		
	}

}
