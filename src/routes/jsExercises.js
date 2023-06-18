const express = require('express');
const router = express.Router();

const exerciseController = require("../controllers/jsExerciseController");
//ex1
router.get("/sum-of", exerciseController.sumOf);
//ex2
router.get("/prime", exerciseController.isPrime);
//ex3
router.post("/max-in-array", exerciseController.findMax);
//ex4
router.get("/string", exerciseController.reverseString);

//ex5
router.get("/paradrome", exerciseController.isPalindrome);

//ex6
router.get("/charater", exerciseController.countChar);

//ex7
router.get("/string-random", exerciseController.randomString);

//ex8
router.get("/factorial", exerciseController.factorial);

//ex9
router.post("/array-number", exerciseController.sortArrayNumber);
//ex10
router.get("/anagram", exerciseController.checkAnagram);

//ex11
router.get("/book", exerciseController.createBook);

//ex12
router.get("/rectangle", exerciseController.areaRectangle);

//ex13
router.post("/even-array", exerciseController.evenArray);

//ex14
router.get("/random-number", exerciseController.randomNumber);

//ex15
router.get("/perfect-number", exerciseController.perfectNumber);
//ex17
router.get("/content", exerciseController.reverseContent);
router.get("/fizzbuzz", exerciseController.fizzbuzz);

module.exports= router;