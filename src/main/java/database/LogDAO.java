package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import models.LogModel;
import properties.SQLQueries;

public class LogDAO {
	public static Vector<LogModel> getLogs(){
		Connection con = DBConnector.getConnection();
		Vector<LogModel> logs = new Vector<LogModel>();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(SQLQueries.RETRIEVE_LOGS);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int sl_no = rs.getInt("sl_no");
				String rfid =  rs.getString("rfid");
				String time = rs.getString("time");
				LogModel log = new LogModel();
				
				log.setSl_no(sl_no);
				log.setRfid(rfid);
				log.setTime(time);
				
				logs.add(log);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return logs;
	}
	public static void main(String[] args) {
		Vector<LogModel> logs = new Vector<LogModel>();
		logs = getLogs();
		System.out.println(logs);
		for(int i=0;i<logs.size();i++) {
			System.out.println(logs.elementAt(i).toString()+"\n");
		}
	}
}
