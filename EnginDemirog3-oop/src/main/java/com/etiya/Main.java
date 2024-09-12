package com.etiya;

import com.etiya.business.ProductManager;
import com.etiya.core.logging.DatabaseLogger;
import com.etiya.core.logging.FileLogger;
import com.etiya.core.logging.Logger;
import com.etiya.dataAccess.HibernateProductDao;
import com.etiya.dataAccess.JdbcProductDao;
import com.etiya.entities.Product;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone XR",1000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger()};

        ProductManager productManager =
                new ProductManager(new HibernateProductDao(), List.of(loggers));
        productManager.add(product1);

    }
}