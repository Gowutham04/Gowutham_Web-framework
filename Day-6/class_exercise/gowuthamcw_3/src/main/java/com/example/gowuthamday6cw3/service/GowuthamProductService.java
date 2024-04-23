package com.example.gowuthamday6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.gowuthamday6cw3.model.GowuthamProduct;
import com.example.gowuthamday6cw3.repository.GowuthamProductRepo;

@Service
public class GowuthamProductService {
    public GowuthamProductRepo productRepo;
    public GowuthamProductService(GowuthamProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(GowuthamProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<GowuthamProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<GowuthamProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public GowuthamProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
