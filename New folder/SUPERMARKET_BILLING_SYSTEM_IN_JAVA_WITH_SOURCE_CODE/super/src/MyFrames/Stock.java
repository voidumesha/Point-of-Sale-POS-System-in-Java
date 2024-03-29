package MyFrames;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMEER
 */
public class Stock {

    private String id;
    private String pname;
    private int available;
    private int mrp;
    
    public Stock(String id,String pname,int available, int mrp)
    {
        this.id=id;
        this.pname=pname;
        this.available=available;
        this.mrp=mrp;
        
        
    }
            
    public String getid()
    {
        return id;
    }
    public String getpname()
    {
        return pname;
    }
    public int getavailable()
    {
        return available;
    }
    public int getmrp()
    {
        return mrp;
    }
  }
