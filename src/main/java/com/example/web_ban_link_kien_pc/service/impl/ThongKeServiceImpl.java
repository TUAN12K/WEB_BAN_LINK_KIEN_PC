package com.example.web_ban_link_kien_pc.service.impl;

import com.example.web_ban_link_kien_pc.model.ChiTietSanPham;
import com.example.web_ban_link_kien_pc.repository.IChiTietSanPhamRepository;
import com.example.web_ban_link_kien_pc.repository.IHoaDonChiTietRepository;
import com.example.web_ban_link_kien_pc.service.IThongKeService;
import com.example.web_ban_link_kien_pc.viewmodel.HoaDonChiTietViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ThongKeServiceImpl implements IThongKeService {
    @Autowired
    private IHoaDonChiTietRepository iHoaDonChiTietRepository;
    @Autowired
    private IChiTietSanPhamRepository iChiTietSanPhamRepository;

    @Override
    public List<HoaDonChiTietViewModel> listHoaDonChiTietViewModel() {
        return null;
    }

    @Override
    public Map<String, Integer> tinhTongSoLuong(List<HoaDonChiTietViewModel> listHoaDonChiTietViewModel) {
        Map<String, Integer> tongSoLuongMap = new HashMap<>();
        for (HoaDonChiTietViewModel hoaDonChiTietViewModel : listHoaDonChiTietViewModel) {
            String id = hoaDonChiTietViewModel.getChiTietSanPham().getId();
            int soLuong = hoaDonChiTietViewModel.getSoLuong();

            if (tongSoLuongMap.containsKey(id)) {
                int tongSoLuongHienTai = tongSoLuongMap.get(id);
                tongSoLuongMap.put(id, tongSoLuongHienTai + soLuong);
            } else {
                tongSoLuongMap.put(id, soLuong);
            }
        }

        return tongSoLuongMap;
    }

    @Override
    public List<ChiTietSanPham> laySanPhamTonKho() {
        return iChiTietSanPhamRepository.getSanPhamTonKho();
    }
}
