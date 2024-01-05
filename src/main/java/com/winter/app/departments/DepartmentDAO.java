package com.winter.app.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.regions.RegionDTO;
import com.winter.app.util.DBConnector;

@Repository
public class DepartmentDAO {
	//데이타 엑셉트 오브젝트 DAO Data Accept Object
	@Autowired
	private SqlSession sqlSession;
	private String namespace = "com.winter.app.departments.DepartmentDAO.";
	
	//Update
		public int update(DepartmentDTO dD) throws Exception {
			Connection con = DBConnector.getConnector();
			String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME =?, MANAGER_ID =?, LOCATION_ID =? WHERE DEPARTMENT_ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dD.getDepartment_name());
			ps.setInt(2, dD.getManager_id());
			ps.setInt(3, dD.getLocation_id());
			ps.setInt(4, dD.getDepartment_id());
			
			
			int result=ps.executeUpdate();
			
			DBConnector.disConnect(ps, con);
			return result; 
		}
	
	//Insert
		public int add(DepartmentDTO dDto) throws Exception{
			Connection con = DBConnector.getConnector();
			
			String sql = "INSERT INTO DEPARTMENTS VALUES (?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, dDto.getDepartment_id());
			ps.setString(2, dDto.getDepartment_name());
			ps.setInt(3, dDto.getManager_id());
			ps.setInt(4, dDto.getLocation_id());
			
			int result = ps.executeUpdate();
			
			DBConnector.disConnect(ps, con);
			return result;
		}
	
	public DepartmentDTO getDetail(DepartmentDTO dDto) throws Exception {
		return sqlSession.selectOne(namespace+"getDetail", dDto);
	}
	
	
	public List<DepartmentDTO> getList() throws Exception {
		//DB접속 후 부서테이블의 모든 정보를 출력
		return sqlSession.selectList(namespace+"getList");
		
	}
}
