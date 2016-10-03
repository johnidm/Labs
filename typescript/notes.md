TypeScript(.ts) => JavaScript(.js)

http://www.typescriptlang.org/docs/tutorial.html

Intall TypeScript
	npm install -g typescript
	tsc -v

	Create the file with .ts extension 

	For compiller you need to user the commando tsc main.ts, this comando tranlate it into Java Cript version main.js

	You can use the automated task  runners such as gulp for compiler the code

	Will result in separeted files

	tsc main.ts worker.ts

	Compile all .ts files
	tsc *.ts

	Initializes a watcher process
	tsc main.ts --watch

	The  tsconfig.json file have various build settings. You can read more about tsconfig.json in http://www.typescriptlang.org/docs/handbook/tsconfig-json.html


You can read mora about Data Types in <URL>

Static Typing 

var burger: string = 'hamburger',     // String 
    calories: number = 300,           // Numeric
    tasty: boolean = true;            // Boolean

var burger = 'hamburger';

function speak(food: string, energy: number): void {
  console.log("Our " + food + " has " + energy + " calories.");
}

speak(burger, calories);

var n : number = 1

var n : any = 1
n = "bla"


Template strings

	let fullName: string = `Bob Bobbington`;
	let age: number = 37;
	let sentence: string = `Hello, my name is ${ fullName }.

	I'll be ${ age + 1 } years old next month.`

	embedded expressions are of the form ${ expr }

Arrays can be written in 
	let list: number[] = [1, 2, 3];
	let list: Array<number> = [1, 2, 3];

Tuple
	// Declare a tuple type
	let x: [string, number];
	// Initialize it
	x = ["hello", 10]; // OK
	// Initialize it incorrectly
	x = [10, "hello"]; // Erro

Enum
	enum Color {Red, Green, Blue};
	let c: Color = Color.Green;

	enum Color {Red = 1, Green, Blue};
	let c: Color = Color.Green;

	enum Color {Red = 1, Green = 2, Blue = 4};
	let c: Color = Color.Green;

Any
	let notSure: any = 4;
	notSure = "maybe a string instead";
	notSure = false; // okay, definitely a boolean

Void
	function warnUser(): void {
    	alert("This is my warning message");
	}

Type assertions - like a type cast in other languages
	let someValue: any = "this is a string";
	let strLength: number = (<string>someValue).length;

	let someValue: any = "this is a string";
	let strLength: number = (someValue as string).length;


Interface
	Interfaces are used to type-check

	interface Food {
	    name: string;
	    calories: number;
	}

	function speak(food: Food): void{
	  console.log("Our " + food.name + " has " + food.calories + " calories.");
	}

	var ice_cream = {
	  name: "ice cream", 
	  calories: 200
	}

	speak(ice_cream);

	interface SquareConfig {
    	color?: string;
    	width?: number;
	}

	"? not required"

	interface Point {
    	readonly x: number;
    	readonly y: number;
	}
	let p1: Point = { x: 10, y: 20 };
	p1.x = 5; // error!

	that of explicitly enforcing that a class meets a particular contract

	interface ClockInterface {
	    currentTime: Date;
	    setTime(d: Date);
	}

	class Clock implements ClockInterface {
	    currentTime: Date;
	    setTime(d: Date) {
	        this.currentTime = d;
	    }
	    constructor(h: number, m: number) { }
	}

Classes

	class Greeter {
    greeting: string;
    constructor(message: string) {
        this.greeting = message;
    }
	    greet() {
	        return "Hello, " + this.greeting;
	    }
	}

	class Animal {
	    name: string;
	    constructor(theName: string) { this.name = theName; }
	    move(distanceInMeters: number = 0) {
	        console.log(`${this.name} moved ${distanceInMeters}m.`);
	    }
	}

	class Snake extends Animal {
	    constructor(name: string) { super(name); }
	    move(distanceInMeters = 5) {
	        console.log("Slithering...");
	        super.move(distanceInMeters);
	    }
	}

	Public, private, and protected modifiers

	Public by default

	class Animal {
    public name: string;
    public constructor(theName: string) { this.name = theName; }
    public move(distanceInMeters: number) {
        console.log(`${this.name} moved ${distanceInMeters}m.`);
    }
}


let greeter = new Greeter("world");

	Abstract Classes

	abstract class Animal {
	    abstract makeSound(): void;
	    move(): void {
	        console.log("roaming the earth...");
	    }
	}

Arrow function 
	var inc = (x) => x + 1;

Union Type
	function formatCommandline(command: string[]|string) {

Tuple Type

Type Alias


Modules



Enum

function print(stark: Start) {
	
}

class Stark {
	name: string = "Phill";

	static castle: string = "Winterfell";

	constructor () {
		this.name = 'Kain';
	}

	hello(person: string) {
		console.log("Hello " + person);
	}
}

console.log(Stark.castle);
var ned = new Stark();
ned.hello("Johni");

class Person extend People {
	....
}

TypeScript modules

module Utility {
	export class useful {
		fucntion apply() {
			....
		}
	}
}

/// <reference path="file.ts" />
var use = new Utility.userfull();
use.apply()
You need to combine de files


export module Example{
    const customer = {};

    export function myExample(customer: string) {
        // How to reference the module level customer object here?
        // Is there a standard to make these module level variables Pascal Case to prevent this overlap?
    }
}









