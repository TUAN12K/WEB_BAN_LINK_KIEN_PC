package com.example.web_ban_link_kien_pc.service;

import com.example.web_ban_link_kien_pc.model.HoaDon;
import org.springframework.data.domain.Page;


import java.util.UUID;

public interface IHoaDonService {

    Boolean saveHoaDon(HoaDon hoaDonForm, String id);
}
