Feature: Beyaz Esya Listesindeki Urunleri Kontrol

  @wip
  Scenario: Beyaz Esya Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici "buzdolabi" tiklamali
    Then Plp urunler ve kategori adi ayni olmali


