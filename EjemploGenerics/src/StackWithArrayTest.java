import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackWithArrayTest {
    

    @Test
    public void testCount() {
        //IStack miStack = new StackWithArray(10);
        IStack<Integer> miStack = new StackWithNodes<Integer>();
        assertEquals(0, miStack.count());
        miStack.push(30);
        miStack.push(35);
        assertEquals(2, miStack.count());
    }

    @Test
    public void testIsEmpty() {
        //IStack miStack = new StackWithArray(10);
        IStack<Integer> miStack = new StackWithNodes<Integer>();
        assertEquals(true, miStack.isEmpty());
        miStack.push(30);
        assertEquals(false, miStack.isEmpty());
    }

    @Test
    public void testPeek() {
        //IStack miStack = new StackWithArray(10);
        IStack<Integer> miStack = new StackWithNodes<Integer>();
        Integer extpectedValue = 0;
        assertEquals(null, miStack.peek());
        extpectedValue = 30;
        miStack.push(30);
        assertEquals(extpectedValue, miStack.peek());
        assertEquals(extpectedValue, miStack.peek());
    }

    @Test
    public void testPop() {
        //IStack miStack = new StackWithArray(10);
        IStack<Integer> miStack = new StackWithNodes<Integer>();
        Integer extpectedValue = 0;
        assertEquals(null, miStack.peek());
        miStack.push(30);
        extpectedValue = 30;
        assertEquals(extpectedValue, miStack.pop());
        assertEquals(null, miStack.pop());
    }

    @Test
    public void testPush() {
        //IStack miStack = new StackWithArray(10);
        IStack<Integer> miStack = new StackWithNodes<Integer>();
        Integer extpectedValue = 0;
        assertEquals(null, miStack.peek());
        miStack.push(30);
        extpectedValue = 30;
        assertEquals(extpectedValue, miStack.peek());
        miStack.push(50);
        extpectedValue = 50;
        assertEquals(extpectedValue, miStack.peek());
    }
}
