Feature: Isıtma Sogutma Listesindeki Urunleri Kontrol

  @abc
  Scenario: Isıtma Sogutma Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici Isitma Sogutma tiklamali
    Then Plp urunler ve kategori adi ayni olmali