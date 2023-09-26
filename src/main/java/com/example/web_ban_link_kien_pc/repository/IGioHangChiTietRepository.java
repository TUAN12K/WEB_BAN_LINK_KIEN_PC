package com.example.web_ban_link_kien_pc.repository;

import com.example.web_ban_link_kien_pc.model.GioHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGioHangChiTietRepository extends JpaRepository<GioHangChiTiet, String> {
    void deleteById(String keyword);
}
