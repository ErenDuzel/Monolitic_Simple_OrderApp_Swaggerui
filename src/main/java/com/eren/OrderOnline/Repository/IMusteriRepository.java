package com.eren.OrderOnline.Repository;

import com.eren.OrderOnline.Repository.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusteriRepository extends JpaRepository<Musteri,Long> {
}