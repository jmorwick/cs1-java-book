#!/bin/bash
docbook=/usr/share/xml/docbook/stylesheet/docbook-xsl/fo/docbook.xsl 
set -e
cp src/fig/*png /tmp
xmllint --xinclude src/primary-book/fulltext.xml -o /tmp/out.xml
xsltproc $docbook /tmp/out.xml > /tmp/out.fo
fop -fo /tmp/out.fo book.pdf
