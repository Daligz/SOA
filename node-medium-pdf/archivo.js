const pdf = require('html-pdf');
const content = `
<h1>Título en el PDF creado con el paquete html-pdf</h1>
<p>Generando un PDF con un HTML sencillo</p>
`;
pdf.create(content).toFile('./html-pdf.pdf', function (err, res) {
    if (err) {
        console.log(err);
    } else {
        console.log(res);
    }
});