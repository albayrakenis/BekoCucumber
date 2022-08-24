Feature: Beko login

  Background:
    Given Kullanici giris sayfasina gitmeli

  @wip
  Scenario: positif login testi
    When Kullanici login olmali
    Then Kullanici su sayfaya gelmeli "Secure Area"

   @wip
  Scenario: negatif login testi
    When Kullanici yanlis kullanici bilgilerini girmeli
    Then Kullanici su sayfaya gelmeli basarisiz giris "Login Page"

