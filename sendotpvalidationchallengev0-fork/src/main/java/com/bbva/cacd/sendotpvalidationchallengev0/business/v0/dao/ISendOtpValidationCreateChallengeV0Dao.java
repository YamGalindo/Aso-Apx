package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.ResponseTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;

public interface ISendOtpValidationCreateChallengeV0Dao {
    BDtoOutCreateChallengePost invokeRestlessApxTransaction(BDtoInCreateChallengePost bDtoInCreateChallengePost);
}
