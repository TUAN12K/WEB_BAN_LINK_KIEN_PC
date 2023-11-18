package com.example.web_ban_link_kien_pc.service.impl;

import com.example.web_ban_link_kien_pc.model.ChiTietSanPham;
import com.example.web_ban_link_kien_pc.model.GioHangChiTiet;
import com.example.web_ban_link_kien_pc.model.HoaDon;
import com.example.web_ban_link_kien_pc.model.HoaDonChiTiet;
import com.example.web_ban_link_kien_pc.model.TaiKhoan;
import com.example.web_ban_link_kien_pc.repository.IChiTietSanPhamRepository;
import com.example.web_ban_link_kien_pc.repository.IHoaDonChiTietRepository;
import com.example.web_ban_link_kien_pc.repository.IHoaDonRepository;
import com.example.web_ban_link_kien_pc.repository.ITaiKhoanRepository;
import com.example.web_ban_link_kien_pc.service.IGioHangService;
import com.example.web_ban_link_kien_pc.service.IHoaDonService;
import com.example.web_ban_link_kien_pc.util.GenMa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HoaDonServiceImpl implements IHoaDonService {

    @Autowired
    private IGioHangService iGioHangService;
    @Autowired
    private ITaiKhoanRepository iTaiKhoanRepository;
    @Autowired
    private IChiTietSanPhamRepository iChiTietSanPhamRepository;
    @Autowired
    private IHoaDonRepository iHoaDonRepository;
    @Autowired
    private IHoaDonChiTietRepository iHoaDonChiTietRepository;

    @Override
    public Boolean saveHoaDon(HoaDon hoaDonForm, String idGioHangChiTiet) {
        GioHangChiTiet gioHangChiTiet = iGioHangService.findOneGioHangChiTiet(idGioHangChiTiet);
        TaiKhoan taiKhoan = iTaiKhoanRepository.findById(gioHangChiTiet.getGioHang().getTaiKhoan().getId()).get();
        ChiTietSanPham chiTietSanPham = iChiTietSanPhamRepository.findById(gioHangChiTiet.getChiTietSanPham().getId()).get();
        Date date = new Date();
        HoaDon hoaDon = new HoaDon(null, taiKhoan, GenMa.generateRandomLineOfCode(), date, date, date, date, hoaDonForm.getTenNguoiNhan(), hoaDonForm.getDiaChi(), hoaDonForm.getSoDienThoai(), 1);
        HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet(null, chiTietSanPham, hoaDon, date, gioHangChiTiet.getSoLuong(), gioHangChiTiet.getDonGia());
        Integer soLuongBanDau = chiTietSanPham.getSoLuong();
        chiTietSanPham.setSoLuong(soLuongBanDau - gioHangChiTiet.getSoLuong());
        iChiTietSanPhamRepository.save(chiTietSanPham);
        iHoaDonRepository.save(hoaDon);
        iHoaDonChiTietRepository.save(hoaDonChiTiet);
        iGioHangService.removeSanPhamTrongGio(gioHangChiTiet.getId());
        return true;
    }
}
