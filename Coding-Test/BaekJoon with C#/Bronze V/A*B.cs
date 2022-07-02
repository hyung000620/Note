using System;

namespace HelloWorld2
{
    class Program
    {
        static int a, b;
        static void Main(string[] args)
        {
            do
            {
                a = Console.Read()-48;
            }while (a<0 && a>9);

            do
            {
                b = Console.Read()-48;
            } while(!(b>0 && b<10));


            Console.WriteLine(a*b);
        }
    }
}
