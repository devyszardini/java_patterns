package pattern.structural.adapter;

public class Client {
    public static void main(String[] args) {

        Client client = new Client();
        LegacySystemData data = new LegacySystemData();
        LegacySystemDataAdapter adapter = new LegacySystemDataAdapter(data);
        client.calculateSystemData(adapter);
    }

    public void calculateSystemData(SystemData data){
        System.out.println("Data = "+data.sendData());
    }
}
