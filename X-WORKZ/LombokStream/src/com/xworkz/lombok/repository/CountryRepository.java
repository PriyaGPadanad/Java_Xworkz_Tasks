package com.xworkz.lombok.repository;

import com.xworkz.lombok.dto.CountryDTO;

import java.util.Collection;

public interface CountryRepository {
    Collection<CountryDTO> countryFetch();
}
