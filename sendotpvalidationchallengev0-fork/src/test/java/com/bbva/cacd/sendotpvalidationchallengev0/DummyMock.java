package com.bbva.cacd.sendotpvalidationchallengev0;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.RequestTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.ResponseTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto.DtoInCreateChallengePost;

public class DummyMock {

    public DtoInCreateChallengePost getDtoInCreateChallengePost(){
        DtoInCreateChallengePost dtoInCreateChallengePost = new DtoInCreateChallengePost();
        dtoInCreateChallengePost.setBusinessData("Business data");
        dtoInCreateChallengePost.setDocumentNumber("1001199309");
        dtoInCreateChallengePost.setPolicy("policy");
        dtoInCreateChallengePost.setOriginAppId("1200001");
        return dtoInCreateChallengePost;
    }

    public BDtoOutCreateChallengePost getBDtoOutCreateChallengePost(){
        BDtoOutCreateChallengePost bDtoOutCreateChallengePost = new BDtoOutCreateChallengePost();
        bDtoOutCreateChallengePost.setCorrelationToken("jasdfdsdsavsadfsdf");
        return bDtoOutCreateChallengePost;
    }

    public BDtoInCreateChallengePost getBDtoInCreateChallengePost(){
        BDtoInCreateChallengePost bDtoInCreateChallengePost = new BDtoInCreateChallengePost();
        bDtoInCreateChallengePost.setBusinessData("Business data");
        bDtoInCreateChallengePost.setDocumentNumber("1001199309");
        bDtoInCreateChallengePost.setPolicy("policy");
        bDtoInCreateChallengePost.setOriginAppId("12000001");
        return bDtoInCreateChallengePost;
    }

    public ResponseTransactionCceetl01_1 getResponseDao(){
        ResponseTransactionCceetl01_1 response = new ResponseTransactionCceetl01_1();
        response.setCodigoRetorno("200");
        response.setAplicacionAviso("aviso");
        response.setCodigoAviso("ok");
        response.setDescripcionAviso("ok");
        return response;
    }

    public RequestTransactionCceetl01_1 getRequestDao(){
        RequestTransactionCceetl01_1 request = new RequestTransactionCceetl01_1();
        request.setPersonalId("1001199309");
        return request;
    }

    public BDtoOutCreateChallengePost getResponseDaoMapped(){
        BDtoOutCreateChallengePost response = new BDtoOutCreateChallengePost();
        response.setCorrelationToken("hola");
        return response;
    }
}
