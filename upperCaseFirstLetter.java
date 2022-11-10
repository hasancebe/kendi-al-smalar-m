package kendi_calismalarim;

public class upperCaseFirstLetter {
    public static void main(String[] args) {
        String str="ali ata bak emel eve gel ipek";
        int a=123;
        String j="";
        String amal="456";
        int alll;
        char[] strchar=str.toCharArray();


        for (int i = 1; i <strchar.length ; i++) {

           if(Character.isSpaceChar(strchar[i])){
              strchar[i+1]=Character.toUpperCase(strchar[i+1]);
           }
    }
        strchar[0]=Character.toUpperCase(str.charAt(0));
       str=String.valueOf(strchar);
       j=String.valueOf(a);
       alll=Integer.valueOf(amal);
        System.out.println(str);
        System.out.println(j.substring(1));
        System.out.println(alll);
    }
}
