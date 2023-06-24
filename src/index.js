const express = require('express');
const app = express();
const port = 8000;

app.use(express.json());
app.use(express.urlencoded({extended: true}));

const jsExercises = require("./routes/jsExercises");
app.use("/v3", jsExercises);


app.listen(port, ()=>{
    console.log('app listening on port', port);
}); 
