# DSA Mastery

Daily DSA practice — Python — following a dependency-ordered, pattern-based roadmap (18 phases: arrays → recursion → trees → graphs → greedy → DP → advanced CP tools). Full plan: see `Master-Plan-DSA.md` in my [planning docs] (link if you make the repo public and want to reference it, otherwise remove).

**LeetCode profile:** [link] · **Contest rating:** [link/screenshot] · **Streak:** [current streak]

---

## Progress

| Phase | Status | Problems Solved | Folder |
|---|---|---|---|
| 0 — Python Foundations | 🔄 In progress | 2/6 | `phase-00-python-foundations/` |
| 1 — Array Foundations | ⬜ Not started | 0/10 | `phase-01-arrays/` |
| 2 — Two Pointers & Sliding Window | ⬜ Not started | 0/10 | `phase-02-two-pointers-sliding-window/` |
| 3 — Hashing | ⬜ Not started | 0/8 | `phase-03-hashing/` |
| 4 — Recursion & Backtracking | ⬜ Not started | 0/12 | `phase-04-recursion-backtracking/` |
| 5 — Sorting & Binary Search | ⬜ Not started | 0/12 | `phase-05-sorting-binary-search/` |
| 6 — Linked Lists | ⬜ Not started | 0/10 | `phase-06-linked-lists/` |
| 7 — Stacks & Queues | ⬜ Not started | 0/10 | `phase-07-stacks-queues/` |
| 8 — Trees | ⬜ Not started | 0/14 | `phase-08-trees/` |
| 9 — Heaps / Priority Queues | ⬜ Not started | 0/8 | `phase-09-heaps/` |
| 10 — Graphs | ⬜ Not started | 0/18 | `phase-10-graphs/` |
| 11 — Greedy | ⬜ Not started | 0/8 | `phase-11-greedy/` |
| 12 — Dynamic Programming | ⬜ Not started | 0/24 | `phase-12-dp/` |
| 13 — Tries & String Algorithms | ⬜ Not started | 0/8 | `phase-13-tries-strings/` |
| 14 — Bit Manipulation | ⬜ Not started | 0/6 | `phase-14-bit-manipulation/` |
| 15 — Advanced CP Data Structures | ⬜ Not started | 0/10 | `phase-15-advanced-ds/` |
| 16 — Math & Number Theory | ⬜ Not started | 0/8 | `phase-16-math-number-theory/` |

*(Phases 17-18 — Contest Craft, Interview/Profile Sustain — are woven in weekly, not a folder of their own; contest solutions live under `contests/`.)*

---

## Chronological Index (showcase — solved in this order)

> Every row = one commit. This is the feed a recruiter or you-on-a-bad-day scrolls through top to bottom.

| # | Date | Phase | Problem | Platform | Difficulty | Pattern | Solution |
|---|---|---|---|---|---|---|---|
| 1 | 2026-08-26 | 0 | Two Sum | LeetCode | Easy | Brute-force (nested loops) | `phase-00-python-foundations/day01-two-sum.py` |
| 2 | 2026-08-26 | 0 | Second Largest | GFG | Easy | Single-pass max/second-max tracking | `phase-00-python-foundations/day01-second-largest.py` |
| 3 | | | | | | | |

*(Add one row per problem, same day you commit it. Number never resets — it's the running total across the whole repo.)*

---

## Pattern-Grouped Index (practice marathon bank)

> Same problems, re-sorted by pattern. When you want a marathon session ("redo every sliding-window problem cold"), come here, not to the chronological list.

### Python Foundations (Phase 0 warm-ups — pre-pattern)
| Problem | Platform | Difficulty | Pattern Used | Solution |
|---|---|---|---|---|
| Two Sum | LeetCode | Easy | Brute-force (nested loops) | `phase-00-python-foundations/day01-two-sum.py` |
| Second Largest | GFG | Easy | Single-pass max/second-max tracking | `phase-00-python-foundations/day01-second-largest.py` |

> Note: Two Sum will get a second, better solution in Phase 3 using the hashing pattern — add it as a new row here (and in the Hashing section below) when that's done, without deleting this brute-force entry.

### Arrays & Prefix Sums
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Two Pointers & Sliding Window
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Hashing
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Recursion & Backtracking
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Sorting & Binary Search
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Linked Lists
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Stacks & Queues
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Trees
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Heaps
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Graphs
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Greedy
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Dynamic Programming
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Tries & String Algorithms
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Bit Manipulation
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Advanced CP Data Structures
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Math & Number Theory
| Problem | Platform | Difficulty | Solution |
|---|---|---|---|
| | | | |

### Contest Problems (Saturdays)
| Problem | Platform | Contest | Result | Solution |
|---|---|---|---|---|
| | | | | |

---

## How I use this repo for revision / marathons

1. **Cold-solve day:** pick a pattern section above, re-solve 2-3 problems from it with no notes, no old solution open — check my old file only after.
2. **Weak-spot marathon:** any pattern where I froze in a mock interview, redo the entire section top to bottom in one sitting.
3. **Pre-interview refresh:** skim every pattern header + one example solution the day before an interview — not full re-solves, just pattern recall.

---

## Conventions

- One file per problem: `dayNN-problem-slug.py`
- Each file starts with a short header comment:
  ```python
  # Pattern: <pattern name>
  # Time: O(...)  Space: O(...)
  # Why this pattern applies: <1-2 lines>
  ```
- One commit per problem-day: `"Day N (Phase X): <problem name> — <pattern>"`
- Both index tables above updated in the same commit as the solution file.
