package com.winter.app.departments;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;

@Controller
@RequestMapping(value = "/departments/*")
public class DepartmentController {
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(HttpServletRequest request) throws Exception {
		
		DepartmentDAO dDao = new DepartmentDAO();
		DepartmentDTO dD = new DepartmentDTO();
		dD.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));
		dD = dDao.getDetail(dD);
		request.setAttribute("dto", dD);
		
		return "departments/detail";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String reionsList(HttpServletRequest request) throws Exception {
		DepartmentDAO dDao = new DepartmentDAO();
		List<DepartmentDTO> ar = dDao.getList();
		
		request.setAttribute("list", ar);
		
		return "departments/list";
	}
}
