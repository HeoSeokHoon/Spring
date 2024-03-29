package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;
//test
public class ProductDAO {
	
	private ProductDTO pD = null;
	
	public ProductDAO() {
		this.pD = new ProductDTO();
	}
	
	public List<ProductDTO> productList() throws Exception {
		//URL: /product/list, Method: GET, Parameter: X\
		Connection con = DBConnector.getConnector();
		String sql = "SELECT * FROM PRODUCT";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		List<ProductDTO> ar = new ArrayList<ProductDTO>();
		
		while(rs.next()) {
			pD = new ProductDTO();
			pD.setProductNum(rs.getLong("productNum"));
			pD.setProductName(rs.getString("productName"));
			pD.setProductContents(rs.getString("productContents"));
			pD.setProductRate(rs.getDouble("productRate"));
			pD.setProductJumsu(rs.getDouble("productJumsu"));
			ar.add(pD);
		}
		
		DBConnector.disConnect(rs, ps, con);
		return ar;
	}
	
	public ProductDTO productDetail(ProductDTO pD) {
		//URL: /product/detail, Method: GET, Parameter: productNum 
		
		
		return null;
	}
	
	public int productAdd(ProductDTO pD) {
		//URL: /product/add, Method: GET, Parameter: productNum	
		return 0;
	}
	
	public int productUpdate(ProductDTO pD) {
		//URL: /product/update, Method: GET, Parameter: productNum	
		return 0;
	}
	
	public int productDelete(ProductDTO pD) {
		
		
		return 0;
	}
	
}
