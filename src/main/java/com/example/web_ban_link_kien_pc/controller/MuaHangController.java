package com.example.web_ban_link_kien_pc.controller;

import com.example.web_ban_link_kien_pc.model.GioHangChiTiet;
import com.example.web_ban_link_kien_pc.model.HoaDon;
import com.example.web_ban_link_kien_pc.service.IGioHangService;
import com.example.web_ban_link_kien_pc.service.IHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mua-hang")
public class MuaHangController {
    @Autowired
    private IGioHangService iGioHangService;
    @Autowired
    private IHoaDonService iHoaDonService;


    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable(name = "id") String id) {
        GioHangChiTiet gioHangChiTiet = iGioHangService.findOneGioHangChiTiet(id);
        model.addAttribute("tongTien", gioHangChiTiet.getDonGia());
        model.addAttribute("gioHangChiTiet", gioHangChiTiet);
        return "trang-thanh-toan";
    }

    @GetMapping("/thanh-toan/{id}")
    public String thanhToan(Model model, @ModelAttribute("hoaDon") HoaDon hoaDonForm, @PathVariable("id") String idGioHangChiTiet) {
        iHoaDonService.saveHoaDon(hoaDonForm, idGioHangChiTiet);
        model.addAttribute("message", "THANH TOÁN-THÀNH-CÔNG");
        return "redirect:/ban-hang/san-pham";
    }

}
