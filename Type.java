package com.example.harry.db4;

public class Type {
    String v_Name;
    int v_ID;

    public Type(String p_Name, int p_ID)
    {
        this.v_Name = p_Name;
        this.v_ID = p_ID;
    }

    public String getName()
    {
        return this.v_Name;
    }
    public int getID()
    {
        return this.v_ID;
    }
}
