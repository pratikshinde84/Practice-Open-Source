# Practice Open Source — Java Basics ☕

A beginner-friendly Java **debugging challenge repository** for first-time open-source contributors. **20 existing Java programs contain intentionally introduced bugs**, each paired with a GitHub issue. Your task is to repair one existing file and open a pull request. The other examples are starting points for practice.

> **Competition notice:** Some example programs are deliberately incorrect. This is intentional, not a production-ready algorithms library. The GitHub issue for each bug describes the expected result; contributors should investigate and fix the code.

## How to Create Your First Pull Request

Follow these steps from start to finish. You need a [GitHub account](https://github.com/signup), [Git](https://git-scm.com/downloads), and Java JDK 8+.

### Step 1 — Fork the repository

Open **[Practice-Open-Source](https://github.com/pratikshinde84/Practice-Open-Source)**, click **Fork** at the top right, then click **Create fork**. Your personal copy will appear at `https://github.com/YOUR_USERNAME/Practice-Open-Source`.

### Step 2 — Clone your fork

Open Git Bash, Terminal or VS Code Terminal and run:

```bash
git clone https://github.com/YOUR_USERNAME/Practice-Open-Source.git
cd Practice-Open-Source
```

Replace `YOUR_USERNAME` with your actual GitHub username. Clone **your fork**, not the original repository.

### Step 3 — Create a feature branch

Never work directly on `main` for a contribution:

```bash
git checkout -b fix-array-reversal
```

Choose your own descriptive branch name, preferably one per issue.

### Step 4 — Pick an issue and edit the code

Visit the **[Issues tab](https://github.com/pratikshinde84/Practice-Open-Source/issues)** and choose one of the 20 open **[Bug]** issues. Read the problem and **edit its existing Java file** (for example, `arrays/ReverseArray.java`); do not create an extra Java file. Keep the public class name and file path unchanged. Avoid external libraries.

### Step 5 — Compile and run your Java program

Example commands (replace with your own Java filename):

```bash
javac arrays/ReverseArray.java
java -cp arrays ReverseArray
```

Check the output, test edge cases, and fix errors before committing. Java compilation creates `.class` files locally; the `.gitignore` prevents tracking these.

### Step 6 — Check, stage and commit your changes

```bash
git status
git add arrays/ReverseArray.java
git commit -m "Fix array reversal bug"
```

If Git asks for your identity, set it once using your own details:

```bash
git config --global user.name "Your Name"
git config --global user.email "your-email@example.com"
```

Stage only the files you intend to contribute.

### Step 7 — Push the branch to your fork

```bash
git push -u origin fix-array-reversal
```

Use the same branch name you created in Step 3. If GitHub asks you to authenticate, follow its browser or credential-manager prompt.

### Step 8 — Create a Pull Request on GitHub

1. Open **your fork** in your browser. Click **Compare & pull request**, or go to **Pull requests → New pull request**.
2. Make sure **base repository** is `pratikshinde84/Practice-Open-Source` and **base branch** is `main`.
3. Set **head repository** to `YOUR_USERNAME/Practice-Open-Source` and **compare branch** to your feature branch.
4. Add a clear title, such as `Fix array reversal bug`.
5. Describe the algorithm, the filename, sample output, and how you tested it.
6. Include `Closes #11` (replace `1` with the number of your chosen issue).
7. Click **Create pull request**. You've submitted your first contribution!

### Step 9 — Respond to review feedback

If a maintainer requests changes, update the same local branch, then commit and push again:

```bash
git add arrays/ReverseArray.java
git commit -m "Improve second largest element example"
git push
```

Your existing PR automatically updates. **Do not create another PR for the same change.**

### Step 10 — Sync your fork before your next contribution (optional)

After your PR is merged, sync with the upstream repository:

```bash
git checkout main
git remote add upstream https://github.com/pratikshinde84/Practice-Open-Source.git
git fetch upstream
git merge upstream/main
git push origin main
```

Run `git remote add upstream` only the first time. For future updates, skip that line. Then create a fresh branch for your next issue.

---

## Java Programs Included

| Topic | Example programs |
| --- | --- |
| `basics/` | Even/odd, leap year, multiplication table, swap numbers |
| `arrays/` | Reverse array, sum, largest, smallest, even/odd count, left rotation |
| `sorting/` | Bubble sort, selection sort, insertion sort |
| `searching/` | Linear search, binary search |
| `strings/` | Reverse string, palindrome, vowel count, word count |
| `numbers/` | Prime check, factorial, Fibonacci, reverse number, sum of digits, Armstrong number |
| `patterns/` | Right triangle star pattern |

There are **26 standalone Java programs**, including **20 intentional bug-fix challenges**, each with a runnable `main` method. No frameworks, dependency managers or external Java libraries are required.

## Running an Existing Example

From the repository root:

```bash
javac arrays/ReverseArray.java
java -cp arrays ReverseArray
```

**Note:** Some examples intentionally produce wrong output or fail. That is the point of the debugging issues. Change and test code locally on your own branch before submitting a pull request.

## Open Source Contributions

All skill levels are welcome, especially beginners. Choose from [20 bug-fix issues](https://github.com/pratikshinde84/Practice-Open-Source/issues), correct the existing file, and read [CONTRIBUTING.md](CONTRIBUTING.md) for code standards. Submit one focused bug fix per PR; intentionally broken programs should start giving the expected outputs after the fix.

## License

This project is licensed under the [MIT License](LICENSE).
