package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.tx.mapper;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.RequestTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.ResponseTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;

public class SendOtpValidationCreateChallengeV0DaoMapper {

    public RequestTransactionCceetl01_1 getRequestTx(BDtoInCreateChallengePost bDtoInCreateChallengePost){
        RequestTransactionCceetl01_1 request = new RequestTransactionCceetl01_1();
        if(bDtoInCreateChallengePost!= null && bDtoInCreateChallengePost.getDocumentNumber()!=null){
            request.setPersonalId(bDtoInCreateChallengePost.getDocumentNumber());
        }
        return request;
    }

    public BDtoOutCreateChallengePost getResponse(ResponseTransactionCceetl01_1 responseTransactionCceetl01_1){
        BDtoOutCreateChallengePost out = new BDtoOutCreateChallengePost();
        out.setCorrelationToken(responseTransactionCceetl01_1.getCodigoRetorno());
        return out;
    }
}
