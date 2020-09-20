import java.util.ArrayList;
import java.util.List;

public abstract class Composite {
    public abstract float getBalance();
 
    public void add(Component g) throws Exception {
        throw new Exception();
    }
 
    public void remove(Component g) throws Exception {
        throw new Exception();
    }
 
    public Component getChild(int i) throws Exception {
        throw new Exception();
    }
}
