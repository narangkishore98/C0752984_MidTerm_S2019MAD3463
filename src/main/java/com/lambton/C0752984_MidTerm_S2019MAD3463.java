package com.lambton;

public class C0752984_MidTerm_S2019MAD3463 {
    public static void main(String[] args) {
        LambtonStringTools object = new LambtonStringTools();
        System.out.println("-----For Testing binaryToDecimal-------");
        System.out.println("1000: "+object.binaryToDecimal("1000"));
        System.out.println("100000: "+object.binaryToDecimal("1000"));
        System.out.println("01001101: "+object.binaryToDecimal("01001101"));
        System.out.println("1000.1: "+object.binaryToDecimal("1000.1"));
        System.out.println("------For Testing Reverse-----");
        System.out.println("Meghna Joshi: "+object.reverse("Meghna Joshi"));
        System.out.println("Kishore Narang: "+object.reverse("Kishore Narang"));
        System.out.println("Mobile Applications: "+object.reverse("Mobile Applications "));
        System.out.println("-------------Testing initals------------");
        System.out.println("Kishore Narang: "+object.initials("Kishore Narang"));
        System.out.println("Kishore Sushil Narang: "+object.initials("Kishore Sushil Narang"));
        System.out.println("-----------Testing mostFrequent----------------");
        System.out.println("Ram: "+object.mostFrequent("Ram"));
        System.out.println("Kishore Kumar Narang: "+object.mostFrequent("Kishore Kumar Narang"));
        System.out.println(object.replaceSubString("the dog jumped the fe" +
                "nce","the","that"));
    }
}
