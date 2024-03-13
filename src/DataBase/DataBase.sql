CREATE DATABASE QUAN_LY_SIEU_THI_G5

GO

USE QUAN_LY_SIEU_THI_G5

GO

CREATE TABLE NHANVIEN(
	MANV VARCHAR(20) PRIMARY KEY NOT NULL,
	MATKHAU VARCHAR(50) NOT NULL,
	HOTEN NVARCHAR(50) NOT NULL,
	GIOITINH BIT DEFAULT 0,
	NGAYSINH DATE NOT NULL,
	VAITRO BIT DEFAULT 0
)

CREATE TABLE KHACHHANG(
	MAKH VARCHAR(20) PRIMARY KEY NOT NULL,
	MATKHAU VARCHAR(50) NOT NULL,
	TENKH NVARCHAR(50) NOT NULL,
	GIOITINH BIT DEFAULT 0,
	NGAYSINH DATE NOT NULL,
	NGAYDANGKI DATE NOT NULL
)

CREATE TABLE CHUNGLOAI(
	MACL VARCHAR(10) PRIMARY KEY NOT NULL,
	TENCL NVARCHAR(50) NOT NULL,
	MIEUTA NVARCHAR(100) NOT NULL,
)

CREATE TABLE SANPHAM(
	MASP VARCHAR(10) PRIMARY KEY NOT NULL,
	TENSP NVARCHAR(50) NOT NULL,
	SOLUONG INT NOT NULL,
	GIATHANH FLOAT NOT NULL,
	MACL VARCHAR(10) NOT NULL,
	FOREIGN KEY (MACL) REFERENCES CHUNGLOAI(MACL) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE HOADON(
    SODEMHD INT IDENTITY NOT NULL,
    MAHD AS 'HD' + RIGHT('000' + CAST(SODEMHD AS VARCHAR(3)),3) PERSISTED PRIMARY KEY,
	/*MAHD VARCHAR(10) PRIMARY KEY NOT NULL,*/
	NGAYLAPHD DATE NOT NULL,
	MANV VARCHAR(20) NOT NULL,
	FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV) ON UPDATE CASCADE ON DELETE CASCADE
)
CREATE TABLE CHITIETHOADON(
	SOLUONG INT NOT NULL,
	THANHTIEN FLOAT NOT NULL,
	MASP VARCHAR(10),
	MAHD VARCHAR(5) NOT NULL
	FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP) ON UPDATE CASCADE ON DELETE SET NULL,
	FOREIGN KEY (MAHD) REFERENCES HOADON(MAHD) ON DELETE CASCADE
)

CREATE TABLE DONHANG(
    SODEMDH INT IDENTITY NOT NULL,
    MADH AS 'DH' + RIGHT('000' + CAST(SODEMDH AS VARCHAR(3)),3) PERSISTED PRIMARY KEY,
	/*MADH VARCHAR(10) PRIMARY KEY NOT NULL,*/
	NGAYDATHANG DATE NOT NULL,
	MAKH VARCHAR(20) NOT NULL
	FOREIGN KEY (MAKH) REFERENCES KHACHHANG(MAKH) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE CHITIETDONHANG(
	SOLUONG INT NOT NULL,
	THANHTIEN FLOAT NOT NULL,
	MASP VARCHAR(10),
	MADH VARCHAR(5) NOT NULL
	FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP) ON UPDATE CASCADE ON DELETE SET NULL,
	FOREIGN KEY (MADH) REFERENCES DONHANG(MADH) ON DELETE CASCADE
)

