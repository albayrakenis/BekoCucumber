Feature: Urun satin alma

  @wip
  Scenario: Kredi karti ile urun satin alma
    Given Kullanici giris sayfasina gitmeli
    Given Kullanici login olmali
    When Kullanici urun secmeli
    And Kullanici sepete eklemeli
    And Kullanici odeme adimina gitmeli
    Then Kullanici kart bilgilerini girmeli