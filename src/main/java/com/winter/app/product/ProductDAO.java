package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	public final String namespace="com.winter.app.product.ProductDAO.";
	
	public List<ProductDTO> productList() throws Exception {
		//URL: /product/list, Method: GET, Parameter: X\
		return sqlSession.selectList(namespace+"productList");
	}
	
	public ProductDTO productDetail(ProductDTO pD) throws Exception {
		//URL: /product/detail, Method: GET, Parameter: productNum 
		Connection con = DBConnector.getConnector();
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCTNUM = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, pD.getProductNum());
		
		ResultSet rs = ps.executeQuery();
		ProductDTO pDto = null;
		if(rs.next()) {
			pDto = new ProductDTO();
			pDto.setProductNum(rs.getLong("productNum"));
			pDto.setProductContents(rs.getString("productContents"));
			pDto.setProductName(rs.getString("productName"));
			pDto.setProductRate(rs.getDouble("productRate"));
			pDto.setProductJumsu(rs.getDouble("productJumsu"));
		}
		
		return pDto;
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
