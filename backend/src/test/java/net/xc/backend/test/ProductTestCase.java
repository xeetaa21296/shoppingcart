package net.xc.backend.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.xc.backend.dao.ProductDAO;
import net.xc.backend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("net.xc.backend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
/*	@Test
	public  void testCRUDProduct(){
		
		//create operation
		product = new Product();
		
		product.setName("nexus 6p");
		product.setBrand("nexus");
		product.setDescription("abscdefgifwi");
		product.setUnitPrice(60000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		assertEquals("Something went wrong",true,productDAO.add(product));
		
		//reading and updating the category
		product = productDAO.get(2);
		product.setName("motorola g3");
		assertEquals("Something went wrong",true,productDAO.update(product));
		assertEquals("Something went wrong",true,productDAO.delete(product));
		
	  //list
		assertEquals("Something went wrong",6,productDAO.list().size());
		
	}
	*/
	
	@Test
	public void testListActiveProducts(){
		assertEquals("Something went wrong",5,productDAO.listActiveProducts().size());
		
	}
	

	@Test
	public void testListActiveProductsByCategory(){
		assertEquals("somethings wrong",3,productDAO.listActiveProductsByCategory(3).size());
		assertEquals("somethings wrong",2,productDAO.listActiveProductsByCategory(1).size());
	
	}

	@Test
	public void testGetLatestActiveProducts(){
		assertEquals("somethings wrong",3,productDAO.getLatestActiveProducts(3).size());
		
}}
