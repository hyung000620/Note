using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;

    class Program
    {
        static void Main(string[] args)
        {

            Silver silver = new Silver();
            silver.Executor();

            //Backjoon40();
        }
    }

    public class Silver
    {
        public Silver()
        { 
        
        }
        public void Executor()
        {
            // true값일때 올라갈 count 변수
            //int count = 0;

            //// n개 입력
            //int n = int.Parse(Console.ReadLine());

            //for (int i = 1; i <= n; i++)
            //{
            //    if (hansu(i.ToString())) count++;
            //}

            //Console.WriteLine(count);

            problemNumber_11720();
        }

        private void problemNumber_11720()
        {
            string input = Console.ReadLine();
            string numData = Console.ReadLine();
            byte[] ASCIIvalues = Encoding.ASCII.GetBytes(numData);
            int sum = 0;
            foreach (var values in ASCIIvalues)
            {
                switch (values)
                {
                    case 48:
                        sum += 0;
                        break;
                    case 49:
                        sum += 1;
                        break;
                    case 50:
                        sum += 2;
                        break;
                    case 51:
                        sum += 3;
                        break;
                    case 52:
                        sum += 4;
                        break;
                    case 53:
                        sum += 5;
                        break;
                    case 54:
                        sum += 6;
                        break;
                    case 55:
                        sum += 7;
                        break;
                    case 56:
                        sum += 8;
                        break;
                    case 57:
                        sum += 9;
                        break;

                }
            }
            Console.WriteLine(sum);
        }
    }
