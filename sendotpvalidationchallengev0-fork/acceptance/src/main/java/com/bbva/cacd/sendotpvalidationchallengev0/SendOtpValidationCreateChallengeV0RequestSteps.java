package com.bbva.cacd.sendotpvalidationchallengev0;

import javax.inject.Inject;

import com.bbva.arch.qe.backend.client.TestingScenario;

import cucumber.api.java.en.When;

public class SendOtpValidationCreateChallengeV0RequestSteps {

    @Inject
    private TestingScenario scenario;

    @When("The user executes service createChallenge")
    public void theUserExecutesServiceCreateChallenge() {
        scenario.http()
            .post("/send-otp-validation/v0/challenge")
                .body()
                    .json()
                    .end()
            .send();
    }

}