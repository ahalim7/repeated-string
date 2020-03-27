/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.repeatedstring;

import sun.awt.RepaintArea;

/**
 *
 * @author AbdElHalim
 */
public class RepeatingString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int repeated = 0;
        int subpart = 0;
        if ("a".equals(s)) {
            return n;
        }
        long size = s.length();
        long part = n % size;
        for (int i = 0; i < size; i++) {
            if ('a' == s.charAt(i)) {
                if (i < part) {
                    subpart++;
                }
                repeated++;
            }
        }
        return repeated != 0 ? (repeated * ((n / size))) + subpart : 0;

    }

    public static void main(String[] args) {       


        long result = repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",
                549382313570L);
        System.out.println(result);
    }
}
