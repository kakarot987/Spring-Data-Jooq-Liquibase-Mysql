/*
 * This file is generated by jOOQ.
 */
package co.db.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer modelId;
    private String  modelName;
    private String  modelInstaurl;
    private String  modelGender;
    private String  modelBorn;
    private String  modelNationality;
    private String  modelHeight;
    private String  modelFigure;

    public Model() {}

    public Model(Model value) {
        this.modelId = value.modelId;
        this.modelName = value.modelName;
        this.modelInstaurl = value.modelInstaurl;
        this.modelGender = value.modelGender;
        this.modelBorn = value.modelBorn;
        this.modelNationality = value.modelNationality;
        this.modelHeight = value.modelHeight;
        this.modelFigure = value.modelFigure;
    }

    public Model(
        Integer modelId,
        String  modelName,
        String  modelInstaurl,
        String  modelGender,
        String  modelBorn,
        String  modelNationality,
        String  modelHeight,
        String  modelFigure
    ) {
        this.modelId = modelId;
        this.modelName = modelName;
        this.modelInstaurl = modelInstaurl;
        this.modelGender = modelGender;
        this.modelBorn = modelBorn;
        this.modelNationality = modelNationality;
        this.modelHeight = modelHeight;
        this.modelFigure = modelFigure;
    }

    /**
     * Getter for <code>model.model_id</code>.
     */
    public Integer getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>model.model_id</code>.
     */
    public Model setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>model.model_name</code>.
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * Setter for <code>model.model_name</code>.
     */
    public Model setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * Getter for <code>model.model_instaURL</code>.
     */
    public String getModelInstaurl() {
        return this.modelInstaurl;
    }

    /**
     * Setter for <code>model.model_instaURL</code>.
     */
    public Model setModelInstaurl(String modelInstaurl) {
        this.modelInstaurl = modelInstaurl;
        return this;
    }

    /**
     * Getter for <code>model.model_gender</code>.
     */
    public String getModelGender() {
        return this.modelGender;
    }

    /**
     * Setter for <code>model.model_gender</code>.
     */
    public Model setModelGender(String modelGender) {
        this.modelGender = modelGender;
        return this;
    }

    /**
     * Getter for <code>model.model_born</code>.
     */
    public String getModelBorn() {
        return this.modelBorn;
    }

    /**
     * Setter for <code>model.model_born</code>.
     */
    public Model setModelBorn(String modelBorn) {
        this.modelBorn = modelBorn;
        return this;
    }

    /**
     * Getter for <code>model.model_nationality</code>.
     */
    public String getModelNationality() {
        return this.modelNationality;
    }

    /**
     * Setter for <code>model.model_nationality</code>.
     */
    public Model setModelNationality(String modelNationality) {
        this.modelNationality = modelNationality;
        return this;
    }

    /**
     * Getter for <code>model.model_height</code>.
     */
    public String getModelHeight() {
        return this.modelHeight;
    }

    /**
     * Setter for <code>model.model_height</code>.
     */
    public Model setModelHeight(String modelHeight) {
        this.modelHeight = modelHeight;
        return this;
    }

    /**
     * Getter for <code>model.model_figure</code>.
     */
    public String getModelFigure() {
        return this.modelFigure;
    }

    /**
     * Setter for <code>model.model_figure</code>.
     */
    public Model setModelFigure(String modelFigure) {
        this.modelFigure = modelFigure;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Model other = (Model) obj;
        if (modelId == null) {
            if (other.modelId != null)
                return false;
        }
        else if (!modelId.equals(other.modelId))
            return false;
        if (modelName == null) {
            if (other.modelName != null)
                return false;
        }
        else if (!modelName.equals(other.modelName))
            return false;
        if (modelInstaurl == null) {
            if (other.modelInstaurl != null)
                return false;
        }
        else if (!modelInstaurl.equals(other.modelInstaurl))
            return false;
        if (modelGender == null) {
            if (other.modelGender != null)
                return false;
        }
        else if (!modelGender.equals(other.modelGender))
            return false;
        if (modelBorn == null) {
            if (other.modelBorn != null)
                return false;
        }
        else if (!modelBorn.equals(other.modelBorn))
            return false;
        if (modelNationality == null) {
            if (other.modelNationality != null)
                return false;
        }
        else if (!modelNationality.equals(other.modelNationality))
            return false;
        if (modelHeight == null) {
            if (other.modelHeight != null)
                return false;
        }
        else if (!modelHeight.equals(other.modelHeight))
            return false;
        if (modelFigure == null) {
            if (other.modelFigure != null)
                return false;
        }
        else if (!modelFigure.equals(other.modelFigure))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelName == null) ? 0 : this.modelName.hashCode());
        result = prime * result + ((this.modelInstaurl == null) ? 0 : this.modelInstaurl.hashCode());
        result = prime * result + ((this.modelGender == null) ? 0 : this.modelGender.hashCode());
        result = prime * result + ((this.modelBorn == null) ? 0 : this.modelBorn.hashCode());
        result = prime * result + ((this.modelNationality == null) ? 0 : this.modelNationality.hashCode());
        result = prime * result + ((this.modelHeight == null) ? 0 : this.modelHeight.hashCode());
        result = prime * result + ((this.modelFigure == null) ? 0 : this.modelFigure.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Model (");

        sb.append(modelId);
        sb.append(", ").append(modelName);
        sb.append(", ").append(modelInstaurl);
        sb.append(", ").append(modelGender);
        sb.append(", ").append(modelBorn);
        sb.append(", ").append(modelNationality);
        sb.append(", ").append(modelHeight);
        sb.append(", ").append(modelFigure);

        sb.append(")");
        return sb.toString();
    }
}