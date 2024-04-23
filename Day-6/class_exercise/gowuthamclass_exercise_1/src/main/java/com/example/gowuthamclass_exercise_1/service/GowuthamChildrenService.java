package com.example.gowuthamclass_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.gowuthamclass_exercise_1.model.GowuthamChildren;
import com.example.gowuthamclass_exercise_1.repository.GowuthamChildrenRepo;

@Service
public class GowuthamChildrenService {

     @Autowired
     public GowuthamChildrenRepo childrenRepo;

     public List<GowuthamChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public GowuthamChildren save(GowuthamChildren children) {
          return childrenRepo.save(children);

     }

     public List<GowuthamChildren> sortedPage(int offset, int pagesize, String field) {
          Page<GowuthamChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<GowuthamChildren> pagination(int offset, int pagesize) {
          Page<GowuthamChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
