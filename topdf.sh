#!/bin/bash
#docbook=/usr/share/xml/docbook/stylesheet/docbook-xsl-ns/fo/docbook.xsl 
cp src/fig/*png /tmp
xmllint --xinclude src/primary-book/fulltext.xml -o /tmp/out.xml
xsltproc /Applications/Oxygen\ XML\ Editor/frameworks/docbook/xsl/fo/docbook.xsl /tmp/out.xml > /tmp/out.fo
fop -fo /tmp/out.fo book.pdf
