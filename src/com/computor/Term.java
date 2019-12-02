package com.computor;

public class Term {

    private String alias;
    private String variable;
    private int exponent = 1;
    private double coefficient;
    private String operation;
    private int sign = 1;
    private boolean status = false;

    public Term(){

    }

    public Term(String alias, double coefficient, int exponent, String operation){
            this.alias = alias;
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.operation = operation;
    }

    public void modCoefficient(Double mod){
        this.coefficient += mod;
    }

    public String getAlias(){
        return this.alias;
    }

    public double getCoefficient(){
        return this.coefficient;
    }

    public int getExponent(){
        return this.exponent;
    }

    public String getOperation(){
        return this.operation;
    }

    public boolean getStatus(){
        return this.status;
    }

    public String getVariable(){
        return this.variable;
    }

    public int getSign(){
        return this.sign;
    }

    public void setAlias(String alias){
        this.alias = alias;
        this.setStatus(true);
    }

    public void setCoefficient(Double coefficient){
        this.coefficient = coefficient * sign;
    }

    public void setExponent(int exponent){
        this.exponent = exponent;
    }

    public void setOperation(String operation){
        this.operation = operation;
        if (operation.equalsIgnoreCase("/"))
            this.coefficient = 1 / this.coefficient;
    }

    public void setVariable(String variable){
            this.variable = variable;
    }

    public void setSign(int sign){
        this.sign *= sign;
        this.coefficient *= sign;
    }

    private void setStatus(boolean status){
        this.status = status;
    }
}
