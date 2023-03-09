package com.eren.OrderOnline.Repository;

import com.eren.OrderOnline.Repository.entity.Restoran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestoranRepository extends JpaRepository<Restoran,Long> {
}
