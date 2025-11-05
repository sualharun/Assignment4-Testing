import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*; // optional, depending on Randoop version

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopStackTest {

    @Test
    public void test1_pushAndPop() {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        int popped = stack.pop();
        assertEquals(20, popped);
        assertEquals(1, stack.size());
    }

    @Test
    public void test2_peekAfterPush() {
        Stack stack = new Stack(2);
        stack.push(5);
        int top = stack.peek();
        assertEquals(5, top);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void test3_stackFull() {
        Stack stack = new Stack(1);
        stack.push(99);
        assertTrue(stack.isFull());
        try {
            stack.push(100);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Stack is full", e.getMessage());
        }
    }

    @Test
    public void test4_popFromEmptyStack() {
        Stack stack = new Stack(2);
        try {
            stack.pop();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Stack is empty", e.getMessage());
        }
    }

    @Test
    public void test5_peekFromEmptyStack() {
        Stack stack = new Stack(2);
        try {
            stack.peek();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Stack is empty", e.getMessage());
        }
    }

    @Test
    public void test6_isEmptyAndIsFull() {
        Stack stack = new Stack(2);
        assertTrue(stack.isEmpty());
        stack.push(7);
        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());
        stack.push(8);
        assertTrue(stack.isFull());
    }
}

