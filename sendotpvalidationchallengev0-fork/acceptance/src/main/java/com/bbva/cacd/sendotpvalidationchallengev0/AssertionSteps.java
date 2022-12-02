package com.bbva.cacd.sendotpvalidationchallengev0;

import com.bbva.arch.qe.backend.client.TestingScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import javax.inject.Inject;

public class AssertionSteps {

    @Inject
    private TestingScenario scenario;

    @Then("^I check that service response is success$")
    public void iCheckThatServiceResponseIsSuccess() {
        scenario.assertThat(":status").isGreaterOrEqualThan(200);
        scenario.assertThat(":status").isLessThan(300);
    }

}