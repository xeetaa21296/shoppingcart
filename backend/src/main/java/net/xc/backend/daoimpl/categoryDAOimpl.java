package net.xc.backend.daoimpl;


import java.util.ArrayList;
import java.util.List;

import net.xc.backend.dao.categoryDAO;
import net.xc.backend.dto.category;

public class categoryDAOimpl implements categoryDAO {
	
	
private static List<category> categories = new ArrayList<>();
	

static{ 
	
	Category category = new Category();
	//adding first category
	category.setId(1);
	category.setName("owl");
	category.setDescription("its a bird");
	category.setImageurl("cat1.png");
	
	categories.add(category); 
	
	//second category
	
	category = new Category();
	category.setId(2);
	category.setName("lion");
	category.setDescription("its an animal");
	category.setImageurl("cat2.png"); 
	 
	//third category
	
	category = new Category();
	category.setId(3);
	category.setName("salmon");
	category.setDescription("its a fish");
	category.setImageurl("cat1.png");
		
}
	public List<category> list() {
		// TODO Auto-generated method stub
		return categories;
	} 

}
