Class EmpDetails{
public static void main(string args[]){
int Username=aaa,Password=123;
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
				out.println(e);
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
	            int n = sc.nextInt
				
				switch(n)
	            {
	                case 1:
	                System.out.println("Enter Username:","Enter Password:");
	                Login = s.nextInt();
					if(Username and Password >= 5)
					{
						System.out.println("LoginSuccessfully");
					}else{
						System.out.println("LoginUnsuccessFully");
					}
						System.out.println(" ");
						Break;
						
					case 2:
	                System.out.print("Show all the employee details:");
	                List all the employee = s.nextInt();
					System.out.print(" ");
					Break;
					
					case 3:
	                System.out.println("Enter Id");
					
	                System.out.println("");
	                break;
					
			}
}
}
			 
			 
			 
			