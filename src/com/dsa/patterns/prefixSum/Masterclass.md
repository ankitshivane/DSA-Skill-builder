# 📘 PREFIX SUM — COMPLETE LEARNING

---

### 🧩 1️⃣ What is Prefix Sum?

---

### 🔹 **Definition**

A **Prefix Sum** (also known as a **Cumulative Sum**) is an array or value that stores the **sum of all elements up to a
certain index** in the original array.

Formally,
If you have an array `arr[]`, then the prefix sum array `prefix[]` is defined as:

[
prefix[i] = arr[0] + arr[1] + arr[2] + ... + arr[i]
]

- **Core idea:**
    - Precompute cumulative sums so later queries about ranges become O(1).

---

### 🔹 **Intuition (Visual Understanding)**

Let’s take a simple example:

```
arr   = [2, 4, 6, 8, 10]
index =  0  1  2  3   4
```

Now, build the prefix sum step by step:

| Index (i) | arr[i] | prefix[i] = sum(arr[0..i]) |
|-----------|--------|----------------------------|
| 0         | 2      | 2                          |
| 1         | 4      | 2 + 4 = 6                  |
| 2         | 6      | 2 + 4 + 6 = 12             |
| 3         | 8      | 2 + 4 + 6 + 8 = 20         |
| 4         | 10     | 2 + 4 + 6 + 8 + 10 = 30    |

✅ **Result:**

```
prefix = [2, 6, 12, 20, 30]
```
``
p[0]=array[0]=2;
p[1]=array[0]+array[1]=2+4=6;
p[2]=array[0]+array[1]+array[2]=2+4+6=12;
p[3]=array[0]+array[1]+array[2]+array[3]=2+4+6+8=20;
p[4]=array[0]+array[1]+array[2]+array[3]+array[4]=2+4+6+8+10=35;
``

So, each element of the prefix array tells you:

> “What’s the total sum from the start till this index.”

---

### 🔹 **Why we store prefix sums**

Let’s say you want to know the **sum of elements between index L and R** multiple times.

**Naïve way:**
Every time, loop through the array from `L` to `R` → `O(n)` time per query.

**Using prefix sum:**
You precompute the prefix sums once → `O(n)` preprocessing.
Then, you can answer each range sum query in **O(1)** time.

That’s the beauty of prefix sum — **it converts repeated linear operations into constant time lookups**.

---

### 🔹 **Formula (For Range Sum Queries)**

Once you have `prefix[]`:

```
Sum from index L to R = prefix[R] - prefix[L - 1]
```

> (If L == 0, then Sum = prefix[R])

Example using our earlier array:

```
arr = [2, 4, 6, 8, 10]
prefix = [2, 6, 12, 20, 30]
```

👉 Find sum from index 1 to 3 (4 + 6 + 8):

```
Sum(1, 3) = prefix[3] - prefix[0]
           = 20 - 2
           = 18 ✅
```

---

### 🔹 **Analogy**

Imagine each array element as the daily amount you earn.
The prefix sum represents your **total money saved up to that day**.
Then, if you want to know how much you earned between day L and day R, you simply **subtract** the total before day L
from the total at day R.

---

### 🔹 **Key Points**

* Prefix sums are always **non-decreasing** if all elements are positive.
* It helps turn range-based problems into simple subtraction operations.
* One of the most common preprocessing techniques in DSA.

---

That makes me really happy to hear, Ankit 😄💪
You’ve got the perfect mindset — learning DSA deeply **concept by concept** with full clarity is exactly how pros are made.

Let’s continue 🔥

---

## 🚀 2️⃣ Why Do We Use Prefix Sum?

Now that you understand **what** prefix sum is, let’s learn **why** it’s such a powerful and popular technique.

---

### 🔹 The Core Problem It Solves

You’ll often see questions like:

> “Given an array, find the sum of elements between index `L` and `R`.”
> “You have to answer multiple range sum queries.”
> “Find total in subarray (L, R).”

If you compute this **directly** each time, it’s slow.

---

### 🔹 The Naïve Approach

Let’s say:

```
arr = [2, 4, 6, 8, 10]
Queries = [(1,3), (0,4), (2,4)]
```

**Without prefix sum:**

* For each query, you loop from L → R.
* So, for 3 queries, you may loop several times.

If the array size is `n = 10^5` and number of queries `q = 10^5`,
→ each query O(n) → total O(n * q) = 10¹⁰ operations ❌ (too slow!)

---

### 🔹 The Prefix Sum Advantage

You precompute prefix sums once:

```
prefix[i] = prefix[i - 1] + arr[i]
```

That’s **O(n)** work.

Then for any query `(L, R)`,

```
Sum = prefix[R] - prefix[L - 1]
```

That’s **O(1)** per query.

⏱️ **Time complexity:**

| Step               | Time       |
| ------------------ | ---------- |
| Build prefix array | O(n)       |
| Each query         | O(1)       |
| For q queries      | O(n + q) ✅ |

This is **much faster** than O(n*q).

---

### 🔹 When to Use Prefix Sum

You should think of prefix sum when:

1. The problem involves **sum/range queries** on an array or subarray.
2. You need to **handle many queries efficiently**.
3. You can **preprocess once** to save time later.
4. You need to count **subarrays** or **prefix-based patterns** (like “how many subarrays have sum K”).

---

### 🔹 Common Use Case Categories

#### 🧮 1. **Range Sum Queries**

The most basic and direct use.

> Example: Given an array and Q queries, each with L and R, find the sum from L to R.

---

