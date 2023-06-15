const express = require('express');
const router = express.Router();

const controller = require("../controllers/hwController");
router.get("/all-data", controller.getAllData);

router.post("/insert-data", controller.insertData);

router.get("/children", controller.findChildrenByCountry);

module.exports= router;