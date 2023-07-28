
JAVA 11 new features:

1) Open JDK

2) New Methods in String - isBlank/lines/strip/stripLeading

3) New File methods - Files.writeString/Files.readString

4) Collection to Array - 

       List sampleList = Arrays.asList("Java", "Kotlin");
       String[] sampleArray = sampleList.toArray(String[]::new);
5) Running java files

        Before :
        $ javac HelloWorld.java
        $ java HelloWorld
        Hello Java 8!
        
        Now: 
        $ java HelloWorld.java

6) Java flight Recorder: profiling tool to gather diagnostic and profiling data 

    
