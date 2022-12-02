package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.ISendOtpValidationCreateChallengeV0Dao;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.RequestTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.ResponseTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.tx.mapper.SendOtpValidationCreateChallengeV0DaoMapper;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.impl.SendOtpValidationCreateChallengeV0Business;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import com.hazelcast.logging.ILogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Component
public class SendOtpValidationCreateChallengeV0Dao implements ISendOtpValidationCreateChallengeV0Dao {


    @Autowired
    private ServicioTransacciones transactionService;

    @Autowired
    private SendOtpValidationCreateChallengeV0DaoMapper mapper;

    private static final Log log = LogFactory.getLog(SendOtpValidationCreateChallengeV0Business.class);

    @Override
    public BDtoOutCreateChallengePost invokeRestlessApxTransaction(BDtoInCreateChallengePost bDtoInCreateChallengePost) {

        log.info(String.format("Dao request " , bDtoInCreateChallengePost));
        RequestTransactionCceetl01_1 request = mapper.getRequestTx(bDtoInCreateChallengePost);
        ResponseTransactionCceetl01_1 response = transactionService.invocar(RequestTransactionCceetl01_1.class, ResponseTransactionCceetl01_1.class, request);
        log.info(String.format("Dao response ", response));
        BDtoOutCreateChallengePost bDtoOutCreateChallengePost = mapper.getResponse(response);
        log.info(String.format(" Dao mapped " , bDtoOutCreateChallengePost));

        return bDtoOutCreateChallengePost;

    }

}
