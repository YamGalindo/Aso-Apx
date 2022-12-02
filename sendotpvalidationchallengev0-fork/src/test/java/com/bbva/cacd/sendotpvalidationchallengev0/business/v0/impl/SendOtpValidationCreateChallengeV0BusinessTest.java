package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.DummyMock;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.impl.SendOtpValidationCreateChallengeV0Dao;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SendOtpValidationCreateChallengeV0BusinessTest {

  @InjectMocks private SendOtpValidationCreateChallengeV0Business bSrv;

  private DummyMock dummyMock;

  private SendOtpValidationCreateChallengeV0Dao dao;

  @Before
  public void init(){
    dummyMock = new DummyMock();
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testSendOtpValidationCreateChallengeV0() {
    Mockito.when(bSrv.sendOtpValidationCreateChallengeV0(Mockito.any(BDtoInCreateChallengePost.class)))
            .thenReturn(dao.invokeRestlessApxTransaction(dummyMock.getBDtoInCreateChallengePost()));
    BDtoOutCreateChallengePost response = bSrv.sendOtpValidationCreateChallengeV0(dummyMock.getBDtoInCreateChallengePost());
    Assert.assertNotNull(response);
  }
}
