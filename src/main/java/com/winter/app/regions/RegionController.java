package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/regions/*")
public class RegionController {
	
	private RegionDAO rDao;
	
	public RegionController() {
		this.rDao = new RegionDAO();
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(HttpServletRequest request) throws Exception {
		
		RegionDTO rD = new RegionDTO();
		rD.setRegion_id(Integer.parseInt(request.getParameter("region_id")));
		rD.setRegion_name(request.getParameter("region_name"));
		
		int result = this.rDao.add(rD);
		String msg="등록 실패";
		if(result>0) {
			msg = "등록 성공";
		}
		
		request.setAttribute("msg", msg);
		request.setAttribute("path", "./list");
		
		return "commons/result";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add () {
		return "regions/add";
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(HttpServletRequest request) throws Exception {
		
		RegionDAO rDao = new RegionDAO();
		RegionDTO rD = new RegionDTO();
		rD.setRegion_id(Integer.parseInt(request.getParameter("region_id")));
		rD = rDao.getDetail(rD);
		request.setAttribute("dto", rD);
		
		return "regions/detail";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String reionsList(HttpServletRequest request) throws Exception {
		RegionDAO rDao = new RegionDAO();
		List<RegionDTO> ar = rDao.getList();
		
		request.setAttribute("list", ar);
		
		return "regions/list";
	}
}
