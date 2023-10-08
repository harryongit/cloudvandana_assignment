// JavaScript
// 1. Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad.
// 2. Perform sorting of an array in descending order.

// Task 1: Reverse Every Word in a Sentence:
function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(" ");
    // Reverse each word and store them in a new array
    let reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });
    // Join the reversed words to form the reversed sentence
    let reversedSentence = reversedWords.join(" ");
    return reversedSentence;
}

let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence: "+reversedSentence);

// Task 2: Sort an Array in Descending Order:
function sortDescending(arr) {
    return arr.sort((a, b) => b - a);
}

let inputArray = [4, 8, 2, 10, 5];
let sortedArray = sortDescending(inputArray);
console.log("Sorted Array: " + sortedArray);


// Output:
// Reversed Sentence: sihT si a ynnus yad
// Sorted Array: 10,8,5,4,2

