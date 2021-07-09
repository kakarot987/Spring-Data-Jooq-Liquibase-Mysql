package com.springBootliquibasejooq.controller;

import co.db.jooq.tables.pojos.Model;
import co.db.jooq.tables.records.ModelRecord;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.springBootliquibasejooq.ModelRepository;
import com.springBootliquibasejooq.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
@RestController
public class ModelController {

    @Autowired
    ModelService modelService;

    @Autowired
    ModelRepository modelRepository;

    @RequestMapping("/addModel")
    public String addModel(@RequestBody Model model){
        return modelService.addModel(model.getModelId(),model.getModelName(),model.getModelInstaurl(),model.getModelGender(),model.getModelBorn(),model.getModelNationality(),model.getModelHeight(),model.getModelFigure());
    }

    @RequestMapping ("getModels")
    public List<Model> getModels(){
        //Optional<ModelRecord> msd = modelRepository.selectFrom();
    return modelRepository.selectAll();
    }
}
