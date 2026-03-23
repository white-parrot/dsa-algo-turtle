# Painter's Partition Problem

## 📌 Problem Statement
You are given:
- `A` painters
- Each painter takes `B` time per unit board
- An array `C[]` where each element represents board length

### Constraints:
- Each painter paints **contiguous boards only**
- A board cannot be split

### Goal:
👉 Minimize the **maximum time taken by any painter**

---

## 🧠 Key Insight
This is a **Binary Search on Answer** problem.

We are not searching an index — we are searching the **minimum possible maximum time**.

---

## 🔍 Search Space

- **Lower Bound (`l`)** = `max(C)`  
  (At least one painter must paint the largest board)

- **Upper Bound (`r`)** = `sum(C)`  
  (One painter paints everything)

---

## ⚡ Approach

1. Apply Binary Search on `[l, r]`
2. For each `mid`:
   - Check if it is possible to paint all boards with ≤ `A` painters
3. If possible:
   - Try smaller value (`r = mid - 1`)
4. Else:
   - Increase (`l = mid + 1`)

---

## ✅ Feasibility Function (Greedy)

### Idea:
- Assign boards to current painter
- If adding next board exceeds `mid`, assign new painter

```java
private boolean isItPossible(ArrayList<Integer> C, int A, long mid){

    long timeTaken = 0;
    int painters = 1;

    for(int i = 0; i < C.size(); i++){
        if(timeTaken + C.get(i) <= mid){
            timeTaken += C.get(i);
        } else {
            painters++;
            timeTaken = C.get(i);

            if(painters > A) return false;
        }
    }
    return true;
}
```

---

## 🧪 Example

```
A = 2
B = 5
C = [1, 10]
```

### Step:
- Best split: `[1] | [10]`
- Max work = 10
- Time = `10 * 5 = 50`

---

## 🧭 How to Think (Without Code)

1. You are trying to **minimize the maximum workload** assigned to any painter.
2. Imagine you fix a value `X` (maximum time allowed per painter).
3. Ask:
   > Can I paint all boards using at most `A` painters if no one exceeds `X`?
4. If yes → try a smaller value.
5. If no → increase the value.

---

```
A = 2
B = 5
C = [1, 10]
```

### Step:
- Best split: `[1] | [10]`
- Max work = 10
- Time = `10 * 5 = 50`

---

## ⏱️ Complexity

- Binary Search: `O(log(sum - max))`
- Feasibility Check: `O(N)`

👉 Total: `O(N log(sum))`

---

## 🔁 Similar Problems

- Split Array Largest Sum
- Koko Eating Bananas
- Capacity to Ship Packages
- Allocate Books

---

## 🚀 Key Takeaways

- Think in terms of **"minimum possible maximum"**
- Use **Binary Search on Answer**
- Combine with **Greedy validation**

---

## 🧠 Mental Model

> "If I limit each painter to X time, how many painters do I need?"

---

## 📌 Pattern Template

```java
while(l <= r){
    long mid = (l + r) / 2;

    if(isPossible(mid)){
        ans = mid;
        r = mid - 1;
    } else {
        l = mid + 1;
    }
}
```

---

## ✅ Done!
This problem is a cornerstone for mastering **Binary Search on Answer** 🚀
