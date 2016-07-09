package pattern.structural.composite;

public class Client {
    public static void main(String[] args) {
        Leaf1 leaf1 = new Leaf1();
        Leaf2 leaf2 = new Leaf2();
        Node node1 = new Node();
        node1.getChildren().add(leaf1);
        node1.getChildren().add(leaf2);
        node1.draw();
        System.out.println("drawing children node");
        Leaf1 leaf11 = new Leaf1();
        Node node2 = new Node();
        node2.getChildren().add(leaf11);
        node2.getChildren().add(node1);
        node2.draw();


    }
}
