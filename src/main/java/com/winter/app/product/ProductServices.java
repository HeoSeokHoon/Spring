package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
	
	@Autowired
	public ProductDAO productDAO;
	
	public List<ProductDTO> productList() throws Exception {
		List<ProductDTO> ar = this.productDAO.productList();
		
		return ar;
	}

}
