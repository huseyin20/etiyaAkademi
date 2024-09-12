package com.etiya.business;

import com.etiya.core.logging.Logger;
import com.etiya.dataAccess.HibernateProductDao;
import com.etiya.dataAccess.JdbcProductDao;
import com.etiya.dataAccess.ProductDao;
import com.etiya.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers; //private Logger[] loggers aynı kullanım

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //İş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10dan küçük olamaz!");
        }

        //ProductDao productDao = new JdbcProductDao();
        productDao.add(product);

        for(Logger logger: loggers){ //[db,mail,....]
            logger.log(product.getName());
        }
    }
}
