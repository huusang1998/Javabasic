package QLNV.Person;

import java.util.Scanner;

public class Person {
	protected String ten;
	protected int tuoi;
	protected int soCMT;
	protected String gioiTinh;
	protected String diaChi;
	Scanner input = new Scanner(System.in);
	public Person(String ten, int tuoi, int soCMT, String gioiTinh, String diaChi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.soCMT = soCMT;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public String inputTen() {
		System.out.println("nhap ten:");
		ten=input.nextLine();
		return ten ;
	}
	public int inputTuoi() {
		do {
			try {
				System.out.println("nhap tuoi:");
				tuoi = Integer.parseInt(input.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("nhap sai vui long nhap lai:");
				tuoi=0;
			} 
			
		} while (tuoi==0);
		return tuoi;
	}
	public int inputSoCMT() {
		do {
			try {
				System.out.println("nhap so chung minh thu:");
				soCMT = Integer.parseInt(input.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("nhap sai vui long nhap lai:");
				soCMT=0;
			} 
			
		} while (soCMT==0);
		return soCMT;
	}
	public Person() {
		super();
	}
	public String inputGioiTinh() {
		System.out.println("nhap gioi tinh:");
		gioiTinh=input.nextLine();
		return gioiTinh;
	}
	public String inputDiaChi() {
		System.out.println("nhap dia chi:");
		diaChi=input.nextLine();
		return diaChi;
	}
	public void input(Person ps) {
		ps.inputTen();
		ps.inputTuoi();
		ps.inputSoCMT();
		ps.inputGioiTinh();
		ps.inputDiaChi();
		
	}
	public void output(Person ps) {
		System.out.println(String.format("ten NV: %s", ps.getTen()));
		System.out.println(String.format("tuoi NV: %s", ps.getTuoi()));
		System.out.println(String.format("gioi tinh: %s", ps.getGioiTinh()));
		System.out.println(String.format("so chung minh thu NV: %s", ps.getSoCMT()));
		System.out.println(String.format("dia chi NV: %s", ps.getDiaChi()));
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getSoCMT() {
		return soCMT;
	}
	public void setSoCMT(int soCMT) {
		this.soCMT = soCMT;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	

}
