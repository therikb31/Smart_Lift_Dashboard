package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import properties.SQLQueries;

public class UserDAO {

	@SuppressWarnings("finally")
	public static int addUser(String userName, String rfid) {
		Connection conn = DBConnector.getConnection();
		int rows = -1;
		if (checkRFID(rfid) == 1) {
			return updateRFID(rfid, userName);
		}
		try {
			PreparedStatement ps = conn.prepareStatement(SQLQueries.INSERT_USER);
			ps.setString(1, rfid);
			ps.setString(2, userName);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return rows;
			}
		}
	}

	@SuppressWarnings("finally")
	public static int deleteUser(String rfid) {
		Connection conn = DBConnector.getConnection();
		int rows = -1;
		try {
			PreparedStatement ps = conn.prepareStatement(SQLQueries.DELETE_USER);
			ps.setString(1, rfid);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return rows;
			}
		}
	}

	public static void deleteRfid(String rfid) {
		Connection conn = DBConnector.getConnection();
		try {
			Statement ps = conn.createStatement();
			String sql = "DELETE FROM RFID_Tab WHERE rfid = '"+rfid+"'";
			ps.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done!");
	}

	@SuppressWarnings("finally")
	public static int checkRFID(String rfid) {
		Connection conn = DBConnector.getConnection();
		int rows = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(SQLQueries.CHECK_RFID);
			ps.setString(1, rfid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				rows = rs.getInt("recordCount");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return rows;
			}
		}
	}

	@SuppressWarnings("finally")
	public static int addRFID(String rfid) {
		if (checkRFID(rfid) == 1) {
			return 0;
		}
		Connection conn = DBConnector.getConnection();
		int rows = -1;
		try {
			PreparedStatement ps = conn.prepareStatement(SQLQueries.INSERT_RFID);
			ps.setString(1, rfid);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return rows;
			}
		}
	}

	@SuppressWarnings("finally")
	public static int updateRFID(String rfid, String userName) {
		Connection conn = DBConnector.getConnection();
		int rows = -1;
		try {
			PreparedStatement ps = conn.prepareStatement(SQLQueries.UPDATE_RFID);
			ps.setString(1, userName);
			ps.setString(2, rfid);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return rows;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	System.out.println(addUser("Ritaban","1237"));
//	System.out.println(deleteUser("1236"));
//	System.out.println(checkRFID("1238"));
//	System.out.println(addRFID("1237"));
//	System.out.println(updateRFID("1236","Mainak"));
		deleteRfid("1235");
	}
}
