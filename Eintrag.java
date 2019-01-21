package com.example.harry.db4;

import java.util.ArrayList;
import java.util.Date;

/**
 * Klasse für einen einzelnen Eintrag mit mit einer Reihe an Records (x,y), dem Datum, welche Achsen
 * benutzt wurden, von welchem Typ der Record ist, welchem user er gehört etc. pp.
 * @author Team Mizan
 */
public class Eintrag {
    final private Date o_Datum;
    private ArrayList<Record> al_Records;
    final private boolean v_hasX;
    final private boolean v_hasY;
    private Type o_Type;
    private User o_User;
    private int v_id;

    public Eintrag(boolean p_hasX, boolean p_hasY, Type p_Type, User p_User, int p_id)
    {
        this.v_hasX = p_hasX;
        this.v_hasY = p_hasY;
        this.al_Records = new ArrayList<>();
        this.o_Datum = new Date();
        this.o_Type = p_Type;
        this.o_User = p_User;
        this.v_id = p_id;
    }
    public String getInfo()
    {
        return String.format("vom: %s",this.o_Datum.toString());
    }
    public Eintrag(boolean p_hasX, boolean p_hasY, Type p_Type, User p_User, Date p_Date, int p_id)
    {
        this.v_hasX = p_hasX;
        this.v_hasY = p_hasY;
        this.al_Records = new ArrayList<>();
        this.o_Datum = p_Date;
        this.o_Type = p_Type;
        this.o_User = p_User;
        this.v_id = p_id;
    }

    public void addRecord(int p_x, int p_y)
    {
        al_Records.add(new Record(p_x,p_y));
    }

    public ArrayList<Record> getRecords()
    {
        return this.al_Records;
    }



    public Type getType()
    {
        return this.o_Type;
    }
    public int getID()
    {
        return this.v_id;
    }

    public boolean isV_hasX() {
        return v_hasX;
    }

    public boolean isV_hasY() {
        return v_hasY;
    }
}
