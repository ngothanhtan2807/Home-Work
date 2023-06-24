// sum of 2 number
function sumOf(req, res) {
    const { num1, num2 } = req.query;
    const num3 = parseFloat(num1);
    const num4 = parseFloat(num2);
    console.log("num1", num3, "num2", num4);
    const result = num3 + num4;
    res.send({ result });
}
//check prime
function isPrime(req, res) {
    const { num } = req.query;
    const num1 = parseInt(num);
    let count = 0;
    for (let a = 1; a <= num1; a++) {
        if (num1 % a === 0) {
            count++;
        }
    }
    if (count === 2) res.send(`${num} is prime`);
    res.send(`${num} is not prime`);
}

//find max in array
function findMax(req, res) {
    const arr = req.body;
    let max = arr[0];
    for (let a = 1; a < arr.length; a++) {
        if (arr[a] > max) {
            max = arr[a];
        }
    }
    res.send(`max is ${max}`);
}

//reverse a string
function reverseString(req, res) {
    const { input } = req.query;
    console.log(input);
    const toArray = input.split("");
    const resultEx4 = toArray.reverse();
    res.send(` ${input} after reverser is ${resultEx4.join("")}`)
}

//check palindrome
function isPalindrome(req, res) {
    const { input } = req.query;
    const toArray5 = input.split("");
    const length = Math.floor(toArray5.length / 2) - 1;
    let result = true;
    for (let i = 0; i <= length; i++) {
        if (toArray5[i] !== toArray5[toArray5.length - 1 - i]) {
            result = false;
            break;
        }

    }
    res.send(result ? `${input} is palindrome` : `${input} is not palindrome`);
}
//count char in string
function countChar(req, res) {
    const { string, char } = req.query;
    let toArray6 = string.split("");
    let count = 0;
    for (let i = 0; i < toArray6.length; i++) {
        if (char === toArray6[i]) {
            count++;
        }
    }
    res.send(`so lan xuat hien cua '${char}' trong chuoi ${string} la ${count}`)
}

//random string with length
function randomString(req, res) {
    const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    const { length } = req.query;
    let result = "";
    for (let i = 0; i < length; i++) {
        result += characters.charAt(Math.floor(Math.random() * characters.length));
    }
    res.send(`chuoi ngau nhien voi ${length} ky tu: ${result}`)
}
//factorial
function factorial(req, res) {
    let { number } = req.query;
    number = parseInt(number);
    let result = 1;
    for (let i = 1; i <= number; i++) {
        result = result * i;
    }
    res.send(`giai thua cua ${number} la ${result}`)
}
//sort array number
function sortArrayNumber(req, res) {
    let arr = req.body;
    res.send(arr.sort());
}

//check anagram
function checkAnagram(req, res) {
    let { string1, string2 } = req.query;
    let result = false;
    if (string1.length !== string2.length) {
        result = false;
    }
    else {
        string1 = string1.split("").sort().join("");
        string2 = string2.split("").sort().join("");
        if (string1 === string2) {
            result = true;
        }
        else {
            result = false;
        }
    }
    res.send(result);
}
//create book
function createBook(req, res) {
    let { title, author, year } = req.query;
    res.send({ title, author, year });
}

//area rectangle
function areaRectangle(req, res) {
    let { width, height } = req.query;
    width = parseFloat(width);
    height = parseFloat(height);
    res.send({ width, height, area: width * height });
}
//even aray
function evenArray(req, res) {
    let arr = req.body;
    let result = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            result.push(arr[i]);
        }
    }
    res.send(result);
}
//random number
function randomNumber(req, res) {
    let { start, end } = req.query;
    start = parseInt(start);
    end = parseInt(end);
    console.log(start, end);
    let result = Math.floor(Math.random() * (end - start + 1)) + start;
    console.log(result);
    res.send(`${result}`);
}
//perfect number
function perfectNumber(req, res) {
    let { number } = req.query;
    number = parseInt(number);
    console.log(number);
    let result = false;
    let arr = [];
    for (let i = 1; i < number; i++) {
        if (number % i === 0) {
            arr.push(i);
        }
    }
    console.log(arr);
    let total = 0;
    arr.forEach(num => total += num);
    console.log(total);

    if (total === number) {
        result = true;
    }
    res.send(result);
}

//revert content
function reverseContent(req, res) {
    const { input } = req.query;
    console.log(input);
    const toArray = input.split(" ");
    console.log(toArray)
    let resultEx4 = toArray.reverse();
    console.log(resultEx4)
    resultEx4 = resultEx4.join(" ");

    console.log(resultEx4)
    res.send(` ${input} after reverser is ${resultEx4}`)
}

//fizzbuzz
function fizzbuzz(req, res) {
    let { number } = req.query;
    number = parseInt(number);
    let result = "";
    if (number % 3 === 0) {
        result += "fizz";
    }
    if (number % 5 === 0) {
        result += "buzz";
    }

    res.send(`${result}`);
}
module.exports = {
    sumOf,
    isPrime,
    findMax,
    reverseString,
    isPalindrome,
    countChar,
    randomString,
    factorial, sortArrayNumber,
    checkAnagram,
    reverseContent,
    fizzbuzz,
    createBook, areaRectangle,
    evenArray,
    randomNumber,
    perfectNumber
}