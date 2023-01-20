package com.virgingames.gameinfo;

import com.virgingames.constants.EndPoints;
import cucumber.api.java.gl.E;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;

public class GameSteps {
    @Step
    public ValidatableResponse getAllData(){
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.GET_ALL_RECORD)
                .then()
                .statusCode(200);

    }
}
