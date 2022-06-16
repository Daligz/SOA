const pdf = require('html-pdf');
const content = `
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>PDF Result Template</title>
<style>
h1 {
color: green;
}
</style>
</head>
<body>
<div id="pageHeader" style="border-bottom: 1px solid #ddd; padding-bottom: 5px;">
<p>Es un ejemplo de cabecera en HTML PDF y NODEJS</p>
</div>
<div id="pageFooter" style="border-top: 1px solid #ddd; padding-top: 5px;">

<p style="color: #666; width: 70%; margin: 0; padding-bottom: 5px; text-align: let; font-
family: sans-serif; font-size: .65em; float: left;"><a href="https://anartz-mugika.com"

target="_blank">https://anartz-mugika.com</a></p>

<p style="color: #666; margin: 0; padding-bottom: 5px; text-align: right; font-family: sans-
serif; font-size: .65em">Página {{page}} de {{pages}}</p>

</div>

<h1>Título en el PDF creado con el paquete html-pdf</h1>
<p>Generando un PDF con un HTML sencillo</p>
</body>
</html>
`;
pdf.create(content).toFile('./html-pdf.pdf', function (err, res) {
    if (err) {
        console.log(err);
    } else {
        console.log(res);
    }
});