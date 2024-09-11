package org.saddy;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String abs;
//        String 1abc; //invalid
        String a1bc; //valid
//        _, $ only these two special characters are allowed for identifier
        String _abc; //valid
        String $abc;
        String acc_cc;
        String acc_;
//        other special characters are not allowed(,, -, @, #, %, ,+.-, =)
//        String abc#;
//        length of identifiers(recommend: 4-15)
        int a  = 10;
        String s = "Java";
//        reserved keywords can not be used for identifiers
//        break, while, for, if, else, class, do, continue,......(53 keywords)
//        String while = "Java";  //invalid usage
    }
}
