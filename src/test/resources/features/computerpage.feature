@regression
Feature: Computer Page
  As a User, I am able to Navigate Computer page

  @author_NP @sanity @smoke @regression
  Scenario: verifyUserShouldNavigateToComputerPageSuccessfully
    Given I am on homepage
    When I click on Computer tab
    Then Navigate to Computer Page
    And Verify "Computer" text is displayed in computer tab

  @author_NP @smoke @regression
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on homepage
    When I click on Computer tab
    Then Navigate to Computer Page
    And I click on Desktop link
    And Verify "Desktop" text is displayed in desktop tab

  @author_NP @regression
  Scenario Outline: verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    Given I am on homepage
    When I click on Computer tab
    Then Navigate to Computer Page
    And I click on Desktop link
    And Click on product name "Build your own computer"
    And Select processor "<processor>"
    And Select RAM "<ram>"
    And Select HDD "<hdd>"
    And Select OS "<os>"
    And Select Software "<software>"
    And Click on "ADD TO CART" Button
    And Verify "The product has been added to your shopping cart" message is displayed
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |