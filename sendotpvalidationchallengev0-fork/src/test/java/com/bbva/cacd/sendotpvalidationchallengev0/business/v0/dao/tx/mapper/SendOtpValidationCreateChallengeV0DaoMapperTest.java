package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.tx.mapper;

import com.bbva.cacd.sendotpvalidationchallengev0.DummyMock;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class SendOtpValidationCreateChallengeV0DaoMapperTest {

    @InjectMocks
    private SendOtpValidationCreateChallengeV0DaoMapper mapper;

    private DummyMock dummyMock;

    @Before
    public void init(){
        dummyMock = new DummyMock();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getRequestTxTest(){
        mapper.getRequestTx(dummyMock.getBDtoInCreateChallengePost());
    }

    @Test
    public void getResponseTest(){
        mapper.getResponse(dummyMock.getResponseDao());
    }

}
