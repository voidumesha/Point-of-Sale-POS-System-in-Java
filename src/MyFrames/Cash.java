package MyFrames;


/**
 *
 * @author umesha
 */
public class Cash {

    private int id;
    private String name;
    private String mno;
    private String address;
    private String email;
    private String password;
    
    public Cash(int id,String name,String mno,String address,String email, String password)
    {
        this.id=id;
        this.name=name;
        this.mno=mno;
        this.address=address;
        this.email=email;
        this.password=password;
        
    }
            
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getmno()
    {
        return mno;
    }
    public String getaddress()
    {
        return address;
    }
    public String getemail()
    {
        return email;
    }
    public String getpassword()
    {
        return password;
    }
}
