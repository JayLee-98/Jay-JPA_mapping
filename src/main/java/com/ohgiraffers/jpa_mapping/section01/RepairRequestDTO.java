package com.ohgiraffers.jpa_mapping.section01;

public class RepairRequestDTO {
    private int requestNo;      // 수리신청 번호
    private String model;       // 기종
    private String issue;     // 고장 내용
    private int repairCost;     // 수리 비용
    private String insurance;    // 보험

    public RepairRequestDTO() {
    }

    public RepairRequestDTO(String model, String issue, int repairCost, String insurance) {
        this.model = model;
        this.issue = issue;
        this.repairCost = repairCost;
        this.insurance = insurance;
    }

    public RepairRequestDTO(int requestNo, String model, String issue, int repairCost, String insurance) {
        this.requestNo = requestNo;
        this.model = model;
        this.issue = issue;
        this.repairCost = repairCost;
        this.insurance = insurance;
    }

    public int getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(int requestNo) {
        this.requestNo = requestNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "RepairRequestDTO{" +
                "requestNo=" + requestNo +
                ", model='" + model + '\'' +
                ", issue='" + issue + '\'' +
                ", repairCost=" + repairCost +
                ", insurance='" + insurance + '\'' +
                '}';
    }
}
