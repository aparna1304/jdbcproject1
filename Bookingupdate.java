package project;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class Bookingupdate {
	           public Connection getconn()
	    {
	         Connection conn=null;
	         try {
	             String url="jdbc:mysql://localhost:3306/prodapt";
	             String username="root";
	             String pass="root";
	             conn=DriverManager.getConnection(url,username,pass);
	         }catch(Exception e) {
	             e.printStackTrace();
	                          
	         }
	         return conn;
	    }
	           Scanner sc1=new Scanner(System.in);
	           public void BASIC()throws SQLException {
	        System.out.println("***please enter user details***");
	        Connection conn=getconn();
	        String name=sc1.nextLine();
	        String s1="UPDATE  BASIC SET phonenumber=?,address=? ,bookingdate=?,gender=? WHERE name=?;";
	        PreparedStatement stmt=conn.prepareStatement(s1);
	        System.out.println("Enter user phonenumber:");
	        String phonenumber=sc1.nextLine();
	        System.out.println("Enter user address:");
	        String address=sc1.nextLine();
	        System.out.println("Enter user bdate:");
	        String soc=sc1.nextLine();
	        System.out.println("Enter user gender:");
	        String gender=sc1.nextLine();
	        stmt.setString(1,phonenumber);
	        stmt.setString(2,address);
	        stmt.setString(3,soc);
	        stmt.setString(4,name);
	        stmt.setString(5,gender);
	        int a=stmt.executeUpdate();
	        System.out.println("***>>>>>>Updated and Room Booked<<<<<***");
	        
	           }
	           public void PREMIUM()throws SQLException {
	        System.out.println("***please enter user details***");
	        Connection conn=getconn();
	        String name=sc1.nextLine();
	        String s1="UPDATE PREMIUM SET phonenumber=?, address=? ,bookingdate=?,gender=? WHERE name=?;";
	        PreparedStatement stmt=conn.prepareStatement(s1);
	        System.out.println("Enter user phonenumber:");
	        String phonenumber=sc1.nextLine();
	        System.out.println("Enter user address:");
	        String address=sc1.nextLine();
	        System.out.println("Enter user bdate:");
	        String soc=sc1.nextLine();
	        System.out.println("Enter user gender:");
	        String gender=sc1.nextLine();
	      //  stmt.setString(1,name);
	        stmt.setString(1, phonenumber);
	        stmt.setString(2,address);
	        stmt.setString(3,soc);
	        stmt.setString(4,name);
	        stmt.setString(5,gender);
	       int a=stmt.executeUpdate();
	        System.out.println("***Updated and Room Booked***");
	        
	           }
	           public void LUXURY()throws SQLException {
	        System.out.println("***please enter user details***");
	        Connection conn=getconn();
	        String name=sc1.nextLine();
	        String s1="UPDATE LUXURY SET phonenumber=?, address=? ,bookingdate=?,gender=?, WHERE name=?;";
	        PreparedStatement stmt=conn.prepareStatement(s1);
	        System.out.println("Enter user phonenumber:");
	        String phonenumber=sc1.nextLine();
	       System.out.println("Enter user name:");
	       //String name=sc1.nextLine();
	        System.out.println("Enter user address:");
	        String address=sc1.nextLine();
	        System.out.println("Enter user bdate:");
	        String soc=sc1.nextLine();
	        System.out.println("Enter user gender:");
	        String gender=sc1.nextLine();
	        stmt.setString(1, phonenumber);
	        stmt.setString(2,address);
	        stmt.setString(3,soc);
	        stmt.setString(4,name);
	        stmt.setString(5,gender);
	      int a=stmt.executeUpdate();
	        System.out.println("***Updated and Room Booked***");
	        
	           }


	}


