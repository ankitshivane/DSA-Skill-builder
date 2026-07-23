***

## 1. When to use HashMap vs HashSet

- If you only care “has this appeared before / is it present / is it unique?” → **HashSet**.
    - Keywords in statement: “duplicate”, “already seen”, “contains”, “unique elements”, “subset”, “intersection”, “union”.
- If you need to attach some info to a key (count, index, frequency, best answer so far) → **HashMap**.
    - Keywords: “frequency”, “count”, “how many times”, “store index”, “map X to Y”, “group by”.

***

## 2. Frequency / counting pattern

Use: `map<thing, count>` or dictionary from value → frequency.

**If problem says:**

- “Check if two strings are anagrams / have same characters.” → Count chars with HashMap and compare.
- “Find first non-repeating / first repeating character or number.” → Use frequency map, then second pass in original order.
- “Top K frequent elements / words / numbers.” → Frequency map then heap or bucket sort.
- “Sort by frequency / group anagrams / group by some property.” → Map key (signature) → list of elements.

**Mental trigger:**

- Whenever you see “how many times does X occur” or “most frequent / least frequent”, immediately think: **build a frequency map first, then answer from it**.

***

## 3. Instant lookup / existence pattern

Use: `set` (or `map` if you also need extra info).

**If problem says:**

- “Check if array contains duplicates.” → Put elements in a set while traversing, if already in set → duplicate.
- “Find if any pair sums to K (Two Sum).” → For each number, check if `target - num` is already in map/set.
- “Is B a subset of A?” → Put A in a set; check every element of B.
- “Find union / intersection of arrays.” → Put one in a set; iterate the other.

**Mental trigger:**

- Whenever you think “I’ll need to repeatedly search through the array to see if something exists”, replace that thought with: **“Store in a set/map and query in O(1)”**.

***

## 4. Index / position tracking pattern

Use: `map<value, index>` or `map<prefix, bestIndex>`.

**If problem says:**

- “Return indices of two numbers that add up to target.” → Use map: value → index, check complement before insert.
- “First repeating element / distance between equal elements / longest span with equal something.” → Store first index of each value, update answers when seen again.
- “Longest consecutive sequence.” → Use set to quickly check if `x-1` exists; only start counting from numbers that have no predecessor.

**Mental trigger:**

- Any time the output involves **indices** or **lengths** based on where you last saw something, think **“value → first/last index map”**.

***

## 5. Prefix sum / prefix XOR + hashmap pattern

Use: `map<prefix, count>` or `map<prefix, earliestIndex>`.

**If problem says:**

- “Number of subarrays with sum K / divisible by K / equal to something.”
- “Largest subarray with 0 sum / equal 0s and 1s / certain property.”
- “Number of subarrays with given XOR.”

**Template idea:**

- Maintain running prefix (sum or XOR) while scanning.
- For each index:
    - Targeting count: need previous prefix `prefix - K` (sum) or `prefix XOR K` (xor) already in map → add its frequency.
    - Targeting longest length: need the **earliest** index where same adjusted prefix appeared to maximize length.

**Mental trigger:**

- Statement mentions **subarray** + **sum / XOR / divisible / equal** → try **prefix + hashmap** before anything else.

***

## 6. Sliding window + hashmap pattern (strings/arrays)

Use: window `[l, r]` with `map<value, count>` inside the window.

**If problem says:**

- “Longest substring without repeating characters.” → Keep char → last index or count; when invalid, move left pointer.
- “Longest/shortest substring with at most / exactly K distinct characters.” → Map char → count, track number of distinct keys.
- “Smallest window containing all characters of another string.” → Count needed chars in a map; shrink/expand window tracking remaining needed count.
- “Count distinct elements in every window of size K.” → Map value → count; as you slide, decrement leaving element, increment entering element.

**Mental trigger:**

- Keywords: “substring”, “subarray”, **“window” size or constraints**, “at most K distinct”, “no repeating characters”, “minimum window” → think **sliding window + hashmap counts**.

***

## 7. Grouping / bucketing pattern

Use: `map<signature, list<items>>`.

**If problem says:**

- “Group anagrams.” → Signature = sorted string or character count vector, map it to list of words.[^4]
- “Group by some property/key (same remainder, same pattern, same slope, same frequency).” → Compute a **canonical key** and group via map.
- “Collect all items that share same X (length, difference, pattern).” → Map X → list.

**Mental trigger:**

- Statement says “group”, “cluster”, “bucket”, or output is “list of lists grouped by some rule” → think **signature as key in a map**.

***

## 8. Custom keys / complex state hashing

Use: `map<state, something>` or `set<state>` where state is pair/tuple/encoded.

**If problem says:**

- “Visited state in a puzzle / grid / BFS/DFS with more dimensions (position + something).” → Hash `(x, y, extraInfo)` in a set to avoid revisits.
- “Find max points on a line / same remainder, etc.” → Hash slope `(dy, dx)` reduced or `(value % k)` into map.
- “Clone graph / tree with random pointers.” → Map `originalNode → clonedNode`.

**Mental trigger:**

- You think “I need to remember I’ve visited this combination before” → encode that combination as a **key** and store it in map/set.

***

## 9. Design / caching / memoization

Use: maps to store results or maintain O(1) operations.

**If problem says:**

- “Design LRU cache / LFU cache / key-value store / logger rate limiter / TinyURL.” → Under the hood: hashmap for O(1) access + extra structure (like list or heap) for order.
- “Avoid recomputing same recursive result” (DP with memo). → HashMap from function parameters (n, remaining, index, etc.) → answer.

**Mental trigger:**

- When you see repeated subproblems or need O(1) lookup by key, think: **“add a hashmap as memo/cache layer”**.

***

## 10. Quick decision tree for hashing in problems

Use this as a mental flow:

1. Do I need to know if I’ve seen this element before or if something exists?
→ Yes → **HashSet** (or HashMap if extra info).[^2]
2. Do I need counts / frequencies / top-k / first non-repeating?
→ Yes → **HashMap value → count**.
3. Do I care about indices / distances / longest subarray / span?
→ Yes → **HashMap value/prefix → index or count**.
4. Is it about subarrays + sum/xor/divisible by K?
→ Yes → **Prefix + HashMap**.
5. Is it about substrings/subarrays with constraints on distinct/required elements?
→ Yes → **Sliding window + HashMap counts**.
6. Do I need to group items by some property?
→ Yes → **Map signature → list of items**.
