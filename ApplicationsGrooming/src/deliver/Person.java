package deliver;

public class Person {
void purchase() {
	System.out.println("opened the flipkart website");
	FlipKart f = new FlipKart();
	System.out.println("requesting the flipakart to sell the product");
	f.sell();
}
public static void main(String[] args) {
	System.out.println("person is persent");
	Person p = new Person();
	System.out.println("he is perchasing the product");
	p.purchase();
}
}
