package com.service.system.dmc;

public class Problem {

    private int number;

    // 利用してない変数として指摘される
    private String type;

    // 利用してない変数として指摘される
    private String category;

    // 利用してない変数として指摘される
    private String comment;
   
    public Problem(int number){
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    } 
    
}
