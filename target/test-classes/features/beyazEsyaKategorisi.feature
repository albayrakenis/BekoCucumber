Feature: Beyaz Esya Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Beyaz Esya Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici "buzdolabi" tiklamali
    Then Plp urunler ve kategori adi ayni olmali



#Feature: Bulasik makinesi Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Bulasik makinesi Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici bulasikMakinesi tiklamali
    Then Plp urunler ve kategori adi ayni olmali

#Feature: Camasir makinesi Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Camasir makinesi Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici camasir makinesi tiklamali
    Then Plp urunler ve kategori adi ayni olmali

#Feature: Derin Dondurucu Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Derin dondurucu makinesi Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici derinDondurucu tiklamali
    Then Plp urunler ve kategori adi ayni olmali

#Feature: Firin Esya Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Firin Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici firin tiklamali
    Then Plp urunler ve kategori adi ayni olmali

#Feature: Kurutmali Camasir makinesi Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Kurutmali Camasir makinesi Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici kurutmali camasir makinesi tiklamali
    Then Plp urunler ve kategori adi ayni olmali

#Feature: Kurutma makinesi Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Kurutma makinesi Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici kurutma makinesi tiklamali
    Then Plp urunler ve kategori adi ayni olmali

#Feature: Mikrodalga Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Mikrodalga Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici mikrodalga tiklamali
    Then Plp urunler ve kategori adi ayni olmali

#Feature: Set ustu Listesindeki Urunleri Kontrol

  @abc2
  Scenario: Set ustu Kategorisi Ürünleri Kontrol Etme
    Given Kullanici giris sayfasina gitmeli
    When Kullanici urunlere tiklamali
    And Kullanici set ustu tiklamali
    Then Plp urunler ve kategori adi ayni olmali


