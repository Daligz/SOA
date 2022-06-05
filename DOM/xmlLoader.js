function loadXML(filename) {
    if (window.XMLHttpRequest) {
        xhttp=new XMLHttpRequest();
    } else {
        xhttp=new ActiveObject("Microsoft.XMLHTTP");
    }
    xhttp.open("GET","books.xml",false);
    xhttp.send();
    return xmlDoc=xhttp.responseXML;
}