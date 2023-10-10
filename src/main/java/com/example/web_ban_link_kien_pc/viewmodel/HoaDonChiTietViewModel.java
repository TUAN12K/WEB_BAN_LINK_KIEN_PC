package com.example.web_ban_link_kien_pc.viewmodel;

import com.example.web_ban_link_kien_pc.model.ChiTietSanPham;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class HoaDonChiTietViewModel {
    private Integer soLuong;
    private ChiTietSanPham chiTietSanPham;
}
