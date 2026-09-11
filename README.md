Laboratory Activity: Recursion

- Brief description of the program
Description This program uses recursive binary search to find a specific target value in a sorted array.
It repeatedly divides the search range into smaller parts until the target is found or there are no more elements to search.
The program also displays the low, high, and mid values during each recursive call. In this example, it searches for50 and finds it at index 4.

- Programming language used
Java

- Instructions for compiling/running the program
  Make sure Java is installed.
  Open the folder with Binary_Search.java.
  Open the terminal there.
  Type javac Binary_Search.java to compile.
  If there are no errors, type java Binary_Search to run.
  If there are no errors, type java Binary_Search to run. The program will then display low, high, and mid values while searching, and show the index where the target value is found.

  - Sample input/output
    input:
    10, 20, 30, 40, 50, 60, 70. Target 50.
    output:
    bSearch 0, 6, 50. Low is 0. High is 6. Mid is 3. Then bSearch4,6,50. Low is 4. High is 6. Mid is 5. Then bSearch 4,4,50. Low is 4. High is 4. Element found at index4.

    - AI disclosure if applicable
    ChatGPT was used to assist with some parts of the program and the related file. The final work was reviewed and edited by the student before submission.
