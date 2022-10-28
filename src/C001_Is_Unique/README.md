**Implement an Algorithm to determine if a string has all unique characters. What if you cannot use additional datastructures ?**

Que: Is string an ASCII or a Unicode String or only contains Lower Case Characters ?

**Brute Force Approach**

We can use two loops and for each character we can search in remaining string whether it contains the same character as current character or not, if not found then advance the pointer.

_Interviewer:_ What's the Time & Space Complexity for this ?
_Me:_ Since we are using two loops for traversing the characters the Time Complexity must be O(n^2), and we are not using any additional space so Space Complexity must be O(1) in this case.

_Interviewer:_ Can you optimize it further ?  
_Me:_ We can sort the string and then can check adjacent characters if they are same or not.

_Interviewer:_ Can you highlight the Time and Space being used in this case ?  
_Me:_ Sure, Actually the Time Complexity would be O(n*log(n)) due to sorting and additional O(n) for traversing, so the final Time Complexity would be O(n*log(n)) and Space Complexity would be O(1) if we are not using any sorting algorithm which takes up extra space.

_Interviewer:_ Ok, Can you name some Sorting Algorithms, which takes extra space and which don't ?  
_Me:_ Ya, Like Merge Sort, Counting Sort takes extra space. Quick Sort, Heap Sort, Insertion Sort, Selection Sort and Bubble Sort don't take any extra spaces.

_Interviewer:_ Very Good, Let's come to the problem you told me about the sorting approach can you optimize it further with O(n) Time being used, and you can use extra space if you want ?  
_Me:_ Ok, let me think about it more. I think we can optimize the brute force approach instead of traversing for every character we can store the visited characters so when we encounter next character we can verify with previously visited characters. we can store the visited characters in a Set so that we can lookup easily.
Since we are not allowed to use additional datastructures I am able to think of use a boolean array, we know that we can have maximum of 256 different characters, and their corresponding ASCII value is 0 to 255, so we can use boolean array of size 256. So for every character we check if for this character we have marked it visited or not. 
If it is mark as visited we return false because we have found that all characters are not unique and if it is marked as not visited then we mark it as visited, and move to next.

_Interviewer:_ Nice, How much time and space would be needed in this approach ?
_Me:_ First let's talk about the space, since we are using boolean array of size 256, so the time complexity would be O(c), where c is 256, and we can consider it O(1) since c is so small.
Now about time complexity of this would be O(min(n,c)) where n is length of string and c is 256 ( no. of unicode characters ), because we are using one loop, and once we know that character is visited we can return answer.

_Interviewer:_ Can you dry run your approach in the following test case ?
Given string is "Iam#i" what would be your answer.
_Me:_ Should we consider uppercase letter and lowercase letter different ?
_Interviewer:_ Yes.
_Me:_ Ok.
( Validated the test cases. )

_Interviewer:_ I am completely satisfied with this approach, can you code it now since we are running out of time.
_Me:_ Ya, sure.

_My Keyboard:_ Ctrl+C, Ctrl+V



