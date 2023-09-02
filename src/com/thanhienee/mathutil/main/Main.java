/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhienee.mathutil.main;

import com.thanhienee.mathutil.core.MathUtil;

/**
 *
 * @author thanhienee
 */
public class Main {
    public static void main(String[] args) {
        // thu nghiem ham tinh giai thua xem chay co dung nhu thiet ke hay khong
        // ta phai dua cac tinh huong su dung ham trong thuc te
        // test case: mot tinh huong/ app/ man hinh/ tinh nang duoc dua vao su dung
        // gia lap hanh vi su dung cua ai do
        
        // TEST CASE: la mot tinh huong su dung app ma no bao ham
        // 1. data dau vao cu the nao do
        // 2. output ung voi xu ly cua ham, dung dau vao de xu ly
        // 3. so sanh de xem ket qua co nhu ki vong hay khong
        
        long expected = 120; // ki vong ham tra ve 120 neu tinh 5!
        int n = 5; // input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
        
        
    }
}
