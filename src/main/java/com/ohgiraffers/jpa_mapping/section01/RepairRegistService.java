package com.ohgiraffers.jpa_mapping.section01;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RepairRegistService {

    private RepairRequestRepository repairRequestRepository;

    public RepairRegistService (RepairRequestRepository repairRequestRepository) {
        this.repairRequestRepository = repairRequestRepository;
    }

    @Transactional
    public void registRequest(RepairRequestDTO repairRequest) {
        RepairRequest request = new RepairRequest(
                repairRequest.getRequestNo(),
                repairRequest.getModel(),
                repairRequest.getIssue(),
                repairRequest.getRepairCost(),
                repairRequest.getInsurance()
        );
        repairRequestRepository.registRequest(request);

    }


}
