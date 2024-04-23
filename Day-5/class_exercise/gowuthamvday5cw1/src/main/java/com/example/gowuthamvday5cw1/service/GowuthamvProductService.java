package com.example.gowuthamvday5cw1.service;

import org.springframework.stereotype.Service;

import com.example.gowuthamvday5cw1.model.GowuthamvProduct;
import com.example.gowuthamvday5cw1.repository.GowuthamvProductRepo;

@Service
public class GowuthamvProductService {
    public GowuthamvProductRepo productRepo;
    public GowuthamvProductService(GowuthamvProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(GowuthamvProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,GowuthamvProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public GowuthamvProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
