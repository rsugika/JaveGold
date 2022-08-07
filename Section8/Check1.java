import java.util.ArrayList;
import java.util.List;

class Check1 {

    private List<Object> list = new ArrayList<>();
    public void add(Object obj) {
        if (obj instanceof Test1) {
            this.list.add(obj);
        }

        // do something
    } 
}

interface Test1 {

}