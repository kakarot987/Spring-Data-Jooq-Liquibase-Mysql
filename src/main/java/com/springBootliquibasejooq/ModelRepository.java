package com.springBootliquibasejooq;

import co.db.jooq.tables.Model;
import co.db.jooq.tables.records.ModelRecord;
import org.jooq.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ModelRepository {

    private final DSLContext dslContext;

    public ModelRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public void addModel(int id, String name, String instaURL, String gender, String born, String nationality, String height, String figure) {
        dslContext
                .insertInto(Model.MODEL)
                .set(Model.MODEL.MODEL_ID, id)
                .set(Model.MODEL.MODEL_NAME, name)
                .set(Model.MODEL.MODEL_INSTAURL, instaURL)
                .set(Model.MODEL.MODEL_GENDER, gender)
                .set(Model.MODEL.MODEL_BORN, born)
                .set(Model.MODEL.MODEL_NATIONALITY, nationality)
                .set(Model.MODEL.MODEL_HEIGHT, height)
                .set(Model.MODEL.MODEL_FIGURE, figure)
                .execute();

    }

    public List<co.db.jooq.tables.pojos.Model> selectAll(){
        return dslContext.selectFrom(Model.MODEL)
                .fetchInto(co.db.jooq.tables.pojos.Model.class);
    }

    //public List<com.warumono.databases.public_.tables.pojos.Book> selectAll()
    //	{
    //		return dsl.selectFrom(book)
    //				.fetchInto(com.warumono.databases.public_.tables.pojos.Book.class);
    //	}
}
