package crossDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.myproject.UI.Login1;
import com.myproject.UI.UIlogin;

import crossDAO.CrossDB;
import crossService.CrossService;
import crossbean.CrossBean;

public class CrossDAO {
	CrossBean cb=new CrossBean();
	String dname=cb.getUname();
	
	public void Register(CrossBean cb)
	{ Connection con = null;
	  PreparedStatement p= null;
	  try
	  {
		 
		  con=CrossDB.getConnection();
		  String ch="select * from registration where uname=? ";
		 PreparedStatement pt=con.prepareStatement(ch);
		 pt.setString(1, cb.getUname());
		  ResultSet rs = pt.executeQuery();
		  if(rs.next())
		  {
			  JOptionPane.showMessageDialog(null, "Username already exist");
		  }
		  else{
		  String ins_str = 
			  "insert into registration(fname,lname,dob,contact,uname,upass) values(?,?,?,?,?,?)";
		  
		  p = con.prepareStatement(ins_str);
		  p.setString(1,cb.getFname());
		  p.setString(2,cb.getLname());
		  p.setString(3,cb.getDob());
		  p.setString(4,cb.getContact());
		  p.setString(5,cb.getUname());
		  p.setString(6,cb.getUpass());
		  int jt = p.executeUpdate();
		  if(jt==1)
		  {
			  JOptionPane.showMessageDialog(null,"Registered Sucessfully...");
		  }
		  else
		  {
			  JOptionPane.showMessageDialog(null,"UnSucessfull...");
		  }
		  }
		 
		  
		  
	}
	  catch(Exception ex)
	  {
	  System.out.println(ex.toString());
	 
	  }
}
	
	@SuppressWarnings("static-access")
	public int Login(CrossBean cb)
	{
		int updatecount=0;
		Connection con=null;
		PreparedStatement stmt= null;
		String dname=cb.getUname();
		String dpass=cb.getUpass();
		try
		{
		con =CrossDB.getConnection();
		String sql="Select * from registration where uname=?and upass=?";
		stmt=con.prepareStatement(sql);
		stmt.setString(1, dname);
		stmt.setString(2, dpass);
		 ResultSet rs = stmt.executeQuery();
		 if(rs.next())
		 {
			 //cb.setUname(dname);
				//cb.setUpass(dpass);
			// CrossService cs=new CrossService();
			 //cs.name(dname);
			 JOptionPane.showMessageDialog(null, "Login Succesfully...");
			
			Login1.frame.dispose();
			 UIlogin ui=new UIlogin();
			 ui.main(null);
			 
			updatecount=1;
			  
		 }
		 else
		 {
			 JOptionPane.showMessageDialog(null, "Invalid username or password");
		 con.close();
		
		 }
		 
	}
		
	catch(Exception e){System.out.println(e);}
		return updatecount;
	}
	public void Medium(CrossBean cb)
	{
		 Connection con = null;
		  PreparedStatement ps= null;
		  PreparedStatement pst= null;
		  try{
			  con=CrossDB.getConnection();
			  String s="select *from registration where uname=?";
			  pst=con.prepareStatement(s);
			  pst.setString(1,cb.getUname());
			  ResultSet rs = pst.executeQuery();
			  if(rs.next())
			  {
				  try{
						con=CrossDB.getConnection();
						String sql="update registration set medium=? where uname=? ";
						 ps=con.prepareStatement(sql);
				         ps.setInt(1,cb.getMedium());
				         ps.setString(2,cb.getUname());
				         ps.executeUpdate();
				         
				         
					} 
				  catch(Exception e1){System.out.println(e1);}
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(null, "Username does not exist");
			  }
		  }
		
         
	
		  catch(Exception e1){System.out.println(e1);}
	}
	public void Easy(CrossBean cb)
	{
		System.out.println(cb.getUname());
		Connection con = null;
		  PreparedStatement ps= null;
		  PreparedStatement pst= null;
		 try{
			  con=CrossDB.getConnection();
			  String s="select *from registration where uname=? and upass=?";
			  pst=con.prepareStatement(s);
			  pst.setString(1,cb.getUname());
			  pst.setString(2, cb.getUpass());
			  ResultSet rs = pst.executeQuery();
			  if(rs.next())
			  {
			  try{
						con=CrossDB.getConnection();
						String sql="update registration set easy=? where uname=? ";
						 ps=con.prepareStatement(sql);
				         ps.setInt(1,cb.getEasy());
				         ps.setString(2,cb.getUname());
				         ps.executeUpdate();
				         
				         
					} 
				  catch(Exception e1){System.out.println(e1);}
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(null, "Invalid Username or password\n\nPress Finish Button again to submit your score");
			  }
		  }
		
	
	
		  catch(Exception e1){System.out.println(e1);}	
	}
	public void Hard(CrossBean cb)
	{
		Connection con = null;
		  PreparedStatement ps= null;
		  PreparedStatement pst= null;
		  try{
			  con=CrossDB.getConnection();
			  String s="select *from registration where uname=?";
			  pst=con.prepareStatement(s);
			  pst.setString(1,cb.getUname());
			  ResultSet rs = pst.executeQuery();
			  if(rs.next())
			  {
				  try{
						con=CrossDB.getConnection();
						String sql="update registration set hard=? where uname=? ";
						 ps=con.prepareStatement(sql);
				         ps.setInt(1,cb.getHigh());
				         ps.setString(2,cb.getUname());
				         ps.executeUpdate();
				         
				         
					} 
				  catch(Exception e1){System.out.println(e1);}
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(null, "Username does not exist");
			  }
		  }
		
       
	
		  catch(Exception e1){System.out.println(e1);}
	}
}
