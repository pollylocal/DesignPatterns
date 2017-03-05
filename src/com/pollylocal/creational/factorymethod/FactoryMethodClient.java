package com.pollylocal.creational.factorymethod;

public class FactoryMethodClient
{
    public static void main(String[] args)
    {
        //canonical way
        DocumentFactory factory = new JsonDocumentFactory();
        Document document = factory.create("New document");
        document.addField("name", "James");
        document.addField("age", "27");
        System.out.println(document);
        
        //Modern way
        DocumentFactory modernFactory = JsonDocument::new;
        Document document1 = factory.create("New document");
        document.addField("name", "James");
        document.addField("age", "27");
        System.out.println(document);
    }
}
