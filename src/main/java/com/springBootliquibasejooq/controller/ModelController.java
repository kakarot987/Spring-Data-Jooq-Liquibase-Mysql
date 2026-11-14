package com.springBootliquibasejooq.controller;

import co.db.jooq.tables.pojos.Model;
import com.springBootliquibasejooq.ModelRepository;
import com.springBootliquibasejooq.service.ModelService;
import org.jooq.exception.DataAccessException;
import org.jooq.exception.SQLStateClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ModelController {

    private final ModelService modelService;
    private final ModelRepository modelRepository;

    public ModelController(ModelService modelService, ModelRepository modelRepository) {
        this.modelService = modelService;
        this.modelRepository = modelRepository;
    }

    @PostMapping("/addModel")
    public ResponseEntity<Void> addModel(@RequestBody Model model) {
        if (model.getModelId() == null || model.getModelId() <= 0
                || model.getModelName() == null || model.getModelName().isBlank()
                || model.getModelName().length() > 20
                || model.getModelInstaurl() == null || model.getModelInstaurl().isBlank()
                || model.getModelDpurl() == null || model.getModelDpurl().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Valid id, name, and URLs are required");
        }
        try {
            modelService.addModel(model.getModelId(), model.getModelName(),
                    model.getModelInstaurl(), model.getModelDpurl(),
                    model.getModelGender(), model.getModelBorn(),
                    model.getModelNationality(), model.getModelHeight(), model.getModelFigure());
        } catch (DataAccessException e) {
            if (e.sqlStateClass() == SQLStateClass.C23_INTEGRITY_CONSTRAINT_VIOLATION) {
                throw new ResponseStatusException(HttpStatus.CONFLICT, "Duplicate or invalid row", e);
            }
            throw e;
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/getModels")
    public List<Model> getModels() {
        return modelRepository.selectAll();
    }
}
