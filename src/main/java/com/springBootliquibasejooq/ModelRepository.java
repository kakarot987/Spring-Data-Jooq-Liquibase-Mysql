package com.springBootliquibasejooq;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class ModelRepository{

    private final DSLContext dslContext;

    public ModelRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public void addModel(String id, String name, String instaURL, String gender, String born, String nationality, String height, String figure){

    }
}
