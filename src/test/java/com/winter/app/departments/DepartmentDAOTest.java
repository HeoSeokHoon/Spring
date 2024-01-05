package com.winter.app.departments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class DepartmentDAOTest extends MyTest{
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Test
	public void deleteTest() throws Exception {
		DepartmentDTO dDto = new DepartmentDTO();
		dDto.setDepartment_id(300);
		int result = departmentDAO.delete(dDto);
		
		assertEquals(1, result);
	}
	
//	@Test
	public void updateTest() throws Exception {
		DepartmentDTO dDto = new DepartmentDTO();
		dDto.setDepartment_id(300);
		dDto.setDepartment_name("TestTest");
		dDto.setManager_id(100);
		dDto.setLocation_id(1700);
		int result = departmentDAO.update(dDto);
		
		assertEquals(1, result);
	}
	
//	@Test
	public void addTest() throws Exception {
		DepartmentDTO dDto = new DepartmentDTO();
		dDto.setDepartment_name("Test");
		dDto.setManager_id(200);
		dDto.setLocation_id(1000);
		int result = departmentDAO.add(dDto);
		
		assertEquals(1, result);
	}
	
//	@Test
	public void getListTest() throws Exception{
		List<DepartmentDTO> ar = departmentDAO.getList();
		assertNotEquals(0, ar.size());
	}
	
//	@Test
	public void getDetailTest() throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(20);
		departmentDTO = departmentDAO.getDetail(departmentDTO);
		
		assertNotNull(departmentDTO);
	}
	
}
