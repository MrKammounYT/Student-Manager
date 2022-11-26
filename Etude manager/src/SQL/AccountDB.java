package SQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDB {

	public void CreateTable() {
		try {
			PreparedStatement ps = MySQL.getConnection().prepareStatement(
					"CREATE TABLE IF NOT EXISTS accounts (user VARCHAR(100),email VARCHAR(100),password VARCHAR(100),PRIMARY KEY (email))");
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean isPasswordCorrect(String email, String password) {
		try {
			PreparedStatement ps = MySQL.getConnection()
					.prepareStatement("SELECT password FROM accounts WHERE email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			boolean s=false;
			if (rs.next()) {
				s = rs.getString("password").equals(password);

				System.out.println("/n"+s);
				return s;			
			}
			return s;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void CreateAccount(String email, String password) {
		try {
			System.out.print("account created " + email);

			if (!UserExists(email)) {
				PreparedStatement ps2 = MySQL.getConnection()
						.prepareStatement("INSERT INTO accounts (email,password) VALUES (?,?)");
				ps2.setString(1, email);
				ps2.setString(2, password);
				ps2.executeUpdate();
				return;

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("account not created " + email);
		}
	}

	public boolean UserExists(String email) {
		try {
			PreparedStatement ps = MySQL.getConnection().prepareStatement("SELECT * FROM accounts WHERE email=?");
			ps.setString(1, email);
			ResultSet results = ps.executeQuery();
			if (results.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

}
