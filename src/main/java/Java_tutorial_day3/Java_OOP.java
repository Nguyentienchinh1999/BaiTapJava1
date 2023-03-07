package Java_tutorial_day3;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Java_OOP {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.id = 1;
//        dog.name = "THỦY";
//        dog.age = 24;
//        dog.color = "black";
//        dog.sleep();
//
//        Dog dog2 = new Dog();
        Scanner in = new Scanner(System.in);
//        System.out.println("nhap vao ten con cho:");
//        dog2.name = in.nextLine();
//        System.out.println(dog2.name);
//        dog2.eat();
//        dog2.sleep();
//        dog2.run();
//        HinhChuNhat hcn = new HinhChuNhat();
//        System.out.println("nhap 2 canh cua hinh chu nhat:");
//        hcn.chieuDai = in.nextDouble();
//        hcn.chieuRong = in.nextDouble();
//        System.out.println(hcn.chuVi());
//        System.out.println(hcn.dienTich());

//        System.out.println("nhap kich thuoc mang:");
//        int n = in.nextInt();
//        Random random = new Random(10);
//       HinhChuNhat[] hcn = new HinhChuNhat[n];
//       for(int i = 0; i < n; i++){
//           hcn[i] = new HinhChuNhat(random.nextInt(), random.nextInt());
//       }
//
//       for(int i = 0; i < n; i++){
//           System.out.println(hcn[i].toString());
//       }
//        double max = hcn[0].dienTich();
//       int index = 0;
//        for(int i = 1; i < n; i++){
//            if(max < hcn[i].dienTich()){
//                max = hcn[i].dienTich();
//                index = i;
//            }
//        }
//        System.out.println("hinh chu nhat co dien tich lon nhat la hinh co vi tri:" + index);

        System.out.println("nhap kich thuoc mang");
        int n = in.nextInt();
        if(n < 1){
            System.out.println("khong hop le");
            System.exit(0);
        }
        HinhTron[] ht = new HinhTron[n];
        for(int i =0; i < n; i++){
            System.out.println("nhap vao hinh tron thu "+ i+1);
            System.out.println("ban kinh:");
           double banKinh = in.nextDouble();
           if(banKinh < 1){
               System.out.println("khong hop le");
               break;
           }
           ht[i] = new HinhTron(banKinh);
        }
        for(int i =0; i < n; i++){
            System.out.println(ht[i].toString());
        }
        double maxCV = ht[0].chuVi();
        double minDt = ht[0].dienTich();
        int indexCv = 0;
        int indextDt = 0;
        int trungbinh = 0;
        int sum = 0;
        int count = 0;
        double temp = ht[0].banKinh;
        for(int i =1; i <n; i++){
            if(maxCV < ht[i].chuVi()){
                maxCV = ht[i].chuVi();
                indexCv = i;
            }
            if(minDt > ht[i].dienTich()){
                minDt = ht[i].dienTich();
                indextDt = i;
            }
            sum += ht[i].chuVi();

            if(ht[i].chuVi() > trungbinh){
                count ++;
            }
        }
        trungbinh = sum/n;
        System.out.println("hinh tron co chu vi lon nhat la: "  + maxCV + " tai vi tri: " + indexCv);
        System.out.println("hinh tron co dien tinh be nhat la: "  + minDt + " tai vi tri: " + indextDt);
        System.out.println("trung binh chu vi la " + trungbinh);
        System.out.println("co " + count + " hinh lon hon trung binh cong chu vi");
        for(int i = 0; i < ht.length - 1; i++){
            for(int j = i + 1; j < ht.length ; j++){
                if(ht[i].banKinh > ht[j].banKinh){
                    temp = ht[j].banKinh;
                    ht[j].banKinh = ht[i].banKinh;
                    ht[i].banKinh = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println("ban kinh tang dan la: " + ht[i].toString());
        }

    }
}
