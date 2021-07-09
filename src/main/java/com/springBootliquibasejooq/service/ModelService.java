package com.springBootliquibasejooq.service;

import com.springBootliquibasejooq.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

    @Autowired
    ModelRepository modelRepository;

    public String addModel(int id, String name, String instaURL, String gender, String born, String nationality, String height, String figure){
        try {
            modelRepository.addModel(id,name,instaURL,gender,born,nationality,height,figure);
            return "Added Model Info Successfully";
        }
        catch (Exception e){
            System.out.println(e);
            return "Exception occur";
        }
    }
}
