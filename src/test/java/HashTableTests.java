import com.lizazaitseva.hashtable.HashTable;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HashTableTests {

    @Test
    public void search (){
        HashTable table = new HashTable();
        table.add(12);
        table.add(55);
        assertTrue(table.search(12));
        assertFalse(table.search(21));

    }

    @Test
    public void add (){
        HashTable table = new HashTable();
        table.add(15);
        table.add(12);
        table.add(31);
        assertEquals("15 - 15\n12 - 12\n31 - 31", table.toString());
    }

    @Test
    public void set (){
        HashTable table = new HashTable();
        table.add(15);
        table.add(12);
        table.add(31);
        table.add(13);
        assertEquals("13 - 13", table.set(3).toString());

    }

    @Test
    public void remove (){
        HashTable table = new HashTable();
        table.add(15);
        table.add(12);
        table.add(31);
        table.add(13);
        table.remove(31);
        assertEquals("15 - 15\n12 - 12\n13 - 13", table.toString());

    }

    @Test
    public void get (){
        HashTable table = new HashTable();
        table.add(15);
        table.add(12);
        table.add(31);
        assertEquals(31, table.get(31));

    }

    @Test
    public void equal (){
        HashTable table1 = new HashTable();
        HashTable table2 = new HashTable();
        table1.add(13);
        table2.add(13);
        table1.add(14);
        table2.add(14);

    }
}
