package july_17th_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Jdbc01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT");
		sql.append("     e.last_name         AS 사원명,");
		sql.append("     d.department_name   AS 부서명");
		sql.append(" FROM");
		sql.append("     employees        e");
		sql.append("     INNER JOIN hr.departments   d ON e.department_id = d.department_id");

		List<EmpDTO> list = new ArrayList<>();

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//			System.out.println("CONNECTION SUCCESS!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString());
			while (rs.next()) {
				EmpDTO empDTO = new EmpDTO();
				empDTO.setLast_name(rs.getString("사원명"));
				empDTO.setDepartment_name(rs.getString("부서명"));
				list.add(empDTO);
			}
			System.out.println("사원명\t부서명");
			for (EmpDTO empDTO : list) {
				System.out.println(empDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (stmt != null) try {stmt.close();} catch(Exception e) {}
			if (conn != null) try {conn.close();} catch(Exception e) {}
		}
	}
}
