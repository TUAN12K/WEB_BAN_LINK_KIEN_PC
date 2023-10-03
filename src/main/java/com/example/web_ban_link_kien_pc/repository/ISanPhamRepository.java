package com.example.web_ban_link_kien_pc.repository;

import com.example.web_ban_link_kien_pc.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISanPhamRepository extends JpaRepository<SanPham, String> {
}
