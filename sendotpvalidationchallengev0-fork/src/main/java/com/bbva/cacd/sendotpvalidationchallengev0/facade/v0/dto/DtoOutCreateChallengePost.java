package com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "dtoOutCreateChallengePost", namespace = "com:bbva:cacd:sendotpvalidationchallengev0:facade:v0:dto")
@XmlType(name = "dtoOutCreateChallengePost", namespace = "com:bbva:cacd:sendotpvalidationchallengev0:facade:v0:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DtoOutCreateChallengePost implements Serializable {

  public static final long serialVersionUID = 3337560438120000000L;

  @NotNull
  @JsonProperty("correlationToken")
  private String correlationToken;

  public String getCorrelationToken() {
    return this.correlationToken;
  }

  public void setCorrelationToken(String correlationToken) {
    this.correlationToken = correlationToken;
  }
}
