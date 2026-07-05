
## 1. Fixed-size array as a frequency map (what you already found)
```java
int[] freq = new int[26];
for (char c : s.toCharArray()) {
    freq[c - 'a']++;
}
```
Used for: anagram checks, first non-repeating character, character frequency comparisons.

## 2. Array initialized to -1 as a "seen/visited" or "index lookup" map
```java
int[] firstIndex = new int[26];
Arrays.fill(firstIndex, -1);

for (int i = 0; i < s.length(); i++) {
    if (firstIndex[s.charAt(i) - 'a'] == -1) {
        firstIndex[s.charAt(i) - 'a'] = i;
    }
}
```
Used for: first occurrence index, detecting duplicates, two-pointer setups.

## 3. HashMap for counting with `getOrDefault` or `merge`
```java
Map<Character, Integer> freq = new HashMap<>();
for (char c : s.toCharArray()) {
    freq.put(c, freq.getOrDefault(c, 0) + 1);
    // or equivalently:
    freq.merge(c, 1, Integer::sum);
}
```
Used for: same as array frequency map, but when the "alphabet" isn't fixed/small (e.g., words, arbitrary integers).

## 4. `putIfAbsent` for grouping into lists (building a multimap)
```java
Map<Integer, List<Integer>> groups = new HashMap<>();
for (int num : nums) {
    groups.putIfAbsent(num % 3, new ArrayList<>());
    groups.get(num % 3).add(num);
}
```
Used for: group anagrams, bucket problems, grouping by remainder/property.

Even more idiomatic version using `computeIfAbsent`:
```java
Map<Integer, List<Integer>> groups = new HashMap<>();
for (int num : nums) {
    groups.computeIfAbsent(num % 3, k -> new ArrayList<>()).add(num);
}
```

## 5. HashSet for O(1) existence checks
```java
Set<Integer> seen = new HashSet<>();
for (int num : nums) {
    if (seen.contains(num)) { /* duplicate found */ }
    seen.add(num);
}
```
Used for: duplicate detection, two-sum (with complement check), longest consecutive sequence.

## 6. Array as a "count then reconstruct" buffer (counting sort flavor)
```java
int[] count = new int[maxVal + 1];
for (int num : nums) count[num]++;

int idx = 0;
for (int val = 0; val <= maxVal; val++) {
    while (count[val]-- > 0) {
        nums[idx++] = val;
    }
}
```
Used for: sort colors (Dutch flag variant), sorting small-range integers in O(n).

## 7. Boolean array as a lightweight "visited" set
```java
boolean[] visited = new boolean[n];
```
Used for: graph traversal (BFS/DFS), avoiding cycles, marking processed indices — cheaper than `HashSet<Integer>` when indices are bounded.

## 8. PriorityQueue with a custom comparator built from a frequency map
```java
Map<Integer, Integer> freq = new HashMap<>();
for (int num : nums) freq.merge(num, 1, Integer::sum);

PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
    (a, b) -> freq.get(b) - freq.get(a)
);
maxHeap.addAll(freq.keySet());
```
Used for: top-K frequent elements, task scheduling.

---

**The underlying pattern connecting all of these:** whenever a problem needs "have I seen this before?" or "how many times has this appeared?" or "what belongs together?", you're choosing between three tools based on constraints:

| Tool | When to use |
|---|---|
| Fixed array (e.g. size 26, 128, 256) | Keys are small, bounded, known in advance (lowercase letters, ASCII, digits 0-9) |
| HashMap | Keys are large, sparse, or non-integer (words, arbitrary numbers) |
| HashSet | You only care about *presence*, not count |

Once you see a problem statement say "lowercase English letters only" — that's your cue an array of size 26 will be faster than a HashMap (O(1) direct indexing, no hashing overhead, no boxing).