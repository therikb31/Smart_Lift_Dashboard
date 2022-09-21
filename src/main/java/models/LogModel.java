package models;

public class LogModel {
	private int sl_no;
	private String rfid;
	private String time;
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "LogModel [sl_no=" + sl_no + ", rfid=" + rfid + ", time=" + time + "]";
	}
}
