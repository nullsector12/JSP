package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.EmpDAO;
import jdbc.ConnectionProvider;
import model.Emp;

public class EmpListService {
	
	
	
	// 싱글톤 패턴 처리
	private EmpListService () {
		
	}
	
	private static EmpListService service = new EmpListService();
	
	public static EmpListService getIncetance() {
		return service;
	}
	
	
	EmpDAO dao;
	
	
	// 예외처리, 트랜잭션 모두 처리
	public List<Emp> getEmpList () {
		// 사용할 DAO 인스턴스 
		dao = EmpDAO.getInstance();
		
		// Connection
		Connection conn = null;
		List<Emp> list = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			list = dao.getEmpList(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
