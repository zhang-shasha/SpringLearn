package com.hbuas.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }
    public void seeHouse(){
        System.out.println("看房子");
    }
    public void fare(){
        System.out.println("收取中介费用");
    }
}
