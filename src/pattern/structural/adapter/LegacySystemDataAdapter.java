package pattern.structural.adapter;


public class LegacySystemDataAdapter extends SystemData{

    private LegacySystemData legacySystemData;

    public LegacySystemDataAdapter(LegacySystemData data) {
        this.legacySystemData = data;
    }

    @Override
    public int sendData() {
        return legacySystemData.sendLegacyData();
    }
}
