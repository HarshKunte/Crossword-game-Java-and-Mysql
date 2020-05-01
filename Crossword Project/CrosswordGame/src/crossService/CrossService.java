package crossService;
import crossDAO.CrossDAO;
import crossbean.CrossBean;
import crossDAO.CrossDB;
public class CrossService {
     CrossBean cb=new CrossBean();
     CrossBean cg=new CrossBean();
     CrossDAO crossDAO=new CrossDAO();
     
     public void register(String fname,String lname,String dob,String contact,String uname,String upass)
     {
    	 cb.setFname(fname);
    	 cb.setLname(lname);
    	 cb.setDob(dob);
    	 cb.setContact(contact);
    	 cb.setUname(uname);
    	 cb.setUpass(upass);
    	 int updateResult=0;
    	 try
    	 {
    		 crossDAO.Register(cb);
    		 
    	 }
    	 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			
		 }
     }
     
     public void login(String name,String pass)
     {
    	 cb.setUname(name);
    	 cb.setUpass(pass);
    	 try
    	 {
    		 crossDAO.Login(cb);
    	 }
    	 catch(Exception e){System.out.println(e);}
    		 
    	 
     }
     public void easy(int id,String name,String pass){
    	 cb.setEasy(id);
     	cb.setUname(name);
     	cb.setUpass(pass);
     	crossDAO.Easy(cb);
     }
     public void medium(int score,String name,String pass)
     {
    	cb.setMedium(score);
    	cb.setUname(name);
    	cb.setUpass(pass);
    	crossDAO.Medium(cb);
     }
     public void hard(int score,String name, String pass){
    	 cb.setHigh(score);
     	cb.setUname(name);
     	cb.setUpass(pass);
     	crossDAO.Hard(cb);
     }
}
