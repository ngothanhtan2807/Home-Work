const express = require('express');
const app = express();
const port = 8000;

app.use(express.json());
app.use(express.urlencoded({extended: true}));

const hwRoute = require("./routes/homework")

app.use("/v1", hwRoute);

//performance
// const pfRoute = require("./routes/perfomance")
// app.use("/v2", pfRoute)

//javascript exercise 



app.listen(port, ()=>{
    console.log('app listening on port', port);
}); 