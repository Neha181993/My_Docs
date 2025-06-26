public class main{
	public static void main(String[] args){
		System.out.println("Hello")
	}
}


Type name_ofvariable = var
String name = "John";
System.out.println(name)

int myNum = 15;
myNum = 20;
System.out.println(myNum);

//Constant variable declaration it's unchangeble
final int mynum1 = 20;


int myNum = 5;
float myFloat = 5.44;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";



String name = "John";
System.out.prinln("Hello" + name);

String firstName = "Neha";
String lastName = "Kolsukar";
String fullName = firstName + lastName;
System.out.println(fullName);

int x = 5;
int y = 6;
System.out.println(x + y);




char myGrade = 'B';
System.out.println("myGrade")


String txt = "ABCD"
System.out.println(txt.length());
System.out.println(txt.indexOf("AB"));


String firstname = "John";
String lastname = "Doe";
System.out.println(firstname +""+lastName);


System.out.println(firstname.concat(lastname));



int myAge = 25;
int votingAge = 18;

if (myAge > votingAge){
	System
	
} else{
	
}


if (){
	
} else if(){
	
}else{
	
}



public class Main {
	public static void main(String[] args){
		int num = 4;
		switch(num){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println();
			case 3:
				System.out.printn();
			case 7:
				System.out.println();
				break;
			default:
			
				
			
		}
	}
}



int i = 0;
while(i < 5)(
	System.out.println("");
}



int i = 0;
do{
	System.out.println(i);
	i++;
} while(i<5);



int countdown = 3;
while(countdown < 3){
	System.out.println(countdown);
	countdown--;
}

System.out.println("It's a message for you");



int dice = 1;
while(dice <= 5){
	if{
			System
	}
	else{
		
	}
	dice = dice + 1;
}


for (int i=0; i<=10; i++){
	System.out.println(i);
}


for(int i=0; i<2; i++){
	System.out.println(i);
	
	for(int j=0; j<5; j++ ){
		System.out.println(j)
	}
}

String[] cars = {"Volvo","BMW","Mazda","Ford"};
for(String i: cars){
	
}

String cars = {};

int[] num = {};


int[][] num ={{1,2,3,4},{5,6,7}}
for(int i=0; i< num.length; i++){
	for(int j=0; j<num[i].length; j++){
		System.out.println(num[][]);
	}
}



public class Main{
	Static void myMethod(String var){
		System.out.println("This is " + var)
		
	}
	
	public static void main(String[] args){
		myMethod("Name");
		myMethod("FirstName");
		myMethod("LastName");
		
	}
}




Recusrion:- 


public class Main{
	
	public static int sum(int k){
		if (k>0){
			return k + sum(k-1);
		}
		else{
			return 0;
		}
		
	}

	public static void main(String[] args){
		int result = sum(10);
		System.out.println(result);
	}
}





public class Main{
	int x=5;
	
	public static void main(String[] args){
		Main obj = new Main();
		System.out.println(obj.x);
	}
}


public class Main{
	int x = 10;
	
	
	public static void main(String[] args){
		Main obj = new Main(); // Object of main class
		Main obj1= new Main(); //Object of main class
		
		obj1.x = 10
		
		System.out.println(obj.x);
		System.out.prnitln(obj1.x);
		
	}
}


public class Main{
	String name = "Neha";
	String lastName = "Kolsukar";
	int age = 32;
	
	public static void main(String[] args){
		Main myObj = new Main();
		System.out.println("Name" + myObj.name);
		System.out.println("lastName" + myObj.lastName);
		System.out.println("My age" + myObj.age);
	}
}




public class Main{
	static void myMethod(){
		
	}
	
	public static void main(String[] args){
		
	}
}




//Static method can be called without creating it's object.
//For public method object nedds to be created.



public class Main{
	
	static void myStaticMethod(){
		
	}
	
	public void myPublicMethod(){
		
	}
	
	
	public static void Main(String[] args){
		myStaticMethod();// static class can be called without creating an object
		
		Main obj = new Main();
		obj.myPublicMethod();
		
	}
}



//final keyword created which can't be reassigned
public class Main{
	final int x = 10;
	final double Pi = 3.14;
	
	public static void main(String[] args){
		Main myObj = new Main();
		myObj.x = 50;
		
		
	}
}


abstract class Main{
	public String fname = "John";
	public int age = 24;
	public abstract void study();// abstract not implemented
	
}

class Student extend Main{
	public int gradyear = 2015;
	public void study(){
		System.out.prinln("Study");
	}
}

class second{
	public static void main(String[] args){
		Student myObj = new Student();
		System.out.prinln("gradyear"' + myObj.gradyear);
		myObj.study();
		
	}
}



//Encapsulation

public class Person{
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String NewName){
		this.name = NewName;
	}
}


//Scanner

import java.util.Scanner

class MyClass{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");
		
		String userName = myObj.nextLine();
		System.out.println("UserName is:" + userName);
	}


//Polymorphism known as many forms
class Animal{
	public void animalSound(){
		System.out.println("This is animal sound");
	}
}

class pig extend Animal{
	public void animalSound(){
		System.out.println("This is what pig says");
	}
	
}

