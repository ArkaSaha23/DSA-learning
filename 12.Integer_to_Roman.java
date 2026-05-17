class Solution {
    public String intToRoman(int num) {
        String str="";int left;
        while(num!=0)
        {
            if(num>=1000)
            {
                num=num-1000;
                str=str+"M";
            }
            else if(num>=500)
            {
                if(num>=900)
                {
                    num=num-900;
                    str=str+"CM";
                }
                else
                {
                   num=num-500;
                   str=str+"D";
                }
            }
            else if(num>=100)
            {
                if(num>=400)
                {
                    num=num-400;
                    str=str+"CD";
                }
                else
                {
                   num=num-100;
                   str=str+"C";
                }
            }
            else if(num>=50)
            {
                if(num>=90)
                {
                    num=num-90;
                    str=str+"XC";
                }
                else
                {
                    num=num-50;
                    str=str+"L";
                }
            }
            else if(num>=10)
            {
                if(num>=40)
                {
                    num=num-40;
                    str=str+"XL";
                }
                else
                {
                    num=num-10;
                    str=str+"X";
                }
            }

            else if(num>=5)
            {
                if(num==9)
                {
                    num=num-9;
                    str=str+"IX";
                }
                else
                {
                    num=num-5;
                    str=str+"V";
                }
            }
            else if(num>=1)
            {
                if(num==4)
                {
                    num=num-4;
                    str=str+"IV";
                }
                else
                {
                    num=num-1;
                    str=str+"I";
                }
            }
            System.out.println(str);
            System.out.println(num);
        }  
        return str;      
    }
}
