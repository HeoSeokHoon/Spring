package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/regions/*")
public class RegionController {
	
	@Autowired
	private RegionService regionService;
	
//	public RegionController() {
//		this.rDao = new RegionDAO();
//	}
	
//	@RequestMapping(value = "add", method = RequestMethod.POST)
//	public String add(RegionDTO rD, Model model) throws Exception {
//		
//		RegionDTO rD = new RegionDTO();
//		rD.setRegion_id(Integer.parseInt(request.getParameter("region_id")));
//		rD.setRegion_name(request.getParameter("region_name"));
		
//		int result = this.rDao.add(rD);
//		String msg="등록 실패";
//		if(result>0) {
//			msg = "등록 성공";
//		}
//		
//		model.addAttribute("msg", msg);
//		model.addAttribute("path", "./list");
//		
//		return "commons/result";
//	}
//	
//	@RequestMapping(value = "add", method = RequestMethod.GET)
//	public String add () {
//		return "regions/add";
//	}
//	
//	@RequestMapping(value = "detail", method = RequestMethod.GET)
//	//파라미터의 이름과 타입을 동일하게 선언
//	//파라미터 이름이 id라 동일하지 않으면 : @RequestParam("id")로 name:파라미터 이름, defaultValue: null 일때 기본값, required: 필수여부 
//	public void detail(Integer region_id, Model model) throws Exception {
//		
//		RegionDAO rDao = new RegionDAO();
//		RegionDTO rD = new RegionDTO();
//		rD.setRegion_id(region_id);
//		rD = rDao.getDetail(rD);
//		
//		//request.setAttribute("dto", rD);
//		model.addAttribute("dto", rD);
//		
//		//return "regions/detail";
//	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView reionsList() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<RegionDTO> ar = regionService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("regions/list");
		
		//return "regions/list";
		return mv;
	}
}
