StreamWriter sw = new StreamWriter(Console.OpenStandardOutput());

int n = int.Parse(Console.ReadLine());

for(int i = 1; i <= n; i++)
{
    sw.WriteLine(i);
}

sw.Close();
