/*HashMap 
 * 
 * It is a class of Map interface.
 * Underlying DataStructure is HashTable.
 * Insertion order not preserved.
 * Duplicate Keys are not allowed.
 * Duplicate Values are not allowed.
 * Only one null key allowed.
 * Multiple Null Values are Allowed.
 * Searching will be faster in HashMap.
 * */ 

package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();
		// HashMap m = new HashMap();
		m.put(101, "Raushan");
		m.put(102, "Vishal");
		m.put(103, "Rakesh");
		m.put(108, "Ravi");
		m.put(105, "Hari");
		m.put(106, "Hari"); // Duplicate Values are allowed.

		System.out.println(m);
		
		//Output:-{101=Raushan, 102=Vishal, 103=Rakesh, 105=Hari, 106=Hari, 108=Ravi}

		// 1. Use to get the value.
		System.out.println(m.get(105));
		//output:-Hari

		// 2.Remove pair from HashMap.
		m.remove(106);
		System.out.println(m);
		//{101=Raushan, 102=Vishal, 103=Rakesh, 105=Hari, 108=Ravi}

		// 3.Check the key is not present.
		System.out.println(m.containsKey(101));
		System.out.println(m.containsKey(106));
		//output:-True False

		// 4.Check value is present or not.
		System.out.println(m.containsValue("Raushan"));
		System.out.println(m.containsValue("Raj"));
		//Output :-True False

		// 5. Check HashMap is empty or not.
		System.out.println(m.isEmpty()); 
		//Output:-False

		// 6.Return all the key as Set.
		System.out.println(m.keySet());
		//Output:-[101, 102, 103, 105, 108]

		// 7.Resturn all the Values as a collection.
		System.out.println(m.values());
		//Output:-[Raushan, Vishal, Rakesh, Hari, Ravi]

		// 8.All the Entries from HashMap.
		System.out.println(m.entrySet());
		//Output:-[101=Raushan, 102=Vishal, 103=Rakesh, 105=Hari, 108=Ravi]

		// 9.Print all the Key one by One.
		for (Object i : m.keySet()) {
			System.out.println(i);
		}
		/*output
		
		101
		102
		103
		105
		108*/
		
		// 10.Print all the Values one by one.
		for (Object i : m.values()) {
			System.out.println(i);
		}
		
		/*output
		Raushan
		Vishal
		Rakesh
		Hari
		Ravi*/

		// 11. It fives Key and Value.

		for (Object i : m.keySet()) {
			System.out.println(i + " " + m.get(i));
		}
		
		/*output
		101    Raushan
        102    Vishal
        103    Rakesh
        105    Hari
        108    Ravi
		 */

		// Entry methods
		// ********************
		// Return all the entrys from hashmap.
		for (Map.Entry entry : m.entrySet()) // 101 x
		{
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		/*output
		101    Raushan
        102    Vishal
        103    Rakesh
        105    Hari
        108    Ravi
		 */

		// iterator()

		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
		
		/*output
		  101    Raushan
          102    Vishal
          103    Rakesh
          105    Hari
          108    Ravi
		 */

	}

}
