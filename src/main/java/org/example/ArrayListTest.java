import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListTest {

    private ArrayList<Integer> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        list.add(1);
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
    }

    @Test
    public void testAddNullElement() {
        list.add(null);
        assertEquals(1, list.size());
        assertNull(list.get(0));
    }

    @Test
    public void testRemoveElement() {
        list.add(1);
        list.add(2);
        list.remove(Integer.valueOf(1));
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(2), list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElementOutOfBounds() {
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveElementOutOfBounds() {
        list.remove(0);
    }

    @Test
    public void testClearList() {
        list.add(1);
        list.add(2);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testContainsElement() {
        list.add(1);
        assertTrue(list.contains(1));
        assertFalse(list.contains(2));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
    }

    @Test
    public void testAddElementAtSpecificIndex() {
        list.add(0, 1);
        list.add(1, 3);
        list.add(1, 2);
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddElementAtInvalidIndex() {
        list.add(1, 1);
    }

    @Test
    public void testSetElementAtSpecificIndex() {
        list.add(1);
        list.set(0, 2);
        assertEquals(Integer.valueOf(2), list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetElementAtInvalidIndex() {
        list.set(0, 1);
    }
}
