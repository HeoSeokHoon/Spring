package com.winter.app.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;

@Repository // DAO 객체를 만들어주세요 스프링아
public class RegionDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.regions.RegionDAO.";
	
	//Update
	public int update(RegionDTO rD) throws Exception {
		Connection con = DBConnector.getConnector();
		String sql = "UPDATE REGIONS SET REGION_NAME =? WHERE REGION_ID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, rD.getRegion_name());
		ps.setInt(2, rD.getRegion_id());
		
		int result=ps.executeUpdate();
		
		DBConnector.disConnect(ps, con);
		return result; 
	}
	
	//Insert
	public int add(RegionDTO rD) throws Exception{
		Connection con = DBConnector.getConnector();
		
		String sql = "INSERT INTO REGIONS VALUES (?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, rD.getRegion_id());
		ps.setString(2, rD.getRegion_name());
		
		int result = ps.executeUpdate();
		
		DBConnector.disConnect(ps, con);
		return result;
	}
	
	public RegionDTO getDetail(RegionDTO rD)throws Exception {
		return sqlSession.selectOne(namespace+"getDetail", rD);
	}
	
	public List<RegionDTO> getList() throws Exception {
		return sqlSession.selectList(namespace+"getList");
	}
}
