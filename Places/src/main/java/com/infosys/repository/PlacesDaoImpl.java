package com.infosys.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.infosys.entity.Places;

public class PlacesDaoImpl implements PlacesDao {

	@Autowired
	JdbcTemplate template;
	
	public RowMapper<Places> srm = (resultSet, rowNum) -> {
		Places p = new Places();
		p.setId(resultSet.getInt(1));
		p.setName(resultSet.getString(2));
		p.setCity(resultSet.getString(3));
		return p;
	};
	
	@Override
	public void addPlace(Places p) {
		template.execute("insert into places values(?, ?, ?)", (PreparedStatement ps) -> {
			ps.setInt(1, p.getId());
			ps.setString(2, p.getName());
			ps.setString(3, p.getCity());
			return ps.executeUpdate();
		});
	}

	@Override
	public Places findByCity(String city) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM places WHERE city = ?";
		List<Places> places = template.query(sql, srm, city);
		return places.isEmpty() ? null : places.get(0);

	}
	
	@Override
	public List<Places> findAll() {
		// TODO Auto-generated method stub
		return template.query("select * from places", srm);
	}

	@Override
	public void updatePlace(Places p) {
		// TODO Auto-generated method stub
		template.execute("update places set name = ?, city = ? where id = ?", (PreparedStatement ps) -> {
			ps.setInt(3, p.getId());
			ps.setString(1, p.getName());
			ps.setString(2, p.getCity());
			return ps.executeUpdate();
		});
	}

	@Override
	public void deletePlace(Places p) {
		// TODO Auto-generated method stub
		template.execute("delete from places where id = ?", (PreparedStatement ps) -> {
			ps.setInt(1, p.getId());
			return ps.executeUpdate();
		});
	}
	
	
}
