package org.softuni.mobilele.model.dto;


import java.math.BigDecimal;
import java.util.Map;

//{
//        "disclaimer": "Usage subject to terms: https://openexchangerates.org/terms",
//        "license": "https://openexchangerates.org/license",
//        "timestamp": 1698948000,
//        "base": "USD",
//        "rates": {
//        "BGN": 1.840483,
//        "BTC": 0.0000287669,
//        "EUR": 0.940901,
//        "XRP": 1.65453342
//        }
//        }
public record ExchangeRatesDTO(String base, Map<String, BigDecimal> rates) {

}
