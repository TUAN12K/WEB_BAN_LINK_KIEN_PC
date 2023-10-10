package com.example.web_ban_link_kien_pc.service;

import com.example.web_ban_link_kien_pc.model.ChiTietSanPham;
import com.example.web_ban_link_kien_pc.viewmodel.HoaDonChiTietViewModel;

import java.util.List;
import java.util.Map;

public interface IThongKeService {
    List<HoaDonChiTietViewModel> listHoaDonChiTietViewModel();

    Map<String, Integer> tinhTongSoLuong(List<HoaDonChiTietViewModel> listHoaDonChiTietViewModel);

    List<ChiTietSanPham> laySanPhamTonKho();
}
