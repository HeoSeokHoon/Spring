package com.winter.app.product;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class ProductDAOTest extends MyTest{

	@Autowired
	private ProductDAO productDAO;
	
	@Test
	public void updateTest() throws Exception {
		ProductDTO pD = new ProductDTO();
		long num = 1;
		pD.setProductNum(num);
		pD.setProductName("TEST3");
		int result = productDAO.productUpdate(pD);
		
		assertEquals(1, result);
	}

}
