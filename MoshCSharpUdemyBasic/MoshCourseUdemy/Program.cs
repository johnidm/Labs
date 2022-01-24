using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;

namespace MoshCourseUdemy
{
    //public struct Point
    //{
    //    public int X;
    //    public int Y;
    //}


    //public enum ShippingMethod
    //{
    //    Regular = 1,
    //    Express = 2,
    //    Sedex = 3
    //}

    //public class Person
    //{

    //    public string Name;

    //    public void Introduce()
    //    {
    //        Console.WriteLine("My name is " + Name);
    //    }

    //    public static void Write(string Name) {
    //        Console.WriteLine(Name + " is you name");
    //    }

    //}


    class Program
    {
        //static private string Capitalize(string word)
        //{

        //    if (string.IsNullOrEmpty(word))
        //    {
        //        return string.Empty;
        //    }

        //    return string.Format("{0}{1}",
        //        char.ToUpper(word.First()),
        //        word.Substring(1).ToLower());
        //}

        //static private string ToPascalCase(string words)
        //{

        //    var words_ = words.Split().ToList().Select(w => Capitalize(w));

        //    return string.Join("", words_);

        //}

        static void Main(string[] args)
        {

            //Console.WriteLine("Enter a numbers separeted by comma: ");
            //var input = Console.ReadLine();

            //Console.WriteLine(input.Max());


            //Console.WriteLine("Enter a English word: ");
            //var input = Console.ReadLine();

            //List<string> vowels = new List<string> { "a", "e", "i", "o", "u" };

            //int counter = 0;

            //foreach (var c in input)
            //{
            //    if (vowels.Contains(c.ToString()))
            //    {
            //        counter++;
            //    }

            //}

            //Console.WriteLine($"Total vowels {counter}");

            //Console.WriteLine("Enter a few words separeted by a space: ");
            //Console.WriteLine(ToPascalCase(Console.ReadLine()));

            //Console.WriteLine( string.Join("", ) )

            //Console.WriteLine("Enter the time in the 24 - hour format(e.g 19:00): ");
            //var input = Console.ReadLine();

            //var time = input.Split(":");

            //var isValidTime = false;

            //if (time.Count() ==2)
            //{
            //    var hour = Convert.ToInt32(time[0]);
            //    var minute = Convert.ToInt32(time[1]);

            //    if ((Enumerable.Range(0, 23).ToList().Contains(hour)) &&
            //        (Enumerable.Range(0, 59).ToList().Contains(minute)))
            //    {
            //        isValidTime = true;
            //    }
            // }

            //if (isValidTime)
            //{
            //    Console.WriteLine("Ok");
            //}
            //else
            //{
            //    Console.WriteLine("Invalid Time");
            //}


            //do
            //{
            //    Console.WriteLine("Enter a few numbers separated by a hyphen: ");
            //    input = Console.ReadLine();

            //    if (string.IsNullOrEmpty(input))
            //    {
            //        break;
            //    }

            //    var numbers = input.Split("-")
            //        .Select(n => Convert.ToInt32(n))
            //        .ToList();

            //    numbers.Sort();

            //    for (var n = 0; n < numbers.Count() - 1; n++ )
            //    {
            //        if (numbers[n] == numbers[n+1])
            //        {
            //            Console.WriteLine("Duplicate");
            //            break;
            //        }
            //    }

            //} while (true);

            //Console.WriteLine("Type a series of number separated by hyphen: ");
            //string input = Console.ReadLine();

            //var series = input.Split("-")
            //       .Select(n => Convert.ToInt32(n));

            //var isConsecutive = Enumerable
            //      .Range(series.First(), series.Count())
            //      .SequenceEqual(series);

            //Console.WriteLine(isConsecutive ? "Consecutive" : "Not Consecutive");


            ////string text = File.ReadAllText("/Users/johnidouglas/Projects/my-app/my-app/components/EditScreenInfo.tsx");

            //int count = text.Split().Count();

            //Console.WriteLine(count);

            //var longest = text.Split().ToList().Select(t => Tuple.Create(t.Length, t)).Max(i => i.Item1);
            //Console.WriteLine(longest);

            //Console.WriteLine(longest);

            //List<string> names = new List<string>();

            //string input;
            //do
            //{
            //    Console.WriteLine("Type a name or Enter to exit: ");
            //    input = Console.ReadLine();

            //    if (string.IsNullOrWhiteSpace(input))
            //    {
            //        break;
            //    }

            //    names.Add(input);

            //} while (true);

            //int count = names.Count();


            //switch (count)
            //{
            //    case 0:
            //        break;
            //    case 1:
            //        Console.WriteLine($"{names.First()} likes your post."  );
            //        break;

            //    case 2:
            //        Console.WriteLine($"{names[0]} and {names[1]} like your post.");
            //        break;

            //    default:
            //        Console.WriteLine($"{string.Join(", ", names)}other like your post.");
            //        break;
            //}

            //List<string> numbers = new List<string>();

            //do
            //{
            //    Console.WriteLine("Suplay a list by comma separeted e.g 5, 1, 9, 2, 10");

            //    string input = Console.ReadLine();

            //    numbers = input.Split(",").ToList();

            //    if (numbers.Count() >= 5)
            //    {
            //        break;
            //    }

            //    Console.WriteLine("Invalid List - List is empry or less than 5 numbers");

            //} while (true);


            //List<int> intNumbers = numbers.Select(n => Convert.ToInt32(n)).ToList();

            //intNumbers.Sort();
            //intNumbers.Reverse();

            //foreach (int n in intNumbers.GetRange(0, 3))
            //{
            //    Console.WriteLine(n);
            //}

            //List<int> numbers = new List<int>();

            //while (true)
            //{
            //    Console.WriteLine("Type a number or Quit to exit: ");

            //    string input = Console.ReadLine();

            //    if (input == "Quit")
            //    {
            //        break;
            //    }

            //    numbers.Add(Convert.ToInt32(input));
            //}

            //foreach (var n in numbers.Distinct().ToList())
            //{
            //    Console.WriteLine(n);
            //}


            //const int TotalAksNumbers = 5;

            //List<int> numbers = new List<int>();

            //do
            //{
            //    Console.WriteLine("Type a number: ");
            //    int number = Convert.ToInt32(Console.ReadLine());

            //    if (numbers.IndexOf(number) != -1)
            //    {
            //        Console.WriteLine($"Can't add number {number}");
            //        continue;
            //    }

            //    numbers.Add(number);

            //} while (numbers.Count() < TotalAksNumbers);

            //numbers.Sort();

            //foreach (var n in numbers)
            //{
            //    Console.WriteLine(n);
            //}


            //Console.WriteLine("Type the name: ");
            //string name = Console.ReadLine();

            //char[] arrName = name.ToCharArray();

            //Array.Reverse(arrName);

            //foreach (var c in arrName)
            //{
            //    Console.WriteLine(c);
            //}

            //String myString = "My String";
            //char[] characters = myString.ToCharArray();

            //foreach (var c in characters)
            //{
            //    Console.WriteLine(c);
            //}



            //Console.WriteLine("Type a series of number separted by comma");

            //string input = Console.ReadLine();

            //int max = input.Split(",").ToList().Select(n => Convert.ToInt32(n)).Max();

            //Console.WriteLine(max);

            //foreach (var number in numbers)
            //{
            //    Console.WriteLine(number);
            //}

            //Random random = new Random();
            //int number = random.Next(1, 10);

            //Console.WriteLine(number);

            //int times = 0;
            //do
            //{
            //    Console.WriteLine("Try to guess the number: ");
            //    int pickcup = Convert.ToInt32(Console.ReadLine());

            //    if (number == pickcup)
            //    {
            //        Console.WriteLine("You win!");
            //        break;
            //    }

            //    times++;

            //} while (times != 4);

            //if (times == 4)
            //{
            //    Console.WriteLine("You lost!");
            //}

            //Console.WriteLine("Type the number: ");
            //int number = Convert.ToInt32(Console.ReadLine());

            //int factorial = 1;

            //for (var n = number; n>=1; n--)
            //{
            //    factorial *= n;
            //}

            //Console.WriteLine(factorial);

            //string input;

            //int sum = 0;


            //while (true)
            //{
            //    Console.WriteLine("Type the number: ");
            //    input = Console.ReadLine();

            //    if (input.ToUpper() == "OK")
            //    {
            //        break;
            //    }

            //    sum += Convert.ToInt32(input);
            //}

            //Console.WriteLine("The sum is " + sum);

            //int counter = 0;

            //for (var n = 1; n <= 100; n++)
            //{

            //    if (n % 3 == 0)
            //    {
            //        counter++;
            //    }
            //}

            //Console.WriteLine("There are " + counter + " numbers divisible by 3");


            //Console.WriteLine("Type Speed Limit: ");
            //string speedLimitInput = Console.ReadLine();

            //int speedLimit = Convert.ToInt32(speedLimitInput);


            //Console.WriteLine("Type Speed Car: ");
            //string speedCarInput = Console.ReadLine();

            //int speedCar = Convert.ToInt32(speedCarInput);

            //if (speedCar <= speedLimit)
            //{
            //    Console.WriteLine("OK");
            //}
            //else
            //{

            //    const int Km = 5;

            //    int speedDifference = speedCar - speedLimit;

            //    bool isMod = (speedDifference % Km) == 0;

            //    int divisionSpeed = speedDifference / Km;


            //    int demeritPoints = isMod ? divisionSpeed : divisionSpeed + 1;


            //    Console.WriteLine("Your demerit poits is: " + demeritPoints);

            //    if (demeritPoints > 12)
            //    {
            //        Console.WriteLine("License Suspended");
            //    }
            //}

            //Console.WriteLine("Type width: ");
            //string inputWidth = Console.ReadLine();

            //Console.WriteLine("Type height: ");
            //string inputHeight = Console.ReadLine();

            //int width = Convert.ToInt32(inputWidth);
            //int height = Convert.ToInt32(inputHeight);

            //if (height > width)
            //{
            //    Console.WriteLine("Portrait");
            //}
            //else if (width > height)
            //{
            //    Console.WriteLine("Landscape");
            //}
            //else
            //{
            //    Console.WriteLine("It's is no possible to define if image is landscape or portrait");
            //}


            //Console.WriteLine("Type number one: ");
            //string inputOne = Console.ReadLine();


            //Console.WriteLine("Type number two: ");
            //string inputTwo = Console.ReadLine();

            //int numberOne = Convert.ToInt32(inputOne);
            //int numberTwo = Convert.ToInt32(inputTwo);


            //if (numberOne > numberTwo)
            //{
            //    Console.WriteLine("Number one is greater then number two");
            //}
            //else if (numberOne < numberTwo)
            //{
            //    Console.WriteLine("Number one is less then number two");
            //}
            //else
            //{
            //    Console.WriteLine("Number one is equal number two");
            //}

            //Console.WriteLine("Type the n");

            //try
            //{
            //    int number = Convert.ToInt32(input);

            //    Console.WriteLine(number);
            //}
            //catch
            //{
            //    Console.WriteLine("Invalid");
            //}

            //var shipping = ShippingMethod.Regular;

            //switch (shipping)
            //{
            //    case ShippingMethod.Express:
            //        Console.WriteLine("You need to fill the form bellow.");
            //        break;
            //    case ShippingMethod.Regular:
            //        Console.WriteLine("All items are free to delivery.");
            //        break;
            //    case ShippingMethod.Sedex:
            //        Console.WriteLine("It's is the fast method.");
            //        break;
            //    default:
            //        Console.WriteLine("You neeed to chooose some shipping method.");
            //        break;
            //}

            //int number = 12;

            //if (number > 0)
            //{
            //    Console.WriteLine("It's true");
            //}
            //else if (number == 0)
            //{
            //    Console.WriteLine("It's is zero!");
            //}
            //else
            //{
            //    Console.WriteLine("It's false");
            //};

            //var time = 14;
            //var isNoon = time == 12 ? true : false;

            //Console.WriteLine(isNoon);

            //bool isX = true;
            //bool isY = false;

            //Console.WriteLine(isX && isY);

            //Console.WriteLine(isX || isY);

            //Console.WriteLine(!isX);

            //int number;
            //number = 42;
            //Console.WriteLine(number);

            //byte b = 4;
            //int i = b;
            //Console.WriteLine(i);

            //int i = 18;
            //byte b = (byte)i;
            //Console.WriteLine(b);

            //string number = "1234";

            //int position = Convert.ToInt32(number);

            //Console.WriteLine(position);

            //Person person = new Person();

            //person.Name = "Johni";

            //person.Introduce();

            //Person.Write("John Due");

            //Point point;

            //point.Y = 9;

            //Console.WriteLine(point.Y);

            //string name = string.Format("{0} {1}", "Johni", "Douglas");
            //Console.WriteLine(name);

            //var numbers = new int[3] { 1, 2, 3 };

            //string list = string.Join(", ", numbers);

            //Console.WriteLine(list);

            //            var message = @"

            //I'm a software enginnier at

            //Softplan

            //Brazil.

            //";
            //            Console.WriteLine(message);


            //var shippingMethod = ShippingMethod.Sedex;
            //Console.WriteLine(shippingMethod);

            //var shippingMethodID = 3;

            //var method = (ShippingMethod)shippingMethodID;
            //Console.WriteLine(method);

            //Console.WriteLine((int)method);

            //Console.WriteLine(method.ToString());

        }
    }
}
