package org.opt.crate.cratepersistance.dao;

import org.opt.crate.cratepersistance.dao.vo.EntityMetadata;
import org.springframework.data.crate.repository.CrateRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by u1cc06 on 2/8/18.
 */
@Repository
public interface EntityMetadataRepository extends CrateRepository<EntityMetadata, String> {

}