INSERT INTO NHANVIEN VALUES
('Thrillseeker','$r^tbs5$', N'Trần Văn Nhân', 1, '2003-12-16', 0)
,('Muscleman','9lj^by)0', N'Nguyễn Lê Hoàng Thắng', 1, '2003-10-01', 0)
,('Ruggedman','lu&s912*', N'Trịnh Duy Bảo', 1, '2003-02-06', 0)
,('LoneWolf','1grj1dh1', N'Nguyễn Văn Kim Hoàng', 1, '2003-02-19', 0)
,('Topslugger', '8#1giwpz', N'Nguyễn Lê Ngọc Diễm', 0, '2005-03-31', 0)
,('hoang0207', '02072003', N'Lê Trung Tấn Phát', 1, '2000-08-28', 1)
,('Gunsmoke', 'q7t30ij0',N'Trần Hoàng Nga', 0, '2003-04-16', 0)
,('Hulksmash', 'pm6*&yiq', N'Lê Trung Định', 1, '2004-12-31', 0)
,('Ruggedheart','smblvn@%',N'Tống Gia Hân', 0, '2001-03-20', 0)
,('Mindbender','gp+7qjtq',N'Lê Hoàng Trung', 1, '2004-05-28', 0)
,('seller','seller', N'Trịnh Phú Khương', 1, '2003-01-22', 0)
,('Mysticlover', 'x6$nac83', N'Lê Nguyễn Na Tô', 0, '2006-08-11', 0)
,('Outlawking','shh70w1z', N'Trần Trung Tuấn', 1, '1999-03-28', 0)
,('Princecharming','bzo%b$*)',N'Lê Thị Thu Trinh', 0, '2002-04-29', 0)

INSERT INTO KHACHHANG VALUES
('KH001', '001', N'Trần Gia Bảo', 1, '2003-12-24', '2023-10-3')
,('KH002', 'dy5wdhv', N'Nguyễn Văn Trung', 1, '2003-09-28', '2022-05-12')
,('KH003', 'hq*z7y^', N'Lê Thị Hồng Cẩm', 0, '2002-03-15', '2022-03-17')
,('KH004', 'y00fw(2', N'Trần Thu Hương', 0, '2004-01-15', '2022-08-21')
,('KH005', 'vo6*j#g', N'Trịnh Duy Nhất', 1, '2001-05-13', '2022-03-30')
,('KH006', 'o6)kl0%', N'Nguyễn Văn Gia Khánh', 1, '2003-08-25', '2022-09-02')
,('KH007', 'et65l8$', N'Tống Gia Thịnh', 1, '2003-12-26', '2022-11-13')
,('KH008', '#jduu4e', N'Lê Hoàng Đạt', 1, '2005-12-15', '2021-07-04')
,('KH009', 'd$4hg*!', N'Lê Trung Định', 1, '2002-11-05', '2022-12-20')
,('KH010', 'kf(b+)q', N'Nguyễn Ánh Như', 0, '2003-07-03', '2021-02-26')
,('KH011', 'll8t1&g', N'Trần Lê Thiên Bảo', 1, '2001-04-04', '2022-07-22')
--,('KH012', '3q94m0y', N'Lý Nguyễn Gia Thiên', 0, '2000-05-29', '2022-04-31')
--,('KH013', '*07^ggy', N'Lê Minh Tiến', 1, '1998-11-23', '2022-12-15')
--,('KH014', 'n&(ts4*', N'Hoàng Văn Nhân', 1, '1999-10-16', '2022-06-12')

INSERT INTO CHUNGLOAI VALUES
('CL001', N'Sữa', N'Các sản phẩm làm từ sữa tươi và sữa bột')
,('CL002', N'Gạo', N'Sản phẩm chứa nhiều tinh bột được sản xuất tại ĐBSCL')
,('CL003', N'Rau', N'Các sản phẩm nông nghiệp chứa nhiều Vitamin')
,('CL004', N'Trứng', N'Các sản phẩm từ các loại gia cầm')
,('CL005', N'Trái Cây', N'Các sản phẩm nông nghiệp chứa nhiều Vitamin')
,('CL006', N'Bột Mì', N'Các sản phẩm nông nghiệp chứa bột mì')
,('CL007', N'Quần Áo', N'Các sản phẩm công nghiệp dệt vải chuyên thời trang')
,('CL008', N'Đồ chơi trẻ em', N'Các sản phẩm đồ chơi dành cho trẻ em')
,('CL009', N'Điện gia dụng', N'Các sản phẩm đồ công nghiệp liên quan đến điện')
,('CL010', N'Xà phòng', N'Các sản phẩm công nghiệp xà bông')

