using System;
using static System.Console;

class Program
{
    static void Main() {
        string sn=ReadLine();
        int a1=Convert.ToInt32(sn);
        sn=ReadLine();
        int a2=Convert.ToInt32(sn);
        sn=ReadLine();
        int a3=Convert.ToInt32(sn);
        
        sn=ReadLine();
        int b1=Convert.ToInt32(sn);
        sn=ReadLine();
        int b2=Convert.ToInt32(sn);
      
        int a=0;
        int b=0;
        if(a1>=a2){
            if(a2<=a3)
                a=a2;
            else    
                a=a3;
        }
        else{
            if(a1<=a3)
                a=a1;
            else
                a=a3;
        }
        
        if(b1>=b2)
            b=b2;
        else
            b=b1;
            
        Write(a+b-50);
    }
     
}
