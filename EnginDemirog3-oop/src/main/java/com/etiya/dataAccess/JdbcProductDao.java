package com.etiya.dataAccess;

import com.etiya.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        // Sadece db erişim kodları buraya eklenir...SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
