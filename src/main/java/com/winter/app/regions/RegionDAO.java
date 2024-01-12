package com.winter.app.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.Pager;


@Repository // DAO 객체를 만들어주세요 스프링아
public class RegionDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.regions.RegionDAO.";
	
	//Delete
	public int delete(RegionDTO rD) throws Exception {
		return sqlSession.delete(namespace+"delete", rD);
	}
	public List<RegionFileDTO> getListFiles(RegionDTO rD) throws Exception{
		return sqlSession.selectList(namespace+"getListFiles", rD);
	}
	
	//Update
	public int update(RegionDTO rD) throws Exception {
		return sqlSession.update(namespace+"update", rD); 
	}
	
	public int addFile(RegionFileDTO regionFileDTO) throws Exception {
		return sqlSession.insert(namespace+"addFile", regionFileDTO);
	}
	
	//Insert
	public int add(RegionDTO rD) throws Exception{
		return sqlSession.insert(namespace+"add", rD);
	}
	
	//Detail
	public RegionDTO getDetail(RegionDTO rD)throws Exception {
		return sqlSession.selectOne(namespace+"getDetail", rD);
	}
	
	
	//List
	public List<RegionDTO> getList(Pager pager) throws Exception {
		return sqlSession.selectList(namespace+"getList", pager);
	}
	
	//Total
	public Long getTotal(Pager pager) throws Exception {
		return sqlSession.selectOne(namespace+"getTotal", pager);
	}
}
