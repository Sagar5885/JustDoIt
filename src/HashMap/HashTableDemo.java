package HashMap;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by sdodia on 3/24/17.
 */
public class HashTableDemo {
    public static void main(String args[]) {
        // Create a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara", new Double(3434.34));
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));

        // Show all balances in hash table.
        names = balance.keys();

        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Deposit 1,000 into Zara's account
        bal = ((Double)balance.get("Zara")).doubleValue();
        balance.put("Zara", new Double(bal + 1000));
        System.out.println("Zara's new balance: " + balance.get("Zara"));
    }

    /*
    Though both Hashtable and HashMap are data-structure based upon hashing and implementation of Map interface,
    the main difference between them is that HashMap is not thread-safe but Hashtable is thread-safe.
    Which means you cannot use HashMap in multi-threaded Java application without external synchronization.
    Another difference is HashMap allows one null key and null values but Hashtable doesn't allow null key or values.
    Also, thread-safety of the hash table is achieved using internal synchronization, which makes it slower than HashMap.
     */
}
