package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
//접속주소 : localhost/xe 포트 : 1521 아이디 : osfu 비번 : 12345678
//JDBC 드라이버

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";

		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement(); // 쿼리 접속 후 => 쿼리문 입력하는 하얀색 화면 만들기
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("title"));
				
			}
//			stmt.executeQuery(sql); // executeQuery 실행하는거

			System.out.println("연결 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
