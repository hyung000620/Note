int A = int.Parse(Console.ReadLine());
int B = int.Parse(Console.ReadLine());


if (A > 0)
{
    if (B > 0)
    {
        Console.WriteLine("1");
    }
    else
    {
        Console.WriteLine("4");
    }
}
else
{
    if (B > 0)
    {
        Console.WriteLine("2");
    }
    else
    {
        Console.WriteLine("3");
    }
}
