#Defining terms#

Term definition files include a concise definition of a term and a brief elaboration of that definition (no examples). 

Each term definition block should begin with a [para](https://tdg.docbook.org/tdg/5.0/para.html). I'm considering finding a more appropriate or custom tag in the future.

This tag should include all of the following:
```
<para xmlns="http://docbook.org/ns/docbook" version="5.0" xml:id="te.NAME">
```
With the name of the term in place of NAME. 

*[termdef](https://tdg.docbook.org/tdg/5.0/termdef.html)* markup is used for concise definitions of terms in the book. These tags should have an id with the same name and *term* as the prefix.
