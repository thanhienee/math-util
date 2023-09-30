/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhienee.mathutil.core;

/**
 *
 * @author thanhienee
 */
public class MathUtil {
    // cung cap nhieu ham xu li toan hoc
    // clone class Math cua JDK
    // ham thu vien xai chung ma khong can luu lai trang thai/gia tri
    // chon thiet ke la ham static
    
    // ham tinh giai thua
    // ! = 1.2.3.4....n
    // khong co giai thua cho so am
    // 0! = 1! = 1 theo quy uoc
    // 20! co 18 chu so 0, vua du cho kieu long cua java
    // 21! tran kieu long
    // bai nay quy uoc tinh giai thua trong khoang 0-20
    
    public static long getFactorial(int n){
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n-1);
    }
}
