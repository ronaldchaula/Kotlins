#   KOTLIN BASICS
- Kotlin is the better Java, but with different kinds of syntax, it copies the best features from many other languages like C#. Groovy, Scala, Groovy and Java itself where its origins came from
- Kotlin was made by Jetbrains and first released in 2011, it was later name-first citizen programming language for an android platform during 2019
- Kotlin can compile to bytecode a java virtual machine code directly translated during the program execution, it can also compile to js and wasm, for another platform such as Mac and iOS it can compile to native binaries, hence giving rise to the new language that can be used to build native apps.
- Kotlin supports multiple paradigms such as 
1. Object oriented
2. Imperative
3. Functional etc

## Kotlin syntax

- what we will cover

- [ ] Types and variables
- [ ] Conditions
- [ ] Loops
- [ ] Functions
- [ ] Classes
- [ ] Classes and Objects
- [ ] Interface,inheritance
- [ ] Projects

>   ```kotlin
> // double slashes in Kotlin means a single line comment, hence this whole line wont be read by the compiler

> "fun" is a key word that's used to define functions in Kotlin

>   ```kotlin
>    fun main(){
>    
>   }


>"main" is a name of an entry point for any console app written in Kotlin and in between the code blocks { } is where all the code that will be executed have to go in.

>   ```kotlin
>    fun main(){
>    prinln()
>   }
>   

> Println() is a function that is called, and we pass the arguements that is then shown on the console as an output, so simply speaking, whatever is passed between the braces will be shown as an output when the application is executed example
> 
>   ```kotlin
>    fun main(){
>    prinln("Hello world")
>   }
- Keywords are reserved for a language use and cannot be used as variable name or constant name 'fun' is a keyword
- A function is collection of code that execute as a single unit to complete a single task, we have already used two predefin functions which are `main()` and `println()`
>```kotlin
> /*
> anything written in between here is a multiline comment
> */

## Variables and Types
### Types (Data types)
- Data/Values in a program are grouped in types, each type supports what operations can be performed on it and what space is reserved for it. Kotlin has several types that are broken down based on the data that is being dealt with. For example, numbers, strings and other user defined types (Classes)

#### Numbers

- Numbers are numerical values that are in decimal(fraction) or whole numbers, example of these numerical values includes whole numbers such as 1,3,15 and fraction values such as 3.14, 2.5 and etc.

#### signed and unsigned numbers
Signed stands for values with negative values and unsigned stands for values with non-negative values

#### Whole numbers

Whole numbers are numbers without a decimal point, these are commonly known as integers in mathematics. Kotlin has 4 categories of these types of numbers
1. *Byte* which is 8bits in size hence supports 2^8 hence supports a number from -128 to 127
2. *Short,* which is 16-bit number that supports numbers from -2^16 to (2^16)-1
3. *Int* is a 32-bit number that support numbers that follow into a range of 2^32 to (2^32)-1 that are whole in structure
4. *Long* is a 64bit number, that supports numbers that fall into a range of 2^64 to (2^64)-1 in a range.

#### Fractional values
These are numbers that have a fractional part; by a fractional part we mean they have a decimal point. These numbers include a pie number and other fractional values. float values have only two types which are also differed in number of decimal places

1. *Float*, floating number is a number that supports up to 10 decimal places and only occupied about 32bits of the memory size when used
2. *Double* is another type that supports up to 64-bits of and has the highest expression

#### Letters and Words/Sentences

Letters and words a great part of the programming experience when building applications software for whatever the use. Kotlin express these values depending on the use case

1. *Char* which stands for the word Character, is a single letter; a character is expressed when it is enclosed in a single quote example below
```kotlin
val gender:Char = 'm'
```
The above code shows an identifier with the name 'gender' of type Char assigned a value 'm' which is actually a letter or best called a character in this sense, the characters can are actually a unicode part

2. *String* is anything written in between double quotes; strings have a couple of methods that can manipulate them. It is actually the most interactive type in comparison to other types.
```kotlin
val name: String = "firstName lastName" 
```

### Booleans

These are values that are used to test truth value or state of decisions, for example `true` and `false` are the values of the Boolean

### Declaring Values and Variables

#### Values
If you plan to store values that won't change, Kotlin allows you to define those with the keyword `val` which stands for value. These values can only be initialized once and can't be reassigned again.
```kotlin
//the val keyword is used to define a single time declared value identifier store
val value:String = "0"
```

### Variables
Variables are declared with the keyword `var` they allow values to be reassigned unlike the 

```kotlin
//the var keyword is used to define a variable that might change values during program execution, the identifier variable will be assigned multiple value throughout the program life
var variable:String = "0"
```