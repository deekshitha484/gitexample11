import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//connction url syntax: "jdbc:mysql://"+localhost+":"+port+"/database" name u want to connect to
		
		String host="localHost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host +":"+ port +"/demo","root","DeeRan@2122");
				//now create statement,dis is path to database or road
		//Creates a Statement object for sendingSQL statements to the database.SQL statements without parameters are normallyexecuted using Statement objects. If the same SQL statementis executed many times, it may be more efficient to use a PreparedStatement object. 
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from employeeinfo where scenario='zerobalanced card'");
		while(rs.next())
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
		
		driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
		System.out.println("rahulshetty.com");

		

	


		System.out.println("rahulshetty.com");
		System.out.println("rahulshetty.com");
		System.out.println("rahulshetty.com");
		System.out.println("rahulshetty.com");
		System.out.println("rahulshetty.com");

		System.out.println("rahulshetty.com");
		System.out.println("rahulshetty.com");
		System.out.println("rahulshetty.com");
		System.out.println("rahulshetty");
		System.out.println("rahulshetty.com");
		System.out.println("rahulshetty.com");


		System.out.println("rahu");

		System.out.println("rahulshetty.com");
		System.out.println("rahu");
		System.out.println("rahu");

		System.out.println("rahulshetty.com");
		System.out.println("rahu");

		//System.out.println(rs.getString("password"));
		}
		
				
				

	}

}
