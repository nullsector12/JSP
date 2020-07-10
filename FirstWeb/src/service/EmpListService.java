package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.EmpDAO;
import jdbc.ConnectionProvider;
import model.Emp;

public class EmpListService {
	
	
	
	// �̱��� ���� ó��
	private EmpListService () {
		
	}
	
	private static EmpListService service = new EmpListService();
	
	public static EmpListService getIncetance() {
		return service;
	}
	
	
	EmpDAO dao;
	
	
	// ����ó��, Ʈ����� ��� ó��
	public List<Emp> getEmpList () {
		// ����� DAO �ν��Ͻ� 
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
