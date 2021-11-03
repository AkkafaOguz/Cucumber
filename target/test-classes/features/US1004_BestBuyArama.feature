Feature: US1004 Bestbuy sayfasinda kelime arama

  Scenario: TC08 kullanici besybuyda istedigi kelimeyi aratip test eder

    Given kullanici "ebayUrl" sayfasina gider
    Then "nutella" icin arama yapar
    And sonucun "nutella" icerdigini test eder
    Then sayfayi kapatir


    # Burada tum step definition'lar tanimli gibi gorulse de testimiz calismaz
    # Cunku arama yapar ve sonucu test eder stepdefinition'lari yalnizca amazon sayfasina gore locate edildi
    # Burada yeniden locate etmemiz gerekirken ayni cumleyi yazdigimiz icin bizden yeni bir stepdefinition istemedi
    # Bu yuzden Gherkin ile yazdigimiz cumlelerin tam tanimliyici olmasi onemlidir.