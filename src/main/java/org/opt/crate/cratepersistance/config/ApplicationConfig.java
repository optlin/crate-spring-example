package org.opt.crate.cratepersistance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.crate.config.AbstractCrateConfiguration;
import org.springframework.data.crate.core.mapping.event.ValidatingCrateEventListener;
import org.springframework.data.crate.core.mapping.schema.CratePersistentEntitySchemaManager;
import org.springframework.data.crate.core.mapping.schema.SchemaExportOption;
import org.springframework.data.crate.repository.config.EnableCrateRepositories;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * Created by u1cc06 on 2/8/18.
 */
@Configuration
@EnableCrateRepositories(basePackages = "org.opt")
class ApplicationConfig extends AbstractCrateConfiguration {

    @Bean
    public CratePersistentEntitySchemaManager cratePersistentEntitySchemaManager() throws Exception {
        return new CratePersistentEntitySchemaManager(crateTemplate(), SchemaExportOption.CREATE);
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public ValidatingCrateEventListener validatingCrateEventListener() {
        return new ValidatingCrateEventListener(validator());
    }
}
