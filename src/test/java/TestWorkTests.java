import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestWorkTests {

    @Test
    public void testGreeting() {
        String expected = "Hello";
        ITestWork foo = new TestWork();
        Assertions.assertEquals(expected, foo.Greetings());
    }

    @Test
    public void testFarewell() {
        String expected = "bye";
        ITestWork foo =  new TestWork();
        Assertions.assertEquals(expected, foo.Farewell());
    }
}