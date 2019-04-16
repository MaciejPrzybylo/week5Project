package notDefaultPackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class app {
	static ObjectMapper mapper = new ObjectMapper();
	static TddFeature bob = new TddFeature();
	static Map<Integer, Account> map = new HashMap<Integer, Account>();
	public static void main(String[] args) {
		
		System.out.println("Yoo world");
		
		

		Account acc1 = new Account("Maciej", "Przybylo", 10);
		Account acc2 = new Account("Janusz", "Smith", 10);
		Account acc3 = new Account("Bogdan", "GrraazYna", 10);
		Account acc4 = new Account("Maciej", "Przybylo", 10);
		Account acc5 = new Account("Maciej", "Przybylo", 10);
		Account acc6 = new Account("Maciej", "Przybylo", 10);
		Account acc7 = new Account("Maciej", "Przybylo", 10);
		Account acc8 = new Account("Maciej", "Przybylo", 10);
		map.put(1, acc1);
		map.put(2, acc2);
		map.put(3, acc3);
		map.put(4, acc4);
		map.put(5, acc5);
		map.put(6, acc6);
		map.put(7, acc7);
		map.put(8, acc8);
		
		for (Map.Entry<Integer, Account> entry : map.entrySet()) {
			int key = entry.getKey();
			Account b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.getFirstName()+" "+b.getLastName()+" "+b.getAccountNumber()+" ");  	
		}
	


	
		
		   try {
	            mapper.writeValue(new File("result.json"), map);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		   try {
	            Map<String, Object> mmap = mapper.readValue(new File(
	                    "result.json"), new TypeReference<Map<String, Object>>() {
	            });
	 
	            System.out.println("Name : " + mmap.get("Maciej"));
	            System.out.println("Surname : " + mmap.get("Janusz"));
	            System.out.println("ID : " + mmap.get("Bogdan"));
	            System.out.println(mmap);
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	System.out.println(bob.getClass());
	System.out.println("Total: "+ cAcc("Maciej"));
	}

	public static int cAcc(String nameL) {
	int i=0;
		for (Map.Entry<Integer, Account> entry : map.entrySet()) {
		Account b = entry.getValue();
		if(b.getFirstName().equals(nameL)) {
			 i++;
		}
		
	}
		return i;
	
	}
}
