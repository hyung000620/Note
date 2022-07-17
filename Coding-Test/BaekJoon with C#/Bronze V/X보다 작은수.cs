using System;
using System.Text;
using static System.Console;

namespace backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = ReadLine().Split();
            string[] q = ReadLine().Split();
            StringBuilder sb = new StringBuilder();
            

            for(int i = 0; i < int.Parse(s[0]) ; i++) {

                if (int.Parse(q[i]) < int.Parse(s[1])) {
                    sb.Append($"{q[i]} ");
                }
            }
            Console.WriteLine(sb);
        }
    }
}
