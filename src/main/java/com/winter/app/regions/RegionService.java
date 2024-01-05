package com.winter.app.regions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//DAO 보내기전 전처리, 후처리
@Service
public class RegionService {
	
	@Autowired
	private RegionDAO regionDAO;
	
	//delete
	public int delete(RegionDTO rDto) throws Exception {
		return regionDAO.delete(rDto);
	}
	
	//update
	public int update(RegionDTO rDto) throws Exception {
		return regionDAO.update(rDto);
	}
	
	//insert
	public int add(RegionDTO rDto) throws Exception {
		return regionDAO.add(rDto);
	}
	
	//detail
	public RegionDTO getDetail(RegionDTO rDto) throws Exception {
		return regionDAO.getDetail(rDto);
	}
	
	//list
	public List<RegionDTO> getList() throws Exception{
		List<RegionDTO> ar = this.regionDAO.getList();
		
		return ar;
	}
}
