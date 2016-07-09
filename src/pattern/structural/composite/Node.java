package pattern.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Node implements Root{

    List<Root> children = new ArrayList<>();
    
    @Override
    public void draw() {
        for (Root child : children) {
            child.draw();
        }
    }

    public List<Root> getChildren() {
        return children;
    }
}
