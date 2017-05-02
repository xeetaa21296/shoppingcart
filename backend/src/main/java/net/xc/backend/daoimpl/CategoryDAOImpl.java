package net.xc.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.xc.backend.dao.CategoryDAO;
import net.xc.backend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
@Autowired
private SessionFactory sessionFactory;
	private static List<Category> categories = new ArrayList<>();
	
	static{
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("horse");
		category.setDescription("this is an animal");
		category.setImageurl("cat1.png");
		
		categories.add(category);
	
	//adding second category
		category = new Category();
		category.setId(2);
		category.setName("crow");
		category.setDescription("this is a bird");
		category.setImageurl("cat2.png");
		
		categories.add(category);
		
	//adding third category
		category = new Category();
		category.setId(3);
		category.setName("salmon");
		category.setDescription("this is a fish");
		category.setImageurl("cat3.png");
		
		categories.add(category);	
	
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		for(Category category : categories){
			if(category.getId() == id) return category;
		}
		return null;
	}
@Override
@Transactional
	public boolean add(Category category) {
		try{
	//add category
			sessionFactory.getCurrentSession().persist(category); 
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	
	}

}
