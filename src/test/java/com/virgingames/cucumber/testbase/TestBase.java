package com.virgingames.cucumber.testbase;

import com.virgingames.utils.PropertyReader;
import io.restassured.RestAssured;
import com.virgingames.constants.Path;
import com.virgingames.utils.PropertyReader;
import com.virgingames.utils.TestUtils;
import org.junit.BeforeClass;

public class TestBase extends TestUtils {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath= Path.GAMES;

    }

}
