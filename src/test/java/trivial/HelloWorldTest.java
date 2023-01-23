package trivial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void runningTests ( ) {
        Assertions.assertEquals ( 2 + 1, 3 );
    }

}
