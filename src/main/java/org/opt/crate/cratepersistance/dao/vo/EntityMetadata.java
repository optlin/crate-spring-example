package org.opt.crate.cratepersistance.dao.vo;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.crate.core.mapping.annotations.Table;

import java.util.Set;

/**
 * Created by u1cc06 on 2/8/18.
 */
@Table(name="EntityMetadata", numberOfReplicas="0-all")
public class EntityMetadata {

    private static final long serialVersionUID = -1l;
    private String entityName;
    private String description;
    private String additionalMetaInfo;
    // TODO additional info here
    private Set<FieldMetadata> fields;

    @PersistenceConstructor
    public EntityMetadata(String entityName, String description, String additionalMetaInfo, Set<FieldMetadata> fields) {
        this.entityName = entityName;
        this.description = description;
        this.additionalMetaInfo = additionalMetaInfo;
        this.fields = fields;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalMetaInfo() {
        return additionalMetaInfo;
    }

    public void setAdditionalMetaInfo(String additionalMetaInfo) {
        this.additionalMetaInfo = additionalMetaInfo;
    }

    public Set<FieldMetadata> getFields() {
        return fields;
    }

    public void setFields(Set<FieldMetadata> fields) {
        this.fields = fields;
    }
}
