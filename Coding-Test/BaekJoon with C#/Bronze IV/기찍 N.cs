using System.IO;
using System.Text;
using System;

namespace codingtest
{
    class level3_baek{
        public static void Main(){
            StreamReader sr = new StreamReader(Console.OpenStandardInput());
            StreamWriter sw = new StreamWriter(Console.OpenStandardOutput());
            StringBuilder sb = new StringBuilder();
            int N = int.Parse(sr.ReadLine());

            for(int i = N; i >= 1; i--){
                sb.Append(i);
                sb.Append(System.Environment.NewLine);
            }
            sw.WriteLine(sb.ToString());
            
            sr.Close();
            sw.Flush();
            sw.Close();
        }
    }
}
