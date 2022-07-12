using System;

class calcul
{
    static void Main()
    {
        int A=0; int B=0;
        int C = 1; int[] T = new int[13];
        int[] D = new int[13];
        char[] tempc = new char[13];
        char tmpc;
        string lin = Console.ReadLine();
        
        tmpc = lin[0];

        for (int i = 0; i < lin.Length; i++)
        {
            tempc[i] = lin[i];

            if (Convert.ToInt32(tempc[i]) == Convert.ToInt32('-'))
            {
                C = -1;
            }
            else if (!(Convert.ToInt32(tempc[i]) == Convert.ToInt32(' ')))
            {
                A = 10 * A;     
                A += Convert.ToInt32(tempc[i])-48;

            }
            else{
                B = A * C;
                A = 0;
                C = 1;
            }

        }
        A = A * C;
     


      
        if(B>A){
            Console.WriteLine(">");
        }
else if(B<A){
        Console.WriteLine("<");
        }
else{
            Console.WriteLine("==");
        }


    }
    }
