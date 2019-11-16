package to.deserialize;

import annotations.Hudson;
import model.PInt;
import model.PObject;
import model.PString;

public class Model {
    @Hudson("base")
    private String str="zoo";
    private Integer num=12;
    private String[] strs={"cow","horse","cat"};
    private Integer[] nums={666,692,781};
}
