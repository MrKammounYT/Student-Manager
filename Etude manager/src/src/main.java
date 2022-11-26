package src;

import java.sql.SQLException;

import SQL.AccountDB;
import SQL.MySQL;
import frameWorks.HomePage;
import frameWorks.UserLogin;

public class main {

	public static void main(String[] args) {

		new HomePage();
		
		
		
	//new UserLogin();
		
	/*	try {
			MySQL.connect();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(MySQL.isConnected()) {
			
			System.out.print("mysql connected!");
			SQL.AccountDB adb = new AccountDB();
			adb.CreateTable();
			adb.CreateAccount("ahmedkammoun010@gmail.com", "1234");
		}*/
	}

}
