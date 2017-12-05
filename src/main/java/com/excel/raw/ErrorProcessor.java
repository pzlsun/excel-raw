package com.excel.raw;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXParseException;

public class ErrorProcessor extends DefaultHandler
{

    public ErrorProcessor ()
    {
	    super();
    }

    public void error (SAXParseException e) {
        System.out.println("Error: "+e.getMessage());
    }

    public void fatalError (SAXParseException e) {
        System.out.println("Fatal Error: "+e.getMessage());
    }

    public void warning (SAXParseException e) {
        System.out.println("Warning: "+e.getMessage());
    }

}