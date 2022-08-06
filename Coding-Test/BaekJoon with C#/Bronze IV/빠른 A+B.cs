using System;
using System.IO;
using System.Text;

static class Baekjoon
{
    static StreamReader sr = new StreamReader(new BufferedStream(Console.OpenStandardInput()));
    static int ReadInt()
    {
        int readchar;
        while ((readchar = sr.Read()) < '-') ;

        var neg = false;
        if (readchar == '-')
        {
            neg = true;
            readchar = sr.Read();
        }
        var m = readchar - '0';
        while (true)
        {
            readchar = sr.Read();
            if (readchar < '0') break;
            m = m * 10 + (readchar - '0');
        }
        return neg ? -m : m;
    }
    static void Main()
    {
        StringBuilder sb = new StringBuilder();
        StreamWriter sw = new StreamWriter(new BufferedStream(Console.OpenStandardOutput()));

        int t = ReadInt();

        for (int i = 0; i < t; i++)
        {
            int a = ReadInt();
            int b = ReadInt();
            sb.Append($"{a + b}\n");
        }
        sw.WriteLine(sb);
        sw.Close();
    }
}
