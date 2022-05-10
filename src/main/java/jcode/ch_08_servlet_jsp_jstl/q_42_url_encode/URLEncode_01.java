package jcode.ch_08_servlet_jsp_jstl.q_42_url_encode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncode_01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Java+programing language";
        String enc = "UTF-8";
//        String enc = "windows-1252";
//        String enc = "iso-8859-1";

        String encStr = URLEncoder.encode(str, enc);
        System.out.println("encStr--->" + encStr);

        String decStr = URLDecoder.decode(encStr, enc);
        System.out.println("decStr--->" + decStr);
    }
}
