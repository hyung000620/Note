using System;
using static System.Console;
using System.Text;
using System.IO;
namespace test 
{ 
    class program
    { 
        static void Main() 
        { 
            int index = int.Parse(Console.ReadLine());

            StringBuilder total = new StringBuilder();
            
            for (int i = 0; i < index; i++)
            {
                for (int j = 0; j < index; j++)
                {
                    if (j < index - i - 1)
                        total.Append(" ");
                    else 
                        total.Append("*");
                }

                total.Append("\n");
            }
            
            Console.WriteLine(total.ToString());
        } 
    } 
}
