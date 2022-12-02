package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.ISendOtpValidationCreateChallengeV0Business;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.impl.SendOtpValidationCreateChallengeV0Dao;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendOtpValidationCreateChallengeV0Business implements ISendOtpValidationCreateChallengeV0Business {

  @Autowired
  private SendOtpValidationCreateChallengeV0Dao dao;

  private static final Log log = LogFactory.getLog(SendOtpValidationCreateChallengeV0Business.class);

  @Override
  public BDtoOutCreateChallengePost sendOtpValidationCreateChallengeV0(final BDtoInCreateChallengePost createChallengePost) {

    log.debug(String.format( "In Business", createChallengePost));
    BDtoOutCreateChallengePost out = dao.invokeRestlessApxTransaction(createChallengePost);
    log.debug(String.format(" Out Business ", out));

    return out;
  }
}
