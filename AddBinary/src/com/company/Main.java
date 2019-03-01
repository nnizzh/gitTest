package com.company;

public class Main {

    public static String addBinary(String a, String b) {

        int sum=0;
        int carry=0;
        StringBuffer stringBuffer=new StringBuffer();
        while(a.length()!=b.length()){
            if(a.length()>b.length()){
                b="0"+b;
            }else {
                a="0"+a;
            }
        }
        for(int i=a.length()-1;i>=0;i--){
            sum = (a.charAt(i)-'0') + (b.charAt(i)-'0') + carry;
            if(sum>=2){
                sum=sum-2;
                carry=1;
            }else {
                sum=sum;
                carry=0;
            }
            stringBuffer.append(sum);
        }
        if(carry==1) {
            stringBuffer.append("1");
        }

        return stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        String a="1101111";
        String b="10011000";
        System.out.println(Main.addBinary(a,b));
    }
}
