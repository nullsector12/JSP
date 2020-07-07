package model;

public class Emp {
	
	private int empno;
	private String ename;
	private int sal;
	private String job;
	
	
	public Emp(int empno, String ename, int sal, String job) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}
	
	public Emp() {
		
	}

	/**
	 * @return the empno
	 */
	public int getEmpno() {
		return empno;
	}

	/**
	 * @param empno the empno to set
	 */
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * @return the sel
	 */
	public int getSal() {
		return sal;
	}

	/**
	 * @param sel the sel to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", job=" + job + "]";
	}
	
	
}
