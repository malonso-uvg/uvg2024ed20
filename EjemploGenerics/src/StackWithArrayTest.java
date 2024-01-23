import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackWithArrayTest {
    

    @Test
    public void testCount() {
        //IStack miStack = new StackWithArray(10);
        IStack miStack = new StackWithNodes();
        assertEquals(0, miStack.count());
        miStack.push(30);
        miStack.push(35);
        assertEquals(2, miStack.count());
    }

    @Test
    public void testIsEmpty() {
        //IStack miStack = new StackWithArray(10);
        IStack miStack = new StackWithNodes();
        assertEquals(true, miStack.isEmpty());
        miStack.push(30);
        assertEquals(false, miStack.isEmpty());
    }

    @Test
    public void testPeek() {
        //IStack miStack = new StackWithArray(10);
        IStack miStack = new StackWithNodes();
        assertEquals(0, miStack.peek());
        miStack.push(30);
        assertEquals(30, miStack.peek());
        assertEquals(30, miStack.peek());
    }

    @Test
    public void testPop() {
        //IStack miStack = new StackWithArray(10);
        IStack miStack = new StackWithNodes();
        assertEquals(0, miStack.peek());
        miStack.push(30);
        assertEquals(30, miStack.pop());
        assertEquals(0, miStack.pop());
    }

    @Test
    public void testPush() {
        //IStack miStack = new StackWithArray(10);
        IStack miStack = new StackWithNodes();
        assertEquals(0, miStack.peek());
        miStack.push(30);
        assertEquals(30, miStack.peek());
        miStack.push(50);
        assertEquals(50, miStack.peek());
    }
}
