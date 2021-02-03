Git was not recognizing that our .pfx ssl cert file was binary, and was corrupting it when it applied the autocrlf conversion.

The suggestions found in the git documentation for workarounds to this problem were not workarounding effectively.

In order to fix this, I renamed the .pfx to .bin.  Now git recognizes the cert file as binary and the ssl implementation still reads it ok.

So, whoever updates the ssl cert in the future will need to know to rename the file...  unless we can figure out a better solution in the meantime.