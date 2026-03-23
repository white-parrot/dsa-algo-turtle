# 🍌 Binary Search on Answer — Koko Pattern (LeetCode Guide)

## 🔥 Base Problem

### 1. Koko Eating Bananas

🔗 https://leetcode.com/problems/koko-eating-bananas/

* Pattern starter problem
* Binary Search on Answer (speed)

---

# 🟢 Core MUST-DO (Same Pattern 1:1)

### 2. Capacity To Ship Packages Within D Days

🔗 https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

* Speed → Capacity
* Hours → Days

---

### 3. Minimum Number of Days to Make m Bouquets

🔗 https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

* Answer = minimum days
* Check feasibility

---

### 4. Split Array Largest Sum

🔗 https://leetcode.com/problems/split-array-largest-sum/

* Same as Painter’s Partition
* Answer = maximum subarray sum

---

### 5. Aggressive Cows *(Equivalent Problem)*

🔗 https://www.interviewbit.com/problems/aggressive-cows/

* Answer = minimum distance
* Greedy + Binary Search

---

### 6. Allocate Books *(Equivalent Problem)*

🔗 https://www.interviewbit.com/problems/allocate-books/

* Same as Painter’s Partition

---

# 🟡 Medium Variations (Same Idea, Slight Twist)

### 7. Minimized Maximum of Products Distributed to Any Store

🔗 https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/

* Answer = max products per store

---

### 8. Find the Smallest Divisor Given a Threshold

🔗 https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

* Very close to Koko
* Uses ceil division

---

### 9. Maximum Running Time of N Computers

🔗 https://leetcode.com/problems/maximum-running-time-of-n-computers/

* Binary Search + Greedy

---

### 10. Minimum Speed to Arrive on Time

🔗 https://leetcode.com/problems/minimum-speed-to-arrive-on-time/

* Koko with floating-point handling

---

# 🔴 Advanced / Tricky Ones

### 11. Maximum Value at a Given Index in a Bounded Array

🔗 https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/

* Binary Search + Math

---

### 12. Magnetic Force Between Two Balls

🔗 https://leetcode.com/problems/magnetic-force-between-two-balls/

* Same as Aggressive Cows

---

### 13. Minimum Limit of Balls in a Bag

🔗 https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/

* Koko-style division problem

---

# 🧠 Pattern Summary

```
Answer space = [low, high]

while(low <= high):
    mid = candidate answer
    
    if (isPossible(mid)):
        try smaller (minimize)
    else:
        go bigger
```

---

# ⚡ Key Insight

* Problems follow **monotonic behavior**
* Pattern: `TTTTFFFF` or `FFFFTTTT`
* Enables Binary Search

---

# 🚀 Recognition Trick

If problem says:

* “Minimum X such that condition holds”
* “Maximum X such that condition holds”

👉 Use **Binary Search on Answer**

---

# 📌 Recommended Practice Order

1. Koko Eating Bananas
2. Capacity to Ship Packages
3. Allocate Books / Painter’s Partition
4. Split Array Largest Sum
5. Bouquets
6. Smallest Divisor

---

# 🏁 Final Thought

This pattern appears **very frequently in interviews**.
Mastering it gives you an edge across multiple problem types.
