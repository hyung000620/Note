using System;

namespace Baekjoon
{
    class Program
    {
        static void Main()
        {
            string sA= Console.ReadLine();
            string[] sA_arr = sA.Split();
 
            int A = int.Parse(sA_arr[0]);
 
            if ((A%4==0) && ((A % 100 != 0)||(A%400==0)))
            {
                Console.WriteLine("1");
            }
            else
            {
                Console.WriteLine("0");
            }

           

        
        }
    }
}
