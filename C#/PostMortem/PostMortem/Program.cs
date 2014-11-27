using System;
using System.Collections.Generic;

namespace PostMortem
{
    class Program
    {
        static void Main(string[] args)
        {
            SyntaxConst foo = new SyntaxConst();
            Console.ReadLine();

            

        }
    }

    class SyntaxConst
    {
        const int a = 10;
        
        //const int b;
        //b = 10;
        //not allowed
        
    }


    class Block
    {
        //invalid block syntax:
        {
            int a;
        }

        {
            int a;
        }
    }
}
