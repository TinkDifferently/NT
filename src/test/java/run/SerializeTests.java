package run;

import java.util.Objects;
import model.CustomSerializer;
import model.PString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import to.deserialize.Model;

public class SerializeTests {
    @Test
    public void testA() {
        System.out.println(CustomSerializer.getInstance().serialize(new Model()));
    }
    @Test
    public void pStringTest(){
        PString pString=new PString("name", new String[] {});
        System.out.println(pString.serialize());
        pString=new PString("name", new String[] {"a","b"});
        System.out.println(pString.serialize());
    }
}
