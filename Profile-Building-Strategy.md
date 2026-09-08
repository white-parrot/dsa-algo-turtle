# Profile-Building Strategy — LeetCode + GitHub, Built in Parallel

The plan itself builds your profile. This doc is just the small set of habits that turn "I solved problems" into "I have a visible, credible trail" — for recruiters, for you on a bad-confidence day, and for contest rating history.

---

## 1. LeetCode

**Every single problem from every phase gets submitted on LeetCode's actual UI**, even the GFG-linked ones (search the same problem name on LeetCode when possible — most classics exist on both).

- **Daily streak:** Turn on LeetCode's daily streak. It's a cheap but real signal, and it enforces the 1hr/day habit externally.
- **Contests (Saturday, per Master Plan):** Join LeetCode Weekly Contest every other Saturday, Codeforces Div 3/4 on alternating Saturdays. Contest rating is one of the few DSA signals that's hard to fake — recruiters and CP communities both respect it.
- **Profile hygiene:** Fill in your LeetCode profile bio, link your GitHub, set a real profile picture. A profile with 40 solved problems and a contest badge reads better than 200 solved with no other signal.
- **Don't chase the total-solved number.** A recruiter skimming your profile checks: streak, contest rating, and topic-tag breadth (do you have solves across arrays/trees/graphs/DP, or all in one bucket). The phase plan guarantees breadth automatically.

## 2. GitHub — the DSA repo

Create **one repository**: `dsa-mastery` (or similar). Structure:

```
dsa-mastery/
  README.md                 <- overview, phase progress table, links to LeetCode profile
  phase-00-python-foundations/
    day01-two-sum.py
    day01-notes.md          <- 3-5 lines: pattern used, why, complexity
    ...
  phase-01-arrays/
    ...
```

**Rules that make this a real signal, not noise:**
- **Commit daily, one commit per problem-day**, with a consistent message format: `"Day N (Phase X): <problem name> — <pattern>"`. Example: `"Day 3 (Phase 0): Valid Anagram — hashing/frequency count"`. Daily commits are fine as long as the message is specific — it's noisy only when messages are vague (`"update"`, `"fix"`). Specific daily commits actually read better than weekly bundles: they show a real, sustained streak on your GitHub contribution graph.
- **Every solution file has a short paired notes file** (or a top-of-file comment): pattern name, why it applies, time/space complexity. This is what makes it "your explanation," not "copied code" — and it's what you re-read on revision days instead of re-reading LeetCode's editorial.
- **README.md has two views, both updated on each daily commit** (see `README-template.md`): a **chronological index** (incremental, in solve order — your showcase feed) and a **pattern-grouped index** (same problems, re-sorted by topic — your future practice-marathon bank). Both are just tables referencing the same files, so updating them daily is a 1-2 line addition, not a rewrite.

## 3. How this ties to interviews specifically

When a phase is "done" (per Master Plan's mastery bar), you have, for free:
- A GitHub folder of clean, commented solutions you can screen-share and explain live.
- A teach-back you already gave me, which is the same skill as explaining your approach to an interviewer.
- LeetCode submission history proving you didn't just read about the pattern once.

Nothing extra to build later "for the interview" — the daily habit **is** the interview prep.

## 4. First actions (do these once, today)

1. Create the `dsa-mastery` GitHub repo, add a README with the progress table above (all phases at 0/N for now).
2. Turn on LeetCode daily streak + fill in profile bio/link to GitHub.
3. Bookmark Codeforces contest schedule (codeforces.com/contests) for Saturday CP days.

That's it — everything after this is just following the Daily Tracker.