INSERT INTO SANPHAM VALUES
('SP0001', N'Milo', 80, 13.800, 'CL001')
,('SP0002', N'Vinamilk', 180, 11.999, 'CL001')
,('SP0003', N'THtruemilk', 50, 12.999, 'CL001')
,('SP0004', N'Gạo Dẻo', 100, 15.000, 'CL002')
,('SP0005', N'Gạo Dẻo Vừa', 50, 13.000, 'CL002')
,('SP0006', N'Gạo Xốp', 200, 15.000, 'CL002')
,('SP0007', N'Xà Lách', 50, 2.000, 'CL003')
,('SP0008', N'Tần Ô', 10, 3.000, 'CL003')
,('SP0009', N'Diếp Cá', 20, 4.500, 'CL003')
,('SP0010', N'Trứng Gà', 300, 5.000, 'CL004')
,('SP0011', N'Trứng Vịt', 500, 3.500, 'CL004')
,('SP0012', N'Trứng Cút', 1000, 2.300, 'CL004')
,('SP0013', N'Táo Mỹ', 50, 50.000, 'CL005')
,('SP0014', N'Xoài', 38, 22.000, 'CL005')
,('SP0015', N'Lê', 100, 30.000, 'CL005')
,('SP0016', N'Quần nữ HoYang', 100, 299.000, 'CL007')
,('SP0017', N'Đồ chơi trí tuệ Blow ball', 20, 99.000, 'CL008')
,('SP0018', N'Búp bê Helbacsi', 15, 38.600, 'CL008')
,('SP0019', N'Đồ chơi bán hàng MyKing', 15, 90.800, 'CL008')
,('SP0020', N'Áo phông Nam tay lở Kakie', 100, 89.000, 'CL007')
,('SP0021', N'Quần Jean Nam Clesion', 30, 259.999, 'CL007')
,('SP0022', N'Áo Croptop Nữ LC', 40, 75.000, 'CL007')
,('SP0023', N'Nồi cơm điện Sunhouse', 10, 455.900, 'CL009')
,('SP0024', N'Tủ lạnh Samsung', 5, 15570.000, 'CL009')
,('SP0025', N'Quạt gió SenKo', 10, 250.400, 'CL009')
,('SP0026', N'Xà bông Lifebuoy', 20, 45.500, 'Cl010')
,('SP0027', N'Xà bông Thiên Mộc', 20, 50.999, 'CL010')
,('SP0028', N'Xà bông Safe guard', 15, 30.500, 'Cl010')
,('SP0029', N'Máy lạnh Toshiba', 5, 10500.000, 'CL009')
,('SP0030', N'Quần ống loe tosshi', 5, 10500.000, 'CL007')

INSERT INTO HOADON (NGAYLAPHD, MANV) VALUES
('2018-02-10', 'Ruggedheart')
,('2018-01-30', 'Gunsmoke')
,('2018-03-22', 'Topslugger')
,('2018-02-22', 'Ruggedheart')
,('2019-10-28', 'LoneWolf')
,('2019-11-13', 'LoneWolf')
,('2019-12-04', 'Gunsmoke')
,('2019-05-02', 'Gunsmoke')
,('2020-04-16', 'Ruggedheart')
,('2020-12-28', 'Thrillseeker')
,('2020-07-28', 'Muscleman')
,('2020-02-17', 'Ruggedman')
,('2021-04-04', 'Muscleman')
,('2021-02-11', 'Ruggedheart')
,('2021-01-02', 'Gunsmoke')
,('2021-11-05', 'Princecharming')
,('2022 -09-12', 'Ruggedheart')
,('2022-03-05', 'Mysticlover')
,('2022-06-09', 'Ruggedheart')
,('2023-12-02', 'Mysticlover')
,('2023-05-21', 'Mysticlover')
--,('2022-06-31', 'Mysticlover')
--,('2022-11-30', 'Thrillseeker')
--,('2023-03-28', 'Princecharming')
--,('2022-06-29', 'Ruggedman')
--,('2022-04-19', 'Princecharming')

