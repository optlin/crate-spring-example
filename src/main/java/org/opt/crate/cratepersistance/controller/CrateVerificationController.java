package org.opt.crate.cratepersistance.controller;

import org.opt.crate.cratepersistance.dao.EntityMetadataRepository;
import org.opt.crate.cratepersistance.dao.vo.EntityMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by u1cc06 on 2/8/18.
 */
@RestController
public class CrateVerificationController {

    @Autowired
    private EntityMetadataRepository entityMetadataRepository;

    @RequestMapping("/create")
    public void createEntity(EntityMetadata entityMetadata) {
        entityMetadataRepository.save(entityMetadata);
    }
}
