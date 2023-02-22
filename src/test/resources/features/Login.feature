
  Feature: Kullanıcı basarili bir sekilde login olabilmeli

    @login
    Scenario: Kayitli kullanici sisteme basarili bir sekilde login olabilmeli
      Given kullanici pastelbulut url adresine gider
      When kullanici giris yapin butonuna tiklar
      Then kullanici gecerli eposta adresi girer
      And kullanici gecerli parola girer ve giris butonuna tiklar
      Then kullanici basarili bir sekilde sisteme girdigini dogrular
