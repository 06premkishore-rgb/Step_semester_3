\# Step\_semester\_3 - Java Lab \& Assignment Log



\## Date: 10-09-2026

\*\*Summary of Tasks:\*\*

\- Completed Session 5 problem sets covering array operations, single-pass algorithms, and object-oriented array sorting on `feature/session\_5`.

\- \*\*Class Modules (`src/main/java/week\_5/class\_problems/`):\*\*

&#x20; - `ScoreBooster`: Targeted in-place array element updates.

&#x20; - `DuplicateTeamFinder`: Pairwise scanning for duplicate detection.

&#x20; - `PodiumFinder`: Efficient single-pass top-3 element retrieval ($O(N)$ efficiency).

&#x20; - `SeatingGridOptimizer`: 2D matrix operations and row-wise average evaluations via private helpers.

&#x20; - `PlacementDriveEngine`: Implemented `Comparable<Candidate>` for custom object array sorting with `Arrays.sort()`.

\- \*\*Assignment Modules (`src/main/java/week\_5/assignment\_problems/`):\*\*

&#x20; - `FantasyScoreMultiplier`: Scaled double array values at specific index locations.

&#x20; - `DuplicatePlayerChecker`: String array inspection to catch early duplicate entries.

&#x20; - `TopPerformerTracker`: Single-pass range scanner calculating dynamic minimum, maximum, and spread values.

&#x20; - `MatchDayGridAnalyzer`: Evaluated matrix data and classified game conditions using modular checks.

&#x20; - `FantasyDraftEngine`: Object collection filtering using overloaded `isDraftable()` methods and interface sorting.



\*\*Current Issues \& Solutions:\*\*

\- Resolved `javac` classpath resolution issues when compiling packages directly from the command line.

\- Normalized package folder structures across feature branches.



\---



\## Date: 29-08-2026

\*\*Summary of Tasks:\*\*

\- Finished Session 2 exercises focused on Java String manipulation, regex formatting, and text parsing on `feature/session\_2`.

\- \*\*Assignment Modules (`src/main/java/week\_2/assignment\_problems/`):\*\*

&#x20; - `AtmPinValidator`: Strict length and numeric validation for security PINs.

&#x20; - `WordReversalEncoder`: Reversed individual token characters while maintaining global word order.

&#x20; - `ProductInventoryParser`: Extracted and verified CSV fields (Name, SKU, Quantity).

&#x20; - `IsbnValidator`: Standardized and verified 13-character ISBN string patterns.

&#x20; - `StopWordFrequencyReport`: Filtered high-frequency stop words and reported sorted word occurrence frequencies using `HashMap`.

\- \*\*Class Modules (`src/main/java/week\_2/class\_problems/`):\*\*

&#x20; - `RockPaperScissorsGame`: Multi-round score logger and overall win-rate percentage tracker.

&#x20; - `VowelConsonantCounter`: Direct char-by-char string parsing using `charAt()`.

&#x20; - `CsvStudentRecordParser`: Deconstructed student record strings into structured attributes.

&#x20; - `FileExtensionValidator`: Extracted file extensions using `lastIndexOf('.')` and checked against valid types.

&#x20; - `MaskedPhoneNumberFormatter`: Validated 10-digit formats and applied character masking (`XXXXXX-1234`).

&#x20; - `BankTransactionValidator`: Verified strict 14-character transaction string rules.



\---



\## Date: 20-08-2026

\*\*Summary of Tasks:\*\*

\- Created initial repository layout (`main` for documentation, `develop` for baseline skeleton, and `feature/` branches for weekly work).

\- Solved Session 1 foundational exercises under `src/main/java/week\_1/`.

\- Tested local environment compilation and run steps using standard `javac` and `java -cp` commands.



\---



\## Branching Guidelines

\- \*\*`main`\*\*: Restricted exclusively to progress logging (`README.md`).

\- \*\*`develop`\*\*: Core skeleton setup.

\- \*\*`feature/session\_n`\*\*: Active development branch containing `class\_problems` and `assignment\_problems` packages.

