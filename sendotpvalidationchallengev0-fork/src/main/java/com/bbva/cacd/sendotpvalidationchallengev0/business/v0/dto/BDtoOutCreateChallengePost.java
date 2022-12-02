package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto;

public class BDtoOutCreateChallengePost {

  private String correlationToken;

  public String getCorrelationToken() {
    return this.correlationToken;
  }

  public void setCorrelationToken(String correlationToken) {
    this.correlationToken = correlationToken;
  }

  @Override
  public String toString() {
    return "BDtoOutCreateChallengePost{" +
            "correlationToken='" + correlationToken + '\'' +
            '}';
  }
}
