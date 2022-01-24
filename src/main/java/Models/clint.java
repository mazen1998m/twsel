package Models;


public class clint extends user {

    public clint() {
        IsAdmin=false;
    }

    @Override
    public void setUserName(String UserName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String Password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String City,String state,String details) {
        address Address = null;
        Address.setCity(City);
        Address.setState(state);
        Address.setDetails(details);
        
        
    }
   
   
    @Override
    public void setId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String Name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setType(String Type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPhone(String Phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    boolean IsUserNameValid(){
    
    }
    
    boolean IsPasswordValid(){
    
    }
    
    boolean IsUserNameValid(){
    
    }
    
}
