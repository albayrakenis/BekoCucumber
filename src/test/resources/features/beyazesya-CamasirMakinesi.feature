Feature: Beyaz Esya Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Beyaz Esya Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici camasir makinesi tiklamali
    Then Plp urunler ve kategori adi ayni olmali