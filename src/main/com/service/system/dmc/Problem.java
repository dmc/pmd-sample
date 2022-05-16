package com.service.system.dmc;

public class Problem {

    private int number;

    // 利用してない変数として指摘される
    private String type;
   
    public Problem(int number){
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    } 
    
}
