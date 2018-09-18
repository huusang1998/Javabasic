package QLNV.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import QLNV.NV.*;

public class TestNhanVien {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		NhanVien nv1 = new NhanVien();
		int soLuong = 0;
		do {
			try {
				System.out.println("nhap so luong nhan vien:");
				soLuong = Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("nhap sai vui long nhap lai");
				soLuong = 0;
			}
		} while (soLuong == 0);

		NhanVien[] nv = new NhanVien[soLuong];
		List<NhanVien> nhanViens = new ArrayList<NhanVien>();
		for (int i = 0; i < soLuong; i++) {
			System.out.println("nhap nhan vien thu" + (i + 1));
			nv[i] = new NhanVien();
			nv[i].inputNV(nv[i]);
			nhanViens.add(nv[i]);

		}

	for (int i = 0; i < nv.length; i++) {
		nv[i].outputNV(nv[i]);
		}

	NhanVien nhanViemSearch = nv1.seach(nv);
        try {
        	nv1.outputNV(nhanViemSearch);
        	 for(NhanVien item : nhanViens){
        		 if(item.getMaNV().equals(nhanViemSearch.getMaNV()))
             	System.out.println(nv1.luong(item.getHeSoLuong(),item.getSoCong()));
      		   }
		} catch (NullPointerException e) {
			System.out.println("ko co ket qua !");
		}
       
		
		
		//System.out.println(String.format("luong cua nv la: %s",nv1.luong(nv1.getHeSoLuong(), nv1.getSoCong())));;
		input.close();

	}

}
