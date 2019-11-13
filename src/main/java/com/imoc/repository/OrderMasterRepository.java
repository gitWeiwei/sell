package com.imoc.repository;

import com.imoc.entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
     Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
