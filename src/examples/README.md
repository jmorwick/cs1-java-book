Illustrative Examples:

Each filename should end in "-example.xml" and begin with concise but distinguishing name. Only use numbers to distinguish examples
when the second/third/etc example are simply re-iterating the same point and not introducing a unique scenario. 

The top level element in the document should be a [example](https://tdg.docbook.org/tdg/5.2/example.html) tag. All 
sourcecode should be inside a [programlisting](https://tdg.docbook.org/tdg/5.2/programlisting.html) tag. 

For examples containing a small program:
If the code in the example can stand alone (that is, it can be correctly interpreted by jshell, possibly requiring another 
script to be run first), it should reference an actual jshell source file (in this directory) with the code in it. 
The jshell file should have the same beginning name as the example xml file, and if there is more than one code snippet, 
each succesive file should end in ---2.jsh, ---3.jsh, etc..

For examples containing jshell interactions:
Use the [screen](https://tdg.docbook.org/tdg/5.2/screen.html) tag containing the interactions.
