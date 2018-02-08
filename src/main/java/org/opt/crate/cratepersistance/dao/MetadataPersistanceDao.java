package org.opt.crate.cratepersistance.dao;

import org.opt.crate.cratepersistance.dao.vo.EntityMetadata;

/**
 * Created by u1cc06 on 2/8/18.
 */
public interface MetadataPersistanceDao {

    void saveMetadata(EntityMetadata entityMetadata);
}
