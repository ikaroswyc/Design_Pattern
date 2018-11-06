package adapter;

// 笔记本，客户端类


public class Client {

    public void test1(Target t){
        t.handlerReq();
    }

    public static void main(String[] args){
        Client c = new Client();
        Adaptee a  = new Adaptee();

//        Target t = new Adapter();
        Target t = new Adapter2(a);
        c.test1(t);
    }
}
