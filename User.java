package com.example.harry.db4;

public class User {
    private String v_name;
    private int v_id;

    public User(String p_name, int p_id)
    {
        this.v_name = p_name;
        this.v_id = p_id;
    }

    public String getName()
    {
        return this.v_name;
    }
    public int getID()
    {
        return this.v_id;
    }
    public String getInfo()
    {
        return String.format("User: %s\nID: %d\n",this.getName(), this.getID());
    }
}
