package com.eren.OrderOnline.Repository;

import com.eren.OrderOnline.Repository.entity.Siparis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISiparisRepository extends JpaRepository<Siparis,Long> {
}
