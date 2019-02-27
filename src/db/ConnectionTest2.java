package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select BI_NUM, BI_TITLE, BI_CONTENT" + " , BI_CREDAT, BI_CRETIM, BI_CNT"
					+ " ,BI_ISACTIVE from board_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			List<HashMap<String, String>> rowList = new ArrayList<>();
			while (rs.next()) {
				HashMap<String, String> row = new HashMap<>();
				String biTitle = rs.getString("bi_title");
				String biNum = rs.getString("bi_num");
				row.put("biNum", biNum);
				row.put("biTitle", biTitle);
				row.put("biContent", rs.getString("BI_CONTENT"));
				row.put("biCredat", rs.getString("BI_CREDAT"));
				row.put("biCrtim", rs.getString("BI_CRETIM"));
				row.put("biCnt", rs.getString("BI_CNT"));
				row.put("biIsactive", rs.getString("BI_ISACTIVE"));
				System.out.println(row); // row는 와일문 안에 선언되어있으면 밖에서 사용X
				// System.out.println("bi_title : " + biTitle);
				// System.out.println("bi_Num : " + biNum);
			}
			for (int i = 0; i < rowList.size(); i++) {
				System.out.println(rowList.get(i)); //for문으로 리스트를 돌면서 출력
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
