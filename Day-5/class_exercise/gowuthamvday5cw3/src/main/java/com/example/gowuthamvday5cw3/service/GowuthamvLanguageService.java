package com.example.gowuthamvday5cw3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gowuthamvday5cw3.model.GowuthamvLanguage;
import com.example.gowuthamvday5cw3.repository.GowuthamvLanguageRepo;

@Service
public class GowuthamvLanguageService {
    private GowuthamvLanguageRepo languageRepo;
    public GowuthamvLanguageService(GowuthamvLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(GowuthamvLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<GowuthamvLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,GowuthamvLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public GowuthamvLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
