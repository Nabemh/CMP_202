Group Members 
Hanior Nabem Nathaniel - BHU/22/04/09/0074
Ezekiel Oyidih - BHU/22/04/05/0026
Ngakilahyel Samuel - BHU/22/04/10/0019
Caleb Joshua Fuojima - BHU/22/04/05/0018
Precious Oguntuase Toluwalope -	BHU/22/04/05/0070

Algorithm

1. Take the input string as input.
2. Convert the input string into a character array by breaking it character for character
3. Create an empty character array of the same length as the input string.
4. Loop through each character of the input string:
   - Assign the character at the current index of the input string to the corresponding index in the empty character array in the other direction.
5. Compare each character of the original input string with the corresponding character in the reversed array:
   - If any character does not match, return false (indicating that the string is not a palindrome).
6. If all characters match, return true (indicating that the string is a palindrome).