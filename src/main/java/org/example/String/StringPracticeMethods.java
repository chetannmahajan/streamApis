package org.example.String;

public class StringPracticeMethods {

    public static void main(String args[]){
        String s3 = "hello1The1re/auth-callback".split("/auth-callback")[0];
         s3 = "hello1The1re";

        // ═══════════════════════════════════════════════════════════
        //  GROUP 1 : SEARCH  (find position of char/substring)
        // ═══════════════════════════════════════════════════════════

        // ─── indexOf ───────────────────────────────────────────────
        System.out.println(s3.indexOf(1));               // -1  → Unicode 1 not found
        System.out.println(s3.indexOf("1"));             // 5   → first "1" at index 5
        System.out.println(s3.indexOf('1', 3));          // 5   → search '1' starting from index 3
        System.out.println(s3.indexOf(101, 5));          // 101='e', finds 'e' from index 5 → 8
        System.out.println(s3.indexOf('t', 3, 5));       // search 't' between index 3-5 → -1  (java 21)
        System.out.println(s3.indexOf(102, 2, 5));       // 102='f', not found in range → -1  (java 21)

        // ─── lastIndexOf ───────────────────────────────────────────
        System.out.println(s3.lastIndexOf(2012));        // -1  → Unicode 2012 not in string
        System.out.println(s3.lastIndexOf("hel"));       // 0   → last occurrence of "hel" starts at 0
        System.out.println(s3.lastIndexOf(101, 3));      // 101='e', search backwards from index 3 → 1
        System.out.println(s3.lastIndexOf("hello", 3));  // last "hello" ending at or before index 3 → 0

        // ═══════════════════════════════════════════════════════════
        //  GROUP 2 : INFO  (size, character at position, emptiness)
        // ═══════════════════════════════════════════════════════════

        // ─── length ────────────────────────────────────────────────
        System.out.println(s3.length());                 // 12

        // ─── charAt ────────────────────────────────────────────────
        System.out.println(s3.charAt(0));                // 'h'
        System.out.println(s3.charAt(6));                // 'T'

        // ─── isEmpty / isBlank ─────────────────────────────────────
        System.out.println("".isEmpty());                // true  → length == 0
        System.out.println("  ".isEmpty());              // false → has space characters
        System.out.println("  ".isBlank());              // true  → only whitespace (java 11)
        System.out.println(s3.isBlank());                // false

        // ═══════════════════════════════════════════════════════════
        //  GROUP 3 : EXTRACT  (pull out a piece of the string)
        // ═══════════════════════════════════════════════════════════

        // ─── substring ─────────────────────────────────────────────
        System.out.println(s3.substring(5));             // "1The1re"   → from index 5 to end
        System.out.println(s3.substring(0, 5));          // "hello"     → from 0 (inclusive) to 5 (exclusive)

        // ═══════════════════════════════════════════════════════════
        //  GROUP 4 : CHECK  (boolean tests on the string)
        // ═══════════════════════════════════════════════════════════

        // ─── contains ──────────────────────────────────────────────
        System.out.println(s3.contains("The"));         // true
        System.out.println(s3.contains("world"));       // false

        // ─── startsWith / endsWith ─────────────────────────────────
        System.out.println(s3.startsWith("hello"));     // true
        System.out.println(s3.startsWith("The", 6));    // true  → check "The" starting at index 6
        System.out.println(s3.endsWith("re"));          // true
        System.out.println(s3.endsWith("The"));         // false

        // ─── equals / equalsIgnoreCase ─────────────────────────────
        System.out.println(s3.equals("hello1The1re"));        // true
        System.out.println(s3.equals("HELLO1THE1RE"));        // false
        System.out.println(s3.equalsIgnoreCase("HELLO1THE1RE")); // true

        // ─── matches ───────────────────────────────────────────────
        System.out.println(s3.matches("[a-zA-Z0-9]+"));  // true  → only letters and digits
        System.out.println(s3.matches("[a-z]+"));        // false → has uppercase letters

        //Here + is one or more
        //Here * is zero or more
        //Here ? is zero or one
        //Here {3} exactly 3
        //Here {2,3} 2 to 4

        // ═══════════════════════════════════════════════════════════
        //  GROUP 5 : COMPARE  (ordering / equality comparison)
        // ═══════════════════════════════════════════════════════════

        // ─── compareTo / compareToIgnoreCase ─────────────────────── This is works on Lexicographically
        System.out.println(s3.compareTo("hello1The1re"));      // 0   → equal
        System.out.println(s3.compareTo("hello1The1rf"));      // negative → s3 comes before lexicographically
        System.out.println(s3.compareToIgnoreCase("HELLO1THE1RE")); // 0

        // ═══════════════════════════════════════════════════════════
        //  GROUP 6 : TRANSFORM  (return a modified copy of the string)
        // ═══════════════════════════════════════════════════════════

        // ─── toUpperCase / toLowerCase ─────────────────────────────
        System.out.println(s3.toUpperCase());            // "HELLO1THE1RE"
        System.out.println(s3.toLowerCase());            // "hello1the1re"

        // ─── trim / strip ──────────────────────────────────────────
        String withSpaces = "  hello  ";
        System.out.println(withSpaces.trim());           // "hello"   → removes leading/trailing spaces
        System.out.println(withSpaces.strip());          // "hello"   → same but Unicode-aware (java 11)
        System.out.println(withSpaces.stripLeading());   // "hello  " → removes only leading spaces
        System.out.println(withSpaces.stripTrailing());  // "  hello" → removes only trailing spaces

        // ─── replace ───────────────────────────────────────────────
        System.out.println(s3.replace('1', '!'));        // "hello!The!re"  → replace char
        System.out.println(s3.replace("1", "#"));        // "hello#The#re"  → replace string
        System.out.println(s3.replaceFirst("[0-9]", "*")); // "hello*The1re" → replace first match of regex
        System.out.println(s3.replaceAll("[0-9]", "*")); // "hello*The*re"  → replace all regex matches

        // ─── concat / repeat ───────────────────────────────────────
        System.out.println(s3.concat(" World"));         // "hello1The1re World"
        System.out.println(s3 + " World");               // same result
        System.out.println("ab".repeat(3));              // "ababab" (java 11)

        // ─── intern ────────────────────────────────────────────────
        String s4 = new String("hello1The1re").intern();  // puts in String pool
        System.out.println(s3 == s4);                     // true if s3 is also from pool

        // ═══════════════════════════════════════════════════════════
        //  GROUP 7 : SPLIT / JOIN  (break apart or combine strings)
        // ═══════════════════════════════════════════════════════════

        // ─── split ─────────────────────────────────────────────────
        String[] parts = s3.split("1");                  // split by "1"
        for (String part : parts) {
            System.out.println(part);                    // "hello", "The", "re"
        }
        String[] limitedParts = s3.split("1", 2);       // split max 2 parts
        for (String part : limitedParts) {
            System.out.println(part);                    // "hello", "The1re"
        }

        // ─── join ──────────────────────────────────────────────────
        System.out.println(String.join("-", "a", "b", "c"));     // "a-b-c"
        System.out.println(String.join(", ", parts));             // "hello, The, re"

        // ═══════════════════════════════════════════════════════════
        //  GROUP 8 : CONVERT  (change to/from other types)
        // ═══════════════════════════════════════════════════════════

        // ─── valueOf ───────────────────────────────────────────────
        System.out.println(String.valueOf(123));         // "123"  → int to String
        System.out.println(String.valueOf(true));        // "true" → boolean to String
        System.out.println(String.valueOf('x'));         // "x"    → char to String

        // ─── toCharArray ───────────────────────────────────────────
        char[] chars = s3.toCharArray();
        System.out.println(chars[0]);                    // 'h'
        System.out.println(chars.length);                // 12

        // ═══════════════════════════════════════════════════════════
        //  GROUP 9 : FORMAT  (build strings with placeholders)
        // ═══════════════════════════════════════════════════════════

        // ─── formatted (java 15) ───────────────────────────────────
        String msg = "Name: %s, Age: %d".formatted("Alice", 30);
        System.out.println(msg);                          // "Name: Alice, Age: 30"

        // ─── String.format (classic) ───────────────────────────────
        System.out.println(String.format("Hello %s!", "World")); // "Hello World!"

        // ═══════════════════════════════════════════════════════════
        //  GROUP 10 : STREAM  (process string as a stream)
        // ═══════════════════════════════════════════════════════════

        // ─── chars (java 9) ────────────────────────────────────────
        s3.chars().forEach(c -> System.out.print((char) c + " ")); // h e l l o 1 T h e 1 r e
        System.out.println();

        // ─── lines (java 11) ───────────────────────────────────────
        String multiLine = "line1\nline2\nline3";
        multiLine.lines().forEach(System.out::println);  // prints each line separately



    }
}
