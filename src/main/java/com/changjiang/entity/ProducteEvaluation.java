package com.changjiang.entity;
public class ProducteEvaluation {
    private Integer id;
    private String number;
    private Integer evaluationRank;
    private String evaluationContent;
    private java.util.Date evaluationTime;
    private String evaluationPeople;
    private String evaluationPeopleContactWay;
    private Integer producteId;
    public ProducteEvaluation() {
        super();
    }
    public ProducteEvaluation(Integer id,String number,Integer evaluationRank,String evaluationContent,java.util.Date evaluationTime,String evaluationPeople,String evaluationPeopleContactWay,Integer producteId) {
        super();
        this.id = id;
        this.number = number;
        this.evaluationRank = evaluationRank;
        this.evaluationContent = evaluationContent;
        this.evaluationTime = evaluationTime;
        this.evaluationPeople = evaluationPeople;
        this.evaluationPeopleContactWay = evaluationPeopleContactWay;
        this.producteId = producteId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getEvaluationRank() {
        return this.evaluationRank;
    }

    public void setEvaluationRank(Integer evaluationRank) {
        this.evaluationRank = evaluationRank;
    }

    public String getEvaluationContent() {
        return this.evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
    }

    public java.util.Date getEvaluationTime() {
        return this.evaluationTime;
    }

    public void setEvaluationTime(java.util.Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public String getEvaluationPeople() {
        return this.evaluationPeople;
    }

    public void setEvaluationPeople(String evaluationPeople) {
        this.evaluationPeople = evaluationPeople;
    }

    public String getEvaluationPeopleContactWay() {
        return this.evaluationPeopleContactWay;
    }

    public void setEvaluationPeopleContactWay(String evaluationPeopleContactWay) {
        this.evaluationPeopleContactWay = evaluationPeopleContactWay;
    }

    public Integer getProducteId() {
        return this.producteId;
    }

    public void setProducteId(Integer producteId) {
        this.producteId = producteId;
    }

}
