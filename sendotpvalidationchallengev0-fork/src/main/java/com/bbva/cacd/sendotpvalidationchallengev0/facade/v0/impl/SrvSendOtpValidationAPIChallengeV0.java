package com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.ISendOtpValidationCreateChallengeV0Business;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.impl.SendOtpValidationCreateChallengeV0Business;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.ISrvSendOtpValidationAPIChallengeV0;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto.DtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto.DtoOutCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.mapper.CreateChallengePostMapper;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse.ServiceResponseBuilder;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseOK;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SN(registryID = "SNGG20220140", logicalID = "send-otp-validation")
@VN(vnn = "v0")
@Path("/v0")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SrvSendOtpValidationAPIChallengeV0 implements ISrvSendOtpValidationAPIChallengeV0 {

  @Autowired private ISendOtpValidationCreateChallengeV0Business sendOtpValidationCreateChallengeV0;

  private static final Log log = LogFactory.getLog(SendOtpValidationCreateChallengeV0Business.class);

  @Override
  @POST
  @Path("/challenge")
  @SMC(registryID = "SMGG20221607", logicalID = "sendOtpValidationCreateChallengeV0", forcedCatalog = "gabiCatalog") // 0.1.0
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public ServiceResponse<DtoOutCreateChallengePost> sendOtpValidationCreateChallengeV0(DtoInCreateChallengePost createChallengePost) {
    log.debug(String.format(" input facade ", createChallengePost));
    CreateChallengePostMapper mapper = Mappers.getMapper(CreateChallengePostMapper.class);
    BDtoInCreateChallengePost request = mapper.dtoInCreateChallengePostToBDtoInCreateChallengePost(createChallengePost);
    log.debug(String.format( " facade request " , request));
    final BDtoOutCreateChallengePost response  = sendOtpValidationCreateChallengeV0.sendOtpValidationCreateChallengeV0(request);
    DtoOutCreateChallengePost outResponse = mapper.bDtoOutCreateChallengePostToDtoOutCreateChallengePost(response);

    ServiceResponseBuilder<DtoOutCreateChallengePost> builder = ServiceResponseOK.data(outResponse);
    return builder.build();
  }
}
