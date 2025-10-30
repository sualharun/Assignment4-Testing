import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatGPTTest {

    @Test
    public void testPushPopPeek() {
        Stack s = new Stack(3);
        assertTrue(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        assertTrue(s.isFull());
        assertEquals(3, s.peek());
        assertEquals(3, s.pop());
        assertEquals(2, s.peek());
        assertEquals(2, s.pop());
        assertEquals(1, s.pop());
        assertTrue(s.isEmpty());
    }

    @Test
    public void testSizeIsEmptyIsFull() {
        Stack s = new Stack(2);
        assertEquals(0, s.size());
        assertTrue(s.isEmpty());
        s.push(10);
        assertEquals(1, s.size());
        assertFalse(s.isFull());
        s.push(20);
        assertEquals(2, s.size());
        assertTrue(s.isFull());
    }

    @Test
    public void testPushUntilFullThrows() {
        Stack s = new Stack(1);
        s.push(5);
        assertThrows(IllegalStateException.class, () -> s.push(6));
    }

    @Test
    public void testPopEmptyThrows() {
        Stack s = new Stack(1);
        assertThrows(IllegalStateException.class, s::pop);
    }

    @Test
    public void testPeekEmptyThrows() {
        Stack s = new Stack(1);
        assertThrows(IllegalStateException.class, s::peek);
    }
}
