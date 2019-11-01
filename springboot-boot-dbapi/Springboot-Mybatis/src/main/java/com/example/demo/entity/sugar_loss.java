package com.example.demo.entity;

public class sugar_loss {

    /*private String id;*/
    private String yyyymm;
    private String sugar_loss;

   /* public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }*/

    public String getyyyymm() {
        return yyyymm;
    }

    public void setyyyymm(String yyyymm) {
        this.yyyymm = yyyymm;
    }

    public String getsugar_loss() {
        return sugar_loss;
    }

    public void setsugar_loss(String sugar_loss) {
        this.sugar_loss = sugar_loss;
    }



    @Override
    public String toString() {
        return "sugar_loss [  yyyymm=" + yyyymm + ", sugar_loss=" + sugar_loss + "]";
    }



}
