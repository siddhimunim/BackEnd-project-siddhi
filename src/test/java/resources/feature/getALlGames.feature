Feature: Get Data of all games of virgingames

  I get all datas from virgingames site

  Scenario: Get all data from games site
    When I Get all data from site
    Then I verify data that jackpotloading=false

