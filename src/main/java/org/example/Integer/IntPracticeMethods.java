package org.example.Integer;

public class IntPracticeMethods {

    public static void main(String args[]){

        int a = 42;
        int b = -17;

        // ═══════════════════════════════════════════════════════════
        //  GROUP 1 : PARSE  (String → int / Integer)
        // ═══════════════════════════════════════════════════════════

        // ─── parseInt (returns primitive int) ──────────────────────
        System.out.println(Integer.parseInt("123"));          // 123   → decimal String to int
        System.out.println(Integer.parseInt("-45"));          // -45   → handles sign
        System.out.println(Integer.parseInt("FF", 16));       // 255   → base 16 (hex)
        System.out.println(Integer.parseInt("1010", 2));      // 10    → base 2 (binary)
        System.out.println(Integer.parseInt("777", 8));       // 511   → base 8 (octal)
        // Integer.parseInt("12a");                            // throws NumberFormatException

        // ─── valueOf (returns Integer object, uses cache -128..127) ─
        System.out.println(Integer.valueOf("200"));           // 200   → String to Integer
        System.out.println(Integer.valueOf(100));             // 100   → int to Integer
        System.out.println(Integer.valueOf("1F", 16));        // 31    → base 16 to Integer

        // ─── decode (auto-detects base from prefix) ────────────────
        System.out.println(Integer.decode("0x1A"));           // 26    → 0x prefix = hex
        System.out.println(Integer.decode("010"));            // 8     → 0 prefix  = octal
        System.out.println(Integer.decode("100"));            // 100   → no prefix = decimal
        System.out.println(Integer.decode("#FF"));            // 255   → # prefix  = hex

        // ═══════════════════════════════════════════════════════════
        //  GROUP 2 : CONVERT  (int → String / other type)
        // ═══════════════════════════════════════════════════════════

        // ─── toString ──────────────────────────────────────────────
        System.out.println(Integer.toString(255));            // "255"   → int to String
        System.out.println(Integer.toString(255, 16));        // "ff"    → to hex String
        System.out.println(Integer.toString(10, 2));          // "1010"  → to binary String

        // ─── toBinaryString / toHexString / toOctalString ─────────
        System.out.println(Integer.toBinaryString(10));       // "1010"  → binary
        System.out.println(Integer.toHexString(255));         // "ff"    → hex
        System.out.println(Integer.toOctalString(64));        // "100"   → octal

        // ─── valueOf then intValue/doubleValue ─────────────────────
        Integer boxed = Integer.valueOf(42);
        System.out.println(boxed.intValue());                 // 42     → back to int
        System.out.println(boxed.doubleValue());              // 42.0   → to double
        System.out.println(boxed.longValue());                // 42     → to long

        // ═══════════════════════════════════════════════════════════
        //  GROUP 3 : INFO / CONSTANTS  (limits, size)
        // ═══════════════════════════════════════════════════════════

        System.out.println(Integer.MAX_VALUE);                // 2147483647
        System.out.println(Integer.MIN_VALUE);                // -2147483648
        System.out.println(Integer.SIZE);                     // 32   → number of bits
        System.out.println(Integer.BYTES);                    // 4    → number of bytes

        // ═══════════════════════════════════════════════════════════
        //  GROUP 4 : COMPARE  (ordering / equality)
        // ═══════════════════════════════════════════════════════════

        // ─── compare (static, no boxing) ───────────────────────────
        System.out.println(Integer.compare(5, 10));           // -1  → 5 < 10
        System.out.println(Integer.compare(10, 10));          // 0   → equal
        System.out.println(Integer.compare(20, 10));          // 1   → 20 > 10
        System.out.println(Integer.compareUnsigned(-1, 1));   // 1   → -1 as unsigned is huge

        // ─── compareTo (instance) ──────────────────────────────────
        System.out.println(boxed.compareTo(50));              // -1  → 42 < 50
        System.out.println(boxed.equals(42));                 // true

        // ─── min / max / sum (static helpers) ──────────────────────
        System.out.println(Integer.min(3, 8));                // 3
        System.out.println(Integer.max(3, 8));                // 8
        System.out.println(Integer.sum(3, 8));                // 11

        // ═══════════════════════════════════════════════════════════
        //  GROUP 5 : ARITHMETIC  (Math class operations)
        // ═══════════════════════════════════════════════════════════

        System.out.println(Math.abs(b));                      // 17    → absolute value
        System.out.println(Math.max(a, b));                   // 42
        System.out.println(Math.min(a, b));                   // -17
        System.out.println(Math.pow(2, 10));                  // 1024.0 → returns double
        System.out.println((int) Math.sqrt(144));             // 12    → cast double to int
        System.out.println(10 / 3);                           // 3     → integer division (truncates)
        System.out.println(10 % 3);                           // 1     → remainder / modulo
        System.out.println(Math.floorDiv(-7, 2));             // -4    → floor division
        System.out.println(Math.floorMod(-7, 2));             // 1     → floor modulo (always same sign as divisor)

        // ─── overflow-safe arithmetic (throws on overflow) ─────────
        System.out.println(Math.addExact(5, 7));              // 12
        System.out.println(Math.multiplyExact(4, 6));         // 24
        // Math.addExact(Integer.MAX_VALUE, 1);               // throws ArithmeticException

        // ═══════════════════════════════════════════════════════════
        //  GROUP 6 : BIT OPERATIONS  (binary-level tricks)
        // ═══════════════════════════════════════════════════════════

        System.out.println(Integer.bitCount(7));              // 3   → number of 1-bits (7 = 111)
        System.out.println(Integer.highestOneBit(20));        // 16  → highest power-of-2 <= 20
        System.out.println(Integer.lowestOneBit(20));         // 4   → lowest set bit value
        System.out.println(Integer.numberOfLeadingZeros(1));  // 31  → zeros before first 1-bit
        System.out.println(Integer.numberOfTrailingZeros(8)); // 3   → zeros after last 1-bit (8 = 1000)
        System.out.println(Integer.reverse(1));               // -2147483648 → reverse all 32 bits
        System.out.println(Integer.reverseBytes(1));          // 16777216    → reverse byte order
        System.out.println(Integer.rotateLeft(1, 4));         // 16  → rotate bits left
        System.out.println(Integer.rotateRight(16, 4));       // 1   → rotate bits right

        // ─── bitwise operators ─────────────────────────────────────
        System.out.println(5 & 3);                            // 1   → AND (101 & 011 = 001)
        System.out.println(5 | 3);                            // 7   → OR  (101 | 011 = 111)
        System.out.println(5 ^ 3);                            // 6   → XOR (101 ^ 011 = 110)
        System.out.println(~5);                               // -6  → NOT (flip all bits)
        System.out.println(1 << 4);                           // 16  → left shift  (multiply by 2^4)
        System.out.println(16 >> 2);                          // 4   → right shift (divide by 2^2)
        System.out.println(-8 >>> 28);                        // 15  → unsigned right shift

        // ═══════════════════════════════════════════════════════════
        //  GROUP 7 : SIGN / MISC  (signum, hashCode)
        // ═══════════════════════════════════════════════════════════

        System.out.println(Integer.signum(-42));              // -1  → sign: -1, 0, or 1
        System.out.println(Integer.signum(0));                // 0
        System.out.println(Integer.signum(42));               // 1
        System.out.println(Integer.hashCode(42));             // 42  → int's hashCode is itself
        System.out.println(Integer.toUnsignedLong(-1));       // 4294967295 → treat int as unsigned

        // ═══════════════════════════════════════════════════════════
        //  GROUP 8 : GOTCHAS  (things that trip people up)
        // ═══════════════════════════════════════════════════════════

        // ─── Integer caching (-128 to 127 are cached) ──────────────
        Integer x1 = 127, x2 = 127;
        System.out.println(x1 == x2);                         // true  → same cached object
        Integer y1 = 128, y2 = 128;
        System.out.println(y1 == y2);                         // false → different objects (outside cache)
        System.out.println(y1.equals(y2));                    // true  → always use equals() for value

        // ─── overflow wraps silently ───────────────────────────────
        System.out.println(Integer.MAX_VALUE + 1);            // -2147483648 → wraps around!

        // ─── division / modulo edge cases ──────────────────────────
        System.out.println(-7 / 2);                           // -3  → truncates toward zero
        System.out.println(-7 % 2);                           // -1  → sign follows dividend
        // System.out.println(5 / 0);                         // throws ArithmeticException

    }
}
