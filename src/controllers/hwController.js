
const fs = require('fs');


function getAllData(req, res) {
    fs.readFile("output.json", 'utf-8', (err, data) => {
        res.send(err ? err : JSON.parse(data));
    })
};
function insertData(req, res) {
    const newData = req.body;
    console.log("new data", newData);
    fs.writeFile("output.json", JSON.stringify(newData), err => {
        res.send(err ? "error" : newData);

    })
}
function findChildrenByCountry(req, res) {
    const country = req.query.country;

    fs.readFile("output.json", 'utf-8', (err, data) => {
        const children = JSON.parse(data);
        const result = [];
        for (const index1 of children.children) {
            for (const index2 of index1.children) {
                for (const index3 of index2.children) {
                    for (const index4 of index3.children) {
                        if(index4.country === country){
                            result.push(index4);
                        }
                    }
                }
            }
        }
        console.log(result);
        ;
        // .children[0].children[0].children.find((i) => i.country === country)
        // console.log(result);
        res.send(result);
    });


}
module.exports = { getAllData, insertData, findChildrenByCountry };