package net.xc.backend.dao;

import java.util.List;

import net.xc.backend.dto.Category;

public interface CategoryDAO {
 List<Category> list();
 Category get(int id);

}
