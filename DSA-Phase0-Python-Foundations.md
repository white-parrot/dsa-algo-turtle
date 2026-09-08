# Phase 0 — Python for DSA (Java → Python Bridge)
**Days:** 6 | **Goal:** Enough Python fluency that syntax never slows down pattern-learning from Phase 1 onward.

You already know *how to program* — 11 years of it. This phase is purely translation: "what I'd write in Java, how do I write it in Python." No new CS concepts, just new syntax, so we move fast.

Each day below: **Concept** (taught live in chat, one at a time) → **Pattern/Idiom** (the Pythonic way to do it) → **Problems** (to lock it in and start your profile).

---

### Day 1 — Setup, I/O, and Core Types
**Concept:** Python variables (no type declarations), `input()`/`print()`, `int/float/str/bool`, f-strings, basic operators, why Python has no `public static void main`.
**Pattern:** Reading input for DSA problems (LeetCode gives you a function signature — no manual I/O needed there, unlike Codeforces/GFG which need `input()`/`sys.stdin`).
**Problems:**
- https://leetcode.com/problems/two-sum/ (your very first Python submission)
- https://www.geeksforgeeks.org/problems/second-largest3735/1 (practice I/O-style GFG format)

### Day 2 — Lists (your Java ArrayList)
**Concept:** List creation, indexing, negative indexing, slicing `[a:b:c]`, `append/pop/insert/remove`, list comprehensions as the Pythonic replacement for for-loops-that-build-a-list.
**Pattern:** "Build a list" — comprehension `[x*2 for x in nums]` vs Java's loop+add.
**Problems:**
- https://leetcode.com/problems/remove-duplicates-from-sorted-array/
- https://leetcode.com/problems/merge-sorted-array/
- https://www.geeksforgeeks.org/problems/reverse-an-array/1

### Day 3 — Dictionaries & Sets (your Java HashMap/HashSet)
**Concept:** `dict` creation/access, `.get()` with default, `in` for O(1) membership, `set` operations (union/intersection), `collections.Counter` and `collections.defaultdict` as Python's power tools with no Java equivalent this concise.
**Pattern:** Frequency counting — the single most common DSA opening move.
**Problems:**
- https://leetcode.com/problems/contains-duplicate/
- https://leetcode.com/problems/valid-anagram/
- https://leetcode.com/problems/majority-element/

### Day 4 — Strings & Common Ops
**Concept:** Strings are immutable (like Java) — but no StringBuilder; instead you build lists of chars and `''.join()`. Slicing, `.split()`, `.strip()`, ASCII via `ord()/chr()`.
**Pattern:** "Build a string efficiently" idiom — list + join, never `+=` in a loop.
**Problems:**
- https://leetcode.com/problems/reverse-string/
- https://leetcode.com/problems/valid-palindrome/
- https://www.geeksforgeeks.org/problems/remove-duplicate-characters/1

### Day 5 — Functions, Recursion Mechanics, Big-O Refresher
**Concept:** `def`, default args, `*args`/`**kwargs` (you'll see these a lot in problem harnesses), Python's recursion limit and why it matters for DSA (`sys.setrecursionlimit`), a fast refresher on Big-O since it's the language of every phase from here.
**Pattern:** Base case + recursive case, written explicitly before any code — the habit that prevents 90% of recursion bugs.
**Problems:**
- https://leetcode.com/problems/fibonacci-number/ (do it recursively first, on purpose — we'll fix its inefficiency properly in Phase 12)
- https://leetcode.com/problems/factorial-trailing-zeroes/

### Day 6 — Quick OOP Bridge + Phase Review
**Concept:** Minimal Python classes (`__init__`, `self` vs Java's implicit `this`) — just enough to define `ListNode`/`TreeNode` classes you'll use constantly from Phase 6 onward. Also: how LeetCode's function-signature style differs from writing a full program.
**Pattern:** Defining a node class in 3 lines instead of Java's boilerplate.
**Problems:**
- https://leetcode.com/problems/design-linked-list/ (forces you to define nodes yourself — perfect capstone for this phase)
- Teach-back: explain, in your own words, one thing that's genuinely easier in Python than Java, and one thing you'll miss from Java's type safety.

---

## Phase 0 exit criteria
- [ ] All 6 days' problems submitted on LeetCode/GFG under your real profile
- [ ] Can write a list comprehension and a dict frequency-counter from memory, no lookup
- [ ] Can define a simple class with `__init__` from memory
- [ ] Teach-back given and accepted
- [ ] Day 6's solutions pushed to GitHub (first commit of the DSA repo — see `Profile-Building-Strategy.md`)

Once all boxes are checked, tell me and we'll build `DSA-Phase1-Arrays-Foundations.md` next.
