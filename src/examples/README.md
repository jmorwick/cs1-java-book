# Illustrative Examples

Each filename be concise but distinguishing name. Only use numbers to distinguish examples
when the second/third/etc example are simply re-iterating the same point and not introducing a unique scenario. 

The top level element in the document should be a [example](https://tdg.docbook.org/tdg/5.2/example.html) tag and should include the following:

```
<example xmlns="http://docbook.org/ns/docbook" version="5.0" xml:id="ex.NAME">
```
where NAME is the same as the filename. Additionally the example should have a title tag with a title similar to the filename.



## For examples containing a small program
If the code in the example can stand alone (that is, it can be correctly interpreted by jshell, possibly requiring another 
script to be run first), it should use a [programlisting](https://tdg.docbook.org/tdg/5.2/programlisting.html) tag. 
Inside should be an xinclude reference to an actual jshell source file (in this directory) with the code in it (use 
parse="text/plain" attribute to avoid validation problems). 
The jshell file should have the same beginning name as the example xml file. 

## For examples containing jshell interactions:
Use the [screen](https://tdg.docbook.org/tdg/5.2/screen.html) tag containing the interactions. Use appropriate markup inside of the screen tag to label user input, jshell responses, prompts, etc..
