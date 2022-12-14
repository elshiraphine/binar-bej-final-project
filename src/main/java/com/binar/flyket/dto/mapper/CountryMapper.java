package com.binar.flyket.dto.mapper;

import com.binar.flyket.dto.model.CountryDTO;
import com.binar.flyket.model.Country;

public class CountryMapper {

    public static CountryDTO toDto(Country country) {
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setCode(country.getCode());
        countryDTO.setName(country.getName());
        return countryDTO;
    }
}
