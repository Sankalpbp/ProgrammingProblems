package trivial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    private static HelloWorld helloWorld;

    @BeforeAll
    static void testSetup() {
        helloWorld = new HelloWorld ();
    }

    @Test
    public void runningTests ( ) {
        Assertions.assertEquals ( 2 + 1, 3 );
    }

    @Test
    public void mainTest () {
        String helloWorldString = helloWorld.returnHelloWorld ();
        Assertions.assertEquals ( "Hello World", helloWorldString );
    }

}
