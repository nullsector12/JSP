package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import member.model.Member;

public class MemberDao {
	
	private MemberDao() {
		
	}
	
	private static MemberDao dao = new MemberDao();
	
	
	public static MemberDao getInstance() {
		
		return dao;
	}

	public int insertMember(Connection conn, Member member) throws SQLException {
		// TODO Auto-generated method stub
		
		int resultCnt = 0;
		
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member (uid, upw, uname, uphoto) VALUES (?, ?, ?, ?);";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getUid());
			pstmt.setString(2, member.getUpw());
			pstmt.setString(3, member.getUname());
			pstmt.setString(4, member.getUphoto());
		
			resultCnt = pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}
		
		return resultCnt;
	}

	public int selectById(Connection conn, String id) throws SQLException {
		// TODO Auto-generated method stub
		
		int resultCnt = 0;
		
		PreparedStatement pstmt = null;
		ResultSet rs;
		
		
		try {
			String sql = "select count(*) from member where uid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				resultCnt = rs.getInt(1);
			}
			
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}
		
		return resultCnt;
	}

	public List<Member> selectMemberList(Connection conn, int startRow, int count) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<Member> memberList = new ArrayList<Member>();

		try {
			
			
			String sql = "select * from member limit ?, ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, count);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Member member = new Member();
				member.setIdx(rs.getInt("idx"));
				member.setUid(rs.getString("uid"));
				member.setUpw(rs.getString("upw"));
				member.setUname(rs.getString("uname"));
				member.setUphoto(rs.getString("uphoto"));
				member.setRegdate(rs.getDate("regdate"));
				
				memberList.add(member);
						}

		} finally {

			if (rs != null) {
				rs.close();
			}

			if (pstmt != null) {
				pstmt.close();
			}
		}

		return memberList;
	}

	public int selectTotalCount(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		int resultCnt = 0;

		Statement stmt = null;
		ResultSet rs = null;

		try {

			stmt = conn.createStatement();

			String sql = "select count(*) from member";

			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				resultCnt = rs.getInt(1);
			}

		} finally {

			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}

		return resultCnt;
	}

	public Member selectMember (Connection conn, String uid) throws SQLException {
		
		Member member = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from member where uid=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member (
						rs.getInt("idx"),
						rs.getString("uid"),
						rs.getString("upw"),
						rs.getString("uname"),
						rs.getString("uphoto"),
						rs.getDate("regdate")
						);

						
			}
			
			} finally {
				if(rs != null) {
					rs.close();
				}
			
				if(pstmt != null) {
					pstmt.close();
				}
	
			}
		System.out.println(member);
		return member;
	}


	public int deleteMember(Connection conn, String uid) throws SQLException{
		int resultCnt = 0;
		
		PreparedStatement pstmt = null;
		String sql = "delete from member where uid=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			resultCnt = pstmt.executeUpdate();
		} finally {
			
			if (pstmt != null) {
				pstmt.close();
			}
			
		}
		
		System.out.println(resultCnt);
		return resultCnt;
		// TODO Auto-generated method stub
		
	}
	
}
