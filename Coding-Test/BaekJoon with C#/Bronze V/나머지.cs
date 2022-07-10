string[] s = Console.ReadLine().Split();

int A = int.Parse(s[0]);
int B = int.Parse(s[1]);
int C = int.Parse(s[2]);

Console.WriteLine(((A + B) % C).ToString());
Console.WriteLine((((A % C) + (B % C)) % C).ToString());
Console.WriteLine(((A * B) % C).ToString());
Console.WriteLine((((A % C) * (B % C)) % C).ToString());
