package com.bbva.cacd.sendotpvalidationchallengev0;

import org.junit.runner.RunWith;

import com.bbva.arch.api.co.GlobalServiceSteps;
import com.bbva.arch.qe.backend.cucumber.module.BackendTesting;
import com.bbva.arch.qe.backend.runner.cucumber.ManagedCucumber;
import com.bbva.arch.qe.backend.runner.cucumber.modules.Module;

@RunWith(ManagedCucumber.class)
@Module(BackendTesting.class)
@Module(GlobalServiceSteps.class)
public class IntegrationTests { }
