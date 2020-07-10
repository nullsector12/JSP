package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Emp;

public class EmpDAO {
	
	// 외부에서 객체 생성 하는것을 막는다.
	// 생성자의 접근 제어지시자 이용 : private
	private EmpDAO() {
		
	}
	
	// 사용할 인스턴스 하나를 참조변수로 생성
	private static EmpDAO dao = new EmpDAO() ;
	
	// EmpDAO 인스턴스의 참조값 반환하는 get 메서드 생성
	
	public static EmpDAO getInstance() {
		return dao;
	}
	
	
	// Connection 을 매개변수 만든 이유 : 트랜잭션 처리를 위해
	public List<Emp> getEmpList(Connection conn) throws SQLException {
		
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Emp> empList = new ArrayList<Emp>();
		
		// 3. Statement 생성
		stmt = conn.createStatement();
		
		String sql = "select * from emp order by ename";
		
		// select 의 결과 ResultSet 객체에 담는다.
		rs = stmt.executeQuery(sql);
		
		// 결과 출력
		while(rs.next()) {
			empList.add(new Emp(rs.getInt("empno"), rs.getString("ename"), rs.getInt("sal"), rs.getString("job")));
		}
		
		return empList;
		
	}

}