#### ⚖️ 2. **Equilibrium / Balance Index**

> Find an index where sum of left elements = sum of right elements.
> Prefix sums help calculate left and right sums instantly.

---

#### 🎯 3. **Subarray Sum Equals K**

> Find number of subarrays whose sum = K.
> Prefix sum + HashMap pattern used here.

---

#### 📊 4. **2D Matrix Sum Queries**

> For fast computation of rectangle submatrix sums, 2D prefix sum is used.

---

#### 🧠 5. **Dynamic Programming Optimization**

In some DP problems (like "sum of previous states" type), prefix sums are used to optimize transitions.

---

### 🔹 Summary (Quick Recap)

| Feature       | Without Prefix Sum | With Prefix Sum               |
| ------------- | ------------------ | ----------------------------- |
| Preprocessing | None               | O(n)                          |
| Query Time    | O(n) per query     | O(1) per query                |
| Use Case      | One-time queries   | Multiple queries              |
| Example       | Find sum(L,R)      | Range sum / subarray problems |

---

Awesome 💪 Let’s dive into the **real working and algorithm** part now —
this is where you’ll see how Prefix Sum actually gets built and used in code.

---

## ⚙️ 3️⃣ How Prefix Sum Works — Algorithm + Step-by-Step Example

We’ll cover this section in **5 layers**:

1. Concept formula
2. Step-by-step dry run
3. 0-based vs 1-based indexing difference
4. In-place and separate-array versions
5. Java implementation

---

### 🔹 1. The Core Formula

For an array `arr[]` of length `n`:

[
prefix[i] = prefix[i - 1] + arr[i]
]

with base case:
[
prefix[0] = arr[0]
]

So each prefix element = current element + sum of all before it.

---

### 🔹 2. Step-by-Step Example

Let’s take:

```
arr = [3, 1, 4, 2, 5]
```

| i | arr[i] | prefix[i] = prefix[i-1] + arr[i] |
| - | ------ | -------------------------------- |
| 0 | 3      | 3                                |
| 1 | 1      | 3 + 1 = 4                        |
| 2 | 4      | 4 + 4 = 8                        |
| 3 | 2      | 8 + 2 = 10                       |
| 4 | 5      | 10 + 5 = 15                      |

✅ Final prefix array:

```
prefix = [3, 4, 8, 10, 15]
```

Now, if you want the sum of elements between **index L=1 and R=3 (1-based)**
→ (1 + 4 + 2) = 7

Using prefix:

```
prefix[3] - prefix[0] = 10 - 3 = 7 ✅
```

---

### 🔹 3. 0-Based vs 1-Based Indexing

This is a **common confusion**, let’s clarify:

#### 🧮 (A) 0-Based Prefix Array

We start prefix from index `0` itself:

```
prefix[0] = arr[0]
prefix[i] = prefix[i-1] + arr[i]
```

To find sum from L to R:

```
if (L == 0) → sum = prefix[R]
else → sum = prefix[R] - prefix[L-1]
```

#### 🧮 (B) 1-Based Prefix Array

We add an **extra 0 at start** to simplify range formula.

```
prefix[0] = 0
prefix[i] = prefix[i-1] + arr[i-1]   // because arr starts at 0
```

Now:

```
Sum(L, R) = prefix[R] - prefix[L-1]
```

and this works cleanly for all L ≥ 1.

This is why **many programmers prefer 1-based prefix arrays** — no special case for L=0.

---

### 🔹 4. In-place vs Separate Array

✅ **Separate prefix array**
Easiest and safest:

```
int[] prefix = new int[n];
prefix[0] = arr[0];
for (int i = 1; i < n; i++)
    prefix[i] = prefix[i - 1] + arr[i];
```

✅ **In-place prefix sum**
If you’re allowed to modify the array:

```
for (int i = 1; i < n; i++)
    arr[i] += arr[i - 1];
```

Then `arr` itself becomes your prefix array.

---

### 🔹 5. 💻 Java Implementation

#### ✅ (A) Using separate prefix array (0-based)

```java
public class PrefixSumExample {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        int n = arr.length;
        
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Example query: sum of elements from index 1 to 3
        int L = 1, R = 3;
        int rangeSum = prefix[R] - (L > 0 ? prefix[L - 1] : 0);

        System.out.println("Prefix Array: " + java.util.Arrays.toString(prefix));
        System.out.println("Sum from index " + L + " to " + R + " = " + rangeSum);
    }
}
```

**Output:**

```
Prefix Array: [3, 4, 8, 10, 15]
Sum from index 1 to 3 = 7
```

---

#### ✅ (B) Using 1-based prefix array (cleaner range formula)

```java
public class PrefixSumOneBased {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        int n = arr.length;

        int[] prefix = new int[n + 1];
        prefix[0] = 0; // extra 0 at start

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        // Example query (1-based indices)
        int L = 2, R = 4;  // corresponds to arr[1..3]
        int rangeSum = prefix[R] - prefix[L - 1];

        System.out.println("Prefix Array: " + java.util.Arrays.toString(prefix));
        System.out.println("Sum from index " + L + " to " + R + " = " + rangeSum);
    }
}
```

**Output:**

```
Prefix Array: [0, 3, 4, 8, 10, 15]
Sum from index 2 to 4 = 7
```

---

### ⚡ Key Takeaways

* Prefix sum array is **built in O(n)** time.
* Any range sum query can be answered in **O(1)**.
* Use **1-based prefix** to avoid edge-case handling for L=0.
* Can be done **in-place** if array modification is allowed.

---
