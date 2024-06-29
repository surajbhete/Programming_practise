package com.suraj1.example1.Repository;

import com.suraj1.example1.Entity.Pen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PenRepository extends JpaRepository<Pen,Integer> {


}
