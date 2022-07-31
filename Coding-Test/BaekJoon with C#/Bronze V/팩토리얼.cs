int fac(int n)
{
    if (n == 0) return 1;
    else return n * fac(n - 1);
}

int n = int.Parse(Console.ReadLine());
Console.Write(fac(n));
