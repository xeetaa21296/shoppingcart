package net.xc.backend.test;



import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.xc.backend.dao.CategoryDAO;
import net.xc.backend.dto.Category;

public class CategoryTestCase {
	
	
	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.xc.backend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	@Test
	public void testAddCategory(){
		
		category = new Category();
		category.setName("horse");
		category.setDescription("this is an animal");
		category.setImageurl("cat1.png");
		
		assertEquals("Succesfully added a category inside the table",true,categoryDAO.add(category));
		
	}
	
	
}