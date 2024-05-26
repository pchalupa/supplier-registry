/*
package com.supplierregistry.supplierregistry.providers.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;


public class EntityManagerProvider {
    EntityManager entityManager ;

    public EntityManager getEntityManager() {
        try {
            if(entityManager == null) {
                entityManager = (Persistence.createEntityManagerFactory("default")).createEntityManager();
            }
            return entityManager;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
*/
