package Models;

public abstract class user extends human{

    //attributes
    //////////////////////////////////////////////////////////////
    public time Time=new time();
    String UserName;
    String Password;
    address Address;
    boolean IsAdmin;
    //////////////////////////////////////////////////////////////
    
    //seter
   //////////////////////////////////////////////////////////////  
    public abstract void setUserName(String UserName);
    public abstract void setPassword(String Password);
    public abstract void setAddress(String City,String state,String details);
   //////////////////////////////////////////////////////////////
   
    //geter
    //////////////////////////////////////////////////////////////
    public String getUserName() {return UserName;}
    public String getPassword() {return Password;}
    public address getAddress() {return Address;}
    public boolean isIsAdmin() {return IsAdmin;}
    //////////////////////////////////////////////////////////////

    
}
