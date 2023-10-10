package com.example.web_ban_link_kien_pc.service;

import com.example.web_ban_link_kien_pc.model.GioHangChiTiet;

import java.util.List;

public interface IGioHangService {
    List<GioHangChiTiet> listGioHangChiTiets();

    GioHangChiTiet findOneGioHangChiTiet(String id);

    Boolean addSanPhamVaoGio(String id);

    Boolean botSanPhamTrongGio(String id);

    Boolean removeSanPhamTrongGio(String id);
}
