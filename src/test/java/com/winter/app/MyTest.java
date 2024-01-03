package com.winter.app;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.winter.app.product.ProductDAO;
import com.winter.app.product.ProductDTO;

public class MyTest {

	
	public void test() throws Exception {

		
		ProductDAO productDAO = new ProductDAO();
		ProductDTO productDTO = new ProductDTO();
		
		
	
		
		List<ProductDTO> ar = productDAO.productList();
		
		System.out.println(ar);
		
	}

}
