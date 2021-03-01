Python 3.9.2 (tags/v3.9.2:1a79785, Feb 19 2021, 13:44:55) [MSC v.1928 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> >>> type(1)
<class 'int'>
>>> type(1L)
SyntaxError: invalid syntax
>>> type(´asdas´)
SyntaxError: invalid character in identifier
>>> type("asdas")
<class 'str'>
>>> type((4+5j))
<class 'complex'>
>>> type(True)
<class 'bool'>
>>> a=1
>>> type(a)
<class 'int'>
>>> a="asd"
>>> type(a)
<class 'str'>
>>> b-True
Traceback (most recent call last):
  File "<pyshell#10>", line 1, in <module>
    b-True
NameError: name 'b' is not defined
>>> bTrue
Traceback (most recent call last):
  File "<pyshell#11>", line 1, in <module>
    bTrue
NameError: name 'bTrue' is not defined
>>> type a
SyntaxError: invalid syntax
>>> type(a)
<class 'str'>
>>> b=True
>>> b=23
>>> type(b)
<class 'int'>
>>> 34+5
39
>>> 3
3
>>> 2//4
0
>>> 3**3
27
>>> false
Traceback (most recent call last):
  File "<pyshell#21>", line 1, in <module>
    false
NameError: name 'false' is not defined
>>> False
False
>>> False& True
False
>>> False or True
True
>>> 0 & 1
0
>>> print ("hola mundo")
hola mundo
>>> input ("Ingrese valor")
Ingrese valor4
'4'
>>> a=input ("Ingrese un número")
Ingrese un número43
>>> a
'43'
>>> int(a)
43
>>> a=int(a)
>>> a
43
>>> a=1
>>> if a==1:
	print("Hola ")
	else:
		
SyntaxError: invalid syntax
>>> else
SyntaxError: invalid syntax
>>> else:
	
SyntaxError: invalid syntax
>>> Mundo
Traceback (most recent call last):
  File "<pyshell#39>", line 1, in <module>
    Mundo
NameError: name 'Mundo' is not defined
>>> print("Hola")
Hola
>>> 
>>> 
>>> a=1
>>> if a==1:
	print("Hola ")
	
SyntaxError: multiple statements found while compiling a single statement
>>> a =1
>>> if a==1:
	print("Hola")
else:
	print("Mundo")

	
Hola
>>> for i in range(5):
	print("Hola")

	
Hola
Hola
Hola
Hola
Hola
>>> for i in range(2,7):
	print(i)

	
2
3
4
5
6
>>> lista=[1,2.5"3",True]
SyntaxError: invalid syntax
>>> lista=[1,2.5,"3",True]
>>> for (0,9)
SyntaxError: invalid syntax
>>> for(0,9):
	
SyntaxError: invalid syntax
>>> for int (0,9)
SyntaxError: invalid syntax
>>> for int (0,9):
	
SyntaxError: invalid syntax
>>> for
SyntaxError: invalid syntax
>>> for i in range(0,9):
	if i/2==o:
		print(i)

		
Traceback (most recent call last):
  File "<pyshell#69>", line 2, in <module>
    if i/2==o:
NameError: name 'o' is not defined
>>> for i in range(0,9):
	if i/2==0:
		print(i)