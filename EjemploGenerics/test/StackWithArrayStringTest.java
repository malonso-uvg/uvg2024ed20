import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackWithArrayStringTest {
    

    @Test
    public void testCount() {
        IStack<String> miStack = new StackWithArray<String>(10);
        //IStack<String> miStack = new StackWithNodes<Integer>();
        assertEquals(0, miStack.count());
        miStack.push("30");
        miStack.push("35");
        assertEquals(2, miStack.count());
    }

    @Test
    public void testIsEmpty() {
        //IStack miStack = new StackWithArray(10);
        IStack<String> miStack = new StackWithArray<String>(10);
        assertEquals(true, miStack.isEmpty());
        miStack.push("30");
        assertEquals(false, miStack.isEmpty());
    }

    @Test
    public void testPeek() {
        //IStack miStack = new StackWithArray(10);
        IStack<String> miStack = new StackWithArray<String>(10);
        
        assertEquals(null, miStack.peek());
        
        miStack.push("30");
        assertEquals("30", miStack.peek());
        assertEquals("30", miStack.peek());
    }

    @Test
    public void testPop() {
        //IStack miStack = new StackWithArray(10);
        IStack<String> miStack = new StackWithArray<String>(10);
        
        assertEquals(null, miStack.peek());
        miStack.push("30");
        assertEquals("30", miStack.pop());
        assertEquals(null, miStack.pop());
    }

    @Test
    public void testPush() {
        //IStack miStack = new StackWithArray(10);
        IStack<String> miStack = new StackWithArray<String>(10);
        
        assertEquals(null, miStack.peek());
        miStack.push("30");
        assertEquals("30", miStack.peek());
        miStack.push("50");
        assertEquals("50", miStack.peek());
    }
}
