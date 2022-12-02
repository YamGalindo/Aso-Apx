package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.DummyMock;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.RequestTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.ResponseTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.tx.mapper.SendOtpValidationCreateChallengeV0DaoMapper;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(MockitoJUnitRunner.class)
public class SendOtpValidationCreateChallengeV0DaoTest {

    @InjectMocks
    private SendOtpValidationCreateChallengeV0Dao dao;

    private DummyMock dummyMock;

    @Mock
    private SendOtpValidationCreateChallengeV0DaoMapper mapper;

    @Mock
    private ServicioTransacciones transaccionService;

    @Before
    public void init(){
        dummyMock = new DummyMock();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void invokeRestlessApxTransactionTest(){
        Mockito.when(mapper.getRequestTx(Mockito.any(BDtoInCreateChallengePost.class)))
                .thenReturn(dummyMock.getRequestDao());
        Mockito.when(transaccionService.invocar(Mockito.any(), Mockito.any(), Mockito.any(RequestTransactionCceetl01_1.class)))
                .thenReturn(dummyMock.getRequestDao());
        Mockito.when(mapper.getResponse(Mockito.any(ResponseTransactionCceetl01_1.class)))
                .thenReturn(dummyMock.getResponseDaoMapped());
        BDtoOutCreateChallengePost response = dao.invokeRestlessApxTransaction(dummyMock.getBDtoInCreateChallengePost());

        Assert.assertNotNull(response);
    }

}
