package com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "dtoInCreateChallengePost", namespace = "com:bbva:cacd:sendotpvalidationchallengev0:facade:v0:dto")
@XmlType(name = "dtoInCreateChallengePost", namespace = "com:bbva:cacd:sendotpvalidationchallengev0:facade:v0:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DtoInCreateChallengePost implements Serializable {

  public static final long serialVersionUID = 3337560438090000000L;

  @JsonProperty("originAppId")
  private String originAppId;

  @NotNull
  @JsonProperty("documentNumber")
  private String documentNumber;

  @JsonProperty("businessData")
  private String businessData;

  @JsonProperty("policy")
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
