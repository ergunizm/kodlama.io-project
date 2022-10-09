package business;

import dataAccess.CategoryDao;
import entities.Category;
import core.logging.ILogger;


public class CategoryManager {
    private CategoryDao categoryDao;
    private Category[] categories;
    private ILogger[] loggers;

    public CategoryManager(Category[] categories, CategoryDao categoryDao,ILogger[] loggers){
        this.categories = categories;
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category newCategory) throws Exception {
        for(Category category:categories){
            if(newCategory.getName() == category.getName()){
                throw new Exception("Ayni isimde kategori girilemez!");
            }
            for(ILogger logger:loggers){
                logger.log(category.getName());
            }

        }

        categoryDao.Add();
    }
}
