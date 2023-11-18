package com.example.web_ban_link_kien_pc.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "hoadon")
public class HoaDon {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
    private String id;
    @ManyToOne
    @JoinColumn(name = "id_tai_khoan")
    private TaiKhoan taiKhoan;
    @Column(name = "ma", unique = true, nullable = false, length = 36)
    private String ma;
    @Column(name = "ngay_tao")
    private Date ngayTao;
    @Column(name = "ngay_thanh_toan")
    private Date ngayThanhToan;
    @Column(name = "ngay_ship")
    private Date ngayShip;
    @Column(name = "ngay_nhan")
    private Date ngayNhan;
    @Column(name = "ten_nguoi_nhan")
    private String tenNguoiNhan;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "so_dien_thoai")
    private String soDienThoai;
    @Column(name = "trang_thai")
    private Integer trangThai;
}
