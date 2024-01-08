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

@Repository
public class DepartmentDAO {
	//데이타 엑셉트 오브젝트 DAO Data Accept Object
	@Autowired
	private SqlSession sqlSession;
	private String namespace = "com.winter.app.departments.DepartmentDAO.";
	
	//delete
		public int delete(DepartmentDTO dDto) throws Exception {
			return sqlSession.delete(namespace+"delete", dDto);
		}
	
	//Update
		public int update(DepartmentDTO dDto) throws Exception {
			return sqlSession.update(namespace+"update", dDto); 
		}
	
	//Insert
		public int add(DepartmentDTO dDto) throws Exception{
			return sqlSession.insert(namespace+"add", dDto);
		}
	
	public DepartmentDTO getDetail(DepartmentDTO dDto) throws Exception {
		return sqlSession.selectOne(namespace+"getDetail", dDto);
	}
	
	
	public List<DepartmentDTO> getList() throws Exception {
		//DB접속 후 부서테이블의 모든 정보를 출력
		return sqlSession.selectList(namespace+"getList");
		
	}
}
