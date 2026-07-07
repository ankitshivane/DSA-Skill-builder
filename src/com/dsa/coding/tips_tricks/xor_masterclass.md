# XOR BIT Manipulation

---

* What is XOR?
    * XOR stands for Exclusive OR
    * symbol is ^
    * XOR works bit by bit where the rule is
        * Same BITs -> 0
        * Different BITs -> 1
    * For Example 5 ^ 3
        * 101 ^ 011 -> 110 which is 6

---

# Properties Must be memorize for DSA

###  * Property 1

* `a ^ 0 = a`
* For Example ` 5 ^ 0 = 5` Lets learn how: `101 ^ 000 => 101`
* Because 0 doesn't change anything.

###  * Property 2 (THE MOST IMPORTANT)

* `a ^ a = 0`
* For Example `5 ^ 5 = 0`  -> `101 ^ 101 = 000` (nothing but 0)
* because as per XOR rule same bits gives 0 (cancel out)

###  * Property 3

* `a ^ b ^ a = b`
* Because `(a ^ a) ^ b` becomes `0 ^ b = b` (refer property 2 for this result)
* For example:

```
( 7 ^ 4 ^ 7) = 4
= (0111 ^ 0100 ^ 0111) 
= (0011 ^ 0111)
= 0100 which is nothing but 4 hence proved
```

###  * Property 4

* In XOR Order doesn't matter
* `a ^ b = b ^ a`
* its commutative means that the order in which you combine numbers or values does not change the final result.
* For Example:

```
= (7 ^ 4)
= (0111 ^ 0100)
= 0011

now do (4 ^ 7)
= (0100 ^ 0111)
= 0011
hence proved 0011=0011 that is a ^ b = b ^ a
```

###  * Property 5

* Grouping doesn't matter
* `(a ^ b) ^ c = a ^ (b ^ c)`
* this is associative when you are adding or multiplying three or more numbers, the grouping of the numbers does not
  change the final result.

## Why Property 4 and 5 matter?

* because you can rearrange XORs however you want.
* Example:
```
1 ^ 2 ^ 3 ^ 2 ^ 1
If we rearrange as, 1 ^ 1 ^ 2 ^ 2 ^ 3
this cancels: 0 ^ 0 ^ 3
Answer is 3
```

---

