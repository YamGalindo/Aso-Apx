package com.bbva.cacd.sendotpvalidationchallengev0.business.v0;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;

public interface ISendOtpValidationCreateChallengeV0Business {
  BDtoOutCreateChallengePost sendOtpValidationCreateChallengeV0(BDtoInCreateChallengePost createChallengePost);
}
