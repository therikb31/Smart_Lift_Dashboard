package properties;

public class SQLQueries {
	public static final String INSERT_USER = "INSERT INTO RFID_Tab(rfid,userName) VALUES (?,?)";
	public static final String DELETE_USER = "UPDATE RFID_Tab SET userName = NULL WHERE rfid = ?";
	public static final String INSERT_RFID = "INSERT INTO RFID_Tab(rfid) VALUES (?)";
	public static final String RETRIEVE_RFID = "SELECT * FROM RFID_Tab WHERE rfid = ?";
	public static final String CHECK_RFID = "SELECT COUNT(*) as recordCount FROM RFID_Tab WHERE rfid = ?";
	public static final String UPDATE_RFID = "UPDATE RFID_Tab SET userName = ? WHERE rfid = ?";
	public static final String RETRIEVE_LOGS = "SELECT * FROM Log";
	public static final String DELETE_RFID = "DELETE FROM RFID_Tab WHERE rfid = ?";
}
