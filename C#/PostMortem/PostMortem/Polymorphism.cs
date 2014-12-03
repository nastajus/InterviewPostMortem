using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PostMortem
{
    //referencing C# in a Nutshell book

    static class Polymorphism
    {
        public void run()
        {
            Stock msft = new Stock();
            House mansion = new House();

            //polymorphism:
            Display()
        }
    }

    abstract class Asset
    {
        public string Name;

        public static void Display(Asset asset)
        {
            Console.WriteLine(asset.Name);
        }
    }

    class Stock : Asset
    {
        public Stock() { Name = "Stock"; }
    }

    class House : Asset
    {
        public House() { Name = "House"; }
    }
}
