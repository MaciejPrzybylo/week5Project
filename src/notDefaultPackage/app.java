package notDefaultPackage;

import java.util.HashMap;
import java.util.Map;

public class app {

	
	public static void main(String[] args) {
		System.out.println("Yoo world");

		Map<Integer, Account> map = new HashMap<Integer, Account>();
		Account acc1 = new Account("Maciej", "Przybylo", 10);
		Account acc2 = new Account("Janusz", "Smith", 10);
		Account acc3 = new Account("Bogdan", "GrraazYna", 10);
		map.put(1, acc1);
		map.put(2, acc2);
		map.put(3, acc3);

		for (Map.Entry<Integer, Account> entry : map.entrySet()) {
			int key = entry.getKey();
			Account b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.getFirstName()+" "+b.getLastName()+" "+b.getAccountNumber()+" ");  	
		}

	}
}
