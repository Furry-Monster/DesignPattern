package org.DesignPattern.Creat.Builder;

public class URLBuilder {
    private String url;

    public URLBuilder builder(){
        url = "";
        return this;
    }

    public URLBuilder setProtocol(String protocol){
        url += protocol + "://";
        return this;
    }

    public URLBuilder setDomain(String domain){
        url += domain;
        return this;
    }

    public URLBuilder setPath(String path){
        url += "/" + path;
        return this;
    }

    public URLBuilder setQuery(String query){
        url += "?" + query;
        return this;
    }

    public String build(){
        return url;
    }
}
