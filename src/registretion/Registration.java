package registretion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Registration
{
	public static void main(String[]args)
	{
		Connection con=null;
		Statement stmt=null;
		//ResultSet rs=null;
		try
		{
			Driver ref = new Driver();
			DriverManager.registerDriver(ref);

			String dbUrl = "jdbc:mysql://localhost:3306/registration?user=j2ee&password=system";
			con = DriverManager.getConnection(dbUrl);
			String query="insert into user values ('ydhhhv','hytfdbvh@gmail.com')";
			stmt=con.createStatement();
			int count = stmt.executeUpdate(query);

			System.out.println("Rows affected :"+count);

		}
		catch(Exception e){
			e.printStackTrace();
			
		}

		finally {
			try{
				if(con!=null)
				{
					con.close();
				}

				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
