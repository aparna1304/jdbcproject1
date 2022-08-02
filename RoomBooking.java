package project;
	import java.sql.SQLException;
	import java.util.Scanner;

public class RoomBooking {
	       static void Userinsert() throws SQLException
	           {
	                      Scanner sc5=new Scanner(System.in);
	                      System.out.println("click 1 for Booking BASIC ROOM");
	                      System.out.println("click 2 for Booking PREMIUM ROOM");
	                      System.out.println("click 3 for Booking LUXURY ROOM");
	                      int n5=sc5.nextInt();
	                      BookingInsert dd=new BookingInsert();
	                      switch(n5) {
	                      case 1:{
	                                 System.out.println(" Book BASIC ROOM");
	                                 dd.BASIC();
	                                 break;
	                                 
	                      }
	                      case 2:{
	                                 System.out.println(" Book PREMIUM ROOM");
	                                 dd.PREMIUM();
	                                 break;
	                                 
	                                 
	                      }
	                      case 3:{
	                                 System.out.println("Book LUXURY ROOM");
	                                 dd.LUXURY();
	                                 break;
	                                 
	                                 
	                      }
	                      
	                      }
	                      
	           }
	           static void insert()  throws SQLException
	           {
	                      System.out.println("*****Insert Operation*****");
	                      Scanner sc2=new Scanner(System.in);
	                      System.out.println("click 1 for Booking BASIC ROOM");
	                      System.out.println("click 2 for Booking PREMIUM ROOM");
	                      System.out.println("click 3 for Booking LUXURY ROOM");
	                      int n2=sc2.nextInt();
	                      BookingInsert dd=new BookingInsert();
	                      switch(n2) {
	                      case 1:{
	                   System.out.println(" Book BASIC ROOM");
	                   dd.BASIC();
	                   break;
	                   
	                   }
	               case 2:{
	                   System.out.println(" Book PREMIUM ROOM");
	                   dd.PREMIUM();
	                   break;
	                   
	                   
	                   }
	                case 3:{
	                   System.out.println("Book LUXURY ROOM");
	                   dd.LUXURY();
	                   break;
	                   
	                   
	                   }
	                      
	                      }
	                      
	           }
	           static void Update() throws SQLException
	           {
	                      //System.out.println("update");
	                      System.out.println("*****Update Operations*****");
	                      Scanner sc3=new Scanner(System.in);
	                      System.out.println("click 1 for Booking BASIC ROOM");
	                      System.out.println("click 2 for Booking PREMIUM ROOM");
	                      System.out.println("click 3 for Booking LUXURY ROOM");
	                      int n3=sc3.nextInt();
	                      Bookingupdate ub=new Bookingupdate ();
	                      switch(n3) {
	                      case 1:{
	                   System.out.println(" Book BASIC ROOM");
	                   ub.BASIC();
	                   break;
	                   
	                   }
	               case 2:{
	                   System.out.println(" Book PREMIUM ROOM");
	                   ub.PREMIUM();
	                   break;
	                   
	                   
	                   }
	                case 3:{
	                   System.out.println("Book LUXURY ROOM");
	                   ub.LUXURY();
	                   break;
	                   
	                   
	                   }
	                      
	                      }
	           }

	           static void adminlogin()throws SQLException{
	                      Scanner sc1=new Scanner(System.in);
	                      System.out.println("***************Admin_Login_Details***************");
	                      System.out.println("Enter the admin name: ");
	                      String adminname=sc1.nextLine();
	                      System.out.println("Enter the admin password: ");
	                      String password=sc1.nextLine();
	                      if(adminname.equals("Aparna") && password.equals("appu@1234")) {
	                                 System.out.println("*<>*<>*<>*Authentication Successfully*<>*<>*<>*");
	                                 System.out.println("Enter your choice of operation");
	                                 System.out.println("click 1 for Insert Operation");
	                                 System.out.println("click 2 for Update Operation");
	                                 System.out.println("click 3 for Delete Operation");
	                                 int n1=sc1.nextInt();
	                                 switch(n1) {
	                                 case 1:{
	                                            insert();
	                                            break;
	                                 }
	                                 case 2:{
	                                            Update();
	                                            break;
	                                 }
	                                 case 3:{
	                                   System.out.println("delete process is ongoing");
	                                   break;
	                                 }
	                                 
	                                 }
	                      
	                                }
	           }
	           static void userlogin() throws SQLException{
	                      System.out.println("user");
	                      Scanner sc4=new Scanner(System.in);
	                      System.out.println("***************User_Login_Details***************");
	                      System.out.println("Enter the username: ");
	                      String username=sc4.nextLine();
	                      System.out.println("Enter the password: ");
	                      String pword=sc4.nextLine();
	                      if(username.equals("sanju") && pword.equals("sanju@1234")) {
	                                 System.out.println("*<>*<>*<>*Login Successfully*<>*<>*<>*");
	                                 Userinsert();
	                      }
	                      else {
	                                 System.out.println("New Account is created");

	                      }

	                      
	           }
	           public static void main(String[] args) throws SQLException {
	                      Scanner sc=new Scanner(System.in);
	                      String[] r= {"user","admin"};
	               String role="";
	               System.out.println("Enter your role:");
	               System.out.println("press 1 if you are user");
	               System.out.println("press 2 if you are admin");
	               int n=sc.nextInt();
	               switch(n) {
	               case 1:{
	                      role=r[0];
	                      userlogin();
	                       break;
	               }
	               case 2:{
	                      role=r[1];
	                      adminlogin();
	                       break;
	               }
	               }

	                      
	           }


	}
