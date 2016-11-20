package pattern.additional.ioc;


public class Container {
    //develop by consumer

    private Service service;

    public void init(){
        service = new Service();
        service.setOption(new OptionB());
    }

    public Service getService(){return service;}

    public static void main(String[] args) {
        Container container = new Container();
        container.init();
        Service service = container.getService();
        System.out.println( service.readOption());
    }
}