class dog extend Animal{
	public void animalSound(){
		System.out.println("This is how dog barks");
	}
}

class Main{
	public static void Main(String[] args){
		Animal myAnimalobj = new Animal();
		Animal myPigObj = new pig();
		Animal myDog = new Dog();
		
		myAnimalobj.animalSound();
		myPigObj.animalSound();
		myDog.animalSound();
		
	}
	
}

//Abstract Classes and Methods

abstract class Animal{ // abstract class
	public abstract void animalSound(); // abstract method
	public void sleep(){ // normal
		System.out.println("Zzzzzzz");
	}
}


class pig extends Animal{
	public void animalSound(){
		System.out.prinln("This is abstract method implementation");
		
	}
}

class Main{
	public static void main(STring[] args){
		Pig myPigObj = new pig();
		myPigObj.animalSound();
		myPigObj.sleep();
	}
}


//interface interface is a completely "abstract class" 

interface Animal(){
	public void animalSound();
	public void run();
}


class pig implements Animal{
	public void animalSound(){
		System.out.prinln("This is pig's sound");
	}
	
	public void sleep(){
		System.out.println("This is time to sleep");
	}
	
}	

class Main(){
	public static void main(String[] args){
		pig myPig = new pig();
		myPig.animalSound();
		myPig.sleep();
	}
}


enum Level{
	Low, 
	High, 
	Medium
}

Level myVar = Level.Medium;




import java.util.ArrayList;
import java.util.LinkedList;

public class Main{
	public static void main(String[] args){
		ArrayList<String> cars = new ArraList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Volvo");
		list.add("Maruti");
		System.out.println(list);
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		
		
	}
}

//ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class Main(){
	public static void main(String[] args){
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(12);
		
		Collections.sort(myNumbers);
		
		for(int i: myNumbers){
			System.out.println(i);
		}
		
	}
}

//Removing items from a Collection

import java.util.ArrayList;
import java.util.Iterator;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayLlist<Integer>();
		numbers.add(12);
		numbers.add(10);
		numbers.add(2);
		numbers.add(35);
		
		Iterator<Integer> it = numbers.Iterator();
		while(it.hasNext()){
			Integer i = it.next();
			if(i<10){
				i.remove();
			}
		}
		System.out.println(numbers);
	}
}



// Try catch and Finally in JAVA

public class Main{
	public static void main(String[] args){
		try{
			int[] myNumbers = {1,2,3,4};
			System.out.println(myNumbers[10]);
			
		} catch(Exception e){
			System.out.prinln("Something went wrong");
			
		} finally{
			System.out.println("The try catch is finished.")
		}
	}
}


//Exception in JAVA
public class Main{
	static void checkAge(int age){
		if(age < 18){
			throw new ArithmeticException("Access denied - upi must be at least 18");
		}
		else {
			System.out.println("Access Granted);			
		}
	}	
	public static void main(String[] args){
		checkAge(15)
	}
}

//JAVA Threads
public class Main extends Thread{
	public void run(){
		System.out.println("This code is running in a thread.")
}

//JAVA Runnable
public class Main implements Runnable{
	public void run(){
		
	}
}

//Running Threads- amount value will be different evry time you run below program
public class Main extends Thread{
	public static int amount = 0;
	
	public static void main(String[] args){
		Main thread = new Main();
		thread.start();		
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}
	
	public void run(){
		amount++;
	}
}

//isAlive method
public class Main extends Thread{
	public static int amount = 0;
	
	public static void main(String[] args){
		Main thread = new Main();
		thread.start();
		
		//Check if thread is alive
		while(thread.isAlive()){
			System.out.println("Waiting....");
	}
	 System.out.println("Main:" + Amount);
	 amount++;
	 System.out.println("Main:" + Amount):
	
	public void run(){
		amount++;
	}
	
}

//JAVA Lambda Expression
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(4);
		
	}



// Read spring initialization
// Read about Bean
// Read about controllers 
// @Restcontroller
// @RequestMapping
// Spring web dependency in spring initializer
// SpringDev Tool - Dependency in spring initializer
// MySQLDriver - Dependency in spring initializer
// SpringDataMongoDB - Dependency in spring initializer
// H2 Database - Dependency in spring initializer
// Spring Security - Dependency in spring initializer
// Thymlyf - Dependency in spring initializer



/////////Dependency
//Springweb
//SpringdataJPA
//MYSql driver
//H2 Database
//Spring webdeveloper
//lombok - getters/setters encapsulation
//SpringBoot Actuator


-- Postman extension
-- Springboot dashborad Tools
-- Springboot dashborad extension on VSCode
-- Eclipse folder structure Application.properties setup a port 9090
-- cntl . to create employee once you 
-- @Data
-- @NoArgConstructor
-- @AllArgConstructor
-- @Autowired -- Injecting dependency in class
-- @GetMapping
-- @PostMapping
-- @DeleteMapping
-- @Restcontroller
-- @Responsestatus

-- Under resources folder - application.properties(application.yml) files 
	-- Server Configuration
	-- Spring Datasource (Database) Configuration
	-- JPA / Hibernate Configuration
	-- Logging
	-- Custom Properties
	
	