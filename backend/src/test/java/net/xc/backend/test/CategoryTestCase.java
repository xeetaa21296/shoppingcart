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
	
	/*@Test
	public void testAddCategory(){
	category = new Category();
	category.setName("horse");
	category.setDescription("this is an animal");
	category.setImageurl("cat1_png");
	
	assertEquals("succesfully added a category",true,categoryDAO.add(category));
		
	
	}*/
	
	/*@Test
	public void testGetCategory(){
		
		category = categoryDAO.get(1);
		assertEquals("succesfully fetched a single category","horse",category.getName());	
		}
	*/
	
	/*@Test
	public void testUpdateCategory(){
		
		category = categoryDAO.get(1);
		category.setName("Pony");
		assertEquals("succesfully updated a single category",true,categoryDAO.update(category));	
		}
	*/
	
	/*@Test
	public void testDeleteCategory(){
		
		category = categoryDAO.get(1);
	
		assertEquals("succesfully deleted a single category",true,categoryDAO.delete(category));	
		}
	*/
	
	/*@Test
	public void testListCategory(){
		
	
		assertEquals("succesfully fetched the list of categories",0,categoryDAO.list().size());	
		}
	*/
	
	@Test
	public void testCRUDCategory(){
		//add operation
		category = new Category();
		
		category.setName("horse");
		category.setDescription("this is an animal");
		category.setImageurl("cat1_png");
		
		assertEquals("succesfully added a category",true,categoryDAO.add(category));
			
		
		category = new Category();
		
		category.setName("crow");
		category.setDescription("this is a bird");
		category.setImageurl("cat2_png");
		
		assertEquals("succesfully added a category",true,categoryDAO.add(category));
			
		
		//fetching and updating the category	
		category = categoryDAO.get(2);
		category.setName("Pony");
		assertEquals("succesfully updated a single category",true,categoryDAO.update(category));	
		
		//delete the category
	   assertEquals("succesfully deleted a single category",true,categoryDAO.delete(category));	
	
	   //fetching the list
	   assertEquals("succesfully fetched the list of categories",1,categoryDAO.list().size());	
	}
	}