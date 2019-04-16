package notDefaultPackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class app {

	
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
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
	}
}
