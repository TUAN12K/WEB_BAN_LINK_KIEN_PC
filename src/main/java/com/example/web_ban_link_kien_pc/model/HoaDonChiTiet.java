package com.example.web_ban_link_kien_pc.model;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "hoadonchitiet")
public class HoaDonChiTiet {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
    private String id;
//    @ManyToOne
//    @JoinColumn(name = "id_chi_tiet_san_pham")
//    private ChiTietSanPham chiTietSanPham;
    @ManyToOne
    @JoinColumn(name = "id_hoa_don")
    private HoaDon hoaDon;
    @Column(name = "ngay_tao")
    private Date ngayTao;
    @Column(name = "so_luong")
    private Integer soLuong;
    @Column(name = "don_gia")
    private BigDecimal donGia;

=======
public class HoaDonChiTiet {
>>>>>>> 5d16ccaf1809d816321bc6053cc7a3115cc4235d
}
