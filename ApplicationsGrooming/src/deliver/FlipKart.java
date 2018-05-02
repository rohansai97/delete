package deliver;

import java.util.Random;
import java.util.Scanner;

public class FlipKart {
	void sell() {
		Random r = new Random();
		int option = r.nextInt(3) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur name");
		String name = sc.nextLine();
		System.out.println("enter ur ph no");
		long phone = sc.nextLong();
		sc.nextLine();
		System.out.println("enter ur adressname");
		String Address = sc.nextLine();
		if (option == 1) {
			FedEx f = new FedEx();
			f.deliver(name, phone, Address);
		} else if (option == 2) {
			IndianPost ip = new IndianPost();
			ip.deliver(name, phone, Address);
		} else if (option == 3) {
			DHL d = new DHL();
			d.deliver(name, phone, Address);

		}
	}
}
