package run;

import java.util.Objects;
import org.junit.jupiter.api.Test;
import to.deserialize.Model;

public class SerializeTests {
    @Test
    public void testA(){
        if (!"{\"str\":\"zoo\",\"num\":12}".equals(new Model().serialize()))
            throw new AssertionError();
    }
}
