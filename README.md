# Java Triangle Classifier & JUnit 4 Automation Matrix

A robust, full-cycle Java application showcasing Object-Oriented Programming (OOP) principles, defensive programming, and rigorous Quality Assurance methodologies.

## 🚀 Project Overview
This project features a logic engine (`Triangle.java`) capable of dynamically parsing raw string inputs into geometric dimensions, validating mathematical constraints, and isolating input noise. To guarantee production-grade reliability, it is backed by an automated verification suite (`DeepinderkalraTriangleTest.java`) containing 20 distinct integration scenarios.

## 🛠️ Key Engineering Features
* **Defensive String Sanitization:** Uses individual `try-catch` blocks to capture alphanumeric errors (`"abc"`) or empty fields (`""`) before they break the application execution flow.
* **Theorem Enforcement:** Programmatically enforces the Geometric Triangle Inequality Theorem ($s_1 + s_2 \le s_3$) to immediately isolate physically impossible parameters.
* **Error Aggregation:** Tracks and bundles multiple validation faults simultaneously (e.g., catching when a custom input is both mathematically invalid *and* exceeds maximum database size allocations).

## 🧪 Testing Coverage (20 Scenarios)
The JUnit suite aggressively stresses code boundaries including:
1. **Valid Classifications:** Equilateral, Isosceles, and Scalene variants.
2. **Data Boundaries:** Negative constraints, absolute zeroes, and systemic size limits ($sum > 1000$).
3. **Type Safety:** Character strings, empty parameters, and null entries.

## 💻 Tech Stack
* **Language:** Java SE
* **Testing Framework:** JUnit 4
* **Methodologies:** Test-Driven Development (TDD), Defensive Architecture, Data Validation
