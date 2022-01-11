class Challenge {
 public static void main(String args[]){
    String _str = "Hello World!";
    String nstr = "";
    char ch;
    for (int i = 0; i < _str.length(); i++){
        ch = _str.charAt(i);
        nstr = ch+nstr;
    }
    System.out.println(nstr);
 }
}