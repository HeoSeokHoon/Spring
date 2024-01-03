package com.winter.app.product;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	private ProductDAO pDao;
	
	public ProductController() {
		this.pDao = new ProductDAO();
	}
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView productList (ModelAndView mv) throws Exception{
		List<ProductDTO> ar = pDao.productList();
		
		mv.addObject("list", ar);
		mv.setViewName("product/list");
		
		return mv;
	}
	
	//detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView productDetail(ProductDTO pD, ModelAndView mv) throws Exception {
		
		System.out.println(pD.getProductNum());
		pD = pDao.productDetail(pD);
		
		System.out.println(pD.getProductName());
		mv.addObject("detail", pD);
		mv.setViewName("product/detail");

		return mv;
	}
}
