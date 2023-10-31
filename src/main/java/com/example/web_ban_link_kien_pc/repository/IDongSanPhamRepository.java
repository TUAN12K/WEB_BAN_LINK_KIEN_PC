package com.example.web_ban_link_kien_pc.repository;

import com.example.web_ban_link_kien_pc.model.DongSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDongSanPhamRepository extends JpaRepository<DongSanPham, String> {
}
