package com.gitbub.jonathankbp.repository;

import com.gitbub.jonathankbp.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
