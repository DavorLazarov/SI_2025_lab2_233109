import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testiraj_everyBranch() {

        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, "2314567891092921"));
        assertEquals("allItems list can't be null!", ex.getMessage());

        List<Object> list1 = new ArrayList<>();
        list1.add(new Item("1", 1, 100, 0));
        list1.add(new Item("2", 1, 200, 0));
        list1.add(new Item("", 1, 300, 0));
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list1, "2314567891092921"));
        assertEquals("Invalid item!", ex.getMessage());

        List<Object> list2 = new ArrayList<>();
        list2.add(new Item("1", 1, 100, 0));
        list2.add(new Item("2", 1, 200, 0));
        list2.add(new Item("3", 1, 300, 0));
        assertEquals(600.0, SILab2.checkCart(list2, "2314567891092921"));

        List<Object> list3 = new ArrayList<>();
        list3.add(new Item("1", 1, 100, 0));
        list3.add(new Item("2", 1, 200, 0));
        list3.add(new Item("3", 1, 300, 0));
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list3, "231456789AEFG321"));
        assertEquals("Invalid character in card number!", ex.getMessage());

        List<Object> list4 = new ArrayList<>();
        list4.add(new Item("1", 1, 100, 0));
        list4.add(new Item("2", 1, 200, 0));
        list4.add(new Item("3", 1, 300, 0));
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list4, "231456789"));
        assertEquals("Invalid card number!", ex.getMessage());
    }

    @Test
    public void testiraj_multipleConditions() {
        // ova ke bide za 000
        List<Object> list1 = List.of(new Item("Item", 5, 100, 0));
        assertEquals(500.0, SILab2.checkCart(list1, "1234567890123456"));

        // ova ke bide za 100
        List<Object> list2 = List.of(new Item("Item", 5, 355, 0));
        assertEquals(1775.0, SILab2.checkCart(list2, "1234567890123456"));

        // ova ke bide za 010
        List<Object> list3 = List.of(new Item("Item", 7, 100, 10));
        assertEquals(630.0, SILab2.checkCart(list3, "1234567890123456"));

        // ova ke bide za 001
        List<Object> list4 = List.of(new Item("Item", 15, 100, 0));
        assertEquals(1500.0, SILab2.checkCart(list4, "1234567890123456"));

        // ova ke bide za 110
        List<Object> list5 = List.of(new Item("Item", 5, 400, 10));
        assertEquals(1800.0, SILab2.checkCart(list5, "1234567890123456"));

        // ova ke bide za 011
        List<Object> list6 = List.of(new Item("Item", 13, 200, 11));
        assertEquals(2314.0, SILab2.checkCart(list6, "1234567890123456"));

        // ova ke bide za 101
        List<Object> list7 = List.of(new Item("Item", 16, 510, 0));
        assertEquals(8160.0, SILab2.checkCart(list7, "1234567890123456"));

        // ova ke bide za 111
        List<Object> list8 = List.of(new Item("Item", 16, 500, 10));
        assertEquals(7200.0, SILab2.checkCart(list8, "1234567890123456"));
    }
}
