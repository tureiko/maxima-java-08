package org.example.service;

import org.example.model.Cat;
import org.example.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatService {
    @Autowired
    private CatRepository repo;

    public void start(){
        System.out.println(repo.findAll());
    }

    public List<Cat> getAllCats(){
        return repo.findAll();
    }

    public void createCat(Cat cat){
        repo.create(cat);
    }

}
