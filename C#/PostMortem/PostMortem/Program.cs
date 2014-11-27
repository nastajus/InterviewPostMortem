using System;
using System.Collections.Generic;

namespace PostMortem
{
    class Program
    {
        static void Main(string[] args)
        {
            SyntaxConst foo = new SyntaxConst();

            //failure. doesn't work// Coverity PDF
            //var oi2 = new ObjectInitializers{ Foo="foo", Bar=10}

            Fizzbuzz.run();


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
        //invalid token '{' 
        //anonymous blocks do not exist in C#
        //{
        //    int a;
        //}

        //{
        //    int a;
        //}
    }

    class ObjectInitializers
    {

        //Object initializers
        //You can set properties on a newly created object from within the
        //creation expression itself. To create a new object of class C with
        //specified values for the Foo and Bar properties:
        //new C {Foo=blah, Bar=blam}

        public ObjectInitializers(string Foo, int Bar)
        {
            Console.WriteLine("Foo: " + Foo + ", Bar: " + Bar);
        }

    }
}
