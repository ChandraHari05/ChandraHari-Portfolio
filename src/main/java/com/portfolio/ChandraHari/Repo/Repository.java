package com.portfolio.ChandraHari.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.ChandraHari.Entity.MyEntity;

public interface Repository extends JpaRepository<MyEntity, Long> {

}
