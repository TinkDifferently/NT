package run;

import java.util.Objects;
import model.CustomSerializer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import to.deserialize.Model;

public class SerializeTests {
    @Test
    public void testA(){
        System.out.println(CustomSerializer.getInstance().serialize(new Model()));
    }

    @Test
    public void testB(){
        if (!"{\"str\":\"zoo\",\"num\":12}".equals(new Model().serialize()))
            throw new AssertionError();
    }
    @Test
    public void testC(){
        if (!"{\"str\":\"zoo\",\"num\":12}".equals(new Model().serialize()))
            throw new AssertionError();
    }
    @Test
    @DisplayName("Мой тест")
    public void testD(){
        System.out.println(new Model().serialize());
    }
}
