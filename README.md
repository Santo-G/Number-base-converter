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
_Enter two numbers in format: {source base} {target base} (To quit type /exit) > 10 7_

_Enter number in base 10 to convert to base 7 (To go back type /back) > 0.234_

_Conversion result: 0.14315_

_Enter number in base 10 to convert to base 7 (To go back type /back) > 10.234_

_Conversion result: 13.14315_

_Enter number in base 10 to convert to base 7 (To go back type /back) > /back_

_Enter two numbers in format: {source base} {target base} (To quit type /exit) > 35 17_

_Enter number in base 35 to convert to base 17 (To go back type /back) > af.xy_

_Conversion result: 148.g88a8_

_Enter number in base 35 to convert to base 17 (To go back type /back) > aaaa.0_

_Conversion result: 54e36.00000_

_Enter number in base 35 to convert to base 17 (To go back type /back) > /back_

_Enter two numbers in format: {source base} {target base} (To quit type /exit) > 21 10_

_Enter number in base 21 to convert to base 10 (To go back type /back) > 4242_

_Conversion result: 38012_

_Enter number in base 21 to convert to base 10 (To go back type /back) > 4242.13a_

_Conversion result: 38012.05550_

_Enter number in base 21 to convert to base 10 (To go back type /back) > /back_

_Enter two numbers in format: {source base} {target base} (To quit type /exit) > /exit_

## Contributing
<a href="https://github.com/Santo-G">
 <img alt="Santo-G" width="90" height="90" src="https://avatars.githubusercontent.com/u/77076220?v=4" />
</a>
