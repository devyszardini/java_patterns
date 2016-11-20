package pattern.behavioral.template;

public class Client {
    public static void main(String[] args) {
        Template template = new Action1();
        System.out.println(template.result());

        template = new Action2();
        System.out.println(template.result());

    }
}
