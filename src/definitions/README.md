Defining terms:

*(termdef)[https://tdg.docbook.org/tdg/5.2/termdef.html]* markup is used for concise definitions of terms in the book:

These concise definitions should be the top level element in xml files with the 
name of the term followed by "-def.xml". Inside these elements, *firstterm*
markup should be used to indicate the term itself (see example above).

A more lengthy introduction to the term can be given in a file with the name 
of the term and ending in "-introduction.xml". Currently, it isn't settled
how this should be marked up. For now, I'm using *para*
