package com.example.web_ban_link_kien_pc.repository;


import com.example.web_ban_link_kien_pc.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaiKhoanRepository extends JpaRepository<TaiKhoan, String> {
    TaiKhoan findByTaiKhoan(String taiKhoan);
}
