using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PostMortem
{
    class Fizzbuzz
    {
        //modulus negatives in Java
        public static void run(){
            for (int i = -50; i <= 50; i++)
            {
                Console.Write(" ");

                if (i % 3 == 0)
                {
                    Console.Write("fizz");
                }
                if (i % 5 == 0)
                {
                    Console.Write("buzz");
                }

                if (i % 3 != 0 && i % 5 != 0)
                {
                    Console.Write(i);
                }

                //if (i % 30 == 0)
                //{
                //    Console.WriteLine("");
                //}
            }
        }
    }
}
