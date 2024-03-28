package com.ohgiraffers.jpa_mapping.section01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class RepairRequestRepository {

    @PersistenceContext
    private EntityManager manager;

    public void registRequest(RepairRequest request) {
        manager.persist(request);
    }
}
