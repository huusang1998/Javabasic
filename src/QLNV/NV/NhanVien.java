package QLNV.NV;


import java.util.Scanner;

import QLNV.Person.Person;

public class NhanVien extends Person  {
	protected String maNV;
	protected String chucVu;
	protected int heSoLuong;
	protected int soCong;
	Scanner input = new Scanner(System.in);
    public int inputHeSoLuong() {
    	do {
			try {
				System.out.println("nhap he so luong co ban:");
				heSoLuong = Integer.parseInt(input.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("nhap sai vui long nhap lai:");
				heSoLuong=0;
			} 
			
		} while (heSoLuong==0);
    	
    	return heSoLuong;
    }
    public String inputMaNV() {
    	System.out.println("nhap Ma NV:");
    	maNV=input.nextLine();
    	return maNV;
    }
    public String inputChucVu() {
    	System.out.println("nhap chuc vu:");
    	chucVu=input.nextLine();
    	return chucVu;
    }
    public int inputSoCong() {
    	do {
			try {
				System.out.println("nhap he so cong:");
				soCong = Integer.parseInt(input.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("nhap sai vui long nhap lai:");
				soCong=0;
			} 
			
		} while (soCong==0);
    	
    	return soCong;
    }
	public int getHeSoLuong() {
		return heSoLuong;
	}

	public NhanVien() {
		super();
	}

	public NhanVien(String ten, int tuoi, int soCMT, String gioiTinh, String diaChi, int heSoLuong, int soCong) {
		super(ten, tuoi, soCMT, gioiTinh, diaChi);
		this.heSoLuong = heSoLuong;
		this.soCong = soCong;
	}

	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getSoCong() {
		return soCong;
	}

	public void setSoCong(int soCong) {
		this.soCong = soCong;
	}

	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public NhanVien seach(NhanVien[] NV) {
		;
		System.out.println("nhap ten nv can tinh luong:");
		String dk;
		dk = input.nextLine();
		for (int i = 0; i < NV.length; i++) {

			if (NV[i].getTen().equals(dk)) {
				return NV[i];
			}
		}
		return null;
	}
 public void inputNV(NhanVien nv) {
	 super.input(nv);
	 nv.inputMaNV();
	 nv.inputChucVu();
	 nv.inputHeSoLuong();
	 nv.inputSoCong();
	 
 }
 public void outputNV(NhanVien nv) {
	 super.output(nv);
	 System.out.println(String.format("ma NV:%s", nv.getMaNV()));
	 System.out.println(String.format("chuc vu:%s", nv.getChucVu()));
	 System.out.println(String.format("he so luong co ban:%s", nv.getHeSoLuong()));
	 System.out.println(String.format("so cong :%s", nv.getSoCong()));
 }
	public int luong(int heSoLuong, int soCong) {

		return heSoLuong * 100000 * soCong;
	}
}
