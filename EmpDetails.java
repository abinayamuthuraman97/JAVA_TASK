import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;


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
				try{
					Connection conn=DriverManager.getConnection(url,username,password);
					Statement stmt=conn.createStatement();
					String query="select * from emptable";
					ResultSet rs=stmt.executeQuery(query);

					while(rs.next())
					{
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
					}
				}
					catch (Exception e) {
						e.printStackTrace();
						System.out.println(e);
					}	
						
				while(true)
			        {
			            System.out.println("Please select the choice:");
						System.out.println("Choose 1 for Login:");
						//System.out.println("Enter the username:");
						//System.out.println("Enter the password:");
						//System.out.println("Login Succes");
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
			                	System.out.println("Enter Password:");
			                 int Login = sc.nextInt();
							 
								int i =3;
								if(i>=5)
							{
								System.out.println("LoginSuccessfully");
							}else{
								System.out.println("LoginUnsuccessFully");
							}
								System.out.println(" ");
								break;
								
							case 2:
			                System.out.print("Show all the employee details:");
			                int n1 = sc.nextInt();
							System.out.print(" ");
							break;
							
							case 3:
			                System.out.println("Get employee Id");
			                System.out.println("");
			                break;
			                
							case 4:
				                System.out.println("Enter Id you want to delete");
				                System.out.println("");
				                break;
				                
							case 5:
				                System.out.println("Enter Id you want to update");
				                System.out.println("");
				                break;
				                
							case 6:
				                System.out.println("Exit");
				                System.out.println("");
				                break;
							
					}
		}
}
}
