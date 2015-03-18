//   nerd4java - A java library which provides a programmable interface to NERD
//               http://nerd.eurecom.fr
//
//   Copyright 2012
//
//   Authors:
//      Giuseppe Rizzo <giuse.rizzo@gmail.com>
//
// This program is free software; you can redistribute it and/or modify it
// under the terms of the GNU General Public License published by
// the Free Software Foundation, either version 3 of the License, or (at 
// your option) any later version. See the file Documentation/GPL3 in the
// original distribution for details. There is ABSOLUTELY NO warranty.


package fr.eurecom.nerd.client.schema;

public class Document {
    private Integer idDocument;
    private String text;
    private String language;
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Integer getIdDocument() {
        return idDocument;
    }
    public void setIdDocument(Integer idDocument) {
        this.idDocument = idDocument;
    }
    public String getLanguage() {
    	return language;
    }
    public void setLanguage(String language) {
    	this.language = language;
    }

}
