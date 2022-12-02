package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto;

public class BDtoInCreateChallengePost {

  private String originAppId;

  private String documentNumber;

  private String businessData;

  private String policy;

  public String getOriginAppId() {
    return this.originAppId;
  }

  public void setOriginAppId(String originAppId) {
    this.originAppId = originAppId;
  }

  public String getDocumentNumber() {
    return this.documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getBusinessData() {
    return this.businessData;
  }

  public void setBusinessData(String businessData) {
    this.businessData = businessData;
  }

  public String getPolicy() {
    return this.policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }
}
