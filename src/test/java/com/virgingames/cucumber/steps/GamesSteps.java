package com.virgingames.cucumber.steps;

import com.virgingames.gameinfo.GameSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.HashMap;

import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasValue;

public class GamesSteps {
    static ValidatableResponse response;
    static Boolean jackpot;

    @Steps
    GameSteps gameSteps;


    @When("^I Get all data from site$")
    public void iGetAllDataFromSite() {
        response = gameSteps.getAllData();
        response.log().all();



    }


    @Then("^I verify data that jackpotloading=false$")
    public void iVerifyDataThatJackpotloadingFalse() {
        Boolean jackpotLoading   = false;
        response.statusCode(200);
        jackpot = response.extract().jsonPath().get("bingoLobbyInfoResource.streams[0].jackpotLoading");
        Assert.assertEquals(jackpot,jackpotLoading);

    }
}


