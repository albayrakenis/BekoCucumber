Feature: Ankastre Listesindeki Urunleri Kontrol


  @abc1
  Scenario: Ankastre Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici Ankastreyi tiklamali
    Then Plp urunler ve kategori adi ayni olmali
