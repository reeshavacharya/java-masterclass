package com.company;

public class Car
{

    private int doors;
    private int wheels;
    private String model;
    private String color;
    private String engine;

    public void setModel(String model)
    {       String validity=model.toLowerCase();
        if(validity.equals("spyder")|| validity.equals("r8"))
        {
            this.model= model;

        }
        else {
            this.model= "UNKNOWN";
        }
    }
    public String getModel()
    {
        return this.model;
    }
}
