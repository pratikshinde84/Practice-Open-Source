# Contributing to Practice Open Source

Welcome! This project is for first-time open-source contributors and Java beginners.

## Contribution workflow
1. Fork the repository on GitHub.
2. Clone **your fork** to your computer.
3. Create a new feature branch from `main`: `git checkout -b add-your-program`.
4. Choose an open **[Bug]** issue and fix the existing Java file named in that issue. Do not add a duplicate algorithm file.
5. Keep the public class matching its filename and ensure it contains `public static void main(String[] args)`.
6. Compile and run the program, e.g. `javac arrays/YourProgram.java` then `java -cp arrays YourProgram`.
7. Commit, push your branch to your fork, and open a pull request targeting this repository's `main`.

Read the full beginner-friendly [fork-to-PR instructions](README.md#how-to-create-your-first-pull-request) in the README.

## Code standards
- Java 8+ and standard library only; no external dependencies.
- Keep programs small, clear, and beginner friendly.
- Use meaningful class and variable names. Add a short comment describing what the program does.
- Show a sample result through `System.out.println`.
- Do not add compiled `.class` files, API keys, or unrelated code.
- Focus on one intentional bug per pull request. Explain the original issue, your fix, and the output you verified.
- Be respectful when communicating and reviewing.

By contributing, you agree that your contribution is available under the repository's MIT license.
