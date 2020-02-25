
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

public class EmpDetails {
	

	public static void main(String args[]){
		//int Username=aaa,Password=123;
		 //int n =Login;
			Scanner sc = new Scanner(System.in);
			
			String drivername="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/task";
			String username="root";
			String password="root";
				try
				{
					Class.forName(drivername);
				}
				catch(ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				
						
				while(true)
			        {
			            System.out.println("Please select the choice:");
						System.out.println("Choose 1 for Login:");
						System.out.println("Choose 2 for List all the employee");
			            System.out.println("Choose 3 for Get a Employee details");
			            System.out.println("Choose 4 for Delete a Employee");
			            System.out.println("Choose 5 for Update a employee");
						System.out.println("Choose 6 for Logout");
			            System.out.print("Choose the operation you want to perform:");
			            int n = sc.nextInt();
						
						switch(n)
			            {
			                case 1:
			                	System.out.println("Enter Username:");
			                	
			                    String Username = sc.nextLine();
			                    System.out.println("Enter Password:");
			                    String Password = sc.nextLine();			                   
			                    //System.out.println("LoginSuccessfully");
			                    
			                    
							 
								int i=sc.nextInt();;
								if(i>=0)
							{
								System.out.println("LoginSuccessfully");
							}else{
								System.out.println("LoginUnsuccessFully");
							}
								System.out.println(" ");
								break;
								
							case 2:
			                System.out.print("Show all the employee details:");
			                System.out.println(" ");
			                //int s = sc.nextInt();
			                
			                try{
								Connection con=DriverManager.getConnection(url,username,password);
								Statement st=con.createStatement();
								 
								
								String query="select * from emptable";
								ResultSet rs=st.executeQuery(query);

								while(rs.next())
								{
									System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));
								}
							}
								catch (Exception e) {
									e.printStackTrace();
									System.out.println(e);
								}	
			                
			               // String employee = sc.nextLine();
							System.out.print("viewed Successfully");
							break;
							
							case 3:
			                System.out.println("Get employee Id");
			               
			                try{


			                	Connection conn=DriverManager.getConnection(url,username,password);
			                	Statement st=conn.createStatement();
			                	
			                	 int empid = sc.nextInt(); 
			                	 String query="select * from emptable where empid="+empid;
									ResultSet rs=st.executeQuery(query);

									while(rs.next())
									{
										System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));
									}
								}
			                	catch (Exception e) {
			                	    e.printStackTrace();
			                	    System.out.println(e);
			                	}
			                System.out.println("");
			                break;
			                
							case 4:
				                System.out.println("Enter Id you want to delete");
				                
				                try{
				                	
				                	Connection conn=DriverManager.getConnection(url,username,password);
				                	Statement st=conn.createStatement();
				                	 int empid = sc.nextInt(); 
									String Update="Delete from emptable where empid =" +empid;
				                	 int i2=st.executeUpdate(Update);
				                	if(i2>0)
				                		 System.out.println("Deleted successfull"); 
				                	else
				                		 System.out.println("Deleted Unsuccessfull"); 

				                }
				                catch (Exception e) {
				                    e.printStackTrace();
				                    System.out.println(e);
				                }
				                System.out.println("");
				                break;
				                
							case 5:
				                System.out.println("Enter Id you want to update");
				                try{
				                	
				                	Connection conn=DriverManager.getConnection(url,username,password);
				                	Statement stmt=conn.createStatement();
				                	int empid =sc.nextInt(); 
									String empname=sc.nextLine();
									int age=sc.nextInt();
									String email=sc.nextLine();
									//String Update=" Update emptable set empid='"+empid+"',empname='"+empname+"',email='"+email+"',age='"+age+"' where empid="+empid;
									String Update="select empid,empname.email,age from emptable where empid =" +empid;
				                	 int i3=stmt.executeUpdate(Update);
				                	 if(i3>0)
				                		 System.out.println("Update successfull"); 
				                	else
				                		 System.out.println("Update Unsuccessfull"); 


				                }
				                catch (Exception e) {
				                    e.printStackTrace();
				                    System.out.println(e);
				                }
				                System.out.println("");
				                break;
				                
							case 6:
				                System.out.println("Logout");
				                System.out.println("");
				                break;
							
					}
		}
}
}
