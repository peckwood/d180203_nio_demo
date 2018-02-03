package com.raidencentral.d180203_nio_demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String flowPicturePathString = "D:/d/flower.jpg";
    	String flowPicturePathString2 = "D:/d/flower2.jpg";
    	Path  flowPicturePath= Paths.get(flowPicturePathString);
    	Path  flowPicturePath2= Paths.get(flowPicturePathString2);
    	byte[] allBytes = Files.readAllBytes(flowPicturePath);
    	Files.write(flowPicturePath2, allBytes);
    }
}
