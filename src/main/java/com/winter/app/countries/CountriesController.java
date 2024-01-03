package com.winter.app.countries;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/countries/*")
public class CountriesController {
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String countriesList(HttpServletRequest request) throws Exception{
		CountriesDAO cDao = new CountriesDAO();
		List<CountriesDTO> ar = cDao.getList();
		request.setAttribute("list", ar);
		
		return "countries/list";
	}
	

}
