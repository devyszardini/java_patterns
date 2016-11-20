package pattern.additional.ioc;

public class Service {
    private Option option;

    public String readOption(){
        return option.getOption();
    }

    public void setOption(Option option){
        this.option=option;
    }
}
