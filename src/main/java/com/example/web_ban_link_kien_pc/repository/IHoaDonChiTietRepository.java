package com.example.web_ban_link_kien_pc.repository;


import com.example.web_ban_link_kien_pc.model.HoaDonChiTiet;
import com.example.web_ban_link_kien_pc.viewmodel.HoaDonChiTietViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface IHoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, String> {

    @Query("SELECT new com.example.web_ban_link_kien_pc.viewmodel.HoaDonChiTietViewModel(hd.soLuong, hd.chiTietSanPham) FROM HoaDonChiTiet hd")
    List<HoaDonChiTietViewModel> getSoLuongAndChiTietSanPhamByDateRange();
    @Query("SELECT new com.example.web_ban_link_kien_pc.viewmodel.HoaDonChiTietViewModel(hd.soLuong, hd.chiTietSanPham) FROM HoaDonChiTiet hd WHERE hd.ngayTao BETWEEN :startDate AND :endDate")
    List<HoaDonChiTietViewModel> getSoLuongAndChiTietSanPhamByDateRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
