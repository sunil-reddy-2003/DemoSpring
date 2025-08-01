package com.sunil;

public class Dev {




    private Computer com;
//    private Laptop laptop;
    private int age;

     Dev() {
        System.out.println("in dev constructor");
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//        System.out.println("in dev1 constructor");
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }



//    public Dev(int age){
//        this.age=age;
//        System.out.println("in dev1 constructor");
//    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("working on awesome project");
        com.compile();
    }
}