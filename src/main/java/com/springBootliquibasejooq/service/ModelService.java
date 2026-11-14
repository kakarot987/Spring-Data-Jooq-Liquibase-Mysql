package com.springBootliquibasejooq.service;

import com.springBootliquibasejooq.ModelRepository;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

    private final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public void addModel(int id, String name, String instaURL, String dpURL,
                         String gender, String born, String nationality,
                         String height, String figure) {
        modelRepository.addModel(id, name, instaURL, dpURL, gender, born, nationality, height, figure);
    }
}
