package com.example.web_ban_link_kien_pc.repository;

import com.example.web_ban_link_kien_pc.model.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGioHangRepository extends JpaRepository<GioHang, String> {
    GioHang findByMa(String ma);
}
