package com.bbva.cacd.sendotpvalidationchallengev0.facade.v0;

import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto.DtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto.DtoOutCreateChallengePost;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;

public interface ISrvSendOtpValidationAPIChallengeV0 {

  ServiceResponse<DtoOutCreateChallengePost> sendOtpValidationCreateChallengeV0(DtoInCreateChallengePost createChallengePost);
}
