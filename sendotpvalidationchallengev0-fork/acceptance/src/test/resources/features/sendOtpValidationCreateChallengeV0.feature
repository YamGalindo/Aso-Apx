Feature: [SMGG20221607] [SendOtpValidationAPIChallengeV0]: Generates an OTP.

Background: A logged-in valid user
    Given the user "client" with tags "multicanalactivo,sinbloqueos,dni"
    And the user sign in using the channel "NET" with login "$client.documentId" and password "$client.password"

Scenario: Happy path
  When The user executes service createChallenge
  Then I check that service response is success