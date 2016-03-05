package com.zensar.test.images;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetImage {

	public static void main(String[] args) {

		Connection con = null;
		FileOutputStream file = null;
		InputStream stream = null;
		int i;
		try {
			con = ConnectionProvider.getConnection();
			System.out.println(con);
			String sql = "SELECT * FROM AKASH.IMAGE";
			PreparedStatement psmt = con.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				i = 0;
				String fileName = ".\\src\\destination\\" + rs.getString(1)
						+ ".jpg";
				file = new FileOutputStream(fileName);
				stream = rs.getBinaryStream(2);
				while ((i = stream.read()) > -1) {
					file.write(i);
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
