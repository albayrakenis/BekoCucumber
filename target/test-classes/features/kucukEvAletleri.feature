Feature: Kucuk Ev Aletleri Listesindeki Urunleri Kontrol

  @abc12
  Scenario: Kucuk Ev Aletleri Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici Kucuk Ev Aletleri tiklamali
    Then Plp urunler ve kategori adi ayni olmali