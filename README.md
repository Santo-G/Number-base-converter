<p align="center">
<img src="JetBrains Academy.png" alt="JetBrainsAcademy logo" width="1023">
</p>

# Number Base Converter
This project consist of implementing a simple Kotlin number base converter.
This project was developed during the JetBrains Academy course to improve knowledge on Kotlin basics.

## Table of Contents
- [Project description](#project-description)
- [Example](#example)
- [Contributing](#contributing)

## Project description
The program will read the user's source base and target radix for the conversion. 
Then it will read the number to convert.
After that, the program will output the given number in the corresponding base, waiting for another number to be 

converted or another type of input from user.

The program should have a two-level menu and the commands guide the user through the use of converter.

When the program gets a fractional number, it should output its representation in the target base rounded to 5 

characters (digits or letters) in the fractional part. If there is no fractional part in the initial number, it should 

be omitted in the resulting number, too.

## Example
Enter two numbers in format: {source base} {target base} (To quit type /exit) > 10 7
Enter number in base 10 to convert to base 7 (To go back type /back) > 0.234
Conversion result: 0.14315

Enter number in base 10 to convert to base 7 (To go back type /back) > 10.234
Conversion result: 13.14315

Enter number in base 10 to convert to base 7 (To go back type /back) > /back

Enter two numbers in format: {source base} {target base} (To quit type /exit) > 35 17
Enter number in base 35 to convert to base 17 (To go back type /back) > af.xy
Conversion result: 148.g88a8

Enter number in base 35 to convert to base 17 (To go back type /back) > aaaa.0
Conversion result: 54e36.00000

Enter number in base 35 to convert to base 17 (To go back type /back) > /back

Enter two numbers in format: {source base} {target base} (To quit type /exit) > 21 10
Enter number in base 21 to convert to base 10 (To go back type /back) > 4242
Conversion result: 38012

Enter number in base 21 to convert to base 10 (To go back type /back) > 4242.13a
Conversion result: 38012.05550

Enter number in base 21 to convert to base 10 (To go back type /back) > /back

Enter two numbers in format: {source base} {target base} (To quit type /exit) > /exit

## Contributing
<a href="https://github.com/Santo-G">
 <img alt="Santo-G" width="90" height="90" src="https://avatars.githubusercontent.com/u/77076220?v=4" />
</a>
