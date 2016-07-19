package com.gtech.onepage.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.gtech.onepage.model.GenericResult;

@Named
public class UserDao {

	@Inject
	private JdbcTemplate firstDatabaseTemplate;

	public List<GenericResult> getAccount(String cpf) {

		String sql = "SELECT * FROM TESTE";

		return firstDatabaseTemplate.query(sql, new Object[] { cpf }, new ResultSetExtractor<List<GenericResult>>() {
			public List<GenericResult> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<GenericResult> listOfGenericResult = new ArrayList<GenericResult>();
				while (rs.next()) {
					GenericResult genericResult = new GenericResult();
					genericResult.setResult1(rs.getString("ID"));
					genericResult.setResult2(rs.getString("NAME"));
					listOfGenericResult.add(genericResult);
				}
				return listOfGenericResult;
			}
		});
	}
	
	public boolean save(String email, String password, String language) {

		String updateStatement = " UPDATE USER"
                + " SET password=?, language=?"
                + " WHERE email=?";
		firstDatabaseTemplate.update(updateStatement, new Object[] {password, language, email});
		return true;
	}

}