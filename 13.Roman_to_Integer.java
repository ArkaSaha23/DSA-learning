class Solution {
    public int romanToInt(String s) {
        int num=0,i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='M'){
                num+=1000;
                i++;
            }else if(ch=='D'){
                num+=500;
                i++;
            }else if(ch=='C'){
                if((i+1)!=s.length() && s.charAt(i+1)=='D'){
                    num+=400;
                    i+=2;
                }
                else if((i+1)!=s.length() && s.charAt(i+1)=='M'){
                    num+=900;
                    i+=2;
                }else{
                    num+=100;
                    i++;
                }
            }else if(ch=='L'){
                num+=50;
                i++;
            }else if(ch=='X'){
                if((i+1)!=s.length() && s.charAt(i+1)=='L'){
                    num+=40;
                    i+=2;
                }
                else if((i+1)!=s.length() && s.charAt(i+1)=='C'){
                    num+=90;
                    i+=2;
                }else{
                    num+=10;
                    i++;
                }
            }else if(ch=='V'){
                num+=5;
                i++;
            }else if(ch=='I'){
                if((i+1)!=s.length() && s.charAt(i+1)=='X'){
                    num+=9;
                    i+=2;
                }
                else if((i+1)!=s.length() && s.charAt(i+1)=='V'){
                    num+=4;
                    i+=2;
                }
                else{
                    num+=1;
                    i++;
                }
            } 
        }
        return num;
    }
}
