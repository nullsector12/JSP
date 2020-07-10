package model;

public class Report {
	private int idx;
	private String sname;
	private String sno;
	private String report;
	
	public Report () {
		
	}
	
	public Report(int idx, String sname, String sno, String report) {
		super();
		this.idx = idx;
		this.sname = sname;
		this.sno = sno;
		this.report = report;
	}
	/**
	 * @return the idx
	 */
	public int getIdx() {
		return idx;
	}
	/**
	 * @param idx the idx to set
	 */
	public void setIdx(int idx) {
		this.idx = idx;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the sno
	 */
	public String getSno() {
		return sno;
	}
	/**
	 * @param sno the sno to set
	 */
	public void setSno(String sno) {
		this.sno = sno;
	}
	/**
	 * @return the reportFile
	 */
	public String getReport() {
		return report;
	}
	/**
	 * @param reportFile the reportFile to set
	 */
	public void setReport(String report) {
		this.report = report;
	}
	@Override
	public String toString() {
		return "Report [idx=" + idx + ", sname=" + sname + ", sno=" + sno + ", report=" + report + "]";
	}
	
	
	
	
}
