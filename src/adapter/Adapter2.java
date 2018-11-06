package adapter;

public class Adapter2 implements Target {


    private Adaptee adaptee;
    @Override
    public void handlerReq() {
        adaptee.request();
    }
    public Adapter2(Adaptee adaptee){
        super();
        this.adaptee = adaptee;
    }


}
