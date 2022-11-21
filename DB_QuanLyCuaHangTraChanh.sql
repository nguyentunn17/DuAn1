﻿CREATE DATABASE QuanLyCuaHangTraChanh
USE QuanLyCuaHangTraChanh
GO
--NGUYEN LIEU
CREATE TABLE NGUYENLIEU (
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MaNL VARCHAR(30) UNIQUE, 
	TenNL NVARCHAR(50) DEFAULT NULL, 
	LoaiNL NVARCHAR(50) DEFAULT NULL,
	SoLuong INT DEFAULT 0
)
GO
--KICHTHUOC
CREATE TABLE KICHTHUOC(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MaKT VARCHAR(30) UNIQUE,
	TenKT NVARCHAR(50) DEFAULT NULL
)
GO
--SANPHAM
CREATE TABLE SANPHAM (
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MaSP VARCHAR(30) UNIQUE, 
	TenSP VARCHAR(50) DEFAULT NULL
)
GO
--THELOAI
CREATE TABLE THELOAI(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MaTL VARCHAR(30) UNIQUE,
	TenTL NVARCHAR(50) DEFAULT NULL
)
GO
--LUONG
CREATE TABLE LUONG(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MaLuong VARCHAR(50) UNIQUE,
	MucLuong DECIMAL(20,0) DEFAULT 0,
	NgayQuyDinh DATE DEFAULT NULL,
	Phucap varchar(50),
	Thuong varchar(50)
)
GO
--KHO
CREATE TABLE KHO(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	IdNL UNIQUEIDENTIFIER,
	MaKho VARCHAR(50) DEFAULT NULL,
	SoLuongTon INT 
)
GO
--NHA CUNG CAP
CREATE TABLE NHACUNGCAP(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MaNCC VARCHAR(50) UNIQUE,
	TenNCC NVARCHAR(MAX) DEFAULT NULL,
	DiaChi NVARCHAR(MAX) DEFAULT NULL,
	SDT VARCHAR(50) DEFAULT NULL,
	Email VARCHAR(50) DEFAULT NULL
)
GO
--BAN
CREATE TABLE BAN(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	IdKV UNIQUEIDENTIFIER,
	MaBan VARCHAR(30) DEFAULT NULL
)
--KHUVUC
CREATE TABLE KHUVUC(
	Id  UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Ma VARCHAR(20) UNIQUE,
	Ten NVARCHAR(50) DEFAULT NULL
)
GO
--KHUYENMAI
CREATE TABLE KHUYENMAI(
	Id  UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Ma VARCHAR(20) UNIQUE,
	Ten NVARCHAR(50) DEFAULT NULL,
	HinhThuc NVARCHAR(50) DEFAULT NULL,
	GiaTri DECIMAL(20,0) DEFAULT 0,
	NgayBatDau DATETIME DEFAULT NULL,
	NgayKetThuc DATETIME DEFAULT NULL,
	TrangThai INT DEFAULT 0,
	DonGiaKhiGiam DECIMAL(20,0) DEFAULT 0
)
GO
--CA
CREATE TABLE CA(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MaCa VARCHAR(30) UNIQUE,
	TenCa NVARCHAR(50) DEFAULT NULL,
	NgayThang DATETIME DEFAULT NULL,
	ThoiGianCa INT
)
GO
--HOA DON
CREATE TABLE HOADON(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	IdNV UNIQUEIDENTIFIER,
	IdKH UNIQUEIDENTIFIER,
	IdBAN UNIQUEIDENTIFIER,
	MaHD VARCHAR(50) UNIQUE,
	NgayTao DATETIME DEFAULT NULL,
	NgayThanhToan DATETIME DEFAULT NULL,
	Ngayship DATETIME DEFAULT NULL,
	NgayNhan DATETIME DEFAULT NULL,
	TrangThai INT DEFAULT 0,
	TenNguoiNhan VARCHAR(MAX) DEFAULT NULL,
	DiaChi VARCHAR(MAX) DEFAULT NULL,
	SDT VARCHAR(30) DEFAULT NULL
)
GO
--NHAN VIEN
CREATE TABLE NHANVIEN(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Ma VARCHAR(20) UNIQUE,
	Ten NVARCHAR(30) DEFAULT NULL,
	GioiTinh NVARCHAR(10) DEFAULT NULL,
	NgaySinh DATE DEFAULT NULL,
	DiaChi NVARCHAR(100) DEFAULT NULL,
	Sdt VARCHAR(30) DEFAULT NULL,
	MatKhau VARCHAR(MAX) DEFAULT NULL,
	TrangThai INT DEFAULT 0,
	Anh Image DEFAULT NULL,
	IdLuong UNIQUEIDENTIFIER,
)
GO
--KHACH HANG
CREATE TABLE KHACHHANG(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	IdLKH UNIQUEIDENTIFIER,
	Ma VARCHAR(20) UNIQUE,
	Ten NVARCHAR(30) DEFAULT NULL,
	NgaySinh DATE DEFAULT NULL,
	Sdt VARCHAR(30) DEFAULT NULL,
	DiaChi NVARCHAR(100) DEFAULT NULL
)
GO
--LOAI KHACH HANG
CREATE TABLE LOAIKHACHHANG(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Ma VARCHAR(20) UNIQUE,
	Ten NVARCHAR(30) DEFAULT NULL,
	TenDem NVARCHAR(30) DEFAULT NULL,
	Ho NVARCHAR(30) DEFAULT NULL,
	GiamGia VARCHAR(30) DEFAULT NULL
)
GO
--PHIEU NHAP
CREATE TABLE PHIEUNHAP(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Ma VARCHAR(20) UNIQUE,
	Ten NVARCHAR(30) DEFAULT NULL,
	NgayNhap DATETIME DEFAULT NULL,
	DonViTinh NVARCHAR(20) DEFAULT NULL,
	SoLuong INT DEFAULT NULL,
	DonGia DECIMAL(20,0) DEFAULT 0,
	ThanhTien DECIMAL(20,0) DEFAULT 0,
	PhanTramChietKhau DECIMAL(20,0) DEFAULT 0,
	GhiChu NVARCHAR(MAX) DEFAULT NULL,
	IdNV UNIQUEIDENTIFIER,
	IDNCC UNIQUEIDENTIFIER,
	IdNL UNIQUEIDENTIFIER
)
GO
--PHIEU XUAT
CREATE TABLE PHIEUXUAT(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Ma VARCHAR(20) UNIQUE,
	NgayXuat DATETIME DEFAULT NULL,
	DonViTinh NVARCHAR(20) DEFAULT NULL,
	SoLuong INT DEFAULT NULL,
	DonGia DECIMAL(20,0) DEFAULT 0,
	ThanhTien DECIMAL(20,0) DEFAULT 0,
	GhiChu NVARCHAR(MAX) DEFAULT NULL,
	IdNV UNIQUEIDENTIFIER,
	IdNL UNIQUEIDENTIFIER
)
GO
--SAN PHAM CHI TIET
CREATE TABLE SANPHAMCHITIET(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	IdKT UNIQUEIDENTIFIER ,
	IdSP UNIQUEIDENTIFIER,
	IdTL UNIQUEIDENTIFIER,
	IdKM UNIQUEIDENTIFIER,
	DonGiaBan DECIMAL(20,0) DEFAULT 0 ,
	DonGiaNhap DECIMAL(20,0) DEFAULT 0,
	DonViTinh NVARCHAR(20),
	MoTa NVARCHAR(50) DEFAULT NULL,
	Anh Image DEFAULT NULL,
	TrangThai INT DEFAULT 0,
)
GO
--HOA DON CHI TIET
CREATE TABLE HOADONCHITIET(
	IdHD UNIQUEIDENTIFIER,
	IdCTSP UNIQUEIDENTIFIER,
	SoLuong DECIMAL(20,0) DEFAULT 0, 
	DonGia DECIMAL(20,0) DEFAULT 0,
	ThanhTien DECIMAL(20,0) DEFAULT 0,
	CONSTRAINT PK_HoaDonChiTiet PRIMARY KEY(IdHD,IdCTSP),
	CONSTRAINT FK1 FOREIGN KEY (IdHD) REFERENCES HOADON(Id),
	CONSTRAINT FK2 FOREIGN KEY (IdCTSP) REFERENCES SANPHAMCHITIET(Id),
)
GO
-- CA CHI TIET
CREATE TABLE CACHITIET(
	IdCA UNIQUEIDENTIFIER ,
	IdNV UNIQUEIDENTIFIER,
	GioVao INT DEFAULT 0,
	GioRa INT DEFAULT 0,
	SoCa INT DEFAULT 0,
	SoTienCa DECIMAL(20,0) DEFAULT 0,
	TongTien DECIMAL(20,0) DEFAULT 0,
	CONSTRAINT PK_CaChiTiet PRIMARY KEY(IdCA,IdNV),
	CONSTRAINT FK1_CaChiTiet FOREIGN KEY (IdCA) REFERENCES CA(Id),
	CONSTRAINT FK2_CaChiTiet FOREIGN KEY (IdNV) REFERENCES NHANVIEN(Id)
)
GO
--TẠO MỐI QUAN HỆ GIỮA CÁC BẢNG
--SAN PHAM CHI TIET - KICH THUOC
ALTER TABLE SANPHAMCHITIET ADD FOREIGN KEY(IdKT) REFERENCES KICHTHUOC(Id)
--SAN PHAM CHI TIET - SAN PHAM
ALTER TABLE SANPHAMCHITIET ADD FOREIGN KEY(IdSP) REFERENCES SANPHAM(Id)
--SAN PHAM CHI TIET - THE LOAI
ALTER TABLE SANPHAMCHITIET ADD FOREIGN KEY(IdTL) REFERENCES THELOAI(Id)
--SAN PHAM CHI TIET - KHUYEN MAI
ALTER TABLE SANPHAMCHITIET ADD FOREIGN KEY(IdKM) REFERENCES KHUYENMAI(Id)
--KHACH HANG - LOAI KHACH HANG
ALTER TABLE KHACHHANG ADD FOREIGN KEY(IdLKH) REFERENCES LOAIKHACHHANG(Id)
--BAN - KHU VUC
ALTER TABLE BAN ADD FOREIGN KEY(IdKV) REFERENCES KHUVUC(Id)
--HOA DON - KHACH HANG
ALTER TABLE HOADON ADD FOREIGN KEY(IdKH) REFERENCES KHACHHANG(Id)
--HOA DON - KHACH HANG
ALTER TABLE HOADON ADD FOREIGN KEY(IdNV) REFERENCES NHANVIEN(Id)
--HOA DON - KHACH HANG
ALTER TABLE HOADON ADD FOREIGN KEY(IdBAN) REFERENCES BAN(Id)
--KHO - NGUYEN LIEU
ALTER TABLE KHO ADD FOREIGN KEY(IdNL) REFERENCES NGUYENLIEU(Id)
--LUONG - NHAN VIEN
ALTER TABLE LUONG ADD FOREIGN KEY(IdNV) REFERENCES NHANVIEN(Id)
--PHIEU NHAP - NGUYEN LIEU
ALTER TABLE PHIEUNHAP ADD FOREIGN KEY(IdNL) REFERENCES NGUYENLIEU(Id)
--PHIEU NHAP - NHA CUNG CAP
ALTER TABLE PHIEUNHAP ADD FOREIGN KEY(IdNCC) REFERENCES NHACUNGCAP(Id)
--PHIEU NHAP - NHAN VIEN
ALTER TABLE PHIEUNHAP ADD FOREIGN KEY(IdNV) REFERENCES NHANVIEN(Id)
--PHIEU XUAT - NHAN VIEN
ALTER TABLE PHIEUXUAT ADD FOREIGN KEY(IdNV) REFERENCES NHANVIEN(Id)
--PHIEU XUAT - NGUYEN LIEU
ALTER TABLE PHIEUXUAT ADD FOREIGN KEY(IdNL) REFERENCES NGUYENLIEU(Id)
--LUONG - NHANVIEN
ALTER TABLE NHANVIEN ADD FOREIGN KEY(IdLuong) REFERENCES LUONG(Id)




