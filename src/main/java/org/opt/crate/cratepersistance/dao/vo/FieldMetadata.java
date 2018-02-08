package org.opt.crate.cratepersistance.dao.vo;

import java.io.Serializable;

/**
 * Created by u1cc06 on 2/8/18.
 */
public class FieldMetadata implements Serializable {

    private static final long serialVersionUID = -1l;
    private String name;
    private String description;
    private String datatype;
    private String additionalMetaInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getAdditionalMetaInfo() {
        return additionalMetaInfo;
    }

    public void setAdditionalMetaInfo(String additionalMetaInfo) {
        this.additionalMetaInfo = additionalMetaInfo;
    }
}
