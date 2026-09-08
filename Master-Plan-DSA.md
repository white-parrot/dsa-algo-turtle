# DSA Mastery — Master Plan
**Track:** Standalone, parallel to the AI Architect Roadmap (self-managed time split)
**Language:** Python (you are a beginner in Python, expert in Java)
**Pace:** ~1 hour/day
**Goal:** Every major DSA pattern at "crack-with-ease" depth → contests, interviews of any level, DP mastery → a real LeetCode/GFG profile + a real GitHub trail, built simultaneously.

---

## 0. How this project is structured

Same philosophy as your AI roadmap, three files deep:

| File | Purpose |
|---|---|
| `Master-Plan-DSA.md` (this file) | The full pattern-ordered map. Read this when you feel lost or want to see the whole mountain. |
| `DSA-PhaseN-<name>.md` | Day-by-day detail for ONE phase at a time — concept → pattern → problems. Built just-in-time, like `Part1-*.md` was for AI. Only Phase 0 exists so far. |
| `DSA-Daily-Tracker.html` | Your single source of truth for "what do I do today." Check things off, watch the route fill in. |
| `Profile-Building-Strategy.md` | The parallel track: how LeetCode + GitHub grow every single day without extra time cost. |

**Rule:** we never write Phase 6's detailed file while you're on Phase 1. Detail is generated just before you need it — otherwise it goes stale and you second-guess sequencing. This file is the only thing that shows everything at once.

---

## 1. Standing mentoring rules (carried over from your AI roadmap, apply here too)

- Assume zero prior knowledge of each day's specific topic, regardless of your 11 years of Java seniority.
- Concept first, in full, with a worked example/analogy — **then** pattern — **then** problems. Never problems-first.
- If code is shown, we walk it line by line so you can type it yourself in your own IDE. You paste code back to me for review, not the other way round.
- One combined exercise per day, not five disconnected ones.
- Knowledge checks are low-typing: MCQ, "which pattern applies here," code review, one-line answers.
- Teach-back required before a phase is marked done — you explain the pattern to me in your own words (even 2-3 sentences) before we move on.
- Accountability tone — I will tell you honestly if a day's understanding is shaky, not just cheerlead.

---

## 2. Why this order (dependency logic)

Patterns are sequenced so each phase's problems are solvable using **only** what came before, plus the new concept. You will never hit a wall requiring something we haven't covered — that's the single biggest source of "beginner drowns in DSA" and we're designing it out.

Rough shape: **linear structures → recursion → trees → graphs → greedy → DP → advanced/CP-only tools.** DP is deliberately late — it needs recursion, trees, and greedy-vs-optimal intuition already built, or it becomes memorization instead of mastery.

---

## 3. The full route (18 phases + 1 standing phase)

Estimated days assume 1 problem-day ≈ 1 hour, including the concept teaching. Numbers are planning estimates, not contracts — we adjust per your actual pace, same as the AI track.

| # | Phase | Core Patterns | Est. Days |
|---|---|---|---|
| 0 | Python for DSA (bridge from Java) | syntax, lists/dicts/sets, strings, functions, recursion mechanics, quick OOP | 6 |
| 1 | Complexity + Array Foundations | Big-O in practice, prefix sums, Kadane's, in-place array tricks | 10 |
| 2 | Two Pointers & Sliding Window | fixed/variable window, fast-slow pointers | 10 |
| 3 | Hashing | frequency maps, hash-set dedup, anagram/grouping patterns | 8 |
| 4 | Recursion & Backtracking | subsets, permutations, combinations, N-Queens style pruning | 12 |
| 5 | Sorting & Binary Search | comparison sorts intuition, binary search on answer, rotated arrays | 12 |
| 6 | Linked Lists | reversal, cycle detection, merge, fast-slow on lists | 10 |
| 7 | Stacks & Queues | monotonic stack, next-greater, min-stack, queue via stacks | 10 |
| 8 | Trees | traversals (recursive+iterative), BST properties, LCA, tree DP intro | 14 |
| 9 | Heaps / Priority Queues | k-way merge, top-K, median-finder | 8 |
| 10 | Graphs | BFS/DFS, Union-Find, topological sort, Dijkstra/Bellman-Ford | 18 |
| 11 | Greedy | interval scheduling, exchange-argument proofs, greedy-vs-DP judgment | 8 |
| 12 | Dynamic Programming | 1D → 2D → knapsack family → LIS family → interval DP → tree/graph DP → bitmask DP | 24 |
| 13 | Tries & String Algorithms | Trie, KMP/Z-algorithm, string hashing | 8 |
| 14 | Bit Manipulation | XOR tricks, bitmasking, subsets via bits | 6 |
| 15 | Advanced CP Data Structures | Segment Tree, Fenwick/BIT, Sparse Table, advanced DSU | 10 |
| 16 | Math & Number Theory for CP | modular arithmetic, sieve, GCD/LCM, combinatorics | 8 |
| 17 | Contest Craft | fast I/O templates, reading constraints → picking approach, virtual contests, rating strategy | ongoing, woven in from Phase 3 onward |
| 18 | Interview + Profile Sustain | mock interviews, company-tagged sets, revision cadence, keeping the streak alive | ongoing, woven in from Day 1 |

**Total core content: ~190 focused days** (~9-10 months at 1 hr/day, adjustable). Phases 17 and 18 aren't "later" — see the weekly rhythm below, they run alongside everything from week one.

---

## 4. Weekly rhythm (this is what actually runs in parallel — contests + interview-readiness + profile, every week, not bolted on at the end)

| Day | Activity |
|---|---|
| Mon–Thu | New concept + pattern + 2-3 problems (the day's phase content) |
| Fri | Revision day: redo one problem from earlier in the week **cold, no notes** — this is what makes it "crack-with-ease" instead of "recognized it once" |
| Sat | Contest: one LeetCode Weekly/Biweekly Contest OR one Codeforces Div 3/4 (alternate). Even partial solves count — this builds the CP muscle real problems don't. |
| Sun | Git day: push the week's solutions to your DSA GitHub repo with clean READMEs (see `Profile-Building-Strategy.md`), plus light revision of the weakest day |

This means from **Day 1**, your LeetCode profile and GitHub repo are both growing — we don't wait for "enough knowledge" to start the profile. The profile IS built by doing the plan, not as a separate task.

---

## 5. Mastery bar per phase ("crack-with-ease," not "recognized once")

A phase is done only when you can:
1. State the pattern's trigger conditions from memory (what problem shape screams "use this").
2. Solve a new, unseen problem in that pattern within a reasonable time, unaided.
3. Explain the time/space complexity trade-off out loud (teach-back).
4. Have pushed all phase solutions to GitHub with your own explanation comments (not copied).

No phase is "passed" on a single successful solve. That's recognition, not mastery — and it's exactly the gap between "solved it in practice" and "froze in the actual interview."

---

## 6. What's next

We build `DSA-Phase0-Python-Foundations.md` first (already done, see companion file) and `DSA-Daily-Tracker.html` to track it. When Phase 0 is done and taught-back, we generate Phase 1's detail file — same just-in-time rhythm as your AI roadmap.
