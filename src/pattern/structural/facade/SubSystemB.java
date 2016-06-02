package pattern.structural.facade;

class SubSystemB {

//    creates SubSYstemA

    SubSystemA createSubSYstemA(int data){
        return new SubSystemA(data);
    }
}
