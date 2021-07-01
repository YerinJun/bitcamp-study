package com.eomcs.lang;

//  package com.eomcs.lang;
//  /src/main/java/com/eomcs/lang/Hello3.java
//  package com.eomcs.ok;
//  /src/main/java/com/eomcs/ok/Hello3.java
//  package com.eomcs;
//  /src/main/java/com/eomcs/Hello3.java
//  package com;
//  /src/main/java/com/Hello3;
//  /src/main/java/Hello3;

/*
        $ javac -d bin src/main/java/com/eomcs/lang/Hello3.java
            /bin/com/eomcs/lang/Hello3.class
        $ javac -d bin/main src/main/java/com/eomcs/lang/Hello3.java
            /bin/main/com/eomcs/lang/Hello3.class
        $ javac -d bin/main src/main/java/com/eomcs/Hello3.java
            /bin/main/com/eomcs/Hello3.class
        $ javac -d bin/main src/main/java/com/Hello3.java
            /bin/main/com/Hello3.class
        $ javac -d bin/main/ src/main/java/Hello3/java
            /bin/main/Hello3.class
*/

class Hello3 {
    public static void main(String[] args) {
        System.out.println("Hello, World3!");
    }
}

