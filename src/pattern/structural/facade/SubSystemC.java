package pattern.structural.facade;


class SubSystemC {

//    Use SubSystemA to create SubSystemC data

    void createCwithA(SubSystemA a)
    {
        System.out.println("created SubSystemC with SubsystemA data of "+a.getData());
    }
}
