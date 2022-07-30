using System;
using System.Text;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();
            while (true)
            {
                string input = Console.ReadLine();
                sb.Append(input+"\n");
                if (string.IsNullOrEmpty(input) == true)
                    break;
            }
            Console.WriteLine(sb);

        }
    }
}
