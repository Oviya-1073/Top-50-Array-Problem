class Reverse
{
    public static String reverseWord(String str)
    {
        int n = str.length();
        if(n<2) return str;
        String s = "";
        for(int i = n-1;i>=0;i--){
            s += str.charAt(i);
        }
        return s;
    }
}