INSERT INTO CHITIETHOADON VALUES
(2, 598.000, 'SP0016', 'HD001')
,(1, 22.000, 'SP0014', 'HD002')
,(1, 30.000, 'SP0015', 'HD002')
,(4, 60, 'SP0004', 'HD003')
,(3, 31500.000, 'SP0030', 'HD004')
,(1, 4.500, 'SP0009', 'HD005')
,(1, 13.800, 'SP0001', 'HD006')
,(2, 9, 'SP0009', 'HD006')
,(2, 598.000, 'SP0016', 'HD007')
,(2, 44.000, 'SP0014', 'HD008')
,(1, 15570, 'SP0024', 'HD009')
,(3, 31500.000, 'SP0030', 'HD010')
,(4, 8, 'SP0007', 'HD010')
,(1, 4.500, 'SP0009', 'HD011')
,(1, 13.800, 'SP0001', 'HD012')
,(2, 30, 'SP0006', 'HD013')
,(1, 22.000, 'SP0014', 'HD014')
,(4, 20.000, 'SP0010', 'HD014')
,(4, 20, 'SP0024', 'HD015')
,(3, 150.000, 'SP0013', 'HD016')
,(1, 4.500, 'SP0009', 'HD017')
,(1, 13.800, 'SP0001', 'HD018')
,(10, 30, 'SP0008', 'HD018')
,(2, 598.000, 'SP0016', 'HD019')
,(1, 22.000, 'SP0014', 'HD020')
,(4, 20, 'SP0024', 'HD021')

INSERT INTO DONHANG (NGAYDATHANG, MAKH) VALUES
('2018-02-10', 'KH001')
,('2018-01-30', 'KH001')
,('2018-03-22', 'KH002')
,('2018-02-22', 'KH002')
,('2019-10-28', 'KH003')
,('2019-11-13', 'KH003')
,('2019-12-04', 'KH004')
,('2019-05-02', 'KH004')
,('2020-04-16', 'KH005')
,('2020-12-28', 'KH005')
,('2020-07-28', 'KH006')
,('2020-02-17', 'KH006')
,('2021-04-04', 'KH007')
,('2021-02-11', 'KH007')
,('2021-01-02', 'KH008')
,('2021-11-05', 'KH008')
,('2022-09-12', 'KH009')
,('2022-03-05', 'KH009')
,('2022-06-09', 'KH010')
,('2023-12-02', 'KH010')
,('2023-05-21', 'KH011')

INSERT INTO CHITIETDONHANG VALUES
(2, 598.000, 'SP0016', 'DH001')
,(1, 22.000, 'SP0014', 'DH002')
,(1, 30.000, 'SP0015', 'DH002')
,(4, 60, 'SP0004', 'DH003')
,(3, 31500.000, 'SP0030', 'DH004')
,(1, 4.500, 'SP0009', 'DH005')
,(1, 13.800, 'SP0001', 'DH006')
,(2, 9, 'SP0009', 'DH006')
,(2, 598.000, 'SP0016', 'DH007')
,(2, 44.000, 'SP0014', 'DH008')
,(1, 15570, 'SP0024', 'DH009')
,(3, 31500.000, 'SP0030', 'DH010')
,(4, 8, 'SP0007', 'DH010')
,(1, 4.500, 'SP0009', 'DH011')
,(1, 13.800, 'SP0001', 'DH012')
,(2, 30, 'SP0006', 'DH013')
,(1, 22.000, 'SP0014', 'DH014')
,(4, 20.000, 'SP0010', 'DH014')
,(4, 20, 'SP0024', 'DH015')
,(3, 150.000, 'SP0013', 'DH016')
,(1, 4.500, 'SP0009', 'DH017')
,(1, 13.800, 'SP0001', 'DH018')
,(10, 30, 'SP0008', 'DH018')
,(2, 598.000, 'SP0016', 'DH019')
,(1, 22.000, 'SP0014', 'DH020')
,(4, 20, 'SP0024', 'DH021')
