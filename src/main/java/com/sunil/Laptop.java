package com.sunil;

public class Laptop implements Computer {
    Laptop(){
        System.out.println("in laptop constructor");
    }

    public void compile(){
        System.out.println("compiling in laptop");
    }
}
