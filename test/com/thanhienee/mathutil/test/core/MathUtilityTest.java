/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thanhienee.mathutil.test.core;

import com.thanhienee.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

 

/**
 *
 * @author thanhienee
 */
public class MathUtilityTest {
    // day la class su dung cac ham cua thu vien JUnit
    // de kiem tra code chinh - ham tinh giai thua
    
    // co nhieu quy tac dat ten ham kiem thu
    // thuong se la noi len muc dich cua cac case kiem thu
    
    // JUnit phoi hop voi JVM de chay ham nay
    // goc la public static void main()
    // co nhieu @Test ung voi nhieu case khac nhau de kiem thu ham tinh giai thua
    @Test
    // ham chay thanh cong, tra ve ket qua dung
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; // test truong hop dau vao valid, phai chay dung
        long expected = 1; // hy vong 0! = 1
        
        //long actual = ; // goi ham can test ben core
        long actual = MathUtil.getFactorial(n);
        
        // so sanh dung framework
        // ham giup so sanh 2 gia tri nao do, xem co giong nhau khong
        // neu giong nhau -> green, it nhat cho case dang test
        // neu khac nhau -> red, nghia là expected va actual khac nhau
        Assert.assertEquals(expected, actual);
        
        // gop them vai case thanh cong, ham phai chuan
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // muon 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); // muon 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); // muon 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); // muon 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); // muon 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); // muon 6! == 720
    }
    
    
//    @Test(expected = NumberFormatException.class )
//    // ham chay khi data dua vao n < 0 || n > 20
//    // ki vong xuat hien ngoai le
//    // tinh huong bat thuong, ngoai le, ngoai du tinh
//    // thi khong the so sanh theo kieu value
//    // chi co the do luong bang cach xem chung co xuat hien hay khong
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5); //ham
//    }
//    
    @Test(expected = IllegalArgumentException.class)
    // ham chay khi data dua vao n < 0 || n > 20
    // ki vong xuat hien ngoai le
    // tinh huong bat thuong, ngoai le, ngoai du tinh
    // thi khong the so sanh theo kieu value
    // chi co the do luong bang cach xem chung co xuat hien hay khong
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5); //ham
    }
    
    // cach viet khac, tu nhien hơn
    // lambda expression
    // test case: ham se tra ve ngoai le neu nhan vao 21
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
//        Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh,
//                            tham số 2: đoạn code chạy ra ngoại lệ runnable);
            Assert.assertThrows(IllegalArgumentException.class,
                            () -> MathUtil.getFactorial(-5));
        //MathUtil.getFactorial(-5); //ham Test chay
    }
      
    // Bat ngoai le, xem ham co tra ve ngoai le hay khong khi n khong dung
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        // chu dong kiem soat ngoai le
        try {
            MathUtil.getFactorial(-5); //ham Test chay
        } catch (Exception e) {
            // bat try-catch thi JUnit se ra mau xanh do da chu dong bat ngoai le
            // nhưng khong dam bao ngoai le minh can co xuat hien hay khong
            // can co doan code kiem soat dung ngoai le IllegalArgumentException xuat hien
            Assert.assertEquals("Invalid argument. n must be between 0 to 20.",
                                e.getMessage());
        }
        
    }
    
    // Data Driven Testing (DDT): la tach tap data test ra mot cho rieng
    // dat chung thanh cac bien tuong ung, roi dua bien vao ham test
    // DDT con co ten la "Kiem thu unit test kieu tham so hoa"
    // Parameterized - tham so hoa data test
    
}
