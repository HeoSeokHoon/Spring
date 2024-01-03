package com.winter.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("product")
public class ProductController {

	//list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void productList () {
		
	}
	
	//detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public void productDetail(ProductDTO pD) {
		
	}
}
