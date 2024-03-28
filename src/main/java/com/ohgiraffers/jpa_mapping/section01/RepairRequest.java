package com.ohgiraffers.jpa_mapping.section01;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_repair")
public class RepairRequest {

    @Id
    @Column(name = "request_no")
    private int requestNo;      // 수리신청 번호
    @Column(name = "model")
    private String model;       // 기종
    @Column(name = "issue")
    private String issue;     // 고장 내용
    @Column(name = "repair_cost")
    private int repairCost;     // 수리 비용
    @Column(name = "insurance", nullable = false, columnDefinition = "varchar(1) default 'N'")
    private String insurance;    // 보험

    protected RepairRequest() {}

    public RepairRequest(int requestNo, String model, String issue, int repairCost, String insurance) {
        this.requestNo = requestNo;
        this.model = model;
        this.issue = issue;
        this.repairCost = repairCost;
        this.insurance = insurance;
    }

    public int getRequestNo() {
        return requestNo;
    }

    public String getModel() {
        return model;
    }

    public String getIssue() {
        return issue;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public String getInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        return "RepairRequest{" +
                "requestNo=" + requestNo +
                ", model='" + model + '\'' +
                ", issue='" + issue + '\'' +
                ", repairCost=" + repairCost +
                ", insurance='" + insurance + '\'' +
                '}';
    }
}
