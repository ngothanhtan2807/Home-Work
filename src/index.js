const express = require('express');
const app = express();
const port = 8000;

app.use(express.json());
app.use(express.urlencoded({extended: true}));

const hwRoute = require("./routes/homework")

app.use("/v1", hwRoute);

app.listen(port, ()=>{
    console.log('app listening on port', port);
});